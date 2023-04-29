package aula4;
import java.util.Scanner;
public class Exemplo5 {//início class
    public static void main (String args[]){//início static
        Scanner objS= new Scanner (System.in);
        int num, acerto;
        num = (int)(Math.random() * 1000);
        System.out.print("Digite um número: ");
        acerto = objS.nextInt();
        for (int i=1; i <=3; i++){//início for
            if (acerto == num){//início if
            System.out.println("Acertouuu!");
            break;
            }//fim if
            else{//início else
                System.out.println("Errouuuuuuu!");
            }//fim else
                System.out.print("Digite o 2º número: ");
                acerto = objS.nextInt();
        }//fim for
        System.out.println(num);
    }//fim static
}//fim class
