
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Multiplico12 {
    public static void main(String[] args) {
        //  ingresa dos números
        String n1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String n2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
        
      //defino variables

        int numero1 = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        // Verifica si uno es múltiplo del otro 
        String resultado = (numero1 % numero2 == 0 || numero2 % numero1 == 0) ? "son múltiplos" : "no son múltiplos";
        

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null, "Los números ingresados " + resultado);
    }
}
