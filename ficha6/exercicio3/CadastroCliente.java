/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio3;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class CadastroCliente {
    ArrayList<Cliente> lista;
        
    public void inserir(Cliente x) throws RepositorioException, ClienteJaExistenteException{
        if(lista.size() > 10){
            throw new RepositorioException();
        }
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCpf().equals(x.getCpf())){
                throw new ClienteJaExistenteException();
            }
        }
        lista.add(x);
    }
    
    public void buscar(Cliente x) throws ClienteInexistenteException{
        boolean cliente = false;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getCpf().equals(x.getCpf())){
                System.out.println(x.getNome() + " : " + x.getCpf());
                cliente = true;
            }
        }
        if(cliente == false){
            throw new ClienteInexistenteException();
        }
    }
}
