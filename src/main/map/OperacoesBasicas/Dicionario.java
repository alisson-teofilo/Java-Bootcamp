package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirPalavra(){
        System.out.println(palavrasMap);
    }

    public String pesquisaPorPalavra(String palavra){
        String numeroPalavra = null;
        if(!palavrasMap.isEmpty()){
            numeroPalavra = palavrasMap.get(palavra);
        }
        return numeroPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Carro", "meio de transporte");
        dicionario.adicionarPalavra("Bicicleta", "meio de transporte economico");
        dicionario.adicionarPalavra("Laranja", "fruta cítrica");
        dicionario.adicionarPalavra("Fone", "objeto usado para ouvir musica");

        dicionario.exibirPalavra();
        dicionario.removerPalavra("Carro");
        System.out.println(dicionario.pesquisaPorPalavra("Laranja"));
        dicionario.exibirPalavra();
    }
}
