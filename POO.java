import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Aluno[] listaAlunos = new Aluno[5];
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < listaAlunos.length; i++) {
            System.out.println("Cadastro do Aluno " + (i + 1));
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            
            listaAlunos[i] = new Aluno(nome, idade, matricula);
            System.out.println("---");
        }

        
        System.out.println("\n--- Lista de Alunos Cadastrados ---");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno.toString());
        }

        sc.close();
    }
}
