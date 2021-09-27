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

/**
 *
 * @author garci
 */
public class MainEjer3 {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner (System.in);
        
        
        
        Ejercicio3 eje=new Ejercicio3();
        
        
        
        System.out.println("ingrese dos numeros");
        
        try{
        eje.setNumero(leer.next());
         eje.setNumero2(leer.next());
        
         
            eje.DivisionNumero();
            
        } catch (NumberFormatException e) {
            
            System.out.println("No puede convertirse en entero" + e);
            
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0" + e);
        
        
        
       // }catch(InputMismatchException e){
        
       }
        
    }
    
}
