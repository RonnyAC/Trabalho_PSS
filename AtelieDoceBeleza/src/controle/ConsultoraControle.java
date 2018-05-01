/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Consultora;
import modelo.DAOConsultora;
import modelo.Status;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Professional
 */
public class ConsultoraControle {
    
    public static void preencherTabela(JTable tabela, List<Consultora> listaConsultoras){
        
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(listaConsultoras.size());
        tabela.setModel(dtm);
        
        int linha =0;
        for(Consultora consultora: listaConsultoras){
            tabela.setValueAt(consultora.getCodigo(), linha, 0);
            tabela.setValueAt(consultora.getNome(), linha, 1);
            tabela.setValueAt(consultora.getCpf(), linha, 2);
            tabela.setValueAt(consultora.getCodSite(), linha, 3);
            tabela.setValueAt(consultora.getDataNascimento(), linha, 4);
            tabela.setValueAt(consultora.getStatus().descricao, linha, 5);
            linha++;
        }
    }
    
    public static void cadastrarConsultora(String nome, String cpf, Integer codSite, String dataNascimento, Status status){
        Consultora consultora = new Consultora();
        consultora.setNome(nome);
        consultora.setCpf(cpf);
        consultora.setCodSite(codSite);
        consultora.setDataNascimento(dataNascimento);
        consultora.setStatus(status);
        DAOConsultora daoConsultoa = new DAOConsultora();
        daoConsultoa.salvar(consultora);
        JOptionPane.showMessageDialog(null, "Consultora Cadastrada!", "Sucesso", 1);
    }
    
    public static void editarConsultora(String nome, String cpf, Integer codSite, String dataNascimento, Status status, int posicao){
        Consultora consultora = new Consultora();
        consultora.setNome(nome);
        consultora.setCpf(cpf);
        consultora.setCodSite(codSite);
        consultora.setDataNascimento(dataNascimento);
        consultora.setStatus(status);
        DAOConsultora daoConsultoa = new DAOConsultora();
        daoConsultoa.alterar(posicao, consultora);
        JOptionPane.showMessageDialog(null, "Consultora Editada!", "Sucesso", 1);
    }
    
}
