/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio2;

/**
 *
 * @author joaog
 */
public class ContaCorrente {
    float limite;
    float saldo;
    private float valorLimite;
    
    ContaCorrente(float limite, float saldo, float valorLimite){
        this.limite = limite;
        this.saldo = saldo;
        setValorLimite(valorLimite);
    }
    
    public void sacar(float valor){
        if(valor < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        if(valor > limite){
            throw new IllegalArgumentException("valor inválido");
        }
        saldo -= valor;
        System.out.println("saque feito");
    }
    public void depositar(float valor){
        if(valor < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        saldo += valor;
        System.out.println("deposito feito");
    }

    public void setValorLimite(float valor) {
        if(valor < 0){
            throw new IllegalArgumentException("valor inválido");
        }
        this.valorLimite = valor;
    }
    
}
