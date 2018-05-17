/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Ronny
 */
public class DAOContasPagar {

    public List<ContasPagar> getLista() {
        return Dados.listaContasPagar;
    }

    public boolean salvar(ContasPagar contasPagar) {
        int newID = buscarID();

        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();

        String sqlInsert = "INSERT INTO tbl_contas_pagar("
                + "id,"
                + "descricao,"
                + "data_conta,"
                + "parcelas,"
                + "data_vencimento,"
                + "valor_total,"
                + "valor_parcela,"
                + "conta_paga)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)"
                + ";";

        PreparedStatement preparedStatement = conectaSQLite.criarPreparedStatement(sqlInsert);

        try {
            preparedStatement.setInt(1, newID);
            preparedStatement.setString(2, contasPagar.getDescricaoConta());
            preparedStatement.setString(3, contasPagar.getDataConta());
            preparedStatement.setInt(4, contasPagar.getParcelas());
            preparedStatement.setString(5, contasPagar.getDataVencimento());
            preparedStatement.setDouble(6, contasPagar.getValorTotal());
            preparedStatement.setDouble(7, contasPagar.getValorParcela());
            preparedStatement.setString(8, contasPagar.getContaPaga());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {

        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DAOContasPagar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conectaSQLite.desconectar();
        }
        return true;
    }

    public boolean alterar(int possicao, ContasPagar contasPagar) {
        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE tbl_contas_pagar"
                + " SET "
                + " descricao = ?,"
                + " data_conta = ?,"
                + " parcelas = ?,"
                + " data_vencimento = ?,"
                + " valor_total = ?,"
                + " valor_parcela = ?,"
                + " conta_paga = ?"
                + " WHERE id = ?";

        try {
            preparedStatement = conectaSQLite.criarPreparedStatement(sql);

            preparedStatement.setString(1, contasPagar.getDescricaoConta());
            preparedStatement.setString(2, contasPagar.getDataConta());
            preparedStatement.setInt(3, contasPagar.getParcelas());
            preparedStatement.setString(4, contasPagar.getDataVencimento());
            preparedStatement.setDouble(5, contasPagar.getValorTotal());
            preparedStatement.setDouble(6, contasPagar.getValorParcela());
            preparedStatement.setString(7, contasPagar.getContaPaga());
            preparedStatement.setInt(8, contasPagar.codigo());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                conectaSQLite.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return true;
    }

    private int buscarID() {
        int newID = 0;
        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();
        ResultSet resultSet = null;
        Statement statement = null;

        String query = "SELECT coalesce(MAX(id), 0)+1 as newID FROM tbl_contas_pagar";

        statement = conectaSQLite.criarStatement();

        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                newID = resultSet.getInt(1);
            }
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                resultSet.close();
                statement.close();
                conectaSQLite.desconectar();
            } catch (SQLException e) {
                System.err.println("Erro no fechamento");
            }
        }

        return newID;
    }

    public ArrayList<ContasPagar> buscar() {
        ConectaSQLite conectaSQLite = new ConectaSQLite();
        conectaSQLite.conectar();
        ResultSet resultSet = null;
        Statement statement = null;
        ArrayList<ContasPagar> contas = new ArrayList<>();

        String query = "SELECT * FROM tbl_contas_pagar";

        statement = conectaSQLite.criarStatement();

        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                ContasPagar conta = new ContasPagar();
                
                conta.codigo(resultSet.getInt("id"));
                conta.setDescricaoConta(resultSet.getString("descricao"));
                conta.setDataConta(resultSet.getString("data_conta"));
                conta.setParcelas(resultSet.getInt("parcelas"));
                conta.setDataVencimento(resultSet.getString("data_vencimento"));
                conta.setValorTotal((float)resultSet.getDouble("valor_total"));
                conta.setValorParcela((float)resultSet.getDouble("valor_parcela"));
                //conta.setContaPaga(resultSet.getBoolean("conta_paga"));
                
                contas.add(conta);

            }
        } catch (SQLException e) {
            System.err.println("ID nao encontrado");
        } finally {
            try {
                resultSet.close();
                statement.close();
                conectaSQLite.desconectar();
            } catch (SQLException e) {
                System.err.println("Erro no fechamento");
            }
        }

        return contas;
    }
}
