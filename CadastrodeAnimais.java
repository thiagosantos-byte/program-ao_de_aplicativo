// Classe base Animal
class Animal {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Raça: " + raca);
    }
}

// Classe Gato que herda de Animal
class Gato extends Animal {
    private String cor;

    public Gato(String nome, double peso, String cor) {
        super(nome, peso);
        this.cor = cor;
    }

    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Cor: " + cor);
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 20.5, "Labrador");
        Gato gato = new Gato("Mimi", 4.2, "Branco");

        System.out.println("Informações do Cachorro:");
        cachorro.mostrarAnimal();

        System.out.println("\nInformações do Gato:");
        gato.mostrarAnimal();
    }
}
