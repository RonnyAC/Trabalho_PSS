/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import modelo.ContasPagar;
import modelo.DAOContasPagar;

/**
 *
 * @author Ronny
 */
public class ContasPagarControle {
    
    public static void cadastraContaPagar(int idConta, String descricaoConta,
            String dataConta, int parcela, String dataVencimento, float valorTotal){
        ContasPagar conta = new ContasPagar();
        conta.setIdConta(0);
        conta.setDescricaoConta(descricaoConta);
        conta.setDataConta(dataConta);
        conta.setParcelas(parcela);
        conta.setDataVencimento(dataVencimento);
        conta.setValorTotal(valorTotal);
        DAOContasPagar daoContasPagar = new DAOContasPagar();
        
    }
    
}
