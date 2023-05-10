package pa_0405_aula6;
import javax.swing.JOptionPane;


public class Wally {
    public static void main(String[] args){
        String nome[] = new String[1000];
        int num, x=0;
        
        for (int i=0; i<nome.length; i++){//preenche vetor
            nome[i] =  "errado";
        }
        num = (int)(Math.random()*1000);
        nome[num] = "Achou o WALLY!!!";
        
        System.out.println(num);// esta linha é para teste, deve ser removida
        
        num = 0;
        
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog
                ("Encontre o Wally \n Digite um número de 0 a 1000"));
            
            JOptionPane.showMessageDialog(null, nome[x]);
            
            num++;
            
        }while(num!=4 && !nome[x].equals("Achou o WALLY!!!"));
    }
}
