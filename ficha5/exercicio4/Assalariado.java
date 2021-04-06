/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio4;

/**
 *
 * @author joaog
 */
public class Assalariado extends Funcionario{

    Assalariado(String nome, float salario){
        super(nome, salario, 40);
    }
    @Override
    public void pagarSalario() {
        System.out.println(nome + ": " + "R$" + salario);
    }
    
}
