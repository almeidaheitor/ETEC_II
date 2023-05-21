
package pa_aula7_1105;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PA_Aula7_1105 {

 
    public static void main(String[] args) {
        Image troca = Toolkit.getDefaultToolkit().
                getImage(PA_Aula7_1105.class.getResource("img/imagem1.jpg"));
        ImageIcon icone = new ImageIcon(troca);
        icone.setImage (troca.getScaledInstance(500, 400, 3));
            //Largura, Altura, tipo escala
        JOptionPane.showMessageDialog(null, icone, "Imagens", -1);
    }
    
}
