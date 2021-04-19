/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7.exercicio2;



/**
 *
 * @author joaog
 */
public class MinhaThread extends Thread{
     Counter c;
     boolean soma;
   

    public MinhaThread(boolean soma){
        this.soma = soma;
        c = new Counter();
        this.start();
    }
    
    
    @Override
    public void run(){
        if(!soma){
            for(int i = 0; i < 20; i++){
                c.decrement();
            }
        }
        else{
            for(int i = 0; i < 20; i++){
            c.increment();
            }
        }
    }
}
