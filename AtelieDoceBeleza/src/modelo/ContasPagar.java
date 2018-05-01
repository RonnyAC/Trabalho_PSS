/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Ronny
 */
public class ContasPagar {
    private Integer codigo;
    private String descricaoConta;
    private String dataConta;
    private Integer parcelas;
    private String dataVencimento;
    private float valorTotal;
    private float valorParcela;
    private boolean contaPaga;
    
    public ContasPagar(){
        
    }

    public Integer getIdConta() {
        return codigo;
    }

    public void setIdConta(Integer idConta) {
        this.codigo = idConta;
    }

    public String getDescricaoConta() {
        return descricaoConta;
    }

    public void setDescricaoConta(String descricaoConta) {
        this.descricaoConta = descricaoConta;
    }

    public String getDataConta() {
        return dataConta;
    }

    public void setDataConta(String dataConta) {
        this.dataConta = dataConta;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public boolean isContaPaga() {
        return contaPaga;
    }

    public void setContaPaga(boolean contaPaga) {
        this.contaPaga = contaPaga;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContasPagar other = (ContasPagar) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    
    
}
