
package aula3;
import java.util.Scanner;

public class Aula3 {

    
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        Scanner objS = new Scanner(System.in);
        System.out.print("Digite o valor de x²");
        a = objS.nextDouble();
        System.out.print("Digite o valor de x");
        b = objS.nextDouble();
        System.out.print("Digite o termo final");
        c = objS.nextDouble();
        delta = (b*b) - 4 * a * c;
        if (delta >= 0){
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("Valor de x² = " + x1);
            System.out.println("Valor de x = " + x2);
        }else{
            System.out.println("Não existe raiz de delta negativo");
        }
    }
    
}
