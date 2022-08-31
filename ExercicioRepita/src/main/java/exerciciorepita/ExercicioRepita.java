
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author gabri
 */
public class ExercicioRepita {
    public static void main(String[] args) {
        int num=0, val=0, par=0, imp=0, above=0, avrg=0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: \n Valor 0 interrompe!"));
            if (num==0){
                break;
            }else{
                val++;
            }
            if ((num % 2) == 0){
                par++;
            } else {
                imp++;
            }
            if (num>100){
                above++;
            }
            avrg = avrg + num;
        } while (num != 0);
        avrg = avrg/val;
    JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>"
    + "\n Total de Valores: " + val
    + "\n Total de pares: " + par
    + "\n Total de ímpares: " + imp
    + "\n Acima de 100: " + above
    + "\n Média dos valores: " + avrg);
    }
}
