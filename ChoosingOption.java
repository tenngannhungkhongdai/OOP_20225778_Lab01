import javax.swing.JOptionPane;
public class ChoosingOption{
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"Change to first class ticket?");
        JOptionPane.showMessageDialog(null,"You've chosen: "+(option==JOptionPane.YES_OPTION?"Yes":"No"));
    }
}