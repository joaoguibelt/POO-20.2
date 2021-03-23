/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4.exercicio9;

import java.util.ArrayList;

/**
 *
 * @author joaog
 */
public class FormaGeometrica<T> {
    
   
    public void setArea(float area) {
        this.area = area;
    }

 
    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    private float area;
    private float perimetro;

    
    public float getArea() {
        return area;
    }

    
    public float getPerimetro() {
        return perimetro;
    }
    
    public static void somarAreas(ArrayList<FormaGeometrica> x){
        float somatorio = 0;
        for(int i = 0; i < x.size(); i++){
            somatorio += x.get(i).getArea();
            
        }
        System.out.println(somatorio);
    }
}
