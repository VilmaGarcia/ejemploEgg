/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
 
    private Integer numero;
    private Integer numero2;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Ejercicio3() {
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Ejercicio3(Integer numero, Integer numero2) {
        this.numero = numero;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Ejercicio3{" + "numero=" + numero + ", numero2=" + numero2 + '}';
    }
    
    
    
    
    
 
    public int DivisionNumero(){
        
        return numero/numero2;
    
    }
    
    
    
    
}
