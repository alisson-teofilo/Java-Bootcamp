package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato(){
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionaContato(String nome, Integer telefone){
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
      agendaContatoMap.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionaContato("Alisson", 98645);
        agendaContato.adicionaContato("Tereza", 5642);
        agendaContato.adicionaContato("Jordan", 4235);
        agendaContato.adicionaContato("Tiao", 9746);

        agendaContato.exibirContatos();
        agendaContato.removerContato("Tiao");
        agendaContato.exibirContatos();
        System.out.println("O numero do conato é: " + agendaContato.pesquisarPorNome("Jordan"));
    }

}
