package com.crio.qcalc;

public class StandardCalculator {
    private int result;
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    public void add(int n1,int n2){
       int res = n1+n2;
        setResult(res);
        
    }
    public void subtract(int n1,int n2){
       int res = n1-n2;
       setResult(res);
    }
    public void multiply(int n1,int n2){
        int res = n1*n2;
        setResult(res);
    }
    public void divide(int n1,int n2){
        int res = n1/n2;
        setResult(res);
    }
    public int getResult(){
        return result;
    }
    private void setResult(int value){
        this.result = value;
    }
    public void clearResult(){
        setResult(0);
    }
    public void printResult(){
       System.out.println("The standard calculator result is :"+getResult());
    }


public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

}
