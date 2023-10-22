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

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaPorNome = new HashSet<>();
        if(!congContatoSet.isEmpty()){
            for (Contato c: congContatoSet) {
                if(c.getNome().startsWith(nome)){
                    pesquisaPorNome.add(c);
                }
            }
        }else {
            System.out.println("O conjusto esta vazio");
        }
        return pesquisaPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if(!congContatoSet.isEmpty()){
            for(Contato c: congContatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroContato(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }else {
            System.out.println("A lista esta vazia");
        }
        return contatoAtualizado;
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


