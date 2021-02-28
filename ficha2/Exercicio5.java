package ficha2;


class Televisao{
    boolean ligado = false;
    int volume = 5;
    int canal = 0;
    boolean silencioso = false;
    void ligarDesligar(){
        if(ligado == false){
            ligado = true;
        }
        else{
            ligado = false;
        }
    }
    void irParaCanal(int n){
        canal = n;
    }
    void canalAnterior(){
        if(canal != 0){
            canal--;
        }
        else{
            canal = 99;
        }
    }
    void proximoCanal(){
        if(canal != 99){
            canal++;
        }
        else{
            canal = 0;
        }
    }
    void silenciar(){
        if(silencioso == false){
            silencioso = true;
        }
        else{
            silencioso = false;
        }
    }
    void estadoDaTv(){
         if(ligado == true){
            System.out.println("a tv está ligada agora");
        }
        else{
            System.out.println("a tv está desligada agora");
        }
        System.out.println("o canal atual é: " + canal);
        System.out.println("o volume atual é: " + volume);
        if(silencioso == true){
            System.out.println("a tv está silenciada agora");
        }
        else{
            System.out.println("a tv não está silenciada");
        }
    }
}


public class Exercicio5 {
    public static void main(String[] args){
        Televisao tv = new Televisao();
        tv.estadoDaTv();
        tv.ligarDesligar();
        tv.canalAnterior();
        tv.proximoCanal();
        tv.silenciar();
        tv.irParaCanal(50);
        tv.silenciar();
        tv.estadoDaTv();
    }
}
