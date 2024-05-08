package Model;

import static View.Voo1_GUI.assento1_txt;
import static View.Voo1_GUI.assento2_txt;
import static View.Voo1_GUI.assento3_txt;
import static View.Voo1_GUI.assento4_txt;
import static View.Voo1_GUI.assento5_txt;
import static View.Voo1_GUI.assento6_txt;
import static View.Voo1_GUI.numAssento_txt;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
    
    public static void fechar(){
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja mesmo sair?\n1 - Sim\n2 - Não", "", -1));
        if(x == 1){
            JOptionPane.showMessageDialog(null,"Encerrando sistema...");
            System.exit(0);
        }
    }
    
    public static void reservar(){
        
        try{
            int x = Integer.parseInt(numAssento_txt.getText());
            switch(x){
                case 1:
                    if(assento1_txt.getText().equals("")){
                        assento1_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 2:
                    if(assento2_txt.getText().equals("")){
                        assento2_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 3:
                    if(assento3_txt.getText().equals("")){
                        assento3_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 4:
                    if(assento4_txt.getText().equals("")){
                        assento4_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 5:
                    if(assento5_txt.getText().equals("")){
                        assento5_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 6:
                    if(assento6_txt.getText().equals("")){
                        assento6_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "O assento selecionado não existe!");
            }
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opção Inválida.");
        }
    }
    
}
