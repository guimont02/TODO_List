package Todo_list;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList todoList = new TodoList();
        boolean run = true;

        while (run) {
            System.out.println("Todo List");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    ListaDeTarefas listaDeTarefas1 = new ListaDeTarefas();
                    System.out.println("Nome da tarefa: ");
                    listaDeTarefas1.setNomeTarefa(sc.nextLine());
                    System.out.println("Descrição: ");
                    listaDeTarefas1.setDescricao(sc.nextLine());
                    System.out.println("Data de término: ");
                    listaDeTarefas1.setDataTermino(sc.nextLine());
                    System.out.println("Prioridade 1-5: ");
                    listaDeTarefas1.setPrioridade(Integer.parseInt(sc.nextLine()));
                    System.out.println("To Do");
                    System.out.println("Doing");
                    System.out.println("Done");
                    System.out.println("Status: ");
                    String status = sc.nextLine();
                    listaDeTarefas1.setStatus(status);
                    System.out.println("----------------------------------------------");
                    todoList.addTask(listaDeTarefas1);
                    break;
                case "2":
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int index = sc.nextInt();
                    todoList.removeTask(index - 1);
                    System.out.println("----------------------------------------------");
                    break;
                case "3":
                    todoList.displayTasks();
                    System.out.println("----------------------------------------------");
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}