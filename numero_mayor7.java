
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class numero_mayor7 {
    public static void main(String[] args) {
        //declaro variables
        //  ingresa tres números
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String n3 = JOptionPane.showInputDialog("Ingrese el tercer número:");

        double numero1 = Double.parseDouble(n1);
        double numero2 = Double.parseDouble(n2);
        double numero3 = Double.parseDouble(n3);

        // proceso ncuentra el número mayor 
        double mayor = Math.max(numero1, Math.max(numero2, numero3));
        

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null,"El número mayor es: " + mayor);
    }
}