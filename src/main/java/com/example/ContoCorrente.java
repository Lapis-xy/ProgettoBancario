package com.example;


public class ContoCorrente {
 private double saldo; 
 private String titolare;
 
 public ContoCorrente(double saldo, String titolare){

    this.saldo = saldo; 
    this.titolare = titolare; 
    if(saldo < 0){
       
        throw new IllegalArgumentException("il valore non puo essere negativo");
        
    } }



public void deposito(double importo){

   this.saldo += importo;
   System.out.println("saldo tot dopo deposito =" + this.saldo);
   
}

public void prelievo(double importo){


   if(importo < 0)   throw new IllegalArgumentException("il valore non puo essere negativo");
        

}




 private void setSaldo(double s){
    this.saldo = s;
 }

}
