/*
Daniel Plotzke
Description: Tested variables to work from top to bottom,
then tried to remove them to see if they turned off. 
 */
package plotzkeweek4tempwarning;

/**
 *
 * @author dan2203524
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PlotzkeWeek4TempWarning 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String highTemp = JOptionPane.showInputDialog("High Temp: ");
        int highTempNumber = Integer.parseInt(highTemp);
        String lowTemp = JOptionPane.showInputDialog("Low Temp: ");
        int lowTempNumber = Integer.parseInt(lowTemp);
        
        if (highTempNumber >= 90)
        {
            System.out.println("Heat Warning");
        }
        if (lowTempNumber < 32)
        {
            System.out.println("Freeze Warning");
        }
        if ((highTempNumber - lowTempNumber) > 40)
        {
            System.out.println("Large Temperature Swing");
        }
        else
        {
            System.out.println("No Parameters Met");
        }
    }
    
}
