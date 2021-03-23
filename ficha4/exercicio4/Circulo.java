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
public class Circulo extends FiguraGeometrica{
    private int raio;
    Circulo(int raio){
        this.raio = raio;
    }
    int areaCirculo(int x){
        x *= x;
        x *= Math.PI;
        return x;
    }

    /**
     * @return the raio
     */
    public int getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(int raio) {
        if(raio >= 0)
        this.raio = raio;
    }

  
}
