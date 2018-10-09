import javax.swing.JOptionPane;

public class Conagua{
  public static void main(String[] args) {

    double A= Double.parseDouble(JOptionPane.showInputDialog("Altura de la alberca"));
    double L= Double.parseDouble(JOptionPane.showInputDialog("Largo de la alberca"));
    double N= Double.parseDouble(JOptionPane.showInputDialog("Ancho de la alberca"));
    double CM= Double.parseDouble(JOptionPane.showInputDialog("Costo de metro cubico"));
    double V= L * N * A;
    double PAG = V * CM;

    JOptionPane.showMessageDialog(null,"El pago es de : " + PAG + " Pesos");

  }
}
