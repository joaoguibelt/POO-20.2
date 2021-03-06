package ficha3.exercicio3;

class Bateria{
    private int capacidadeDeCarga;
    private int nivelDeCarga;

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

       public int getNivelDeCarga() {
        return nivelDeCarga;
    }

   
    public void setNivelDeCarga(int nivelDeCarga) {
        if(nivelDeCarga > 0)
        this.nivelDeCarga = nivelDeCarga;
    }

   
    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        if(capacidadeDeCarga > 0)
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}

class Celular{
    Bateria bateria = new Bateria();
    void ligar(int tempo){
        bateria.setNivelDeCarga(bateria.getNivelDeCarga() - tempo / 5);
        if(bateria.getNivelDeCarga() < 0){
            bateria.setNivelDeCarga(0);
        }
    }
    void mandarMensagem(){
        bateria.setNivelDeCarga(bateria.getNivelDeCarga() - 1);
         if(bateria.getNivelDeCarga() < 0){
             bateria.setNivelDeCarga(0);
        }
    }
    void checarBateria(){
        System.out.println("nível de bateria atual é " + bateria.getNivelDeCarga());
    }
    void carregarCelular(){
        bateria.setNivelDeCarga(bateria.getCapacidadeDeCarga());
    }
}


public class Questao8 {
     public static void main(String[] args){
        Celular celular = new Celular();
        celular.bateria.setCapacidadeDeCarga(100);
        celular.bateria.setNivelDeCarga(50);
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
