package aula3;
import java.util.Scanner;

//Uma determinada pessoa que trabalha com a construção de piscina precisa de um programa que calcule o valor das construções solicitadas pelos clientes, sabendo-se que os clientes sempre fornecem o comprimento, a largura e a profundidade da piscina a ser construída. Leve em consideração que o valor da cosntrução é cobrado por metro cúbico da piscina e o preço 120,00 por metro cúbico.
public class Piscina {
    public static void main(String args[]) {
        double comp, larg, prof, vt;
        Scanner objS = new Scanner (System.in);
        System.out.print("Digite o comprimento da piscina: ");
        comp = objS.nextDouble();
        System.out.print("Digite a largura da piscina: ");
        larg = objS.nextDouble();
        System.out.print("Digite a profundidade da piscina: ");
        prof = objS.nextDouble();
        vt = (comp * larg * prof) * 120;
        System.out.println("O valor da piscina será de R$ " + vt);
       
        }
        
}
