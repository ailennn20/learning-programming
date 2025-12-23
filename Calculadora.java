/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasimple;

/**
 *
 * @author ailen
 */
public class Calculadora {
    double numero_1;
    double numero_2;
    
    public Calculadora(double numero1, double numero2) {
    this.numero_1 = numero1;
    this.numero_2 = numero2;
}
    
    public double Suma (){
        return numero_1 + numero_2;
    }
    public double Multiplicar (){
        return numero_1 * numero_2 ;
    }
    public double Dividir (){
        return numero_1 / numero_2;
    }
    public double Restar (){
        return numero_1 - numero_2 ;
    }
    public void Finalizar (){
        System.out.println ("Gracias por usar la calculadora");
    }

}
