package ficha1;
import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] arq){
        Scanner teclado = new Scanner(System.in);
        int n;
        int magico = 0;
        int soma = 0;
        int ajudante = 0;
        n = teclado.nextInt();
        int[][] matriz = new int[n][n];  
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                if(i == j){
                    ajudante += matriz[i][j];
                }
            }
        }
        soma = ajudante;
        if(magico == 0){
            for(int i = 0; i < n; i++){      
                if(soma == ajudante){
                    ajudante = 0;
                    for(int j = 0; j < n; j++){
                        ajudante += matriz[i][j];
                    }
                    if (soma != ajudante){
                        magico = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
        if(magico == 0){
            for(int i = 0; i < n; i++){      
                if(soma == ajudante){
                    ajudante = 0;
                    for(int j = 0; j < n; j++){
                        ajudante += matriz[j][i];
                    }
                    if (soma != ajudante){
                        magico = 1;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
      if(magico == 0){
                    ajudante = 0;
            for(int i = 0; i < n; i++){      
                    int j = 1;
                    ajudante += matriz[i][n - j];
                    j++;    
                    }
                    if (soma != ajudante){
                        magico = 1;
                    }
                }
      if(magico == 0){
          System.out.print("é uma quadrado mágico");
      }
      else{
          System.out.print("não é um quadrado mágico");
      }
    }
}
