/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio6;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class Charmander extends Fogo{
    private String nome = "charmander";
    private ArrayList ataques;
    Charmander(int tamanho, int peso){
        super("blaze", tamanho, peso);
        Scratch scratch = new Scratch();
        Growl growl = new Growl();
        ataques.add(scratch);
        ataques.add(growl);
    }       
    @Override
    void evoluir(){
        FireFang firefang = new FireFang();
        setHp(58);
        setAtk(64);
        setDef(58);
        setSpatk(80);
        setSpdef(65);
        setSpd(80);
        setNome("charmeleon");
        setTamanho(getTamanho() + 10);
        setPeso(getPeso() + 15);
        getAtaques().add(firefang);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ataques
     */
    public ArrayList getAtaques() {
        return ataques;
    }

    /**
     * @param ataques the ataques to set
     */
    public void setAtaques(ArrayList ataques) {
        this.ataques = ataques;
    }
}
