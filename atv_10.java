import javax.swing.JComponent;
import javax.swing.JOptionPane;
public class atv_10 {
    public static void main(String[] args) {
        String dia=JOptionPane.showInputDialog("Digite um número entre 1 a 7");
        if (dia!= null) {
            try{
                int diasemana = Integer.parseInt(dia);
                if (diasemana == 1)
                    dia = "Domingo";
                else if (diasemana == 2)
                    dia = "Segunda";
                else if (diasemana == 3)
                        dia = "Terça";
                else if (diasemana == 4)
                        dia = "Quarta";
                else if (diasemana == 5)
                        dia = "Quinta";
                else if (diasemana == 6)
                        dia = "Sexta";
                else if (diasemana == 7)
                        dia = "Sábado";
                else 
                    dia = "Desconheço";
                JOptionPane.showMessageDialog(parentComponent: null, dia);
                } 
            }

            catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(parentComponent:null, "Formato Inválido");
            } 
        } 
    }
}
