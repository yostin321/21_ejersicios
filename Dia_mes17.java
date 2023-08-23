
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Dia_mes17 {
    public static void main(String[] args) {
        //  ingresa un número de mes
        String mesStr = JOptionPane.showInputDialog("Ingrese un número de mes (1-12):");
        int mes = Integer.parseInt(mesStr);

        // Determina el número de días de mes ingresado
        int dias = 0;
        dias = switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        // Muestra el numero de días 
       
        JOptionPane.showMessageDialog(null, "El mes ingresado tiene " + dias + " días");
    }
}
