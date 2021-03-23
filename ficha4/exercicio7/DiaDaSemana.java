/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio7;

/**
 *
 * @author joaog
 */
public class DiaDaSemana {
    public enum DiaDeSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;
    }
    private DiaDeSemana x;
    boolean ehDiaUtil(){
        if(this.getX() == DiaDeSemana.DOMINGO || this.getX() == DiaDeSemana.SABADO){
            return false;
        }
        else{
            return true;
        }
    }

    public DiaDeSemana getX() {
        return x;
    }
}
