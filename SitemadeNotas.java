public class Carro {
    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            if (this.velocidadeAtual + valor <= this.velocidadeMaxima) {
                this.velocidadeAtual += valor;
                System.out.println(marca + " acelerou. Vel. Atual: " + this.velocidadeAtual + " km/h");
            } else {
                this.velocidadeAtual = this.velocidadeMaxima;
                System.out.println(marca + " atingiu a velocidade máxima: " + this.velocidadeMaxima + " km/h");
            }
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            if (this.velocidadeAtual - valor >= 0) {
                this.velocidadeAtual -= valor;
                System.out.println(marca + " freou. Vel. Atual: " + this.velocidadeAtual + " km/h");
            } else {
                this.velocidadeAtual = 0;
                System.out.println(marca + " parou totalmente.");
            }
        }
    }

    
    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }
}
