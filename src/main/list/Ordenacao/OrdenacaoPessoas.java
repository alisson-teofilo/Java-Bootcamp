package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas(){
        this.listPessoa = new ArrayList<>();
    }

    public List<Pessoa> adicionarPessoa(String nome, int idade, int alturEmCm){
        listPessoa.add(new Pessoa(nome, idade, alturEmCm));
        return listPessoa;
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(listPessoa);
        if(!listPessoa.isEmpty()){
            Collections.sort(pessoasOrdenadas);
        }else{
            System.out.println("A lista esta vazia");
        }
        return pessoasOrdenadas;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaOrdenadas = new ArrayList<>(listPessoa);
        if(!listPessoa.isEmpty()){
            Collections.sort(pessoaOrdenadas, new ComparatorPorAltura());
        }else {
            System.out.println("A lista está vazia");
        }
        return pessoaOrdenadas;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listaDePessoas = new OrdenacaoPessoas();

        listaDePessoas.adicionarPessoa("Alisson", 30, 172);
        listaDePessoas.adicionarPessoa("Vitória", 21, 153);
        listaDePessoas.adicionarPessoa("Dinha", 28, 160);
        listaDePessoas.adicionarPessoa("Wesley", 36, 170);

        System.out.println("Por idade: " + listaDePessoas.ordenarPorIdade());
        System.out.println("Por altura: " + listaDePessoas.ordenarPorAltura());
    }
}

