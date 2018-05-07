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

            int resultado = preparedStatement.executeUpdate();

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

    public boolean alterar(int possicao, ContasPagar conta) {
        Dados.listaContasPagar.set(possicao, conta);
        conta.codigo(possicao + 1);
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
            newID = resultSet.getInt("id");
        } catch (SQLException e) {
            System.err.println("ID nao encontrado");
        }finally{
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
}
