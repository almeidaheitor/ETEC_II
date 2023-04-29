
package pa_0604_aula2;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String arg[]){
        Scanner objS = new Scanner(System.in);
        double num;
        System.out.print("Digite um número: ");
        num = objS.nextDouble();
        if (num > 0){
            System.out.println(num + " é Positivo!");
        } else if (num < 0) {
            System.out.println(num + " é Negativo!");
        } else {
            System.out.println(num + " é Neutro!");
        }
    }
}//fim classe
