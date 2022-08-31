/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class HackRank {
    public static void main(String[] args) {
    int a[]= new int[3];
    int b[]= new int[3];
    int result[]= new int[2];
    Scanner scan = new Scanner(System.in);
    for (int c=0; c<3; c++){
        a[c] = scan.nextInt();
}
    for (int cc=0; cc<3; cc++){
        b[cc] = scan.nextInt();
}
    for (int cr=0; cr<3; cr++){
        if (a[cr]>b[cr]){
            result[0]= result[0]+1;
        }else if (a[cr]<b[cr]){
            result[1]= result[1]+1;
    }
        
}
    String r1 = Integer.toString(result[0]);
    String r2 = Integer.toString(result[1]);
    System.out.print(r1 + r2);
}
}
