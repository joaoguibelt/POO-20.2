/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio1;

/**
 *
 * @author joaog
 */
public class Quadrado extends Retangulo{
    
    void calcularArea(float lado){
      lado *= lado;
      setArea(lado);
    }
   
    void calcularPerimetro(float lado){
        lado *= 4;
        setPerimetro(lado);
    }
}
