/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Ronny
 */
public class DAOContasPagar {
    public List<ContasPagar> getLista(){
        return Dados.listaContasPagar;
    }
    
    public boolean salvar (ContasPagar contasPagar){
        if (contasPagar.getIdConta() == null) {
            Integer codigo = Dados.listaContasPagar.size() + 1;
            contasPagar.setIdConta(codigo);
            Dados.listaContasPagar.add(contasPagar);
        }
        
        return true;
    }
}