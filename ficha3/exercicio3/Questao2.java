package ficha3.exercicio3;


class Pessoa{
    private String nome;
    private int idade = 0;
    public void aniversario(){
        setIdade(getIdade() + 1);
    }

    
    public Pessoa(String nome){
        this.nome = nome;
    }
   
    public String getNome() {
        return nome;
    }

    
    public int getIdade() {
        return idade;
    }

  
    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        }
    }
}


public class Questao2 {
     public static void main(String[] args){
        Pessoa bebezao = new Pessoa("ze");
        for(int i = 0; i < 50; i++){
            bebezao.aniversario();
        }
        System.out.println("nome: " + bebezao.getNome());
        System.out.println("idade: " + bebezao.getIdade());
    }
}
