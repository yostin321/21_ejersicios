
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class clima16 {
    public static void main(String[] args) {
        // ingresa la temperatura
        String temperaturaStr = JOptionPane.showInputDialog("Ingrese la temperatura:");
        double temperatura = Double.parseDouble(temperaturaStr);

        // Determina el  clima según la temperatura ingresada
        String tipoClima = "";
        if (temperatura <= 10) {
            tipoClima = "Frio";
        } else if (temperatura > 10 && temperatura <= 20) {
            tipoClima = "Nublado";
        } else if (temperatura > 20 && temperatura <= 30) {
            tipoClima = "Caluroso";
        } else if (temperatura > 30) {
            tipoClima = "Tropical";
        }

        // Muestra el tipo de clima
        
        JOptionPane.showMessageDialog(null, "El tipo de clima según la temperatura es: " + tipoClima);
    }
}
