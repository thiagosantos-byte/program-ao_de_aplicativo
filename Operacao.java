/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuada;
import javax.swing.JOptionPane;
/**
 *
 * @author 021.900803
 */
public class Operacao {
    
    String res="";
 
    
    public void adicao(int n, int x){
        
        
        res+=String.valueOf(n)+" + "+String.valueOf(x)+" = "+String.valueOf(n+x)+"\n";
        
    }

    public void subtracao(int n, int x){
        
        res+=String.valueOf(n+x)+" - "+String.valueOf(n)+" = "+String.valueOf(n+x)+"\n";
      
    }
    
    public void multiplicacao(int n, int x){
        
        res+=String.valueOf(n+x)+" x "+String.valueOf(x)+" = "+String.valueOf(n*x)+"\n";
    }
    
    public void divisao(int n, int x){
        
        res+=String.valueOf(n*x)+" ÷ "+String.valueOf(n)+" = "+String.valueOf(x)+"\n";
        
    }
    
    public void imprimir(){
    
        JOptionPane.showMessageDialog(null, res, "Tabuada",0);
        
}
}
