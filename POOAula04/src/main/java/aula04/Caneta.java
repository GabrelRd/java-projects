/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;
/**
 *
 * @author gabri
 */
public class Caneta {
    public String model;
    private float ponta;
    private String cor;
    
    public Caneta(String m,float p,String c){
        this.cor=c;
        this.ponta=p;
        this.model=m;
    }
    public String getModelo(){
        return this.model;
    }
    public void setModelo(String m){
        this.model=m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }
    public void status(){
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.model);
    }
}
