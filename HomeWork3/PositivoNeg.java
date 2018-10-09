import javax.swing.JOptionPane;
public class PositivoNeg{
public static void main(String[] args) {
      double R;
      
  int NUM= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

  if(NUM==0){
    R =NUM;
  JOptionPane.showMessageDialog(null,"El numero "+R+" es nulo");
  } else{
  if(NUM>0){
    R =NUM;
  JOptionPane.showMessageDialog(null,"El numero "+R+" es positivo");
  }else{
    R =NUM;
  JOptionPane.showMessageDialog(null,"El numero "+R+" es negativo");
  }
  }
}
}
