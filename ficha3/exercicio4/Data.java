
package ficha3.exercicio4;


public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesS;
    
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    Data(String mesS, int dia, int ano){
        this.mesS = mesS;
        this.dia = dia;
        this.ano = ano;
    }
    
    Data(int diasAno, int ano){
        this.dia = diasAno;
        this.ano = ano;
    }
    public void printarPadrao(){
        System.out.println(getDia() + "/" + getMes() + "/"  + getAno());
    } 
    public void printarMesEscrito(){
        System.out.println(getMesS() + " " + getDia() + "," + getAno());
    }
    public void printarDiasDoAno(){
        System.out.println(getDia() + " " + getAno());
    }

  
    public int getDia() {
        return dia;
    }

  
    public void setDia(int dia) {
        if(dia > 0 && dia < 32)
            this.dia = dia;
    }

 
    public int getMes() {
        return mes;
    }

 
    public void setMes(int mes) {
        if(mes > 0 && mes < 13)
         this.mes = mes;
    }

  
    public int getAno() {
        return ano;
    }

 
    public void setAno(int ano) {
        if(ano > 0)
            this.ano = ano;
    }

  
    public String getMesS() {
        return mesS;
    }
}
