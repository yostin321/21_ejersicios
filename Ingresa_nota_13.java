
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Ingresa_nota_13 {
    public static void main(String[] args) {
        // ingresa una nota
        String notas = JOptionPane.showInputDialog("Ingrese una nota (0 al 10):");
        double nota = Double.parseDouble(notas);

        // Evalúa la nota y decide el diagnóstico
        String diagnostico = "";
        if (nota < 4) {
            diagnostico = "Insuficiente";
        } else if (nota >= 4 && nota < 6) {
            diagnostico = "Suficiente";
        } else if (nota >= 6 && nota < 8) {
            diagnostico = "Bien";
        } else if (nota >= 8 && nota < 9) {
            diagnostico = "Notable";
        } else if (nota >= 9) {
            diagnostico = "Sobresaliente";
        }

        // Muestra el resultado = diagnostico
        String mensaje = "La nota ingresada es: " + nota + ". " + "Diagnóstico: " + diagnostico;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
