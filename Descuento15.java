
import javax.swing.JOptionPane;


/**
 *
 * @author yostin
 */
public class Descuento15 {
    public static void main(String[] args) {
        // ingresa el valor de compra
        String valorCompra1 = JOptionPane.showInputDialog("Ingrese el valor de compra:");
        double valorCompra = Double.parseDouble(valorCompra1);

        // Calcula el descuento y la cantidad a pagar
        double descuento = (valorCompra > 300) ? valorCompra * 0.20 : 0;
        double totalAPagar = valorCompra - descuento;

        // Muestra el descuento y el total a pagar en una ventana de diálogo
        
        JOptionPane.showMessageDialog(null, "El descuento es de: " + descuento + "\nEl total a pagar es: " + totalAPagar);
    }
}
