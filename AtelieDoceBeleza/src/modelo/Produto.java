
package modelo;

import java.util.Objects;

/**
 *
 * @author Rafael
 */
public class Produto {

    private Integer codigo;
    private String descricao;
    private float valorRomance;
    private float valorSugerido;

    public Produto() {
    }

    public Produto(Integer codigo, String descricao, float valorRomance, float valorSugerido) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorRomance = valorRomance;
        this.valorSugerido = valorSugerido;
    }
    
    
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorRomance() {
        return valorRomance;
    }

    public void setValorRomance(float valorRomance) {
        this.valorRomance = valorRomance;
    }

    public float getValorSugerido() {
        return valorSugerido;
    }

    public void setValorSugerido(float valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.codigo);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    

}
