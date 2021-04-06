/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio4;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        Assalariado jorge = new Assalariado("Jorge", 3500);
        PorHora renata = new PorHora("Renata", 3000, 50);
        Comissionados maria = new Comissionados("Maria", 50, 10500, 20);
        AssalariadoComissonado joao = new AssalariadoComissonado("Joao",3000,7000,15);
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(jorge);
        lista.add(renata);
        lista.add(maria);
        lista.add(joao);
        joao.salario += joao.salario * 0.1f; 
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).pagarSalario();
        }
    }
}