package com.mycompany.escoladeti2015time03.teste;

import java.util.Objects;
import javax.persistence.Entity;

@Entity
public class Escola {
    
    private Long id;
    private String nome;
    private String Endereço;
    private String Telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Escola other = (Escola) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Escola(String nome, String Endereço, String Telefone) {
        this.nome = nome;
        this.Endereço = Endereço;
        this.Telefone = Telefone;
    }

    @Override
    public String toString() {
        return "Escola{" + "id=" + id + ", nome=" + nome + ", Endere\u00e7o=" + Endereço + ", Telefone=" + Telefone + '}';
    }
    
    
    
}
