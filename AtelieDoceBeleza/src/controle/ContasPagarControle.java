/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Situacao;
import modelo.ContasPagar;
import modelo.DAOContasPagar;

/**
 *
 * @author Ronny
 */
public class ContasPagarControle {
    
    public static JTable preencherTabela(JTable tabela) {

        ArrayList<ContasPagar> lista = new ArrayList<>();

        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        DAOContasPagar daoContasPagar = new DAOContasPagar();
        lista = daoContasPagar.buscar("SELECT * FROM tbl_contas_pagar");

        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);

        int linha = 0;
        for (ContasPagar conta : lista) {
            tabela.setValueAt(conta.codigo(), linha, 0);
            tabela.setValueAt(conta.getDescricaoConta(), linha, 1);
            tabela.setValueAt(conta.getDataVencimento(), linha, 2);
            tabela.setValueAt(conta.getParcelas(), linha, 3);
            tabela.setValueAt(conta.getValorParcela(), linha, 4);
            linha++;
        }
        return tabela;
    }

    public static void cadastraContaPagar(String descricaoConta,
            String dataConta, int parcela, String dataVencimento, float valorTotal, float valorParcela, Situacao contaPaga) {
        ContasPagar conta = new ContasPagar();
        conta.codigo(0);
        conta.setDescricaoConta(descricaoConta);
        conta.setDataConta(dataConta);
        conta.setParcelas(parcela);
        conta.setDataVencimento(dataVencimento);
        conta.setValorTotal(valorTotal);
        conta.setValorParcela(valorParcela);
        conta.setContaPaga(contaPaga);
        DAOContasPagar daoContasPagar = new DAOContasPagar();
        daoContasPagar.salvar(conta);
        JOptionPane.showMessageDialog(null, "Conta Cadastrada!", "Sucesso", 1);
    }

    public static void editarContaPagar(String descricaoConta,
            String dataConta, int parcela, String dataVencimento, float valorTotal, float valorParcela, Situacao contaPaga, int posicao) {
        ContasPagar conta = new ContasPagar();
        conta.codigo(0);
        conta.setDescricaoConta(descricaoConta);
        conta.setDataConta(dataConta);
        conta.setParcelas(parcela);
        conta.setDataVencimento(dataVencimento);
        conta.setValorTotal(valorTotal);
        conta.setValorParcela(valorParcela);
        DAOContasPagar daoContasPagar = new DAOContasPagar();
        daoContasPagar.alterar(posicao, conta);
        JOptionPane.showMessageDialog(null, "Consultora Editada!", "Sucesso", 1);
    }

    public static JTable buscarConta(String dataInicial, String dataFinal,
            Double valorInicial, Double valorFinal, String descricao, JTable tabela) {
        String querry = "SELECT * FROM tbl_contas_pagar WHERE";

        if (dataInicial != null) {
            if (dataFinal != null) {
                querry = querry + " data_conta BETWEEN '" + dataInicial + "' AND '" + dataFinal + "' AND ";
            } else {
                querry = querry + " data_conta = '" + dataInicial + "' AND ";
            }
        } else {
            if (dataFinal != null) {
                querry = querry + " data_conta = '" + dataFinal + "' AND ";
            }
        }

        if (valorInicial != null) {
            if (valorFinal != null) {
                querry = querry + " data_conta BETWEEN " + valorInicial + " AND " + valorFinal + " AND ";
            } else {
                querry = querry + " data_conta = " + valorInicial + " AND ";
            }
        } else {
            if (valorFinal != null) {
                querry = querry + " data_conta = " + dataFinal + " AND ";
            }
        }

        querry = querry + " descricao LIKE '" + descricao + "%';";

        ArrayList<ContasPagar> lista = new ArrayList<>();

        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        DAOContasPagar daoContasPagar = new DAOContasPagar();
        lista = daoContasPagar.buscar(querry);

        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);

        int linha = 0;
        for (ContasPagar conta : lista) {
            tabela.setValueAt(conta.codigo(), linha, 0);
            tabela.setValueAt(conta.getDescricaoConta(), linha, 1);
            tabela.setValueAt(conta.getDataVencimento(), linha, 2);
            tabela.setValueAt(conta.getParcelas(), linha, 3);
            tabela.setValueAt(conta.getValorParcela(), linha, 4);
            linha++;
        }
        return tabela;

    }

}
