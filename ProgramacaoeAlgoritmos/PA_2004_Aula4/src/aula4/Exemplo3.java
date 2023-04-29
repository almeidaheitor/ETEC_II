package aula4;
import java.util.Scanner;
public class Exemplo3 {//início class
    public static void main (String args[]){//início static
        Scanner objS = new Scanner(System.in);
        int num;
        System.out.print("Digite um número para ver a Tabuada: ");
        num = objS.nextInt();
        for (int i=1; i <=10; i++){//início for
            System.out.println
            (num + " x "+ i +" = "+(num*i));
        }//fim for
    }//fim static
}//fim class
