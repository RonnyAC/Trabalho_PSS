
package controle;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.DAOProduto;
import modelo.Produto;

/**
 *
 * @author Rafael
 */
public class ProdutoControle {
   public static void preencherTabela(JTable tabela, List<Produto> listaProdutos){
        
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(listaProdutos.size());
        tabela.setModel(dtm);
        
        int linha =0;
        for(Produto produto: listaProdutos){
            tabela.setValueAt(produto.getCodigo(), linha, 0);
            tabela.setValueAt(produto.getDescricao(), linha, 1);
            tabela.setValueAt(produto.getValorRomance(), linha, 2);
            tabela.setValueAt(produto.getValorSugerido(), linha, 3);
            linha++;
        }
    }
   public static void cadastrarProduto(String descricao , float valorRomance, float valorSugerido){
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setValorRomance(valorRomance);
        produto.setValorSugerido(valorSugerido);
        DAOProduto daoProduto = new DAOProduto();
        daoProduto.salvar(produto);
        JOptionPane.showMessageDialog(null, "Produto Cadastrado!", "Sucesso", 1);
    }
   
   public static void editarProduto(String descricao , float valorRomance, float valorSugerido, int posicao){
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setValorRomance(valorRomance);
        produto.setValorSugerido(valorSugerido);
        DAOProduto daoProduto = new DAOProduto();
        daoProduto.alterar(posicao , produto);
        JOptionPane.showMessageDialog(null, "Produto Editado!", "Sucesso", 1);
    }
   
    public static void removerProduto(Produto produto){
         DAOProduto daoProduto = new DAOProduto();
        daoProduto.remover(produto);
        
        
    }
}
