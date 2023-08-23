
import javax.swing.JOptionPane;



/**
 *
 * @author aleizerbick
 */
public class Numero_par_impar {
    public static void main(String[] args) {
        //asignamos vatiables
        //  ingresar un número
        String numeroStr = JOptionPane.showInputDialog("Digite un número:");
        int numero = Integer.parseInt(numeroStr);

        // Verifica si el número es par o impar
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        String mensaje =  resultado;

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null,"El número ingresado es " + mensaje);
    }
}