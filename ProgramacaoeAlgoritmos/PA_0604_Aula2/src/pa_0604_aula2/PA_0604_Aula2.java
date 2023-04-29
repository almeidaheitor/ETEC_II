/*
 Aula de Programação e Algoritmos 06/04/2023
 */
package pa_0604_aula2;
import java.util.Scanner;

public class PA_0604_Aula2 {//início classe

    public static void main(String[] args) {//MP
        Scanner objHei = new Scanner(System.in, "latin1");
        System.out.print("Digite seu nome: ");
        String nome = objHei.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = objHei.next();
        System.out.println("Boa noite, " + nome + " " + sobrenome);
        
    }//fimMP
    
}//fim classe
