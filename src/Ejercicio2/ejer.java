/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author garci
 */
public class ejer {
    
     private double[]notas =new double[2];

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public ejer() {
    }

    public ejer(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "ejercicio2{" + "notas=" + notas + '}';
    }
    
    
    
    
    public void cargarNotas(){
    
        for (int i = 0; i < 5; i++) {
            notas[i]=Math.random()*10+1;
        }
        for (double nota : notas) {
            System.out.println(nota);
        }
        
        
    
    
    }
    
    
}

    
    





