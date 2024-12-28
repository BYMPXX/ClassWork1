/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject17;

import javax.swing.JOptionPane;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject17 {

    public static void main(String[] args) {
        String nombre= ""; 
        int edad=0; 
        double notas[]={7,9,6,2,4}; 
        double nota[]={5, 10, 8, 10};
        nombre = JOptionPane.showInputDialog("Ingresar nombre"); 
        edad = Integer. parseInt(JOptionPane.showInputDialog("Ingresar Edad")); 
        
        mensaje(nombre, edad);
        JOptionPane.showMessageDialog(null, promedio(notas));
    }
    
    public static void mensaje(String nombres, int edades ){
        JOptionPane.showMessageDialog(null, nombres + " Tiene "+ edades + "años");
    } 
    public static double promedio( double [] calificaciones ){
double suma=0; 
double respuesta; 
for(int i=0; i< calificaciones. length; i++){
    suma = suma+ calificaciones[i];  
}        
respuesta = suma/ calificaciones. length; 
return respuesta; 
    }
}

