
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Suma_de_numeros8 {
    public static void main(String[] args) {
        // Solicita al usuario ingresar dos números
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

        double numero1 = Double.parseDouble(n1);
        double numero2 = Double.parseDouble(n2);

        // proceso
        double suma = numero1 + numero2;
       

        //resultado
        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
    }
}
