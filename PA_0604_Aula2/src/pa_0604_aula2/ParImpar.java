
package pa_0604_aula2;
import java.util.Scanner;

public class ParImpar {//inicio classe
    public static void main(String Hei[]){
        Scanner objS = new Scanner(System.in);
        int num;
        System.out.print("Digite um número inteiro: ");
        num = objS.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " é Par");
        } else {
            System.out.println(num + " é Ímpar");
        }
    
    }
}//fim classe