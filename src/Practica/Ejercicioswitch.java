/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import Practica.Complemeto;

/**
 *
 * @author franz
 */
public class Ejercicioswitch {
    Complemeto com = new Complemeto();
    //--------------------------------------------------------------------------------------------
    /**
     * Este método muestra el nombre del mes correspondiente a un número (1-Enero, 2-Febrero, etc.).
     * @param mes Número del mes (1-12)
     */
    //Mostrar nombre del mes según número ingresado.
    public void numeroMes(int mes){
        switch (mes){
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
            default -> System.out.println("Numero de mes no existente");
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método identifica figuras geométricas por su número de lados (0-círculo, 3-triángulo, etc.).
     * @param lados Cantidad de lados de la figura
     */
    //Identificar figura geométrica por número de lados.
    public void figuraLado (int lados){
        switch (lados) {
            case 0 -> System.out.println("Círculo");
            case 1 -> System.out.println("No existe");
            case 2 -> System.out.println("No existe");
            case 3 -> System.out.println("Triángulo");
            case 4 -> System.out.println("Cuadrilátero");
            case 5 -> System.out.println("Pentágono");
            case 6 -> System.out.println("Hexágono");
            case 7 -> System.out.println("Heptágono");
            case 8 -> System.out.println("Octágono");
            case 9 -> System.out.println("Eneágono o Nonágono");
            case 10 -> System.out.println("Decágono");
            case 11 -> System.out.println("Hendecágono");
            case 12 -> System.out.println("Dodecágono");
            default -> System.out.println("Numero de lados fuera de rango");
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método muestra el estado del semáforo según código numérico (1-verde, 2-amarillo, 3-rojo).
     * @param color Código numérico del color
     */
    //Control de semáforo según estado (verde, amarillo, rojo).
    public void controlSemaforo(int color){
        switch (color) {
            case 1 -> System.out.println("Verde. puede avanzar");
            case 2 -> System.out.println("Amarillo. reduzca su velocidad");
            case 3 -> System.out.println("Rojo. detengase");
            default -> System.out.println("Numero no valido. Por favor, ingrese un número correcto del menú");
        }
    } 
    //--------------------------------------------------------------------------------------------
    /**
     * Este método calcula el precio de boletos según categoría de edad (niño, adulto, adulto mayor).
     * @param edad La edad de la persona a la cual se desea vender el boleto
     */
    //Calcular precio de boletos según edad (niño, adulto, mayor).
    public void precioEdad (int edad){
        int tipo = com.personaEdad(edad);
        switch (tipo) {
            case 1 -> System.out.println("niño. el precio del boleto es de 5$");
            case 2 -> System.out.println("adulto. el precio del boleto es de 10$");
            case 3 -> System.out.println("adulto. mayor el precio del boleto es de 8$");
            default -> {
            }
        }
    }
}
