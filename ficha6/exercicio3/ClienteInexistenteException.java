/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio3;

/**
 *
 * @author joaog
 */
public class ClienteInexistenteException extends Exception{
    public ClienteInexistenteException(){
        super("Cliente Inexistente");
    }
}
