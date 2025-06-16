/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.Scanner;
import Practica.Complemeto;

/**
 *
 * @author franz
 */
public class Ejercicioswhile {
    private Complemeto com = new Complemeto();
    //--------------------------------------------------------------------------------------------
    /**
     * Este método suma todos los múltiplos de 4 menores a un número límite ingresado por el usuario.
     * @param limite El número máximo hasta donde se buscarán múltiplos de 4
     * @return suma La suma total de todos los múltiplos de 4 menores al límite 
     */
    //Sumar todos los múltiplos de 4 menores a un número dado.
    //provar codigo 
    public int sumaMultiplo(int limite){
        int contador = 1;
        int suma = 0;
        int mult = 0;
        while (mult < limite){
            suma = suma + mult;
            mult = contador * 4;
            contador++;
        }
        return suma;
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método pide números al usuario hasta que la suma acumulada supere 1000.
     */
    //Ingresar números hasta que la suma supere 1000.
    public void sumaLimitada(){
        Scanner sc = new Scanner(System.in);
        int inicial = 0;
        int suma = 0;
        while (suma < 1000){ 
            System.out.println("Ingrese un numero entero para comenzar la operación:");
            int number = sc.nextInt();
            suma = inicial + number;
            inicial = suma;
        }
        System.out.println("La suma de los numeros ingresados es " +suma+ " se ha superado las base de 1000");
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método simula una carrera entre dos jugadores usando tiradas de dados hasta alcanzar un número de casillas.
     * @param casillas Número de casillas que deben recorrer para ganar
     */
    //Simular una carrera con tiradas de dado hasta llegar a una meta.
    public void carreraDado(int casillas){
        int jugador1 = 0;
        int jugador2 = 0;
        while (jugador1 < casillas && jugador2 < casillas){
            int jug =0;
            jug++;
            jugador1 = com.Complemeto1(jugador1,jug);
            System.out.println();
            if (jugador1 >= casillas){
                System.out.println("El jugador 1 es el ganador");
                break;
            }
            jug++;
            jugador2 = com.Complemeto1(jugador2, jug);
            System.out.println();
            if (jugador2 >= casillas){
                System.out.println("El jugador 2 es el ganador");
                break;
            }
        }
        System.out.println("Fin del juego");
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método pide al usuario ingresar caracteres hasta que ingrese una vocal (a, e, i, o, u).
     */
    //Leer caracteres hasta que se ingrese una vocal.
    public void caracterVocal(){
        Scanner sc = new Scanner(System.in);
        char ca = ' ';
        while (!(ca == 'a'||ca == 'e'||ca == 'i'||ca == 'o'||ca == 'u')){
            System.out.println("Ingrese una letra (a - z), el proceso terminara al ingresar una vocal");
            ca = sc.next().toLowerCase().charAt(0);
        }
    }
}
