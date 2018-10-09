import javax.swing.JOptionPane;
public class Mayor3{
  public static void main(String[] args) {

    int A= Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));

    int B= Integer.parseInt(JOptionPane.showInputDialog("Enter the two value"));

    int C= Integer.parseInt(JOptionPane.showInputDialog("Enter the three value"));
    int M=0;
    if(A >= B && A >= C){
       M=A;
       JOptionPane.showMessageDialog(null,"The highest value is : "+ M);
    }else if(B >= A && B >= C){
    M=B;
    JOptionPane.showMessageDialog(null,"The highest value is : "+ M);
  }else if(C >= A && C >= B ){
    M=C;
    JOptionPane.showMessageDialog(null,"The highest value is : "+ M);
    }

  }

}
