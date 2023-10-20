package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> setPalavraUnica;

    public ConjuntoPalavrasUnicas(){
        this.setPalavraUnica = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        setPalavraUnica.add(new Palavra(palavra));
    }
        public void removerPalavra(String palavra){
            Palavra palavrasRemover = null;
            if(!setPalavraUnica.isEmpty()){
                for (Palavra p: setPalavraUnica) {
                    if(p.getPalavra().equalsIgnoreCase(palavra)){
                        palavrasRemover = p;
                    }
                    setPalavraUnica.remove(palavrasRemover);
                }
            }else {
                System.out.println("A lista está vazia");
            }
            if (palavrasRemover == null){
                System.out.println("Não há palavras para remover");
            }
        }

        public void verificarPalavra(String palavra){
            Palavra palavraPresente = null;
            if(!setPalavraUnica.isEmpty()){
                for(Palavra p: setPalavraUnica){
                    if (p.getPalavra().equalsIgnoreCase(palavra)){
                        palavraPresente = p;
                    }
                }
            } else {
                System.out.println(" A lista está vazia");
            }if(palavraPresente == null){
                System.out.println("Não há palavras iguais a" + palavra);
            }else{
                System.out.println("Palavra encontrada " + palavraPresente);
            }
        }

        public Set<Palavra> exibirPalavrasUnicas(){
            return setPalavraUnica;
        }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Manga");
        palavras.adicionarPalavra("Banana");
        palavras.adicionarPalavra("Jaca");
        palavras.adicionarPalavra("Tomate");

        palavras.removerPalavra("Banana");
        palavras.verificarPalavra("Jaca");
        System.out.println(palavras.exibirPalavrasUnicas());

    }

}






















