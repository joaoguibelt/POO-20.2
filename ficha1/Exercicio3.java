package ficha1;


public class Exercicio3 {
    public static void main(String[] arq){
        int contador = 1;
        int resposta = 0;
        while(contador != 1000){
            resposta += contador;
            contador++;
        }
        System.out.print(resposta);
    }
}
