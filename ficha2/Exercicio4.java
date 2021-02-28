package ficha2;


class Porta{
    int numeroDePortas;
    boolean[] portas = new boolean[numeroDePortas];
    void fecharTodasAsPortas(){
        for(int i = 0; i < numeroDePortas; i++){
            portas[i] = false;
        }
    }
    void abrirEFecharPortas(int n){
        n--;
        if(portas[n] == true){
            portas[n] = false;
        }
        else{
            portas[n] = true;
        }
    }
    void quantasPortasEstaoAbertas(){
        int abertas = 0;
        for(int i = 0; i < numeroDePortas; i++){
            if (portas[i] == true){
                abertas++;
            }
        }
        System.out.println("a casa tem " + abertas + " portas abertas");
    }
}   
    
    
class Casa{
    String cor;
    Porta portasDaCasa = new Porta();
}


public class Exercicio4 {
    public static void main(String[] args){
        Casa casinha = new Casa();
        casinha.cor = "roxo";
        casinha.portasDaCasa.numeroDePortas = 3;
        boolean[] vetorAuxiliar = new boolean[casinha.portasDaCasa.numeroDePortas];
        casinha.portasDaCasa.portas = vetorAuxiliar;
        casinha.portasDaCasa.fecharTodasAsPortas();
        casinha.portasDaCasa.abrirEFecharPortas(2);
        casinha.portasDaCasa.abrirEFecharPortas(3);
        casinha.portasDaCasa.abrirEFecharPortas(2);
        casinha.portasDaCasa.abrirEFecharPortas(1);
        System.out.println("a cor da casa e: " + casinha.cor);
        casinha.portasDaCasa.quantasPortasEstaoAbertas();
    }
}
