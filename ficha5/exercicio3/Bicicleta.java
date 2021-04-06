/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio3;

/**
 *
 * @author joaog
 */
public class Bicicleta implements CarbonFootprint{

    String nome;
    
    Bicicleta(String nome){
        this.nome = nome;
    }
    
    @Override
    public void getCabonFootprint() {
        System.out.println( nome + ": 0 kg por km");
    }
    
}
