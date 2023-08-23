
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Cacula_salario18 {
    public static void main(String[] args) {
        // ingresa el nombre, edad y salario
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String edad1 = JOptionPane.showInputDialog("Ingrese su edad:");
        String salario1 = JOptionPane.showInputDialog("Ingrese su salario:");

        int edad = Integer.parseInt(edad1);
        double salario = Double.parseDouble(salario1);

        String mensaje = "";

        if (edad < 17) {
            mensaje = nombre + ", no puede trabajar debido a su edad.";
        } else if (edad >= 18 && edad <= 50) {
            double salarioNuevo = salario * 1.05;
            mensaje = nombre + ", su salario aumenta un 5%: $" + salarioNuevo;
        } else if (edad >= 51 && edad <= 60) {
            double salarioNuevo = salario * 1.10;
            mensaje = nombre + ", su salario aumenta un 10%: $" + salarioNuevo;
        } else {
            double salarioNuevo = salario * 1.15;
            mensaje = nombre + ", su salario aumenta un 15%: $" + salarioNuevo;
        }
        

        // Muestra el resultado 
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
