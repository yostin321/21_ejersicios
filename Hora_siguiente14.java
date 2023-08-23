
import javax.swing.JOptionPane;



/**
 *
 * @author yostin
 */
public class Hora_siguiente14 {
    public static void main(String[] args) {
        //  ingresa la hora, minutos y segundos
        String hora1 = JOptionPane.showInputDialog("Ingrese la hora:");
        String minutos1 = JOptionPane.showInputDialog("Ingrese los minutos:");
        String segundos1 = JOptionPane.showInputDialog("Ingrese los segundos:");

        int hora = Integer.parseInt(hora1);
        int minutos = Integer.parseInt(minutos1);
        int segundos = Integer.parseInt(segundos1);

        // Agrega un segundo a la hora
        segundos++;
        if (segundos >= 60) {
            segundos = 0;
            minutos++;
            if (minutos >= 60) {
                minutos = 0;
                hora++;
                if (hora >= 24) {
                    hora = 0;
                }
            }
        }

        // Muestra la hora en el segundo siguiente 
        
        JOptionPane.showMessageDialog(null, "La hora en el segundo siguiente es: " + hora + ":" + minutos + ":" + segundos);
    }
}
