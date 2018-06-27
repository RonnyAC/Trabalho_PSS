
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
   
   public static void editarProduto(Produto produto){
        DAOProduto daoProduto = new DAOProduto();
        String query = "UPDATE tbl_produtos"
                + " SET "
                + " descricao = ?,"
                + " valor_romance = ?,"
                + " valor_sugerido = ?"
                + " WHERE id = ?";
        
        daoProduto.alterar(query , produto);
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

    public static JTable buscarProduto(String descricao, int id, JTable tabela) {
        String querry;
        if(id != 0){
            querry = "SELECT * FROM tbl_produtos WHERE descricao LIKE '" + descricao
                + "%' AND id LIKE '" + id + "%';";
        }else{
            querry = "SELECT * FROM tbl_produtos WHERE descricao LIKE '" + descricao
                + "%';";
        }
        

        List<Produto> lista = new ArrayList<>();
        DAOProduto daoProduto = new DAOProduto();
        lista = daoProduto.buscar(querry);

        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(lista.size());

        tabela.setModel(dtm);

        int linha = 0;

        for (Produto produto : lista) {
            tabela.setValueAt(produto.getCodigo(), linha, 0);
            tabela.setValueAt(produto.getDescricao(), linha, 1);
            tabela.setValueAt(produto.getValorRomance(), linha, 2);
            tabela.setValueAt(produto.getValorSugerido(), linha, 3);
            linha++;
        }
        return tabela;
    }
    
    public static int getIdConsultoraTabela(JTable tabela, int linha){
        DefaultTableModel dtm = (DefaultTableModel)tabela.getModel();        
        int id = (Integer)dtm.getValueAt(linha, 0);        
        return id;
    }
    
}
