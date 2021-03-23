/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio9;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        Triangulo triangulo = new Triangulo();
        triangulo.calcularArea(4f, 5f);
        Quadrado quadrado = new Quadrado();
        quadrado.calcularArea(4f);
        lista.add(triangulo);
        lista.add(quadrado);
        FormaGeometrica.somarAreas(lista);
    }
}
