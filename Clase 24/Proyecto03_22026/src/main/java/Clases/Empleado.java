/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author nfernandez
 */
public class Empleado extends Persona
{
    public int legajo;
    public String Puesto;
    public double salario;
    
    @Override
   public void imprimir2()
   {
       System.out.println("Nombre :"+nombre+" Apellido:"+apellido+" mail:"+mail+" Edad:"+edad+" Legajo:"+legajo);
   }
   
    
}
