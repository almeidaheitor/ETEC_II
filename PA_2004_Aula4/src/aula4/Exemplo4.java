package aula4;
import java.util.Scanner;
public class Exemplo4 {//início cass
    public static void main (String args[]) {//início static
        Scanner objS= new Scanner (System.in);
        int num;
        System.out.print("Digite a quantidade de jogos: ");
        num = objS.nextInt();
        for (int i=1; i <=6 ; i++){//início for
            System.out.println("\n");
            for(int x=1; x <=6 ; x++){//inicío for
            System.out.print(" - " + ( (int)(Math.random()*60)+1) );
            }//fim for
        }//fim for
    }//fim static
}//fim class
