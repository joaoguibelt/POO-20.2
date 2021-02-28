package ficha2;


class Pessoa{
    String nome;
    int idade = 0;
    void aniversario(){
        idade++;
    }
}

public class Exercicio2 {
    public static void main(String[] args){
        Pessoa bebezao = new Pessoa();
        bebezao.nome = "ze";
        for(int i = 0; i < 50; i++){
            bebezao.aniversario();
        }
        System.out.println("nome: " + bebezao.nome);
        System.out.println("idade: " + bebezao.idade);
    }
}
