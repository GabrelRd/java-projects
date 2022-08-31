/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author gabri
 */
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.abrirConta("CC");
        conta1.setDono("Jurumeiro");
        conta1.setNumConta(1234);
        ContaBanco conta2 = new ContaBanco();
        conta2.abrirConta("CP");
        conta2.setDono("Celomaia");
        conta2.setNumConta(4321);
        conta1.depositar(100);
        conta2.depositar(500);
        conta2.statusConta();
        conta1.statusConta();
    }
    
}
