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
public class PessoaJuridica extends Agenda{
    int cnpj;
    String razaoSocial;
    float faturamento;
    PessoaJuridica(int cnpj, String razaoSocial, float faturamento, String endereco, PessoaJuridica x){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.endereco = endereco;
        listaJuridica.add(x);
    }
    
    @Override
    public void pegarContato() {
        System.out.println("cnpj: " + cnpj);
        System.out.println("razão social: " + razaoSocial);
        System.out.println("endereço: " + endereco);
        System.out.println("faturamento: " + faturamento);
    }
    
}
