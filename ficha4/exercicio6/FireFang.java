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
public class FireFang extends Ataque{
    FireFang(){
        super("fogo",15,95,65);
    }
   
    @Override
    void atacar(Pokemon x) {
        x.setEstado("queimando");
    }
    
}
