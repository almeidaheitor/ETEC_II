
package aula3;
import java.util.Scanner;

//Crie um programa que receba 5 valores que receba 5 valores quaisquer e mostre a média entre eles.
public class Media {
    public static void main(String args[]) {
        double x1,x2,x3,x4,x5,media;
        Scanner objS = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        x1 = objS.nextDouble();
        System.out.print("Digite o segundo número: ");
        x2 = objS.nextDouble();
        System.out.print("Digite o terceiro número: ");
        x3 = objS.nextDouble();
        System.out.print("Digite o quarto número: ");
        x4 = objS.nextDouble();
        System.out.print("Digite o quinto número: ");
        x5 = objS.nextDouble();
        media = (x1+x2+x3+x4+x5) /5;
        System.out.println("A média dos 5 números digitados é: " + media);
    }
}
