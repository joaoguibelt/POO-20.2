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
public class Retangulo extends FormaGeometrica{

    void calcularArea(float lado1, float lado2) {
      lado1 *= lado2;
      setArea(lado1);
    }


    void calcularPerimetro(float lado1, float lado2) {
      lado1 *= 2;
      lado2 *= 2;
      lado1 += lado2;
      setPerimetro(lado1);
    }
    
}
