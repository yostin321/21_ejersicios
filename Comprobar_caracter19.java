
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Comprobar_caracter19 {
    public static void main(String[] args) {
        // ingresa un carácter
        String caracterStr = JOptionPane.showInputDialog("Ingrese un carácter:");
        char caracter = caracterStr.charAt(0);

        // Verifica el tipo de carácter utilizando su codigo ASCII
        String tipo = "";
        if (caracter >= 48 && caracter <= 57) {
            tipo = "dígito";
        } else if (caracter >= 65 && caracter <= 90) {
            tipo = "letra mayúscula";
        } else if (caracter >= 97 && caracter <= 122) {
            tipo = "letra minúscula";
        }

        // Muestra el resultado 
        
        JOptionPane.showMessageDialog(null, "El carácter ingresado es un " + tipo);
    }
}
