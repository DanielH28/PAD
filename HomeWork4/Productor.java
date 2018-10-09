import javax.swing.JOptionPane;

public class Productor{
  public static void main(String[] args) {

    System.out.println();
    int L= Integer.parseInt(JOptionPane.showInputDialog("Ingresa los litros que produce"));
    System.out.println();
    int PG= Integer.parseInt(JOptionPane.showInputDialog("Ingresa precio de galon"));
    double GALON= 3.785;
    double TG= (L / GALON) * (PG);
    JOptionPane.showMessageDialog(null,"El productor obtiene : " + TG + "Pesos");

  }
}
