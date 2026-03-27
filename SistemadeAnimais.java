
import java.util.*;


class animal{
  String nome;
  
  public Animal(String nome){
    this.nome = nome;
    
  }
  
}

  void emitirSom(){
    System.out.println("Som generico de animal");
  }
  
  class Cachorro(String nome);
  super(nome);
  }
  
  @Override
  void emitirSom(){
    System.out.println("Au Au");
  }
  
  void emitirSom(int vezes){
    for(int i = 0; i < i < vezes; i++){
      System.out.println("Au");
      
    }
  }
  
  
  class Gato extends Animal {
    public Gato(String nome){
      super(nome);
    }
    
    @Override
    void emitirSom(){
      System.out.println("Miau");
      
    }
  }
  
  public class Main {
    
    public static void main(String[]args){
      Cachorro dog = new cachorro("Rex");
      Gato cat = new gato("Mimi");
      
      dog.emitirSom();
      dog.emitirSom(3);
      
      cat.emitirSom();
    }
  }
