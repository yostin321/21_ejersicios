
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Mayuscula_minuscula10 {
    public static void main(String[] args) {
        // ingresa una letra
        String letraStr = JOptionPane.showInputDialog("Ingrese una letra:");
        char letra = letraStr.charAt(0);
        // se verifica si la letra es mayuscula o minuscula
        String tipo = (Character.isUpperCase(letra)) ? "Mayúscula" : "Minúscula";
        

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null,"La letra " + letra + " está en " + tipo);
    }
}
