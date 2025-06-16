/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franz
 */
public class Ejerciciosdowhile {
    Scanner sc = new Scanner(System.in);
    //--------------------------------------------------------------------------------------------
    /**
     * Este metodo cuenta cuántas personas son mayores de edad (18+ años) entre un número determinado de personas.
     * @param npersonas Cantidad total de personas a evaluar
     * @return personamayor Número de personas mayores de edad 
     */
    //Leer edades y determinar la cantidad de mayores de edad
    public int mayorEdad (int npersonas){
        int personamayor = 0;
        int contadorp = 0;
        do {            
            contadorp++;
            System.out.println("Por favor, ingrese la edad de la persona "+contadorp+" en años");
            int edadp = sc.nextInt();
            if (edadp >= 18){
                personamayor++;
            }
                   
        } while (contadorp < npersonas);
        return personamayor;
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este metodo muestra las potencias de 2 hasta que el resultado supere 1000.
     */
    //Mostrar tabla de potencia de 2 hasta que supere 1000.
    public void potenciaDos(){
        int base = 0;
        int potencia = 0;
        do {            
            base++;
            potencia = (int)Math.pow((int)base, 2);
            System.out.println("El resultado de 2^"+base+" = "+potencia);
        } while (potencia <= 1000);
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este metodo genera números aleatorios y los suma hasta alcanzar un total mínimo. 
     * @param tminimo Valor mínimo de la suma a alcanzar
     * @param rango Rango máximo para números aleatorios
     * @return Suma total de los numeros aleatorios
     */
    //Sumar números aleatorios hasta alcanzar un total mínimo.
    public int SumaAleatoria(int tminimo, int rango){
        Random ra = new Random();
        int sumaaleatoria  = 0;
        do {            
            int aleatorio = ra.nextInt(rango)+1;
            System.out.println("El numero aleatorio es "+aleatorio);
            sumaaleatoria = sumaaleatoria + aleatorio;
        } while (sumaaleatoria <= tminimo);
        return sumaaleatoria;
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este metodo simula lanzamientos de dos dados hasta obtener doble 6
     */
    //Simular lanzamientos de dados hasta obtener doble 6.
    public void dobleDado (){
        Random ra = new Random();
        int sumda = 0;
        do {            
            int dado1 = ra.nextInt(6)+1;
            int dado2 = ra.nextInt(6)+1;
            System.out.println("El primer numero es: "+dado1);
            System.out.println("El segundo numero es: "+dado2);
            sumda = dado1 + dado2;
        } while (sumda < 12);
    }
    
}
