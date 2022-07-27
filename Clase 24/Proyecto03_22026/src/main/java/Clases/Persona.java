/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Persona
{
   public String nombre;
   public String apellido;
   public String mail;
   public int edad;  
   
   
   public String imprimir()
   {
       return ("Nombre :"+nombre+" Apellido:"+apellido+" mail:"+mail+" Edad:"+edad);
   }
   
    public void imprimir2()
   {
       System.out.println("Nombre :"+nombre+" Apellido:"+apellido+" mail:"+mail+" Edad:"+edad);
   }
    
}
