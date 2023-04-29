package pa_0604_aula2;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String arg[]){
        Scanner teste = new Scanner(System.in, "latin1");
        double num1, num2;
        String nome;
        System.out.print("Digite o nome do aluno: ");
        nome = teste.next();
        System.out.print("Digite a primeira nota: ");
        num1 = teste.nextDouble();
        System.out.print("Digite a segunda nota: ");
        num2 = teste.nextDouble();
        double media = (num1 + num2)/2;
        if (media >= 7){
            System.out.println(nome + " Aprovado");
        } else if (media < 5) {
            System.out.println(nome + " Reprovado");
        } else{
            System.out.println(nome + " Recuperação");
        }
        
    }
}//fim classe