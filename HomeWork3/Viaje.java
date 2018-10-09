import javax.swing.JOptionPane;
public class Viaje{
  public static void main(String[] args) {

    int NA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de alumnos "));
int TOT;
int PA;
    if(NA >= 100){
      PA=65;
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null,"Total a pagar por alumno "+PA);
      JOptionPane.showMessageDialog(null,"Total a pagar a la compañia "+TOT);
    }else if( NA < 30 ){
            PA = 4000/NA;
      TOT = 4000;
    JOptionPane.showMessageDialog(null,"Total a pagar por alumno "+PA);
    JOptionPane.showMessageDialog(null,"Total a pagar a la compañia "+TOT);
    }else if (NA >= 50 && NA <=99) {
      PA=70;
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null,"Total a pagar por alumno "+PA);
      JOptionPane.showMessageDialog(null,"Total a pagar a la compañia "+TOT);
    }else if( NA >= 30 ||  NA <=49){
      PA = 95;
      TOT = NA * PA;
      JOptionPane.showMessageDialog(null,"Total a pagar por alumno "+PA);
      JOptionPane.showMessageDialog(null,"Total a pagar a la compañia "+TOT);
    }

  }
}
