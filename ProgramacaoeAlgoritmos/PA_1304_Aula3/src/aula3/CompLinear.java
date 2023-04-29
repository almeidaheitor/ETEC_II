package aula3;
import java.util.Scanner;
public class CompLinear {

    //Crie um programa que receba a largura e o comprimento de um lote de terra e mostre o comprimento linear
    public static void main(String args[]) {
        double larg, comp, linear;
        Scanner objS = new Scanner (System.in);
        System.out.print("Digite a largura do lote: ");
        larg = objS.nextDouble();
        System.out.print("Digite o comprimento do lote: ");
        comp = objS.nextDouble();
        linear = larg * 2 + comp *2;
        System.out.println("O comprimento linear do lote é: " + linear);
        
    }
}
