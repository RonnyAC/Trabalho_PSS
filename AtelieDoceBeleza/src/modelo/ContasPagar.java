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
    
    
}
