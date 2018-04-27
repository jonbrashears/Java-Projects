/*Author: Jonathan Brashears
 * A GUI to welcome a user to Java programming by name
 * 
 * 
 */
package namedialog;
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        //Prompt user to enter name
        String name =
            JOptionPane.showInputDialog("What is your name?");
        
        //create the message
        String message =
            String.format("Welcome, %s, to Java Programming!", name);
        
        //display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
    
}
