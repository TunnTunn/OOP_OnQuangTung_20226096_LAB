package JavaBasics.src;

import javax.swing.JOptionPane;

public class Lab01_61 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option==JOptionPane.YES_OPTION?"Yes":"No"));
    }
}
