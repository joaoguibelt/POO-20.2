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
public abstract class Funcionario {

    String nome;
    float salario;
    int horas;
    Funcionario(String nome, float salario, int horas){
        this.horas = horas;
        this.salario = salario;
        this.nome = nome;
    }
    public abstract void pagarSalario();
}
