/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorasimple;

import java.util.Scanner;

/**
 *
 * @author ailen
 */
public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcion;
        
        do{ 
            System.out.println("Calculadora");
            System.out.println("Ingrese 1 para Sumar");
            System.out.println("Ingrese 2 para Multiplicar");
            System.out.println("Ingrese 3 para Dividir");
            System.out.println("Ingrese 4 para Restar");
            System.out.println("Ingrese 5 para Finalizar");
            opcion=sc.nextInt();
            
         switch(opcion){
             case 1:
             case 2:
             case 3:
             case 4:
             System.out.println("Ingrese el primer numero");
             double numero_1=sc.nextDouble();
             System.out.println("Ingrese el segundo numero");
             double numero_2=sc.nextDouble();
             
             
         Calculadora Calc = new Calculadora (numero_1, numero_2);
         
         switch(opcion){
             case 1:
                 System.out.println("Resultado:" + Calc.Suma());
             break;
             case 2:
                 System.out.println("Resultado:" + Calc.Multiplicar());
             break;
             case 3:
                 System.out.println("Resultado:" + Calc.Dividir());
             break;
             case 4:
                 System.out.println("Resultado:" + Calc.Restar());
             break;
             case 5:
                Calc.Finalizar();
             break;
             default:
                 System.out.println("Opcion no valida");
                  }
}
        } while (opcion!=5);
         sc.close();
        }
}