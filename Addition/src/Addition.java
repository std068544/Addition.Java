/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Πρόγραμμα πρόσθεσης που χρησιμοποιεί το JOptionPane για είσοδο και έξοδο
import javax.swing.JOptionPane;

/**
 *
 * @author Vassilis Dionisopoulos
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // παίρνει είσοδο από τον χρήστη από παράθυρο διαλόγου εισόδου JOptionPane
        String firstNumber = JOptionPane.showInputDialog("Enter first integer: ");
        String secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
        
        //μετατρέπει τις String εισόδους σε τιμές int για χρήση σε έναν υπολογισμό
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE );
        
    }
    
}
