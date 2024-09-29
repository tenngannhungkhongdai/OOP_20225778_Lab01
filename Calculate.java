import javax.swing.JOptionPane;
public class Calculate{
    public static void main(String[] args){
        double a,b;
        String result;
        a=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the first number: "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second number: "));
        result = "Sum= "+(a+b)+", Difference= "+(a-b)+", Product= "+(a*b)+", Quotient= "+(a/b);
        JOptionPane.showMessageDialog(null,result);
        System.exit(0);
    }
}