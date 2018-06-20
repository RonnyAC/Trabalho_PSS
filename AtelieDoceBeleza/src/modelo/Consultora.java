
package modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author William Rodrigues da Silva
 */
public class Consultora implements Serializable{
    
    //ATRIBUTOS
    private Integer codigo;
    private String nome;
    private String cpf;
    private Integer codSite;
    private String dataNascimento;
    private Status status;

    //CONSTRUTOR
    public Consultora() {
    }

    //METODOS
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getCodSite() {
        return codSite;
    }

    public void setCodSite(Integer codSite) {
        this.codSite = codSite;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final Consultora other = (Consultora) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }    
    
    
}
