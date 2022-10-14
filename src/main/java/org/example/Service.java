package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    Scanner scanner = new Scanner(System.in);
    List<People> pessoas = new ArrayList<>();
    List<People> homens = new ArrayList<>();
    List<People> feminino = new ArrayList<>();
    List<People> masculino = new ArrayList<>();

    public static People popular(String nome, String sexo) {
        People p = new People();
        p.setNome(nome);
        p.setSexo(sexo);
        return p;
    }

    public List<People> cadastrar(String nome, String sexo) {

        this.pessoas.add(popular(nome, sexo));
        for (People i : pessoas) {
            if (!pessoas.contains(i)) {
                pessoas.add(i);
            }
        }
        return pessoas;
    }


    public List<People> classificar(String nome, String sexo) {
        homens.add(popular(nome, sexo));
        for (People i : homens) {
            if (i.getSexo() == "feminino") {
                if (!feminino.contains(i)) {
                    feminino.add(i);
                }
            } else if (i.getSexo() == "masculino") {
                if (!masculino.contains(i)) {
                    masculino.add(i);
                }
            } else {
                System.out.println("Sexo indefinido. ");
            }

        }

        System.out.println("Lista dos homens: " + masculino);
        System.out.println("Lista das mulheres: " + feminino);
        return homens;
    }

    public void chamar() {
        int count = 0;
        int i = 0;
        System.out.println("Deseja cadastrar quantas pessoas? ");
        i = scanner.nextInt();
        while (count < i) {
            count++;
            System.out.println("Entre com nome: ");
            String nome = scanner.nextLine();
            System.out.println("Entre com sexo: ");
            String sexo = scanner.nextLine();
            this.classificar(nome, sexo);
            System.out.println("Rodando " + count + " vezes.");
        }
        System.out.println(this.pessoas);
    }
}
