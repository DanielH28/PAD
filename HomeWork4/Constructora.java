import javax.swing.JOptionPane;
public class Constructora{
  public static void main(String[] args) {


    int A= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de la figura"));
    int B= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la figura"));
    int C= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de triagulo"));
    A=A-C;
    int AT= (B*C) /(2) ;
    JOptionPane.showMessageDialog(null,"El Area del triagulo es: " + AT);
    int AR= B*A;
    JOptionPane.showMessageDialog(null,"El Area del rectangulo es: " + AR);
    int Area= AT*AR;
    JOptionPane.showMessageDialog(null,"El Area del terreno es: " + Area);

  }
}
