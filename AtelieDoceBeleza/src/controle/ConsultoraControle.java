/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Consultora;
import modelo.DAOConsultora;
import modelo.Status;
import javax.swing.table.DefaultTableModel;
import modelo.Dados;

/**
 *
 * @author Professional
 */
public class ConsultoraControle {

    public static void preencherTabela(JTable tabela) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

        List<Consultora> lista = new ArrayList<>();
        DAOConsultora daoConsultora = new DAOConsultora();

        lista = daoConsultora.buscar("SELECT * FROM tbl_consultoras");
        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);

        int linha = 0;
        for (Consultora consultora : lista) {
            tabela.setValueAt(consultora.getCodigo(), linha, 0);
            tabela.setValueAt(consultora.getNome(), linha, 1);
            tabela.setValueAt(consultora.getCodSite(), linha, 2);
            tabela.setValueAt(consultora.getStatus().descricao, linha, 3);
            linha++;
        }
    }

    public static void cadastrarConsultora(Consultora consultora) {
        DAOConsultora daoConsultoa = new DAOConsultora();
        daoConsultoa.incluir(consultora);

        JOptionPane.showMessageDialog(null, "Consultora Cadastrada!", "Sucesso", 1);
    }

    public static void editarConsultora(Consultora consultora) {

        DAOConsultora daoConsultoa = new DAOConsultora();
        String query = "UPDATE tbl_consultoras"
                + " SET "
                + " nome = ?,"
                + " cpf = ?,"
                + " cod_site = ?,"
                + " data_nascimento = ?,"
                + " status = ?"
                + " WHERE id = ?";
        
        daoConsultoa.alterar(query, consultora);
        JOptionPane.showMessageDialog(null, "Consultora Editada!", "Sucesso", 1);
    }

    public static Consultora getConsultoraPorCodigo(int id) {
        DAOConsultora daoConsultora = new DAOConsultora();
        
        Consultora consultora = daoConsultora.getConsultora("SELECT * FROM tbl_consultoras WHERE id = " + id + ";");
        
        return consultora;

    }

    public static JTable buscarConsultora(String nome, String codSite, String cpf, JTable tabela) {
        String querry = "SELECT * FROM tbl_consultoras WHERE nome LIKE '" + nome
                + "%' AND cpf LIKE '" + cpf + "%' AND cod_site LIKE '" + codSite + "%';";

        List<Consultora> lista = new ArrayList<>();
        DAOConsultora daoConsultora = new DAOConsultora();
        lista = daoConsultora.buscar(querry);

        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(lista.size());

        tabela.setModel(dtm);

        int linha = 0;

        for (Consultora consultora : lista) {
            tabela.setValueAt(consultora.getCodigo(), linha, 0);
            tabela.setValueAt(consultora.getNome(), linha, 1);
            tabela.setValueAt(consultora.getCodSite(), linha, 2);
            tabela.setValueAt(consultora.getStatus(), linha, 3);
            linha++;
        }
        return tabela;
    }
    
    public static int getIdConsultoraTabela(JTable tabela, int linha){
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        
        int id = (Integer)dtm.getValueAt(linha, 0);
        
        return id;
    }

}
