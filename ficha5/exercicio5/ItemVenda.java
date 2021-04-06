/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio5;

/**
 *
 * @author joaog
 */
public class ItemVenda implements Recebivel{
    
    String produto;
    int quantidade;
    double precoUnitario;

    ItemVenda(String produto, int quantidade, double precoUnitario){
        this.precoUnitario = precoUnitario;
        this.produto = produto;
        this.quantidade = quantidade;
    }  
    
    @Override
    public double totalizarReceita() {
        double x = precoUnitario * quantidade;
        return x;
    }

    @Override
    public void printar(double x) {
        System.out.println(quantidade + " de " + produto + " =  R$" + x);
    }
    
}
