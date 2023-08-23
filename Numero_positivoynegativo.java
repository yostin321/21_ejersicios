
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Numero_positivoynegativo{
    public static void main(String[] args) {
        // Solicita al usuario ingresar un número
        String numero1 = JOptionPane.showInputDialog("Digite un número:");
        double numero = Double.parseDouble(numero1);

        // Verifica si el número es positivo o negativo
        String resultado = (numero > 0) ? "Positivo" : "Negativo";
        String mensaje =  resultado;

        // Muestra el resultado en una ventana de diálogo
        JOptionPane.showMessageDialog(null,"El número ingresado es "+ mensaje);
    }
}
