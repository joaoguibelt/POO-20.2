/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio8;

/**
 *
 * @author joaog
 * @param <F>
 * @param <S>
 */
public class Par <F, S>{
    private F primeiroElemento;
    private S segundoElemento;
    Par(F primeiroElemento, S segundoElemento){
        this.primeiroElemento = primeiroElemento;
        this.segundoElemento = segundoElemento;
    }

    /**
     * @return the primeiroElemento
     */
    public F getPrimeiroElemento() {
        return primeiroElemento;
    }

    /**
     * @param primeiroElemento the primeiroElemento to set
     */
    public void setPrimeiroElemento(F primeiroElemento) {
        this.primeiroElemento = primeiroElemento;
    }

    /**
     * @return the segundoElemento
     */
    public S getSegundoElemento() {
        return segundoElemento;
    }

    /**
     * @param segundoElemento the segundoElemento to set
     */
    public void setSegundoElemento(S segundoElemento) {
        this.segundoElemento = segundoElemento;
    }
}
