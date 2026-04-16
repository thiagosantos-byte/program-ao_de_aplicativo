public class Aluno {

    private String nome;
    private double[] notas;

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new double[0]; // inicia com array vazio
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para notas com validação
    public void setNotas(double[] novasNotas) {
        if (novasNotas == null) {
            System.out.println("Erro: Array de notas não pode ser nulo.");
            return;
        }

        // Validação: nenhuma nota pode ser < 0 ou > 10
        for (double nota : novasNotas) {
            if (nota < 0 || nota > 10) {
                System.out.println("Erro: Todas as notas devem estar entre 0 e 10. Nota inválida: " + nota);
                return; // não altera o array se houver nota inválida
            }
        }

        // Se todas as notas forem válidas, copia para o atributo
        this.notas = new double[novasNotas.length];
        for (int i = 0; i < novasNotas.length; i++) {
            this.notas[i] = novasNotas[i];
        }
    }

    // Getter para notas
    public double[] getNotas() {
        return notas;
    }

    // Calcula e mostra a média
    public void calcularMedia() {
        if (notas.length == 0) {
            System.out.println("Aluno: " + nome + " - Nenhuma nota cadastrada.");
            return;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        // Regra: média não pode ser negativa (embora a validação já impeça)
        if (media < 0) {
            media = 0;
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Quantidade de notas: " + notas.length);
        System.out.printf("Média: %.2f%n", media);
        
        resultado(media); // chama o método resultado
    }

    // Mostra se o aluno foi aprovado ou reprovado
    public void resultado(double media) {
        System.out.println("Resultado: " + (media >= 7.0 ? "APROVADO" : "REPROVADO"));
        System.out.println("-----------------------------------");
    }
}
