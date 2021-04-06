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
public class Carro implements CarbonFootprint{
    String combustivel;
    float cilindrada;

    Carro(String combustivel, float cilindrada){
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }
    
    @Override
    public void getCabonFootprint() {
        float x = 0;
        if(combustivel.equals("gasolina")){
            x += cilindrada * 0.3f;
        }
        else if(combustivel.equals("alcool")){
            x += cilindrada * 0.275f;
        }
        else if(combustivel.equals("gnv")){
            x += cilindrada * 0.20f;
        }
        else if(combustivel.equals("flex")){
            x += cilindrada * 0.29f;
        }
        System.out.println("carro " + combustivel + ": " + x + "kg por km");
    }
        
}