
package pa_2704_aula5;
import javax.swing.JOptionPane;

public class PA_2704_Aula5 {

    public static void main(String[] args) {
        int idade;
        String idade2;
        idade2 = JOptionPane.showInputDialog("Digite sua idade");
        idade = Integer.parseInt(idade2);
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, nome + " " + idade + " Primeiro Painel");
    }
    
}
