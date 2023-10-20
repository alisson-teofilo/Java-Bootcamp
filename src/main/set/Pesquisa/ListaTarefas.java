package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> conjuntoTarefaSet;

    public ListaTarefas(){
        this.conjuntoTarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descicao, Boolean status){
        conjuntoTarefaSet.add(new Tarefa(descicao, status));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!conjuntoTarefaSet.isEmpty()){
            for (Tarefa t: conjuntoTarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                }
            }
            conjuntoTarefaSet.remove(tarefaParaRemover);
        }else {
            System.out.println("não há tarefas, a lista está vazia");
        }
    }

    public Set<Tarefa> exibirTarefas(){
        return conjuntoTarefaSet;
    }

    public int contarTarefas(){
        return conjuntoTarefaSet.size();
    }

    public Set<Tarefa> obterTarefaConcluida(){
        Set<Tarefa> tarefasConcluida = new HashSet<>();
        if(!conjuntoTarefaSet.isEmpty()){
            for (Tarefa t: conjuntoTarefaSet){
                if(t.getTarefaConcluida()){
                    tarefasConcluida.add(t);
                }
            }
        }else {
            System.out.println("O conjunto esta vazio");
        }
        return tarefasConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!conjuntoTarefaSet.isEmpty()){
            for (Tarefa t: conjuntoTarefaSet){
                if(!t.getTarefaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }else {
            System.out.println("O conjunto esta vazio");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!conjuntoTarefaSet.isEmpty()){
            for (Tarefa t: conjuntoTarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);
                }
            }
        }else {
            System.out.println("O conjunto está vazio");
        }
    }
    public void marcarTarefaPendente(String descricao){
        if(!conjuntoTarefaSet.isEmpty()){
            for (Tarefa t: conjuntoTarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(false);
                }
            }
        }else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void limparListaTarefas(){
        conjuntoTarefaSet = null;
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("limpar a casa", false);
        lista.adicionarTarefa("estudar", true);
        lista.adicionarTarefa("lavar louça", true);
        lista.adicionarTarefa("fazer trabalho", true);

        System.out.println(lista.exibirTarefas());
        lista.removerTarefa("estudar");
        System.out.println("quantidade tarefas " + lista.contarTarefas());
        System.out.println("tarefas concluidas " + lista.obterTarefaConcluida());
        System.out.println("tarefas pendentes " + lista.obterTarefasPendentes());
        lista.marcarTarefaConcluida("lavar louça");
        lista.marcarTarefaPendente("fazer trabalho");
        System.out.println(lista.exibirTarefas());
    }


}
