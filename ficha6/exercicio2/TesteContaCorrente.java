/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio2;

/**
 *
 * @author joaog
 */
public class TesteContaCorrente {
    public static void main (String[] args){
            ContaCorrente conta = new ContaCorrente(8000.00f, 5000.00f, 10000.00f);
        try{    
            conta.sacar(1000);
        }
        catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage() + "\n");
        }
        try{    
            conta.depositar(2000);
        }
        catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage() + "\n");
        }    
        try{    
            conta.depositar(-15);
        }
        catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage() + "\n");
        }
        try{    
            conta.sacar(1500000);
        }
        catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage() + "\n");
        }
    }
}
