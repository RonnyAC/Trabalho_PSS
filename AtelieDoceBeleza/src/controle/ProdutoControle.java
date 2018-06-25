
package controle;

import java.util.ArrayList;
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
   public static void preencherTabela(JTable tabela){
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        
        List<Produto> lista = new ArrayList<>();
        DAOProduto daoProduto = new DAOProduto();
        
        lista = daoProduto.buscar("SELECT * from tbl_produtos");
        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);
        
        int linha =0;
        for(Produto produto: lista){
            tabela.setValueAt(produto.getCodigo(), linha, 0);
            tabela.setValueAt(produto.getDescricao(), linha, 1);
            tabela.setValueAt(produto.getValorRomance(), linha, 2);
            tabela.setValueAt(produto.getValorSugerido(), linha, 3);
            linha++;
        }
    }
   public static void cadastrarProduto(Produto produto){

        DAOProduto daoProduto = new DAOProduto();
        daoProduto.incluir(produto);
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

    public static int getIdProdutoTabela(JTable tabela, int linha) {
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();
        int id = (Integer)dtm.getValueAt(linha, 0);
        return id;
    }

    public static Produto getProdutoPorCodigo(int id) {
        DAOProduto daoProduto = new DAOProduto();
        
        Produto produto = daoProduto.getProduto("SELECT * FROM tbl_produtos WHERE id = " + id + ";");
        
        return produto;
    }
    
}
