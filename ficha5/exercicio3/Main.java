/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio3;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        Bicicleta bicicleta1 = new Bicicleta("bicicleta1");
        Bicicleta bicicleta2 = new Bicicleta("bicicleta2");
        Carro carro1 = new Carro("gnv", 1.2f);
        Carro carro2 = new Carro("gasolina", 2.1f);
        Casa casa = new Casa(20,false,18,false);
        Escola escola = new Escola(50,true,35,true);
        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
        lista.add(bicicleta1);
        lista.add(bicicleta2);
        lista.add(carro1);
        lista.add(carro2);
        lista.add(casa);
        lista.add(escola);
        for(int i = 0; i < 6; i++){
            lista.get(i).getCabonFootprint();
        }
    }
}

//nao ira rodar pois classes abstratas nao podem ser instanciadas.
