package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProduto(){
        this.estoqueProdutos = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque(){
        double valorTodal = 0d;
        if (!estoqueProdutos.isEmpty()){
            for (Produto p: estoqueProdutos.values()){
              valorTodal += p.getQuantidadeEstoque() * p.getPreco();
            }
        }else {
            System.out.println("O estoque está vazio");
        }
        return valorTodal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produto = null;
        double produtoMaisCaro = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p: estoqueProdutos.values()){
                if(p.getPreco() > produtoMaisCaro){
                    produto = p;
                }
            }
        }else{
            System.out.println("Estoque vazio");
        }
        return produto;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produto = null;
        double produtoMaisBarato = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto p: estoqueProdutos.values()){
                if(p.getPreco() < produtoMaisBarato){
                    produto = p;
                }
            }
        }else{
            System.out.println("Estoque vazio");
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidadeEstoque();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}
