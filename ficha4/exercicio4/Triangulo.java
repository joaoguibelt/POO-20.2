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
public class Triangulo extends FiguraGeometrica{

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        if(base >= 0)
            this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        if(altura >= 0)
            this.altura = altura;
    }
    private int base;
    private int altura;
    Triangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    int areaTriangulo(int x, int y){
        x *= y;
        x /= 2;
        return x;
    }
}
