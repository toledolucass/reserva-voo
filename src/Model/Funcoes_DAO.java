package Model;

import static View.Voo1_GUI.numAssento_txt;
import static View.Voo1_GUI.assento1_1_txt;
import static View.Voo1_GUI.assento1_2_txt;
import static View.Voo1_GUI.assento1_3_txt;
import static View.Voo1_GUI.assento1_4_txt;
import static View.Voo1_GUI.assento1_5_txt;
import static View.Voo1_GUI.assento1_6_txt;

import static View.Voo2_GUI.numAssento2_txt;
import static View.Voo2_GUI.assento2_1_txt;
import static View.Voo2_GUI.assento2_2_txt;
import static View.Voo2_GUI.assento2_3_txt;
import static View.Voo2_GUI.assento2_4_txt;
import static View.Voo2_GUI.assento2_5_txt;
import static View.Voo2_GUI.assento2_6_txt;
import javax.swing.JOptionPane;

public class Funcoes_DAO {
    
    public static void fechar(){
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja mesmo sair?\n1 - Sim\n2 - Não", "", -1));
        if(x == 1){
            JOptionPane.showMessageDialog(null,"Encerrando sistema...");
            System.exit(0);
        }
    }
    
    public static void reservarVoo1(){
        
        try{
            int x = Integer.parseInt(numAssento_txt.getText());
            switch(x){
                case 1:
                    if(assento1_1_txt.getText().equals("")){
                        assento1_1_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 2:
                    if(assento1_2_txt.getText().equals("")){
                        assento1_2_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 3:
                    if(assento1_3_txt.getText().equals("")){
                        assento1_3_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 4:
                    if(assento1_4_txt.getText().equals("")){
                        assento1_4_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 5:
                    if(assento1_5_txt.getText().equals("")){
                        assento1_5_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 6:
                    if(assento1_6_txt.getText().equals("")){
                        assento1_6_txt.setText("X");
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
    
    
    public static void reservarVoo2(){
        try{
            int x = Integer.parseInt(numAssento2_txt.getText());
            switch(x){
                case 1:
                    if(assento2_1_txt.getText().equals("")){
                        assento2_1_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 2:
                    if(assento2_2_txt.getText().equals("")){
                        assento2_2_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 3:
                    if(assento2_3_txt.getText().equals("")){
                        assento2_3_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 4:
                    if(assento2_4_txt.getText().equals("")){
                        assento2_4_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 5:
                    if(assento2_5_txt.getText().equals("")){
                        assento2_5_txt.setText("X");
                    }else{
                        JOptionPane.showMessageDialog(null, "Assento já reservado.");
                    }
                    break;
                case 6:
                    if(assento2_6_txt.getText().equals("")){
                        assento2_6_txt.setText("X");
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
