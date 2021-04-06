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
public class Triangulo extends FormaGeometrica{

    
    void calcularArea(float base, float altura) {
        base *= altura;
        base /= 2;
        setArea(base);
    }

  
    void calcularPerimetro(float lado1, float lado2, float lado3) {
        lado1 += lado2 + lado3;
        setPerimetro(lado1);
    }

}
