// 1. Classe Base: Pessoa
class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método original
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome);
    }

    // Sobrecarga: apresentar(String mensagem)
    public void apresentar(String mensagem) {
        System.out.println(mensagem + ", meu nome é " + this.nome);
    }
}

// 2. Subclasse: Aluno
class Aluno extends Pessoa {
    String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    // Sobrescrita: @Override apresentar()
    @Override
    public void apresentar() {
        System.out.println("Oi, sou o aluno " + this.nome + " e estudo " + this.curso + ".");
    }
}

// 3. Subclasse: Professor
class Professor extends Pessoa {
    String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    // Sobrescrita: @Override apresentar()
    @Override
    public void apresentar() {
        System.out.println("Olá, sou o professor " + this.nome + " de " + this.disciplina + ".");
    }
}

// 4. Teste no Main.java
public class Main {
    public static void main(String[] args) {
        // Criando instâncias
        Pessoa p1 = new Pessoa("Carlos");
        Aluno a1 = new Aluno("Ana", "Engenharia");
        Professor prof1 = new Professor("Roberto", "Física");

        System.out.println("--- Teste de Sobrescrita (Polimorfismo) ---");
        p1.apresentar();    // Chamada Pessoa
        a1.apresentar();    // Chamada Aluno (Sobrescrito)
        prof1.apresentar(); // Chamada Professor (Sobrescrito)

        System.out.println("\n--- Teste de Sobrecarga (Mesmo nome, parametros diferentes) ---");
        a1.apresentar("E aí");
        prof1.apresentar("Bom dia");
    }
}
