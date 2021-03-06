package ficha3.exercicio3;

class Televisao{
    private boolean ligado = false;
    private int volume = 5;
    private int canal = 0;
    private boolean silencioso = false;
    void ligarDesligar(){
        if(isLigado() == false){
            ligado = true;
        }
        else{
            ligado = false;
        }
    }
    void irParaCanal(int n){
        setCanal(n);
    }
    void canalAnterior(){
        if(getCanal() != 0){
            setCanal(getCanal() - 1);
        }
        else{
            setCanal(99);
        }
    }
    void proximoCanal(){
        if(getCanal() != 99){
            setCanal(getCanal() + 1);
        }
        else{
            setCanal(0);
        }
    }
    void silenciar(){
        if(isSilencioso() == false){
            silencioso = true;
        }
        else{
            silencioso = false;
        }
    }
    void estadoDaTv(){
         if(isLigado() == true){
            System.out.println("a tv está ligada agora");
        }
        else{
            System.out.println("a tv está desligada agora");
        }
        System.out.println("o canal atual é: " + getCanal());
        System.out.println("o volume atual é: " + getVolume());
        if(isSilencioso() == true){
            System.out.println("a tv está silenciada agora");
        }
        else{
            System.out.println("a tv não está silenciada");
        }
    }

    
    public boolean isLigado() {
        return ligado;
    }

   
    public int getVolume() {
        return volume;
    }

    
    public void setVolume(int volume) {
        if(canal > 0)
        this.volume = volume;
    }

    
    public int getCanal() {
        return canal;
    }

  
    public void setCanal(int canal) {
        if(canal > 0)
        this.canal = canal;
    }

  
    public boolean isSilencioso() {
        return silencioso;
    }
}


public class Questao5 {
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
