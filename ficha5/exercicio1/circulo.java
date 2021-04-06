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
public class Circulo extends FormaGeometrica{
  
    void calcularArea(float raio) {
       raio *= raio;
       raio *= Math.PI;
       setArea(raio);
    }

    void calcularPerimetro(float raio) {
       raio *= Math.PI * 2;
       setPerimetro(raio);
    }

    

}
