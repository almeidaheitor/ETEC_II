
package pa_0405_aula6;
import javax.swing.JOptionPane;

public class Vetor {
    public static void main(String[] args){
        String nomes[] = new String[4]; //declarar vetor
        int x = 0;
        
        for (int i = 0; i < nomes.length; i++){//preencher o vetor
            nomes[i] = JOptionPane.showInputDialog("Digite um nome");
        }
        
        int continuar = 0;
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 3"));
            
            if (x<4 && x>0){//mostrar campo de vetor
                JOptionPane.showMessageDialog(null, nomes[x]);
            }
            continuar = JOptionPane.showConfirmDialog(null, "Deseja outra sequência?", "Saída", 0, 1);
            
        }while (continuar != 1);//diferente de 1
       
    }
}
