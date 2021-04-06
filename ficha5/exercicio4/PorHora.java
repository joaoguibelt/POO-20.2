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
public class PorHora extends Funcionario{

    PorHora(String nome, float salario, int horas){
        super(nome, salario, horas);
    }
    
    @Override
    public void pagarSalario() {
        horas -= 40;
        float salarioPorHora = salario / 40;
        float rendaExtra = salarioPorHora * 1.5f * horas;
        salario += rendaExtra;
        System.out.println(nome + ": " + "R$" + salario);
    }
    
}
