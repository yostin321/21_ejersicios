
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Comparacion_numero5 {
    public static void main(String[] args) {
        //Declaro variables
        //  ingresar tres números
        String numero1Str = JOptionPane.showInputDialog("Ingrese el primer número:");
        String numero2Str = JOptionPane.showInputDialog("Ingrese el segundo número:");
        String numero3Str = JOptionPane.showInputDialog("Ingrese el tercer número:");

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);

        // Verifica la relación entre los números 
        String resultado = (numero1 == numero2 && numero2 == numero3) ? "iguales"
                : (numero1 != numero2 && numero2 != numero3) ? "diferentes" : "mixtos";
        String mensaje =  resultado;

        // Muestra el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null,"Los números ingresados son " + mensaje);
    }
}
