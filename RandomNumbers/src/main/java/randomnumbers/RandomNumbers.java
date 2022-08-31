
package randomnumbers;
/**
 *
 * @author gabri
 */
public class RandomNumbers {

    public static void main(String[] args) {
        double numRandom = Math.random();
        //a função .random gera um numero entre 0.0 e 1.0 portanto para valores maiores é necessario realizar um fator
        //matematico com o intervalo dos numeros desejados
        int num = (int) (1 + numRandom * (1000-1)); 
        System.out.println(num);
    }
}
