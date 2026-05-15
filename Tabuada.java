package tabuada;

import javax.swing.JOptionPane;

public class Tabuada {

    public static void main(String[] args) {
      
        Operacao op = new Operacao();
      
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número", "Número", 1));
        
        String simb = JOptionPane.showInputDialog(null, 
                "1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão", 
                "Escolha a Operação", 1);
      
        for (int x = 0; x <= 10; x++) { 
            switch (simb) {
                case "1" -> op.adicao(num, x);
                case "2" -> op.subtracao(num, x);
                case "3" -> op.multiplicacao(num, x);
                case "4" -> op.divisao(num, x);
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    return; 
                }
            }
        } 
        
    
        op.imprimir();
    }
}

