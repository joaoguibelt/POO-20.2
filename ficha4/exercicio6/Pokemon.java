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
public abstract class Pokemon {
    private String habilidade;
    private int tamanho;
    private int peso;
    private int hp;
    private int atk;
    private int def;
    private int spatk;
    private int spdef;
    private int spd;
    private String estado = "saudável";
    abstract void evoluir();     
    Pokemon(String habilidade, int tamanho, int peso, int hp, int atk, int def, int spatk, int spdef, int spd){
        this.habilidade = habilidade;
        this.peso = peso;
        this.tamanho = tamanho;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spd = spd;
        this.spdef = spdef;
    }

    /**
     * @return the habilidade
     */
    public String getHabilidade() {
        return habilidade;
    }

    /**
     * @param habilidade the habilidade to set
     */
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @param atk the atk to set
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * @return the def
     */
    public int getDef() {
        return def;
    }

    /**
     * @param def the def to set
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * @return the spatk
     */
    public int getSpatk() {
        return spatk;
    }

    /**
     * @param spatk the spatk to set
     */
    public void setSpatk(int spatk) {
        this.spatk = spatk;
    }

    /**
     * @return the spdef
     */
    public int getSpdef() {
        return spdef;
    }

    /**
     * @param spdef the spdef to set
     */
    public void setSpdef(int spdef) {
        this.spdef = spdef;
    }

    /**
     * @return the spd
     */
    public int getSpd() {
        return spd;
    }

    /**
     * @param spd the spd to set
     */
    public void setSpd(int spd) {
        this.spd = spd;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
