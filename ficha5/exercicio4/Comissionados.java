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
public class Comissionados extends Funcionario{

    
    int valorTotalVendas;
    float comissao;
    
    Comissionados(String nome, int horas, int valorTotalVendas, float comissao){
        super(nome, 0, horas);
        this.comissao = comissao;
        this.valorTotalVendas = valorTotalVendas;
    }
    
    @Override
    public void pagarSalario() {
        comissao /= 100;
        salario = valorTotalVendas * comissao;
        System.out.println(nome + ": " + "R$" + salario);
    }
    
}
