
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Contar_cifras4 {
    public static void main(String[] args) {
        // declaro variables
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(numeroStr);

        // Cuenta las cifras del número utilizando logaritmo en base 10
        int cifras = (int) Math.log10(numero) + 1;
        String mensaje =  cifras + " cifras";

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null,"El número ingresado tiene " + mensaje);
    }
}