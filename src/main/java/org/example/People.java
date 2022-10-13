package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class People {
    private String nome;
    private String sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "People{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People people)) return false;
        return nome.equals(people.nome) && sexo.equals(people.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
