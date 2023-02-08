package Todo_list;
import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    public ArrayList<ListaDeTarefas> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(ListaDeTarefas task) {
        this.tasks.add(task);
        ordenaTarefasPrioridade();
    }


    public void removeTask(int index) {
        tasks.remove(index);
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void ordenaTarefasPrioridade(){
        Collections.sort(tasks, (t1, t2) -> t2.getPrioridade() - t1.getPrioridade());
    }



}
