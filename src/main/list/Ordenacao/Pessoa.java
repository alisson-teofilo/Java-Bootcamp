package main.list.Ordenacao;

import java.util.Comparator;

public class Pessoa  implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private int alturaEmCm;

    public Pessoa(String nome, int idade, int alturaEmCm){
        this.nome = nome;
        this.idade = idade;
        this.alturaEmCm = alturaEmCm;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(idade, pessoa.getIdade());
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getAlturaEmCm(){
        return alturaEmCm;
    }
    public void setAlturaEmCm(int alturaEmCm){
        this.alturaEmCm = alturaEmCm;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturaEmCm=" + alturaEmCm +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2){
        return Integer.compare(p1.getAlturaEmCm(), p2.getAlturaEmCm());
    }
}
