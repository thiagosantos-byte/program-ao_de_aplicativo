import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[4];
        int somaPares = 0;
        
        System.out.println("Digite 4 números inteiros:");
        System.out.println("---------------------------");
        
        // Lê os 4 números com tratamento de erro
        for (int i = 0; i < numeros.length; i++) {1
            boolean leuCorreto = false;
            
            while (!leuCorreto) {
                System.out.print("Número " + (i + 1) + ": ");
                
                try {
                    numeros[i] = Integer.parseInt(entrada.nextLine().trim());
                    leuCorreto = true;
                } 
                catch (NumberFormatException e) {
                    System.out.println("Erro: Digite apenas números inteiros válidos!");
                    System.out.println("Tente novamente.\n");
                }
                catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                    System.out.println("Tente novamente.\n");
                }
            }
        }
        
        // Calcula a soma dos pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                somaPares += num;
            }
        }
        
        // Mostra resultado
        System.out.println("\n================ RESULTADO ================");
        System.out.print("Números digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(", ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);
        
        // Mostra quais foram os pares usados (opcional - didático)
        System.out.print("Números pares somados: ");
        boolean temPar = false;
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                temPar = true;
            }
        }
        if (!temPar) {
            System.out.print("nenhum");
        }
        System.out.println();
        
        entrada.close();
    }
}
