// Classe Base - Conta
class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método original
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    // Sobrecarga: sacar(double valor, double taxa)
    public void sacar(double valor, double taxa) {
        double valorTotal = valor + taxa;
        if (valor > 0 && saldo >= valorTotal) {
            saldo -= valorTotal;
            System.out.println("Saque de R$" + valor + " com taxa de R$" + taxa + " realizado. Saldo final: R$" + saldo);
        } else {
            System.out.println("Saque com taxa inválido ou saldo insuficiente.");
        }
    }
}

// Subclasse - ContaCorrente
class ContaCorrente extends Conta {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    // Sobrescrita: Conta corrente cobra taxa automática no saque comum
    @Override
    public void sacar(double valor) {
        double taxaCC = 0.50; // Taxa fixa de 50 centavos
        System.out.print("[Conta Corrente] ");
        super.sacar(valor, taxaCC);
    }
}

// Subclasse - ContaPoupanca
class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    // Sobrescrita: Conta poupança permite saque sem taxa padrão
    @Override
    public void sacar(double valor) {
        System.out.print("[Conta Poupança] ");
        super.sacar(valor);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste Conta Corrente ---");
        ContaCorrente cc = new ContaCorrente(1000.0);
        cc.sacar(100.0); // Usa o sacar sobrescrito (com taxa fixa 0.50)
        cc.sacar(50.0, 2.0); // Usa a sobrecarga (taxa informada 2.0)

        System.out.println("\n--- Teste Conta Poupança ---");
        ContaPoupanca cp = new ContaPoupanca(1000.0);
        cp.sacar(100.0); // Usa o sacar sobrescrito (sem taxa)
        cp.sacar(100.0, 0.0); // Usa a sobrecarga

        System.out.println("\n--- Teste Saque Inválido ---");
        cc.sacar(2000.0); // Saldo insuficiente
    }
}

