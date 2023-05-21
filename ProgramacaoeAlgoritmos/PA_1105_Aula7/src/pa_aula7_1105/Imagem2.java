package pa_aula7_1105;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Imagem2 {
    public static void main(String[] args){
        int x, foto;
        Image troca;
        ImageIcon icone;
        do{
            try{
                foto = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de \n 1 a 7"));
            }catch (Exception ex){
                foto = 0;
            }
            switch(foto){
                case 1: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem1.jpg"));
                break;
                case 2: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem2.jpg"));
                break;
                case 3: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem3.jpg"));
                break;
                case 4: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem4.jpg"));
                break;
                case 5: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem5.jpg"));
                break;
                case 6: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem6.jpg"));
                break;
                case 7: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/imagem7.jpg"));
                break;
                default: troca = Toolkit.getDefaultToolkit().getImage(Imagem2.class.getResource("img/pikachu.PNG"));
                
            }
            icone = new ImageIcon(troca);
            icone.setImage(troca.getScaledInstance(500, 400, 3));
            JOptionPane.showMessageDialog(null, icone, "Imagens", -1);
            x = JOptionPane.showConfirmDialog(null, "Quer ver outra imagem?", "Imagens", 0, -1);
        }while(x!= 1);
    }
}
