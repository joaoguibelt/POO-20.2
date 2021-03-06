package ficha3.exercicio3;

class Porta{
    private boolean aberta;
    private String cor;
    private float altura;
    private float largura;
    Porta(boolean aberta, String cor, float altura, float largura){
        this.aberta = aberta;
        this.altura = altura;
        this.cor = cor;
        this.largura = largura;
    }
    public void estaAberta(){
        if (aberta == true){
            System.out.println("aberta");
        }
        else{
            System.out.println("fechada");
        }
    }
    public boolean getAberta() {
        return aberta;
    }
    public String getCor() {
        return cor;
    }
    public float getAltura() {
        return altura;
    }
    public float getLargura() {
        return largura;
    }
}

public class Questao3 {
     public static void main(String[] args){
       Porta portaRosa = new Porta(true,"rosa",2.5f,0.5f);
       System.out.println("cor: " + portaRosa.getCor());
       System.out.println("dimensoes: " + portaRosa.getAltura() + " de altura, e " + portaRosa.getLargura() + " de largura");
       System.out.println("a porta esta:");
       portaRosa.estaAberta();
    }
}
