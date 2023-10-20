package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> congContatoSet;

    public AgendaContatos(){
        this.congContatoSet = new HashSet<>();
    }

    public void adicionaContato(String nome, int numeroContato){
        congContatoSet.add( new Contato(nome, numeroContato));
    }

    public Set<Contato> exibirContatos(){
        return congContatoSet;
    }

    public Contato pesquisarPorNome(String nome){
        Contato contatoEncontrado = null;
        if(!congContatoSet.isEmpty()){
            for (Contato c: congContatoSet) {
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatoEncontrado = c;
                }
            }
        }else {
            System.out.println("O conjusto esta vazio");
        }
        return contatoEncontrado;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contato = null;
        if(!congContatoSet.isEmpty()){
            for(Contato c: congContatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroContato(novoNumero);
                    contato = c;
                }

            }
        }else {
            System.out.println("A lista esta vazia");
        }
        return contato;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionaContato("Alisson", 996885920);
        contatos.adicionaContato("Vitória", 333333);
        contatos.adicionaContato("Dinha", 44444444);
        contatos.adicionaContato("Wesley", 55555);

        System.out.println("exibe " + contatos.exibirContatos());
        System.out.println("pesquisa " + contatos.pesquisarPorNome("Alisson"));
        System.out.println(contatos.atualizarNumeroContato("Alisson", 11111));
    }


}


