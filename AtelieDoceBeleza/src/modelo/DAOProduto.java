package modelo;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class DAOProduto {
        //Retorna lista de Consultoras (Futura persistência com Banco de Dados)
    public List<Produto> getLista(){
        return Dados.listaProdutos;
    }
    
    //Insere uma nova Consultora (Futura persistência com Banco de Dados)
    public boolean salvar(Produto produto){
        if(produto.getCodigo()==null){
            //Se é um novo objeto, gerar código para ele.
            Integer codigo = Dados.listaProdutos.size() + 1;
            produto.setCodigo(codigo);
            Dados.listaProdutos.add(produto);
        }
        return true;
    }
    
    public boolean alterar( int posicao, Produto produto){        
        Dados.listaProdutos.set(posicao, produto);
        produto.setCodigo(posicao+1);
        return true;
    }
    
    public boolean remover (Produto produto){
        Dados.listaProdutos.remove(produto);
        return true;
    }
}
