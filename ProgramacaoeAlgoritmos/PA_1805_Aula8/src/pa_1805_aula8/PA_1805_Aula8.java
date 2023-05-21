package pa_1805_aula8;
import javax.swing.JOptionPane;

public class PA_1805_Aula8 {


    public static void main(String[] args) {
        int num = 0, tamanho = 0, res = 0;
        String texto = "";
        do{
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
                tamanho = Integer.toString(num).length();
                texto = num + "";
            }catch (Exception ex){
                num = 0;
                tamanho = 0;
            }
            res = 0;
            char separar;
            for(int i = 0; i < tamanho; i++){
                separar = texto.charAt(i);
                num = Integer.parseInt(separar + "");
                res = res + (int)Math.pow(num, tamanho);
        }
        }while(!texto.equals(Integer.toString(res)));
        JOptionPane.showMessageDialog(null, res);
    }
    
}
