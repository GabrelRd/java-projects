/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author gabri
 */
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.carga = 50;
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
    }
    
}
