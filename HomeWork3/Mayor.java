import javax.swing.JOptionPane;
public class Mayor{
  public static void main(String[] args) {

    int A= Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));

    int B= Integer.parseInt(JOptionPane.showInputDialog("Enter the two value"));
    int M=0;
    if(A > B){
       M=A;
       JOptionPane.showMessageDialog(null,"The highest value is : "+ M);
    }else if(B > A){
    M=B;
    JOptionPane.showMessageDialog(null,"The highest value is : "+ M);
    }
    else{
  JOptionPane.showMessageDialog(null,"The number is the same" );
    }



  }

}
