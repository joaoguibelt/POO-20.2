package ficha3.exercicio3;
import java.util.Random;

class Carta{
    String naipe;
    int tipo;
}


class Baralho{
    Carta[][] baralho = new Carta[4][13];
    void formarBaralhoEmOrdem(){
        int tipos = 1;
        for(int i = 0; i < 13; i++){
            baralho[0][i] = new Carta();
            baralho[0][i].tipo = tipos;
            baralho[0][i].naipe = "copas";
            baralho[1][i] = new Carta();
            baralho[1][i].tipo = tipos;
            baralho[1][i].naipe = "espadas";
            baralho[2][i] = new Carta();
            baralho[2][i].tipo = tipos;
            baralho[2][i].naipe = "ouros";
            baralho[3][i] = new Carta();
            baralho[3][i].tipo = tipos;
            baralho[3][i].naipe = "paus";
            tipos++;
            if(tipos == 14){
                tipos = 1;
            }
        }
    }
    void embaralhar(){
        Random random = new Random();
        int auxiliarTipos;
        String auxiliarNaipes;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                int numero = random.nextInt(3);
                String naipes;
                if(numero == 0){
                    naipes = "copas";
                }
                else if(numero == 1){
                    naipes = "espadas";
                }
                else if(numero == 2){
                    naipes = "ouros";
                }
                else{
                    naipes = "paus";
                }
                int tipos = random.nextInt(12);
                tipos++;
                auxiliarTipos = baralho[i][j].tipo;
                auxiliarNaipes = baralho[i][j].naipe;
                baralho[i][j].tipo = baralho[numero][tipos].tipo;
                baralho[i][j].naipe = baralho[numero][tipos].naipe;
                baralho[numero][tipos].tipo = auxiliarTipos;
                baralho[numero][tipos].naipe = auxiliarNaipes;
            }
        }
    }
    void mostrarBaralho(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                if(baralho[i][j].tipo > 1 && baralho[i][j].tipo < 11){
                    System.out.println(baralho[i][j].tipo + " de " + baralho[i][j].naipe);
                }
                else if(baralho[i][j].tipo == 1){
                    System.out.println("ás" + " de " + baralho[i][j].naipe);
                }
                else if(baralho[i][j].tipo == 11){
                    System.out.println("valete" + " de " + baralho[i][j].naipe);
                }
                else if(baralho[i][j].tipo == 12){
                    System.out.println("dama" + " de " + baralho[i][j].naipe);
                }
                else{
                    System.out.println("rei" + " de " + baralho[i][j].naipe);
                }
            }
        }
    }
}

public class Questao6 {
    public static void main(String[] args){
        Baralho deck = new Baralho();
        deck.formarBaralhoEmOrdem();
        System.out.println("baralho em ordem: ");
        deck.mostrarBaralho();
        deck.embaralhar();
        System.out.println("baralho embaralhado: ");
        deck.mostrarBaralho();
    }

}
