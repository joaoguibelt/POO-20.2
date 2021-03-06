package ficha3.exercicio3;


class Agenda{
    private int numeroInserir;
    private String nomeInserir;
    public Agenda(String nomeInserir, int numeroInserir){
        this.nomeInserir = nomeInserir;
        this.numeroInserir = numeroInserir;
    }
    public int getNumeroInserir(){
        return this.numeroInserir;
    }    
    public String getNomeInserir(){
        return this.nomeInserir;
    }
}


public class Questao1 {
     public static void main(String[] args){
        Agenda primeiraAgenda = new Agenda("joao", 997011209);
        System.out.println("nome: " + primeiraAgenda.getNomeInserir());
        System.out.println("numero: " + primeiraAgenda.getNumeroInserir());
    }
}
