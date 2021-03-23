/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio9;

/**
 *
 * @author joaog
 */
public class Circulo extends FormaGeometrica{
    void calcularArea(float raio){
        float x = (float) (raio*raio*Math.PI);
        setArea(x);
      
    }
    void calcularPerimetro(float raio){
        
    }
}
