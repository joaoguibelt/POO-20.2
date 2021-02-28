package ficha2;

class Porta{
    boolean aberta;
    String cor;
    float altura;
    float largura;
    void estaAberta(){
        if (aberta == true){
            System.out.println("aberta");
        }
        else{
            System.out.println("fechada");
        }
    }
}
public class Exercicio3 {
    public static void main(String[] args){
       Porta portaRosa = new Porta();
       portaRosa.aberta = true;
       portaRosa.cor = "rosa";
       portaRosa.altura = 2.5f;
       portaRosa.largura = 0.5f;
       System.out.println("cor: " + portaRosa.cor);
       System.out.println("dimensoes: " + portaRosa.altura + " de altura, e " + portaRosa.largura + " de largura");
       System.out.println("a porta esta:");
       portaRosa.estaAberta();
    }
}
