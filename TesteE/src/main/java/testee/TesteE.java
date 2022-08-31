/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testee;

import static java.lang.Double.sum;
import static java.lang.Integer.sum;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author gabri
 */
public class TesteE {

    public static void main(String[] args) {
    /*boolean yes = (0.2 + 0.3 == 0.5);       
    System.out.println(yes);*/
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    BigInteger ar[] = new BigInteger [n];
    BigInteger result;
    result = BigInteger.valueOf(0);
    for (int c = n-1; c >= 0; c--){
        ar[c] = scan.nextBigInteger();
        result = result.add(ar[c]);
    }
    //int result = IntStream.of(ar).sum(); faz soma dos items no array
    System.out.println(result);
    }
}
