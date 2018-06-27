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
 * @author Rafael
 */
public class DAOProduto {

    //Insere uma nova Consultora (Futura persistência com Banco de Dados)
    public boolean incluir(Produto produto) {
        ConectaSQLite conecta = new ConectaSQLite();

        conecta.conectar();

        int newID = buscarID("SELECT coalesce(MAX(id), 0)+1 as newID FROM tbl_produtos");

        String sqlInsert = "INSERT INTO tbl_produtos("
                + "id,"
                + "descricao,"
                + "valor_romance,"
                + "valor_sugerido)"
                + " VALUES(?, ?, ?, ?)";

        PreparedStatement preparedStatement = conecta.criarPreparedStatement(sqlInsert);

        try {
            preparedStatement.setInt(1, newID);
            preparedStatement.setString(2, produto.getDescricao());
            preparedStatement.setFloat(3, produto.getValorRomance());
            preparedStatement.setFloat(4, produto.getValorSugerido());

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

    public boolean alterar(String query, Produto produto) {
        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();

        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = conectaSQLite.criarPreparedStatement(query);

            preparedStatement.setString(1, produto.getDescricao());
            preparedStatement.setFloat(2, produto.getValorRomance());
            preparedStatement.setFloat(3, produto.getValorSugerido());
            preparedStatement.setInt(4, produto.getCodigo());

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

    public boolean remover(Produto produto) {
        
        return true;
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

    public List<Produto> buscar(String query) {

        ConectaSQLite conecta = new ConectaSQLite();
        conecta.conectar();
        ResultSet resultSet = null;
        Statement statement = null;
        List<Produto> produtos = new ArrayList<>();

        statement = conecta.criarStatement();

        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Produto produto = new Produto();

                produto.setCodigo(resultSet.getInt("id"));
                produto.setDescricao(resultSet.getString("descricao"));
                produto.setValorRomance(resultSet.getFloat("valor_romance"));
                produto.setValorSugerido(resultSet.getFloat("valor_sugerido"));

                produtos.add(produto);

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

        return produtos;
    }

    public Produto getProduto(String query) {
        ConectaSQLite conecta = new ConectaSQLite();
        conecta.conectar();
        ResultSet resultSet = null;
        Statement statement = null;
        statement = conecta.criarStatement();
        Produto produto = new Produto();

        try {
            resultSet = statement.executeQuery(query);

            produto.setCodigo(resultSet.getInt("id"));
            produto.setDescricao(resultSet.getString("descricao"));
            produto.setValorRomance(resultSet.getFloat("valor_romance"));
            produto.setValorSugerido(resultSet.getFloat("valor_sugerido"));

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
        return produto;
    }
}
