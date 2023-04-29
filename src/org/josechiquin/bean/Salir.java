package org.josechiquin.bean;

public class Salir {
    private int num1;
    
    public Salir(){
    }
    public Salir(int num1){
        this.num1 = num1;
    }
    
    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public double salida(int num1){
        System.exit(0);
        return 0;
   }     
}