package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String descricao){
        List<Item> listaComprasParaRemover = new ArrayList<>();
        if(!itens.isEmpty()){
            for (Item i: itens){
                if(i.getNome().equalsIgnoreCase(descricao)){
                    listaComprasParaRemover.add(i);
                }
            }
            itens.removeAll(listaComprasParaRemover);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    public void calcularValorTotal(List <Item> listaCompras ){
        double valorTotal = 0;

        for (Item item : listaCompras) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("O valor total do carinho é de: " + valorTotal);
    }

    public void exibirItens(){
        for (Item item : itens) {
            System.out.println(item);
        }
    }


    public static void main(String[] args) {

        CarrinhoDeCompras listaCompras = new CarrinhoDeCompras();

        listaCompras.adicionarItem("leite", 6.20, 3);
        listaCompras.adicionarItem("cafe", 21.90, 4);
        listaCompras.adicionarItem("arroz", 15.50, 4);
        listaCompras.adicionarItem("feijao", 13.00, 5);

        listaCompras.calcularValorTotal(listaCompras.itens);
        listaCompras.removerItem("leite");
        listaCompras.exibirItens();
      
    }

}
