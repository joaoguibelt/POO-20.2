/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio5;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public abstract class Agenda {
    String endereco;
    ArrayList<PessoaFisica> listaFisica;
    ArrayList<PessoaJuridica> listaJuridica;
    abstract void pegarContato();
    void pegarTodosContatos(){
        for(int i = 0; i < listaFisica.size(); i++){
            System.out.println("proximo contato");
            listaFisica.get(i).pegarContato();
        }
        for(int i = 0; i < listaJuridica.size(); i++){
            System.out.println("proximo contato");
            listaJuridica.get(i).pegarContato();
        }
    }
}
