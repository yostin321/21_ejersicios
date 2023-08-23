
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Multilo_de_ocho_3 {
    public static void main(String[] args) {
        // declaro variables
        String numero1 = JOptionPane.showInputDialog("Digite un número:");
        int numero = Integer.parseInt(numero1);

        // se aclara el proceso para ve si el numero es multiplo de 8
        String resultado = (numero % 8 == 0) ? "múltiplo" : "no es múltiplo";
        

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null,"El número ingresado " + resultado + " de 8");
    }
}
