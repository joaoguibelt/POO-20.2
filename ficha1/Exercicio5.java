package ficha1;
import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] arq){
        int N;
        Scanner teclado = new Scanner(System.in);
        System.out.print("fatorial de: ");
        N = teclado.nextInt();
        if(N > 0){
            int fatorial = 1;
            for(int i = 1; i <= N; i++){
                fatorial *= i;
            }
            System.out.print(fatorial);
        }
        else{
            System.out.print("-1");
        }
    }
    
}
