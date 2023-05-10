
package pa_2704_aula5;
import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main (String args[]){
//        JOptionPane.showMessageDialog(null, "Texto Saída", "Título", -1);
//        JOptionPane.showMessageDialog(null, "Texto Saída", "Título", 0);
//        JOptionPane.showMessageDialog(null, "Texto Saída", "Título", 1);
//        JOptionPane.showMessageDialog(null, "Texto Saída", "Título", 2);
//        JOptionPane.showMessageDialog(null, "Texto Saída", "Título", 3);

String num1;
num1 = JOptionPane.showInputDialog("Digite um número");

try{
    int numero = Integer.parseInt(num1);
}catch (Exception e){
    JOptionPane.showMessageDialog(null, "Você não digitou um número");
}
        
    }
}
