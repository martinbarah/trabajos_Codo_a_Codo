/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica01;
import java.util.Scanner;


public class Clase01 
{
    public static void main(String[] args)
    {
     int valor1;
     int valor2;
     int res;
     
     Scanner ingreso=new Scanner(System.in);
     
        System.out.println("Ingrese Valor Nro.1 :");
        valor1=ingreso.nextInt();
     
         System.out.println("Ingrese Valor Nro.2 :");
         valor2=ingreso.nextInt();
         
         res=multiplicar(valor1,valor2);
         
        //System.out.println("La multiplicacion es:"+(valor1*valor2));
        System.out.println("La multiplicacion es:"+res);
        
        div(valor1,valor2);
      
    }
    
    public static int multiplicar(int x, int y)
    {
        int resultado=(x*y);
        return resultado;
    }
    
    public static void div(int x,int y)
    {
        System.out.println("El resultado de la division es :"+(x/y));
    }
}
