package ficha2;


class Contato{
    String nome;
    int numero;
}


class Agenda{
    Contato pessoa = new Contato();
}


public class Exercicio1 {
    public static void main(String[] args){
        Agenda primeiraAgenda = new Agenda();
        primeiraAgenda.pessoa.nome = "joao";
        primeiraAgenda.pessoa.numero = 997011209;
        System.out.println("nome: " + primeiraAgenda.pessoa.nome);
        System.out.println("numero: " + primeiraAgenda.pessoa.numero);
    }
}
