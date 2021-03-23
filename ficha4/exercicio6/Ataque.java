/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio6;

/**
 *
 * @author joaog
 */
public abstract class Ataque {
    private String tipo;
    private int pp; //quantidade de vezes que pode ser usado
    private int precisao;
    private int potencia;
    Ataque(String tipo, int pp, int precisao, int potencia){
        this.tipo = tipo;
        this.pp = pp;
        this.precisao = precisao;
        this.potencia = potencia;
    }
    abstract void atacar(Pokemon x);

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the pp
     */
    public int getPp() {
        return pp;
    }

    /**
     * @param pp the pp to set
     */
    public void setPp(int pp) {
        this.pp = pp;
    }

    /**
     * @return the precisao
     */
    public int getPrecisao() {
        return precisao;
    }

    /**
     * @param precisao the precisao to set
     */
    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
