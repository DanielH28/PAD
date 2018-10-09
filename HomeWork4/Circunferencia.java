import javax.swing.JOptionPane;

public class Circunferencia{
  public static void main(String[] args) {

    int R= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio"));
    double PI= 3.1416;
    double result= (PI) *(R*R);
    JOptionPane.showMessageDialog(null,"El Area de la circunferencia es: " + result);

  }
}
