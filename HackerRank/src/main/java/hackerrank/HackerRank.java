/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class HackerRank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger arr[] = new BigInteger[5];
        for(int c=0;c<5;c++){
            arr[c]= scan.nextBigInteger();
        }
        BigInteger sum1 = BigInteger.valueOf(0);
        BigInteger sum2 = BigInteger.valueOf(0);
        Arrays.sort(arr);
        for(int c1=1;c1<5;c1++){
            sum1 = sum1.add(arr[c1]);
        }
        for(int c2=0;c2<4;c2++){
            sum2 = sum2.add(arr[c2]);
        } 
        System.out.print(sum2+" "+sum1);

}
}
