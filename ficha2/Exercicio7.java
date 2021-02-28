package ficha2;


class Produto{
    String nome;
    float preco;
    int quantidadeEstoque;
}


class Itens{
    Produto produto = new Produto();
    int quantidade;
    void abaterQuantidadeEmEstoque(){
        produto.quantidadeEstoque -= quantidade;
    }
}

class Pedido{
    String pagamento;
    int quantidadeItensDiferentes = 2;
    int precoTotal = 0;
    Itens[] itens = new Itens[quantidadeItensDiferentes];
    void iniciarVetor(){
        for(int i = 0; i < quantidadeItensDiferentes; i++){
            itens[i] = new Itens();
        }
    }
    void precoAPagar(){
        for(int i = 0; i < quantidadeItensDiferentes; i++){
            precoTotal += itens[i].produto.preco * itens[i].quantidade;
        }
        System.out.println("O cliente tem que pagar: " + precoTotal);
    }
}

public class Exercicio7 {
    public static void main(String[] args){
        Pedido pedido = new Pedido();
        pedido.iniciarVetor();
        pedido.itens[0].produto.nome = "arroz";
        pedido.itens[0].produto.quantidadeEstoque = 50;
        pedido.itens[0].produto.preco = 30.0f;
        pedido.itens[0].quantidade = 1;
        pedido.itens[0].abaterQuantidadeEmEstoque();
        pedido.itens[1].produto.nome = "banana";
        pedido.itens[1].produto.quantidadeEstoque = 100;
        pedido.itens[1].produto.preco = 1.5f;
        pedido.itens[1].quantidade = 6;
        pedido.itens[1].abaterQuantidadeEmEstoque();
        pedido.pagamento = "credito";
        pedido.precoAPagar();
        System.out.println("pedido de " + pedido.precoTotal + " reais pago em " + pedido.pagamento);
    }
}
