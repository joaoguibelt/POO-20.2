package ficha2;


class Bateria{
    int capacidadeDeCarga;
    int nivelDeCarga;
}

class Celular{
    Bateria bateria = new Bateria();
    void ligar(int tempo){
        bateria.nivelDeCarga -= tempo / 5;
        if(bateria.nivelDeCarga < 0){
            bateria.nivelDeCarga = 0;
        }
    }
    void mandarMensagem(){
        bateria.nivelDeCarga -= 1;
         if(bateria.nivelDeCarga < 0){
            bateria.nivelDeCarga = 0;
        }
    }
    void checarBateria(){
        System.out.println("nível de bateria atual é " + bateria.nivelDeCarga);
    }
    void carregarCelular(){
        bateria.nivelDeCarga = bateria.capacidadeDeCarga;
    }
}


public class Exercicio8 {
    public static void main(String[] args){
        Celular celular = new Celular();
        celular.bateria.capacidadeDeCarga = 100;
        celular.bateria.nivelDeCarga = 50;
        celular.checarBateria();
        celular.mandarMensagem();
        celular.mandarMensagem();
        celular.ligar(120);
        celular.checarBateria();
        celular.ligar(125);
        celular.checarBateria();
        celular.carregarCelular();
        celular.checarBateria();
    }
}
