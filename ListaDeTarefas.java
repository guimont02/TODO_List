package Todo_list;

import java.util.Collections;
import java.util.List;

public class ListaDeTarefas {
    private String nomeTarefa;
    private String descricao;
    private String dataTermino;

    private int prioridade;

    private String status;

    public ListaDeTarefas() {

    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public ListaDeTarefas(String nomeTarefa, String descricao, String dataTermino, int prioridade, String status){
        super();
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = (prioridade);
        this.status = status;
    }

    @Override
    public String toString() {
        return "ListaDeTarefas{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTermino='" + dataTermino + '\'' +
                ", prioridade=" + prioridade +
                ", status='" + status + '\'' +
                '}';
    }

}
