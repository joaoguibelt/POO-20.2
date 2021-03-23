/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio4;

/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado(4);
        quadrado.setArea(quadrado.areaQuadrilater(quadrado.getLado(), quadrado.getLado()));
        System.out.println("área do quadrado = " + quadrado.getArea());
        Retangulo retangulo = new Retangulo(5, 8);
        retangulo.setArea(retangulo.areaQuadrilater(retangulo.getBase(), retangulo.getAltura()));
        System.out.println("área do retangulo = " + retangulo.getArea());
        Triangulo triangulo = new Triangulo(3, 2);
        triangulo.setArea(triangulo.areaTriangulo(triangulo.getAltura(), triangulo.getBase()));
        System.out.println("área do triangulo = " + triangulo.getArea());
        Circulo circulo = new Circulo(6);
        circulo.setArea(circulo.areaCirculo(circulo.getRaio()));
        System.out.println("área do circulo = " + circulo.getArea());
    }
}
