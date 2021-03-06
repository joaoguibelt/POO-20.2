
package ficha3.exercicio4;


public class Main {
    public static void main(String[] args){
        Data data = new Data(23, 5, 2002);
        data.printarPadrao();
        data = new Data(28, 6, 2001);
        data.printarPadrao();
        data = new Data("dezembro", 05, 1980);
        data.printarMesEscrito();
        data = new Data("janeiro", 20, 1744);
        data.printarMesEscrito();
        data = new Data(240, 2015);
        data.printarDiasDoAno();
        data = new Data(46, 2077);
        data.printarDiasDoAno();
    }
}
