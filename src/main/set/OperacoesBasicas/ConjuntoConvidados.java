package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add( new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvidado){
        Convidado convidadoRemover = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c: convidadoSet){
                if(c.getCodigoConvite() == codigoConvidado){
                    convidadoRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoRemover);
        }else {
            System.out.println("A lista de convidados está vazia");
        }

        if(convidadoRemover == null){
            System.out.println("Não há convidados para remover");
        }
    }

    public Set<Convidado> exibeListaConvidado(){
        return convidadoSet;
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Alisson", 1234);
        convidados.adicionarConvidado("Vitória", 4321);
        convidados.adicionarConvidado("Dinha", 1604);
        convidados.adicionarConvidado("Dinha2", 1604);
        convidados.adicionarConvidado("Wesley", 3101);

        convidados.removerConvidado(1604);
        System.out.println(convidados.exibeListaConvidado());
        System.out.println(convidados.contarConvidado());
    }


}
