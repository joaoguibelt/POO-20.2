package ficha3.exercicio3;

class Porta{
    private int numeroDePortas;
    private boolean[] portas = new boolean[3];
    void fecharTodasAsPortas(){
        for(int i = 0; i < getNumeroDePortas(); i++){
            portas[i] = false;
        }
    }
    void abrirEFecharPortas(int n){
        n--;
        if(getPortas()[n] == true){
            portas[n] = false;
        }
        else{
            portas[n] = true;
        }
    }
    void quantasPortasEstaoAbertas(){
        int abertas = 0;
        for(int i = 0; i < getNumeroDePortas(); i++){
            if (getPortas()[i] == true){
                abertas++;
            }
        }
        System.out.println("a casa tem " + abertas + " portas abertas");
    }

    
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

   
    public void setNumeroDePortas(int numeroDePortas) {
        if(numeroDePortas > 0){
            this.numeroDePortas = numeroDePortas;
        }
    }

  
    public boolean[] getPortas() {
        return portas;
    }
}   
    
    
class Casa{
    String cor;
    Porta portasDaCasa = new Porta();
}

public class Questao4 {
     public static void main(String[] args){
        Casa casinha = new Casa();
        casinha.cor = "roxo";
        casinha.portasDaCasa.setNumeroDePortas(3);
      //
        casinha.portasDaCasa.fecharTodasAsPortas();
        casinha.portasDaCasa.abrirEFecharPortas(2);
        casinha.portasDaCasa.abrirEFecharPortas(3);
        casinha.portasDaCasa.abrirEFecharPortas(2);
        casinha.portasDaCasa.abrirEFecharPortas(1);
        System.out.println("a cor da casa e: " + casinha.cor);
        casinha.portasDaCasa.quantasPortasEstaoAbertas();
    }
}
