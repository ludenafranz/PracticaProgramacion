/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visualizar;

import Practica.Ejerciciosdowhile;
import Practica.Ejerciciosfor;
import Practica.Ejercicioswhile;
import Practica.Ejercicioswitch;
import Practica.PracticaNum2;
import java.util.Scanner;

/**
 *
 * @author franz
 */
public class Ejecutar {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Generar todos los números de 3 dígitos donde la suma de los dígitos sea igual a 10. \n2. Numeros del 1 al 100 que no son divisibles para 5 o 3 \n3. Generador de secuencia de Collatz \n4. Determinar la raíz cuadrada entera de un número");
        System.out.println("5. Sumar todos los múltiplos de 4 menores a un número dado. \n6. Ingresar números hasta que la suma supere 1000.\n7. Simular una carrera con tiradas de dado hasta llegar a una meta.\n8. Leer caracteres hasta que se ingrese una vocal.");
        System.out.println("9. Mostrar nombre del mes según número ingresado. \n10. Identificar figura geométrica por número de lados. \n11. Control de semáforo según estado (verde, amarillo, rojo). \n12. Calcular precio de boletos según edad (niño, adulto, mayor).");
        System.out.println("13. Leer edades y determinar la cantidad de mayores de edad \n14. Mostrar tabla de potencia de 2 hasta que supere 1000. \n15. Sumar números aleatorios hasta alcanzar un total mínimo.");
        System.out.println("16. Simular lanzamientos de dados hasta obtener doble 6.\n17. Consumo de agua potable\n18. Compañía de autos \n19. Llamadas telefónicas \n20. Control de acceso en un sistema de seguridad \n21. Simulación de préstamo bancario");
        int option = sc.nextInt();
        Ejerciciosfor or = new Ejerciciosfor();
        Ejercicioswhile wi = new Ejercicioswhile();
        Ejercicioswitch sw = new Ejercicioswitch();
        Ejerciciosdowhile de = new Ejerciciosdowhile();
        PracticaNum2 pra = new PracticaNum2();
        do{
            switch (option) {
            case 1:
                or.NumeroSuma();
                break;
            case 2:
                or.numeroDivisible();
                break;
            case 3:
                System.out.println("Ingrese un número entero positivo para iniciar la secuencia de Collatz:");
                int inicio = sc.nextInt();
                System.out.println("la sucecion es:");
                System.out.print(+inicio + " ");
                or.secuenciaCollatz(inicio);
                System.out.println(" ");
                break;
            case 4:
                System.out.println("Ingrese un número para calcular su raíz cuadrada entera");
                int raiz = sc.nextInt();
                or.raizcuadradaNumero(raiz);
                break;
            case 5:
                System.out.println("Ingrese hasta que resultado del mutiplo de 4 se sumara");
                int limite = sc.nextInt();
                int suma = wi.sumaMultiplo(limite);
                System.out.println("la sumo total es " +suma);
                break;
            case 6:
                wi.sumaLimitada();
                break;
            case 7:
                System.out.println("Ingrese el numero maximo de casillas");
                int casillas = sc.nextInt();
                System.out.println("la carrera termninara hasta "+casillas+" de casillas");
                wi.carreraDado(casillas);
                break;
            case 8:
                wi.caracterVocal();
                break;
            case 9: 
                System.out.println("Ingrese un número del 1 al 12 para obtener el nombre del mes correspondiente:");
                int mes = sc.nextInt();
                sw.numeroMes(mes);
                break;
            case 10: 
                System.out.println("Ingrese el numero de lados (1 - 12) de la figura");
                int lados = sc.nextInt();
                sw.figuraLado(lados);
                break;
            case 11: 
                System.out.println("Ingrese el estado del semaforo (1.verde, 2.amarillo, 3.rojo)");
                int color = sc.nextInt();
                sw.controlSemaforo(color);
                break;
            case 12: 
                System.out.println("Ingrese su edad para calcular el precio del boleto:");
                int edad = sc.nextInt();
                sw.precioEdad(edad);
                break;
            case 13: 
                System.out.println("Ingrese cuántas personas desea evaluar:");
                int npersonas = sc.nextInt();
                int personamayor = de.mayorEdad(npersonas);
                System.out.println("entre todas las edades hay "+personamayor+" personas mayores");
                break;
            case 14: 
                de.potenciaDos();
                break;
            case 15: 
                System.out.println("ingrese el limite de la suma de los numeros aleatorios");
                int tminimo = sc.nextInt();
                System.out.println("ingrese el rango de los numeros aleatorios");
                int rango = sc.nextInt();
                int sumaaleatoria = de.SumaAleatoria(tminimo, rango);
                System.out.println("el resultado de la suma de numeros aleatorios es: "+sumaaleatoria);
                break;
            case 16: 
                de.dobleDado();
                break;
            case 17: 
                System.out.println("Ingrese su consumo de agua potable en metros cúbicos");
                int consumo = sc.nextInt();
                pra.CalculoAgua(consumo);
                break;
            case 18: 
                pra.DesempeñoVendedor();
                break;
            case 19: 
                System.out.println("AMERICANORTE clave: 12, costo por minuto: 2.75,\n"
                        + "AMERICACENTRAL clave: 15, costo por minuto: 1.89),\n"
                        + "AMERICASUR clave 18, costo por minuto: 1.60),\n"
                        + "EUROPA clave: 19, costo por minuto: 3.5),\n"
                        + "ASIA clave: 23, costo por minuto: 4.5),\n"
                        + "AFRICA clave: 25, costo por minuto: 3.1),\n"
                        + "OCEANIA clave: 29, costo por minuto: 3),\n"
                        + "RESTODELMUNDO clave: 39, costo por minuto: 6),;");
                System.out.println("Ingrese la clave del pais al que desea llamar ");
                int clave = sc.nextInt();
                System.out.println("Ingrese la duración de la llamada en minutos");
                int tiempo = sc.nextInt();
                pra.LlamadaTelefonica(clave, tiempo);
                break;
            case 20: 
                pra.ContraseñaValidar();
                break;
            case 21: 
                System.out.println("Ingrese el tipo de prestamo(PERSONAL, HIPOTECARIO o COFIDIS.)");
                String tipotaz = sc.next().toLowerCase();
                System.out.println("Ingrese el monto solicitado para el préstamo en dólares");
                double monto = sc.nextDouble();
                System.out.println("Ingrese el número de cuotas mensuales del préstamo");
                int cuotas = sc.nextInt();
                pra.prestamoBancario(tipotaz, monto, cuotas);
                break;
            default:
                break;
        }
            System.out.println("desea salir presione 0 si desea continuar presione cualquier numero");
            option = sc.nextInt();
        } while (option != 0);
        

    }
}
