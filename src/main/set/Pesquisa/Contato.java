package main.set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroContato;

    public Contato(String nome, int numeroContato){
        this.nome = nome;
        this.numeroContato = numeroContato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return numeroContato == contato.numeroContato && Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroContato);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroContato=" + numeroContato +
                '}';
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumeroContato(){
        return numeroContato;
    }
    public void setNumeroContato(int numeroContato){
        this.numeroContato = numeroContato;
    }

}
