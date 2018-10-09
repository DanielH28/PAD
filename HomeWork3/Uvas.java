import javax.swing.JOptionPane;
public class Uvas{
  public static void main(String[] args) {

    double P = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio inicial del  kilo de uva "));

    int K = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los kilo de uva "));

    int TA =Integer.parseInt(JOptionPane.showInputDialog("Tamaño de uva 1 o 2 "));

    String TI =JOptionPane.showInputDialog("Tipo de uva A o B? ");

    double GA;

    if(TI == "A" && TA == 1){
      GA=(P*K)+.20;

      JOptionPane.showMessageDialog(null,"Tu ganancia es de "+GA);
    }else if (TI == "A" && TA == 2) {
      GA=(P*K)+.30;

      JOptionPane.showMessageDialog(null,"Tu ganancia es de "+GA);
    }else if (TI == "B" && TA == 1) {
      GA=(P*K)-.30;

      JOptionPane.showMessageDialog(null,"Tu ganancia es de "+GA);

  }else if (TI == "B" && TA == 2) {
    GA=(P*K)-.50;

    JOptionPane.showMessageDialog(null,"Tu ganancia es de "+GA);
  }

  }
}
