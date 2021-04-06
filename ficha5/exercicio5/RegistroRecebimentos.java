/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5.exercicio5;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author joaog
 */
public class RegistroRecebimentos{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Recebivel> registros = new ArrayList<>();
        ItemVenda mouse = new ItemVenda("mouse simples", 10, 19.99);
        registros.add(mouse);
        Servico consertoComputador = new Servico("conserto de computador", 3, 50);
        registros.add(consertoComputador);
        System.out.println("imprimir recibo? ");
        System.out.println("digite s para sim ou n para não");
        String n = teclado.next();
        if(n.equals("s")){
            for(int i = 0; i < registros.size(); i++){
            double x = registros.get(i).totalizarReceita();
            registros.get(i).printar(x);
            }
        }
    }
}
