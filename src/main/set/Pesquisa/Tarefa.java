package main.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean tarefaConcluida;

    public Tarefa(String descricao, Boolean statusTarefa){
        this.descricao = descricao;
        this.tarefaConcluida = statusTarefa;
    }

    public String getDescricao(){
        return descricao;
    }
    public Boolean getTarefaConcluida(){
        return tarefaConcluida;
    }
    public void setTarefaConcluida (Boolean status){
        this.tarefaConcluida = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaConcluida=" + tarefaConcluida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao) && Objects.equals(tarefaConcluida, tarefa.tarefaConcluida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, tarefaConcluida);
    }
}
