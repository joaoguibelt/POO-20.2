/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio6;

import java.util.*;

/**
 *
 * @author joaog
 */
public class Karaoke {
    public static void main(String[] args){
        ArrayList<Musica> musicasDisponiveis = new ArrayList<>();
        Musica pop = new Musica("pop", "cantor1");
        musicasDisponiveis.add(pop);
        Musica rock = new Musica("rock", "cantor2");
        musicasDisponiveis.add(rock);
        Musica indie = new Musica("indie", "cantor3");
        musicasDisponiveis.add(indie);
        Musica funk = new Musica("funk", "cantor4");
        musicasDisponiveis.add(funk);
        Musica rap = new Musica("rap", "cantor5");
        musicasDisponiveis.add(rap);
        Musica trap = new Musica("trap", "cantor6");
        musicasDisponiveis.add(trap);
        Musica eletronica = new Musica("eletronica", "cantor7");
        musicasDisponiveis.add(eletronica);
        Musica sertanejo = new Musica("sertanejo", "cantor8");
        musicasDisponiveis.add(sertanejo);
        Musica samba = new Musica("samba", "cantor9");
        musicasDisponiveis.add(samba);
        Musica pagode = new Musica("pagode", "cantor10");
        musicasDisponiveis.add(pagode);
        Scanner teclado = new Scanner(System.in);
        ArrayList<Musica> listaDeEspera = new ArrayList<>();
        while(true){
        System.out.println("Ver lista de musicas?\nDigite s para sim e n para não");
        String x = teclado.next();
        if(x.equals("s")){
            System.out.println("Ver lista por nome ou artista?");
            x = teclado.next();
            if(x.equals("nome")){
                for(int i = 0; i < musicasDisponiveis.size(); i++){
                    System.out.println(musicasDisponiveis.get(i).nome);
                }
                System.out.println("Digite a musica que vai para a lista de espera.");
                x = teclado.next();
                boolean controlador = false;
                for(int i = 0; i < musicasDisponiveis.size(); i++){
                    if(musicasDisponiveis.get(i).nome.equals(x)){
                        listaDeEspera.add(musicasDisponiveis.get(i));
                        controlador = true;
                        System.out.println("Musica adicionada a lista");
                    }
                }
                if(controlador = false){
                    System.out.println("nome inválido");
                }
            }
            else{
                for(int i = 0; i < musicasDisponiveis.size(); i++){
                    System.out.println(musicasDisponiveis.get(i).artista);
                }
                System.out.println("Digite o nome do artista que vai para a lista de espera.");
                x = teclado.next();
                boolean controlador = false;
                for(int i = 0; i < musicasDisponiveis.size(); i++){
                    if(musicasDisponiveis.get(i).artista.equals(x)){
                        listaDeEspera.add(musicasDisponiveis.get(i));
                        controlador = true;
                        System.out.println("Musica adicionada a lista");
                    }
                }
                if(controlador = false){
                    System.out.println("nome inválido");
                }
            }
        }
        else{
            System.out.println("Ver lista de reprodução?\nDigite s para sim e n para não");
            x = teclado.next();
            if(x.equals("s")){
                  System.out.println(listaDeEspera.size());
                for(int i = 0; i < listaDeEspera.size(); i++){
                    System.out.println(listaDeEspera.get(i).nome);
                }
            }
            break;
        }
        }
    }
}
