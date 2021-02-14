package ficha1;
import java.util.Scanner;


public class Exercicio2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        int r, s, t;
        System.out.print("insira r: ");
        r = teclado.nextInt();
        System.out.print("insira s: ");
        s = teclado.nextInt();
        System.out.print("insira t: ");
        t = teclado.nextInt();
        int maior = r;
        if(maior < s){
            maior = s;
        }
        if(maior < t){
            maior = t;
        }
        System.out.print("o maior é:");
        if(maior == r){
            System.out.print("r");
        }
        else if(maior == s){
            System.out.print("s");
        }
        else{
            System.out.print("t");
        }
    }
}
