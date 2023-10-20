package main.set.OperacoesBasicas;

import java.util.Objects;

public class Palavra {
    private String palavra;

    public Palavra(String palavra){
        this.palavra = palavra;
    }
    public Palavra(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Palavra palavra1)) return false;
        return Objects.equals(getPalavra(), palavra1.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }
    public String getPalavra(){
        return palavra;
    }

    public void setPalavra(String palavra){
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
