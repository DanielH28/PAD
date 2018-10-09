import javax.swing.JOptionPane;

public class Area{
  public static void main(String[] args) {

    int A= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
    int B= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
    int result= A*B;
    JOptionPane.showMessageDialog(null,"El Area es: " + result);

  }
}
