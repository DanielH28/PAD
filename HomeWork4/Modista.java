import javax.swing.JOptionPane;
public class Modista{
  public static void main(String[] args) {


    double CM= Double.parseDouble(JOptionPane.showInputDialog("Cantidad de metros que requiere"));
    double PG= CM / 2.54;
    JOptionPane.showMessageDialog(null,"Las pugadas son : " + PG);

  }
}
