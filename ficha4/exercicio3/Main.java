package ficha4.exercicio3;



public class Main {
    public static void main(String[] args){
       Pessoa pessoa = new Pessoa("Joao",19);
       System.out.println(pessoa.nome +" " + pessoa.idade + " anos : parâmetro");
       pessoa.pai = new Pessoa("Lucio", 58);
       System.out.println(pessoa.pai.nome +" " + pessoa.pai.idade + " anos : pai");
       pessoa.mae = new Pessoa("Lucila", 53);
       System.out.println(pessoa.mae.nome +" " + pessoa.mae.idade + " anos : mãe");
       pessoa.pai.pai = new Pessoa("Lorival", 89);
       System.out.println(pessoa.pai.pai.nome +" " + pessoa.pai.pai.idade + " anos : avô de pai");
       pessoa.pai.mae = new Pessoa("Jacinta",83);
       System.out.println(pessoa.pai.mae.nome +" " + pessoa.pai.mae.idade + " anos : avó de pai");
       pessoa.mae.mae = new Pessoa("Nilma", 75);
       System.out.println(pessoa.mae.mae.nome +" " + pessoa.mae.mae.idade + " anos : avó de mãe");
       pessoa.mae.pai = new Pessoa("Roberto",86);
       System.out.println(pessoa.mae.pai.nome +" " + pessoa.mae.pai.idade + " anos : avô de mãe");
    }
}
