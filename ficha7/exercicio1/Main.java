/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7.exercicio1;
import java.util.Scanner;
/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int n = teclado.nextInt();
        NumerosPrimos pares = new NumerosPrimos(n, true);
        NumerosPrimos impares = new NumerosPrimos(n, false); 
        pares.join();
        impares.join();
        int resultado = pares.numPrimos + impares.numPrimos;
        System.out.println("Existem " + resultado + " números primos antes de " + n);
                 
    }
}
