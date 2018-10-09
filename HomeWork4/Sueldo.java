import javax.swing.JOptionPane;;

public class Sueldo{
  public static void main(String[] args) {


    double HT= Double.parseDouble(JOptionPane.showInputDialog("Horas trabajadas"));
    double PH= Double.parseDouble(JOptionPane.showInputDialog("Pago por hora"));
    double SS= HT * PH;

    JOptionPane.showMessageDialog(null,"El sueldo semanal es de : " + SS + " Pesos");

  }
}
