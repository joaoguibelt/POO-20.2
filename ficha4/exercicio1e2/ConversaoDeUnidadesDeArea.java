package ficha4.exercicio1e2;


class ConversaoDeUnidadesDeArea {
    static float metroParaPe(float x){
        x *= 10.76;
        return x;
    } 
    static float peParaCentimetro(float x){
        x *= 929;
        return x;
    }
    static float milhaParaAcre(float x){
        x *= 640;
        return x;
    }
    static float acreParaPes(float x){
        x *= 43560;
        return x;
    }
    static float centimetroParaPes(float x){
        x /= 929;
        return x;
    }
    static float pesParaAcre(float x){
        x /= 43560;
        return x;
    }
}
