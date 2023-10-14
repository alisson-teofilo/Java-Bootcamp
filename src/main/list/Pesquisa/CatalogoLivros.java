package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor){
        List<Livros> livrosEncontrados = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l: livrosList) {
                if (l.getAutor().toString().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(l);
                }
                System.out.println("autor " + autor);
                System.out.println("l.getAutor().toString() " + l.getAutor().toString());
            }
        } else{
            System.out.println("pesquisarPorAutor: A lista está vazia");
        }
        System.out.println("Pesquisa por Autor " + livrosEncontrados);
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosEncontrados = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros l: livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosEncontrados.add(l);
                }
            }
        }else {
            System.out.println("pesquisarPorIntervaloAnos: A lista esta vazia");
        }
        System.out.println("Pesquisa por intervalo " + livrosEncontrados);
    }

    public void pesquisaPorTitulo(String titulo){
        List <Livros> livroEncontrado = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado.add(l);
                }
            }
        } else {
            System.out.println("pesquisaPorTitulo: A lista esta vazia");
        }
        System.out.println("Pesquisa por titulo " + livroEncontrado);
    }
    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Garra ", "Angela ", 2005);
        livros.adicionarLivro("Robson Crozue ", "Jose ", 2000);

        livros.pesquisarPorAutor("Angela");
        livros.pesquisarPorIntervaloAnos(2005,2006);
        livros.pesquisaPorTitulo("Garra");
    }

}
