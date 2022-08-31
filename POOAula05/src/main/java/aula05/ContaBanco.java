/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;
/**
 *
 * @author gabri
 */
public class ContaBanco {
public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

    public ContaBanco(){
        saldo = 0;
        status = false;
    }
    
    public void statusConta(){
        System.out.println("Conta: "+getNumConta());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Dono:  "+getDono());
        System.out.println("Saldo:  "+getSaldo());
        System.out.println("Status: "+isStatus());
            
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void abrirConta(String tipo){
        setTipo(tipo);
        setStatus(true);
            if("CC".equals(tipo)){
                setSaldo(50);
            } else if ("CP".equals(tipo)) {
                setSaldo(150);
            }
    }
    public void fecharConta(){
        if(getSaldo()>0){
            System.out.println("Não e possivel fechar conta pois há"+getSaldo()+"reais na conta.");
        } else if (getSaldo()<0){
            System.out.println("Não e possivel fechar conta pois há"+getSaldo()+"reais em débito na conta.");
        } else {
            setStatus(false);
        }
    }
    public void depositar(float value){
        if(isStatus()==true){
            setSaldo((getSaldo()+value));
        } else {
            System.out.println("Conta fechada, impossivel depositar");
        }
    }
    public void sacar(float value1){
        if(isStatus()){
            if(getSaldo()>0){
                setSaldo(getSaldo()+value1);
            }
        } else {
            System.out.println("Conta fechada ou sem saldo disponivel.");
        }
    }
    public void pagarMensal(){
        if(isStatus()){
            if("CC".equals(getTipo())){
            setSaldo(getSaldo()-12);
        } else if ("CP".equals(getTipo())){
            setSaldo(getSaldo()-20);
        }
    }
    
    }
}
