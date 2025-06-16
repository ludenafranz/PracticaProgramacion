/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 * 
 * @author franz
 */
public class Ejerciciosfor {
    //--------------------------------------------------------------------------------------------
    /**
     * Este metodo genera e imprime todos los números de tres dígitos donde la suma de sus dígitos es igual a 10.
     */
    //Generar todos los números de 3 dígitos donde la suma de los dígitos sea igual a 10.
    public void NumeroSuma(){
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int l = 0; l <= 9; l++) {
                    if (i + j + l == 10) {
                        System.out.println("Los numeros son " + i + "" + j + "" + l);
                    }
                }
            }
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método muestra por todos los números enteros del 1 al 100 que no son divisibles ni por 3 ni por 5
     */
    //Mostrar todos los números de 1 a 100 que no sean divisibles por 3 ni por 5.
    public void numeroDivisible() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println("Los numeros son "+ i);
            }
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método genera e imprime la secuencia de Collatz para un número entero dado, siguiendo estas reglas:
     * Si el número es par, se divide por 2
     * Si el número es impar, se multiplica por 3 y se suma 1 El proceso
     * continúa hasta que la secuencia alcance el valor 1.
     * @param inicio el valor ingresado por el usuario para el inicio de la secuencia
     */
    //Generar la secuencia de Collatz de un número.
    public void secuenciaCollatz(int inicio){
        for (int suc = inicio; suc != 1; ){
            if (suc % 2 == 0){
                suc = suc / 2;
            } else {
                suc = (suc * 3)+1; 
            }
            System.out.print(+suc+ " ");
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método calcula la raíz cuadrada entera exacta de un número sin utilizar funciones matemáticas.Si el número no tiene una raíz cuadrada exacta, informa al usuario.
     * @param numero El número del cual se desea calcular la raíz cuadrada. Debe ser un número entero no negativo.
     */
    //Determinar la raíz cuadrada entera de un número sin usar funciones matemáticas.
    public void raizcuadradaNumero(int numero){
        int contador = 0;
        if (numero  < 0){
            System.out.println("No se puede calcular raiz de numeros negativos");
        } else {
            for (int respuesta = 1; numero > 0; contador++) {
                numero = numero - respuesta;
                respuesta = respuesta + 2;
            }
            if (numero >= 0) {
                System.out.println("El resultado de la raiz es " +contador);
            } else {
                System.out.println("No contiene raiz cuadrada entera exacta");
            }
        }
        
    }
}
