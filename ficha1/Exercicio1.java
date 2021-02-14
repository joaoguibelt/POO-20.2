package ficha1;
import java.util.Scanner;


public class Exercicio1 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int n;
        n = teclado.nextInt();
        int[] numeros = new int[n];
        int contador = 0;
        while(n > 0){
            n--;
            numeros[n] = teclado.nextInt();
            if(numeros[n] >= 0){
                contador++;
            }
        }
        System.out.print(contador);
    }
}
