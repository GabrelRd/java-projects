
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    System.out.println("A resolução do Sistema é:");
    System.out.println(tela.toString());
    }
}
