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
public class Quadrado extends Quadrilatero{

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        if(lado >= 0)
        this.lado = lado;
    }
    private int lado;
    Quadrado(int lado){
        this.lado = lado;
    }
}
