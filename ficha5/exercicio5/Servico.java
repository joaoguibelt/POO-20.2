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
public class Servico implements Recebivel{

    String descricao;
    int horas;
    double precoHoras;
    
    Servico(String descricao, int horas, double precoHoras){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHoras = precoHoras;
    }
    
    
    @Override
    public double totalizarReceita() {
        double x = horas * precoHoras;
        return x;
    }

    @Override
    public void printar(double x) {
        System.out.println(descricao + " = R$ " + x);
    }
    
}
