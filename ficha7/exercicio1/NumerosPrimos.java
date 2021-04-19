/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7.exercicio1;

/**
 *
 * @author joaog
 */
public class NumerosPrimos extends Thread{
    
    int parametro;
    boolean par;
    int numPrimos;
    
    public NumerosPrimos(int parametro, boolean par){
        this.parametro = parametro;
        this.par = par;
        this.numPrimos = 0;
        this.start();
    }
            
    @Override
    public void run(){
        if(!par){
            for(int i = 3; i < parametro; i += 2){
                boolean ePrimo = true;
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        break;
                    }
                    if(j == i - 1){
                            numPrimos++;
                    }
                }
            }
        }
        else{
            numPrimos++;
            for(int i = 2; i < parametro; i += 2){
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        break;
                    }
                    if(j == i - 1){
                            numPrimos++;
                    }
                }
            }
        }
    }
}
