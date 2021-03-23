package ficha4.exercicio1e2;


public class Main {
    public static void main(String[] args){
        float areaCampoDeFut = 8250f;
        areaCampoDeFut = ConversaoDeUnidadesDeArea.metroParaPe(areaCampoDeFut);
        System.out.println(areaCampoDeFut + " pés quadrados");
        areaCampoDeFut = ConversaoDeUnidadesDeArea.peParaCentimetro(areaCampoDeFut);
        System.out.println(areaCampoDeFut + " centimetros quadrados");
        areaCampoDeFut = ConversaoDeUnidadesDeArea.centimetroParaPes(areaCampoDeFut);
        areaCampoDeFut = ConversaoDeUnidadesDeArea.pesParaAcre(areaCampoDeFut);
        System.out.println(areaCampoDeFut + " acres");
    }
}
