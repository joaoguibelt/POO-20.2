/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha6.exercicio5;

import java.util.*;

/**
 *
 * @author joaog
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> aList = new ArrayList<>();
        aList.add("exemplo");
        aList.add("xyz");
        aList.add("joao");
        String arraylist = aList.toString();
        HashSet<String> hSet = new HashSet<>(aList);
        String hashset = hSet.toString();
        PriorityQueue<String> pQueue = new PriorityQueue<>(hSet);
        String priorityqueue = pQueue.toString();
        ArrayDeque<String> aDeque = new ArrayDeque<>(pQueue);
        String arraydeque = aDeque.toString();
        TreeSet<String> tSet = new TreeSet<>(aDeque);
        String treeset = tSet.toString();
        System.out.println(arraylist);
        System.out.println(hashset);   
        System.out.println(priorityqueue);
        System.out.println(arraydeque);
        System.out.println(treeset);
        //Alguns deles ficam em ordens diferentes pois eles ordenam a seus objetos de formas diferentes.
        //Exemplo: o ArrayList ordena seus objetos na ordem em que eles são adcionados porém o PriorityQueue ordena seus elementos seguinda a ordenação natural do java o que no caso de carecteres alfabeticos é a ordem alfabetica.
    }
}
