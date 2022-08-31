/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class HackerRank1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numHour = "";
        char caracter[] = new char[10];
        String hour = scan.next(); //0 a 9 caracteres
            for(int count=0;count<10;count++){
                caracter[count]=hour.charAt(count);//passa a string pra um array de char
        }
        numHour = (String.valueOf(caracter[0]))+(String.valueOf(caracter[1])); //pega os dois caracteres iniciais da Hora AM/PM
        if(caracter[8]=='A'){
            if("12".equals(numHour)){
                numHour="00";
            } else{
                numHour = numHour;
            }
        } else if (caracter[8]=='P'){
            if("12".equals(numHour)){
                numHour="12";
            } else {
                numHour = Integer.toString((Integer.parseInt(String.valueOf(numHour))) + 12);//transforma a string em int, soma 12 e volta pra string
        }
        }
        for(int count1=2;count1<8;count1++){
            numHour = numHour + caracter[count1];
        }
        System.out.println(numHour);
}
}