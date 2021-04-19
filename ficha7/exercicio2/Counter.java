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
public class Counter {
    private static int cout;
    
//    public Counter(){
//        Counter.cout = 0;
//    }
    
   synchronized void increment(){
        if(cout < 3){
            cout++;
            System.out.println("Soma para " + cout);
            try {
                MinhaThread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
              
                }
        }
        else{
            System.out.println("Esperando para somar");
            try {
                MinhaThread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
              
                }
        }
    }
    
    synchronized void decrement(){
        if(cout > 0){
            cout--;
            System.out.println("Subtração para " + cout);
            try {
                MinhaThread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
              
                }
        }
        else{
            System.out.println("Esperando para diminuir");
            try {
                MinhaThread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
              
                }
        }
    }
    
}
