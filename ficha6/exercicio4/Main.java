/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio4;

import java.util.*;


/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        Map<String,Integer> mapa = new HashMap<>();
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        String[] fraseCortada = frase.split(" ");
        for(String palavra: fraseCortada){
            if(mapa.containsKey(palavra)){
                Integer x = 1;
                mapa.put(palavra, x + mapa.get(palavra));
            }
            else{
                mapa.put(palavra, 1);
            }
        }
        for(String palavra: fraseCortada){
            if(mapa.get(palavra) != 0){
                System.out.println(palavra + " : " + mapa.get(palavra));
                mapa.put(palavra, 0);
            }
        }
    }
}
