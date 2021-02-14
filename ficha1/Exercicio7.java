package ficha1;
import java.util.Scanner;


public class Exercicio7 {
    public static void main(String[] arq){
        Scanner teclado = new Scanner(System.in);
        int notas = 1;
        int contador = 0;
        float pessimas = 0.0f;
        float ruins = 0.0f;
        float boas = 0.0f;
        float otimas = 0.0f;
        while(notas >= 0 && notas <= 100){
            notas = teclado.nextInt();
            if(notas < 0 || notas > 100){
                break;
            }
            contador++;
            if(notas < 25){
                pessimas++;
            }
            else if(notas < 50){
                ruins++;
            }
            else if(notas < 75){
                boas++;
            }
            else{
                otimas++;
            }
        }
        pessimas = (int)((pessimas / contador) * 100);
        ruins = (int)((ruins / contador) * 100);
        boas = (int)((boas / contador) * 100);
        otimas = (int)((otimas / contador) * 100);
        System.out.print("porcentagem de pessimas: ");
        System.out.print((int)pessimas);
        System.out.print("%\n");
        System.out.print("porcentagem de ruins: ");
        System.out.print((int)ruins);
        System.out.print("%\n");
        System.out.print("porcentagem de boas: ");
        System.out.print((int)boas);
        System.out.print("%\n");
        System.out.print("porcentagem de otimas: ");
        System.out.print((int)otimas);
        System.out.print("%");
    }
}