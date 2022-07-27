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
public class JavaHerencia 
{
    public static void main(String[] args)
    {
        Persona p1=new Persona();
        
        
        Persona Pepito=new Persona();
        Persona p2=new Persona();
        Persona AlgunNombre=new Persona();
        
        p1.nombre="Nicolas";
        p1.apellido="Fernandez";
        p1.mail="nm@gmail.com";
        p1.edad=40;
        
       
        
        System.out.println(p1.imprimir());
        
        p1.imprimir2();
        
        Empleado emp1=new Empleado();
        emp1.nombre="Pedro";
        emp1.legajo=438;
        emp1.Puesto="Analista";
        
        emp1.imprimir2();
        
    }
    
}
