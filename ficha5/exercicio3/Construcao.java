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
public abstract class Construcao implements CarbonFootprint{
    int numPessoas;
    boolean energiaRenovavel;
    int numLampadas;
    boolean usoArCondicionado;

    
    Construcao(int numPessoas, boolean energiaRenovavel, int numLampadas, boolean usoArCondicionado){
        this.energiaRenovavel = energiaRenovavel;
        this.numLampadas = numLampadas;
        this.numPessoas = numPessoas;
        this.usoArCondicionado = usoArCondicionado;
    }
    
    @Override
    public void getCabonFootprint() {
        float x = 0;
        if(energiaRenovavel == false){
            if(usoArCondicionado == true){
                x += 10;
            }
            x += numPessoas * 0.45f;
            x += numLampadas * 0.145;
        }
        else{
            if(usoArCondicionado == true){
                x += 5;
            }
            x += numPessoas * 0.45f;
            x += numLampadas * 0.067;
        }
        System.out.println("construcao "+ numPessoas +" pessoas: " + x + " kg por hora");
    }
    
}
