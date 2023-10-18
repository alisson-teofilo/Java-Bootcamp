package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
       this.numeros.add(numero);
    }

    public void calcularSoma(){
        int somaTotal = 0;
        if(!numeros.isEmpty()){
            for(Integer i: numeros){
                somaTotal += i;
            }
        }else{
            throw new RuntimeException("Lista vazia MENOR");
        }
        System.out.println("A soma de todos os numeros é: " + somaTotal);
    }

    public void encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
            System.out.println("O maior numero é: " + maiorNumero);
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()) {
            for (Integer i : numeros) {

                if (i  < menorNumero) {
                    menorNumero = i;
                }
            }
            System.out.println("O menor numero é: " + menorNumero);
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(3);
        soma.adicionarNumero(5);
        soma.adicionarNumero(10);

        soma.calcularSoma();
        soma.encontrarMaiorNumero();
        soma.encontrarMenorNumero();
        soma.exibirNumeros();
    }
}
