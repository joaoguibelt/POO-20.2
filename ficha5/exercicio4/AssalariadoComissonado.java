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
public class AssalariadoComissonado extends Funcionario{
    int valorTotalVendas;
    float comissao;
    
    AssalariadoComissonado(String nome,float salario, int valorTotalVendas, float comissao){
        super(nome, salario, 40);
        this.comissao = comissao;
        this.valorTotalVendas = valorTotalVendas;
    }
    
    
    @Override
    public void pagarSalario() {
        comissao /= 100;
        salario += valorTotalVendas * comissao;
        System.out.println(nome + ": " + "R$" + salario);
    }
    
}
