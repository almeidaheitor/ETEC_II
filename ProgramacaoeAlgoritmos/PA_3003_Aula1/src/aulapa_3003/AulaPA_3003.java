package aulapa_3003;
import java.util.Scanner;

public class AulaPA_3003 {//Início Classe
    public static void main(String[] args) {//MP
      
        System.out.println("Meu primeiro programa Java");
        double num1, num2;
        Scanner objS = new Scanner(System.in);
        
        System.out.print("Digite um número");
        
        num1 = objS.nextDouble();
        
        System.out.print("Digite outro número");
        
        num2 = objS.nextDouble();
        
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        
  
        
    }//fim MP
    
}//Fim Classe
