
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Orden_creciente_o_decreciente6 {
    public static void main(String[] args) {
        // declaro variables
        // ingresar tres números
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String n3 = JOptionPane.showInputDialog("Ingrese el tercer número:");

        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);
        int numero3 = Integer.parseInt(n3);

        // Verifica el orden de los números y muestra el resultado
        String resultado = (numero1 > numero2 && numero2 > numero3) ? "en orden decreciente"
                : (numero1 < numero2 && numero2 < numero3) ? "en orden creciente" : "sin orden";
        

        // Muestra el resultad0
        JOptionPane.showMessageDialog(null,"Los números ingresados están " + resultado);
    }
}
