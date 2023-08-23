
import javax.swing.JOptionPane;



/**
 *
 * @author Yostin
 */
public class Tipo_triangulo20 {
    public static void main(String[] args) {
        // Solicita al usuario ingresar tres lados del triángulo
        String ladoo1 = JOptionPane.showInputDialog("Ingrese el primer lado:");
        String ladoo2 = JOptionPane.showInputDialog("Ingrese el segundo lado:");
        String ladoo3 = JOptionPane.showInputDialog("Ingrese el tercer lado:");

        double lado1 = Double.parseDouble(ladoo1);
        double lado2 = Double.parseDouble(ladoo2);
        double lado3 = Double.parseDouble(ladoo3);

        // Determina el tipo de triángulo segun sus lados
        String tipo = "";
        if (lado1 == lado2 && lado2 == lado3) {
            tipo = "equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipo = "isósceles";
        } else {
            tipo = "escaleno";
        }

        // Muestra el tipo de triangulo 
       
        JOptionPane.showMessageDialog(null, "El triángulo es " + tipo);
    }
}
