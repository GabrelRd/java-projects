/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author gabri
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual a carga? " + this.carga + "%");
        System.out.println("Espessura da ponta? " + this.ponta);
    }
    void rabiscar(){
        if(tampada == true){
            System.out.println("Não é possivel rabiscar");
        }
        else {
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}

