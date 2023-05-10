
package pa_0405_aula6;
import javax.swing.JOptionPane;

public class PA_0405_Aula6 {

    
    public static void main(String[] args) {
        int x;
        do{
            long numero;
            String binario="";
            numero = Long.parseLong(JOptionPane.showInputDialog("Digite um número"));
            while(numero > 0){
                binario = (numero % 2) + binario;
                numero = numero/2;
            }
            JOptionPane.showMessageDialog(null, binario);
            x = JOptionPane.showConfirmDialog(null, "Quer continuar?", "", 0,1);
        }while (x<1);
    }
    
}
