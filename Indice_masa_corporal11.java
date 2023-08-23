
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Indice_masa_corporal11 {
    public static void main(String[] args) {
        //  ingresa peso y altura
        String pesoStr = JOptionPane.showInputDialog("Ingrese su peso en kg:");
        String alturaStr = JOptionPane.showInputDialog("Ingrese su altura en metros:");
        //define variables

        double peso = Double.parseDouble(pesoStr);
        double altura = Double.parseDouble(alturaStr);

        // Calcula el índice de masa corporal 
        double imc = peso / (altura * altura);

        // Determina el diagnóstico según el indice de masa corporal
        String diagnostico = "";
        if (imc < 16) {
            diagnostico = "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            diagnostico = "Infra peso";
        } else if (imc >= 17 && imc < 18) {
            diagnostico = "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            diagnostico = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            diagnostico = "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            diagnostico = "Sobrepeso crónico (obesidad de grado II)";
        }

        // muestra el diagnostico
        
        JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es de " + imc + ". " + "Diagnóstico: " + diagnostico);
    }
}
