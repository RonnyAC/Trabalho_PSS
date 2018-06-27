/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronny
 */
public enum Situacao {
    PAGA("Paga"), NAOPAGA("Naopaga");

    public String descricao;

    Situacao(String descricao) {
        this.descricao = descricao;
    }
}