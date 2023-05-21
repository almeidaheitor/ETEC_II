package pa_1805_aula8;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class SorteioOrdem {
    public static void main(String[] args){
        int num[] = new int[6];
        int continuar = 0;
        do{
            int x = 0;
            String res ="";
            for (int i = 0; i < num.length; i++){//sorteia os números
                x = (int)(Math.random()*60)+1;
                for (int f = 0; f < num.length; f++){//garante que não se repitam
                    if(x == num[f]){
                        f = 0;
                        x = (int)(Math.random()*60) + 1;
                    }
                }
                num[i] = x;
            }
            Arrays.sort(num); //coloca o vetor em ordem
            JOptionPane.showMessageDialog(null, Arrays.toString(num)); //imprime o vetor
            continuar = JOptionPane.showConfirmDialog(null, "Deseja outra sequência?", "Saída", 0, 3);
        }while(continuar!=1);
        
    }
}
