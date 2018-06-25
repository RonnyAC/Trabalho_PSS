package modelo;

import conexao.ConectaSQLite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author William Rodrigues da Silva
 */
public class DAOConsultora {

    //Insere uma nova Consultora (Futura persistência com Banco de Dados)
    public boolean incluir(Consultora consultora) {
        ConectaSQLite conecta = new ConectaSQLite();

        conecta.conectar();

        int newID = buscarID("SELECT coalesce(MAX(id), 0)+1 as newID FROM tbl_consultoras");

        String sqlInsert = "INSERT INTO tbl_consultoras("
                + "id,"
                + "nome,"
                + "cpf,"
                + "cod_site,"
                + "data_nascimento,"
                + "status)"
                + " VALUES(?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conecta.criarPreparedStatement(sqlInsert);

        try {
            preparedStatement.setInt(1, newID);
            preparedStatement.setString(2, consultora.getNome());
            preparedStatement.setString(3, consultora.getCpf());
            preparedStatement.setString(4, consultora.getCodSite());
            preparedStatement.setString(5, consultora.getDataNascimento());
            preparedStatement.setString(6, consultora.getStatus().descricao);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOContasPagar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conecta.desconectar();
        }
        return true;
    }

    public boolean alterar(String query, Consultora consultora) {

        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conectaSQLite.criarPreparedStatement(query);

            preparedStatement.setString(1, consultora.getNome());
            preparedStatement.setString(2, consultora.getCpf());
            preparedStatement.setString(3, consultora.getCodSite());
            preparedStatement.setString(4, consultora.getDataNascimento());
            preparedStatement.setString(5, consultora.getStatus().toString());
            preparedStatement.setInt(6, consultora.getCodigo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        } finally {
            try {
                preparedStatement.close();
                conectaSQLite.desconectar();
            } catch (SQLException ex) {
            }
        }

        return true;
    }

    public List<Consultora> buscar(String query) {

        ConectaSQLite conecta = new ConectaSQLite();
        conecta.conectar();
        ResultSet resultSet = null;
        Statement statement = null;
        List<Consultora> consultoras = new ArrayList<>();

        statement = conecta.criarStatement();

        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Consultora consultora = new Consultora();

                consultora.setCodigo(resultSet.getInt("id"));
                consultora.setNome(resultSet.getString("nome"));
                consultora.setCpf(resultSet.getString("cpf"));
                consultora.setCodSite(resultSet.getString("cod_site"));
                consultora.setDataNascimento(resultSet.getString("data_nascimento"));
                String status = resultSet.getString("status").toUpperCase();

                if (status.equals("ATIVA")) {
                    consultora.setStatus(Status.ATIVA);
                } else if (status.equals("INATIVA")) {
                    consultora.setStatus(Status.INATIVA);
                }

                consultoras.add(consultora);

            }
        } catch (SQLException e) {
            System.err.println("ID nao encontrado" + e.getMessage());
        } finally {
            try {
                resultSet.close();
                statement.close();
                conecta.desconectar();
            } catch (SQLException e) {
                System.err.println("Erro no fechamento");
            }
        }

        return consultoras;
    }

    public int buscarID(String query) {
        int newID = 0;
        ConectaSQLite conecta = new ConectaSQLite();

        conecta.conectar();
        ResultSet resultSet = null;
        Statement statement = null;

        statement = conecta.criarStatement();

        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                newID = resultSet.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {

            try {
                resultSet.close();
                statement.close();
                conecta.desconectar();
            } catch (SQLException e) {
                System.err.println("Erro no fechamento");
            }
        }

        return newID;
    }

    public Consultora getConsultora(String query) {
        ConectaSQLite conecta = new ConectaSQLite();
        conecta.conectar();
        ResultSet resultSet = null;
        Statement statement = null;
        statement = conecta.criarStatement();
        Consultora consultora = new Consultora();

        try {
            resultSet = statement.executeQuery(query);

            consultora.setCodigo(resultSet.getInt("id"));
            consultora.setNome(resultSet.getString("nome"));
            consultora.setCpf(resultSet.getString("cpf"));
            consultora.setCodSite(resultSet.getString("cod_site"));
            consultora.setDataNascimento(resultSet.getString("data_nascimento"));
            String status = resultSet.getString("status").toUpperCase();

            if (status.equals("ATIVA")) {
                consultora.setStatus(Status.ATIVA);
            } else if (status.equals("INATIVA")) {
                consultora.setStatus(Status.INATIVA);
            }

        } catch (SQLException e) {
            System.err.println("ID nao encontrado" + e.getMessage());
        } finally {
            try {
                resultSet.close();
                statement.close();
                conecta.desconectar();
            } catch (SQLException e) {
                System.err.println("Erro no fechamento");
            }
        }
        return consultora;
    }

}
