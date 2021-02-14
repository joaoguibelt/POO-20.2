package ficha1;


public class Exercicio6 {
    public static void main(String[] arq){
        int item1 = 0;
        int item2 = 1;
        int ajudante = item2;
        System.out.print(item1);
        System.out.print(" ");
        System.out.print(item2);
        while(item2 <= 100){
            item2 += item1;
            item1 = ajudante;
            ajudante = item2;
            System.out.print(" ");
            System.out.print(item2);
        }
    }
}
