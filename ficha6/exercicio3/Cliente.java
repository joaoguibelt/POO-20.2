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
public class Cliente {
    private String cpf;
    private String nome;

    
    public String getCpf() {
        return cpf;
    }

  
    public void setCpf(String cpf) throws DadoInvalidoException{
        if(cpf.length() != 11){
            throw new DadoInvalidoException();
        } 
        this.cpf = cpf;
    }

  
    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }
}
