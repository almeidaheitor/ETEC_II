
package pa_2704_aula5;
import javax.swing.JOptionPane;
public class ParImpar {
    public static void main (String args[]){
     int x=0;
     do{
         x = JOptionPane.showConfirmDialog(null, "Deseja Continuar", "", 0, 3);
     }while (x!=1);
    }
}
