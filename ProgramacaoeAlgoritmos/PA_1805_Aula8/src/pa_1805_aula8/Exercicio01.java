/*Declarar 2 vetores com tamanho 1000;
Completá-los com números aleatórios;
Declarar um terceiro e carregá-lo com a soma dos 2 primeiros;
Ordenar e Mostrar.

Vetor A | 10 | 20 | 025 | 05 | 08 | 16 | 02 | 01 | 00 | 012
Vetor B | 05 | 06 | 089 | 02 | 03 | 06 | 15 | 12 | 11 | 000
Vet A+B | 15 | 26 | 114 | 07 | 11 | 22 | 17 | 13 | 11 | 012
Saída   | 07 | 11 | 011 | 12 | 13 | 15 | 17 | 22 | 26 | 114

package pa_1805_aula8;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args){
        int vet1[] = new int[1000];
        int vet2[] = new int[1000];
        for (int i=0; i < 1000; i++){
            vet1[i] = (int)(Math.random()*100);
            vet2[i] = (int)(Math.random()*100);
        }
        int vetAB[] = new int[1000];
        for (int i=0; i<1000; i++){
            vetAB[i] = vet1[i] + vet2[i];
        }
    }
}
*/
package pa_1805_aula8;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args){
        int vet1[] = new int [1000];
        int vet2[] = new int [1000];
        for (int i = 0; i < vet1.length; i++){
            vet1[i] = (int)(Math.random() * 100);
            vet2[i] = (int)(Math.random() * 100);
        }
        int vetAB[]= new int[1000];
        for (int i = 0; i < vet1.length; i++){
            vetAB[i] = vet1[i] + vet2[i];
        }
        Arrays.sort(vetAB);
        JOptionPane.showMessageDialog(null, Arrays.toString(vetAB));
    }
}