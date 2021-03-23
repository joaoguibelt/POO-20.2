/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio5;

/**
 *
 * @author joaog
 */
public class PessoaFisica extends Agenda{
    int cpf;
    String nome;
    int diaNiver;
    int mesNiver;
    int anoNiver;
    
    PessoaFisica(int cpf, String nome, int diaNiver, int mesNiver, int anoNiver, String endereco, PessoaFisica x){
        this.anoNiver = anoNiver;
        this.cpf = cpf;
        this.diaNiver = diaNiver;
        this.endereco = endereco;
        this.mesNiver = mesNiver;
        this.nome = nome;
        listaFisica.add(x);
    }

 
    @Override
    public void pegarContato() {
        System.out.println("cpf: " + cpf);
        System.out.println("nome: " + nome);
        System.out.println("endereço: " + endereco);
        System.out.println("data de aniversario: " + diaNiver + "/" + mesNiver + "/" + anoNiver);
    }

 
}
