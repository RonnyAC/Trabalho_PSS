/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Professional
 */
public enum Status {
    ATIVA("Ativa"), INATIVA("Inativa");
    
    public String descricao;
    
    Status(String descricao){
        this.descricao=descricao;
    }
}
