
package com.mycompany.mavenproject1.beer;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    private String teorAlcolico;

    public Beer() {
    }

    public Beer(String nome, String teorAlcolico) {
        this.nome = nome;
        this.teorAlcolico = teorAlcolico;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Beer other = (Beer) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Beer{" + "id=" + id + ", nome=" + nome + ", teorAlcolico=" + teorAlcolico + '}';
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTeorAlcolico() {
        return teorAlcolico;
    }

    public void setTeorAlcolico(String teorAlcolico) {
        this.teorAlcolico = teorAlcolico;
    }

    public Long getId() {
        return id;
    }
    
    
}
