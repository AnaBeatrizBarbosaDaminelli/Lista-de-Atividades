import javax.swing.JComponent;
import javax.swing.JOptionPane;
public class atv_10 {
    public static void main(String[] args){
    String dia= JOptionPane.showInputDialog(null, "Digite um número entre 1 e 7: ");
    if (dia != null) {
    try{
         int diasemana = Integer.parseInt(dia);
          if (diasemana==1)
              dia = "Domingo";
          else if (diasemana==2)
              dia = "Segunda-Feira";
          else if (diasemana==3)
              dia = "Terça-Feira";
          else if (diasemana==4)
              dia = "Quarta-Feira";
          else if (diasemana==5)
              dia = "Quinta-Feira";
          else if (diasemana==6)
              dia = "Sexta-Feira";
          else if (diasemana==7)
              dia = "Sábado";
          else 
              dia = "Dia inválido";                    
                JOptionPane.showMessageDialog(null, dia);    
            }    

     catch(NumberFormatException erro) {
        JOptionPane.showMessageDialog(null, "Formato Inválido");

                }
            }    
        }
    }
