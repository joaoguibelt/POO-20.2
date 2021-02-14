package ficha1;


public class Exercicio4 {
    public static void main(String[] arq){
        int[] multiplos = new int[100];
        int contador = 0;
        for(int i = 1; i <= 100; i++){
           if(i % 3 == 0){
               multiplos[contador] = i;
               contador++;
           }
        }
        for(int i = 0; i <= 99; i++){
            if(multiplos[i] == 0){
                break;
            }
            System.out.print(multiplos[i]);
            System.out.print(" ");
        }
    }
}
