//IllegalArgumentException - é causada quando é feito um argumento ilegal ou inaprorpiado.
//NumberFormatException - é causada pela tentativa de transformar uma string em um tipo numerico, sem que a string tenha o formato apropriado(é um tipo de IllegalArgumentException).
package ficha6.exercicio1;


public class TratamentoDeExecoes {
    public static void main(String[] args){
        try{
            String exemplo = "exemplo";
            int a = Integer.parseInt(exemplo);
            System.out.println(a);
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
    }
    
}
