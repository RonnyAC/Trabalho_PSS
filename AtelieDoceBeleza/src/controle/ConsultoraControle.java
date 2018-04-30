/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.Consultora;
import modelo.DAOConsultora;

/**
 *
 * @author Professional
 */
public class ConsultoraControle {
    
    public static void preencherTabela(){
        
    }
    
    public static void cadastrarConsultora(String nome, Integer cpf, Integer codSite, String dataNascimento){
        Consultora consultora = new Consultora();
        consultora.setNome(nome);
        consultora.setCpf(cpf);
        consultora.setCodSite(codSite);
        consultora.setDataNascimento(dataNascimento);
        DAOConsultora daoConsultoa = new DAOConsultora();
        daoConsultoa.salvar(consultora);
        //JOptionPane.showMessageDialog(null, "Consultora Cadastrada!", "Sucesso", 1);
    }
    
    public static void editarConsultora(){
        
    }
    
}
