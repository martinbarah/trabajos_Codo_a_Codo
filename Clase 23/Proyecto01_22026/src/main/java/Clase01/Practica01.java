/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase01;
import java.util.Scanner;

/**
 *
 * @author nfernandez
 */
public class Practica01 
{
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo");
        
        //variables
        int variableEntera=10;
        String variableString="Nicolas";
        boolean variableBoolean=true;
        double variableDoubleFactura=1500.45;
        int opcionIngresada;
        
        /*
        Imprimir por pantalla
        */
        System.out.println("Dato1: "+variableString);
        
        
        //Ingresar datos x pantalla.
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese Valor: ");
        opcionIngresada=ingreso.nextInt();
        
        
        System.out.println("EL valor ingresado es: "+opcionIngresada);
        
        //condicionales
        
        
        if(opcionIngresada==1 )
        {
            System.out.println("Opcion Correcta");
        }
        else
        {
           System.out.println("Opcion Incorrecta"); 
        }
        
        switch(opcionIngresada)
        {
            case 1:
                    System.out.println("Numero 1");
                    break;
            case 2:
                System.out.println("Numero 2");
                    break;
            case 3:
                System.out.println("Numero 3");
                    break;             
            default:
                System.out.println("Otro numero");
                break;             
            
        }
        
        //iteraciones
        int opcion=0;        
        do{
            System.out.println("El valor de Opcion en el do: "+opcion); 
            opcion++;
        }while(opcion!=5);
        
        opcion=0; 
        while(opcion!=5)
        {
            System.out.println("El valor de Opcion en el while: "+opcion); 
            opcion++;            
        }
        
        
        for(int x=0;x<10;x++)
        {
            System.out.println("EL valor del for es:"+x);            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
