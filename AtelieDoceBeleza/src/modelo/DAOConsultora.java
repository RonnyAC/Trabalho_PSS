
package modelo;

import java.util.List;

/**
 *
 * @author William Rodrigues da Silva
 */
public class DAOConsultora {
    
    //Retorna lista de Consultoras (Futura persistência com Banco de Dados)
    public List<Consultora> getLista(){
        return Dados.listaConsultoras;
    }
    
    //Insere uma nova Consultora (Futura persistência com Banco de Dados)
    public boolean salvar(Consultora consultora){
        if(consultora.getCodigo()==null){
            //Se é um novo objeto, gerar código para ele.
            Integer codigo = Dados.listaConsultoras.size() + 1;
            consultora.setCodigo(codigo);
            Dados.listaConsultoras.add(consultora);
        }
        return true;
    }
    
    public boolean alterar( int posicao, Consultora consultora){        
        Dados.listaConsultoras.set(posicao, consultora);
        consultora.setCodigo(posicao+1);
        return true;
    }
    
}
