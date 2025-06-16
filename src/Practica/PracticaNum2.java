/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.Random;
import java.util.Scanner;
import Practica.Complemeto;

/**
 *
 * @author franz
 */
public class PracticaNum2 {
    Complemeto com = new Complemeto();
    //--------------------------------------------------------------------------------------------
    /**
     * Este programa Calcula amortización de préstamos con diferentes tasas según tipo:
     * Personal: 8% anual
     * Hipotecario: 20% anual
     * Cofidis: 15% anual
     * @param tipotaz Tipo de préstamo que se está pidiendo
     * @param monto Cantidad solicitada
     * @param cuotas Numero de cuotas mensuales
     */
    // Simulación de préstamo bancario.
    public void prestamoBancario(String tipotaz, double monto, int cuotas ){
        double costo_mensual = 0.0f;
        double taza_anual = 0.0f;
        double interes_anual = 0.0f;
        double amortizacion_anual = 0.0f;
        switch (tipotaz) {
            case "personal":
                taza_anual = 0.08;
                break;
            case "hipotecario":
                taza_anual = 0.20;
                break;
            case "cofidis":
                taza_anual = 0.15;
                break;
            default:
        }
        double taza_mensual = taza_anual / 12;
        costo_mensual = (monto * taza_mensual) / (1 - Math.pow(1 + taza_mensual, -cuotas));
        System.out.printf("El pago mensual del prestamo es: %.2f\n", costo_mensual);
        double saldo = monto;
        for(int i = 1;i <= cuotas; i++){
            double interes_mensual = saldo * taza_mensual;
            double amotizacion = costo_mensual - interes_mensual;
            saldo = saldo - amotizacion;
            interes_anual = interes_anual + interes_mensual;
            amortizacion_anual = amortizacion_anual + amotizacion;
            if (i % 12 == 0 || i == cuotas){
                int anios = (i+11)/12;
                if (cuotas < 12) {
                    int mes = i ;
                    System.out.println("mes "+mes+ ":");
                }else{
                    System.out.println("Año "+anios+ ":");
                }
                System.out.printf("  Total del interes pagado: %.2f\n", interes_anual);
                System.out.printf("  Total de la amortización capital: %.2f\n", amortizacion_anual);
                System.out.printf("  Saldo restante: %.2f\n", saldo);
                
                interes_anual = 0;
                amortizacion_anual = 0;
            }
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método simula de manera aleatoria y evalúa el desempeño de 30 vendedores durante 30 días según montos de venta aleatorios.
     * Clasificandolos en :
     * Millonario: ventas ≥ $900
     * Excelente: $500-$899
     * Normal: $100-$499
     * Bajo rendimiento: < $100
     */
    //Evaluación de desempeño de vendedores
    public void DesempeñoVendedor(){
        Random ra = new Random();
        int aporte = 0;
        for (int ven = 1; ven <= 30; ven++) {
            int bajoapor = 0;
            int excelente = 0;
            int millonario = 0;
            int dianormal = 0;
            for (int dias = 1; dias <= 30; dias++) {
                aporte = ra.nextInt(1000) + 1;
                if (aporte >= 900) {
                    millonario++;
                } else if (aporte >= 500 && aporte < 900) {
                    excelente++;
                } else if (aporte >= 100 && aporte < 500) {
                    dianormal++;
                } else if (aporte < 100) {
                    bajoapor++;
                }
            }
            System.out.println("El vendedor " +ven);
            System.out.println("Días Excelente (ventas > $500): " + excelente);
            System.out.println("Días Millonario (ventas > $900): " + millonario);
            System.out.println("Días de Bajo Rendimiento (ventas < $100): " + bajoapor);
            System.out.println("Días de rendimiento normal: " + dianormal);
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método calcula el costo total del servicio de agua incluyendo:
     * Tarifa por consumo escalonado
     * Tarifa de alcantarillado (35%)
     * Procesamiento de datos ($0.50)
     * Recolección de basura ($0.75)
     * @param consumo Metros cúbicos consumidos por el usuario
     */
    //consumo de agua.
    public void CalculoAgua(int consumo){
        double precio = 3;
        double alc = 0.35;
        double dat=0.5;
        double tbas=0.75;
        if  (consumo <=15){
            precio = 3;
        } else if (consumo > 15 && consumo <= 25){
            precio =  (precio + (consumo - 15)*0.1);
        } else if (consumo > 25 && consumo <= 40){
            precio = (precio +(10 * 0.1));
            precio = (precio + (consumo - 25)*0.2);
        } else if (consumo > 40 && consumo <= 60){
            precio += (10 * 0.1);
            precio += ((15 * 0.2));
            precio = (precio + (consumo - 40)*0.30);
        } else if (consumo > 60){
            precio += (10 * 0.1);
            precio += (15 * 0.2);
            precio += (20 * 0.3);
            precio = (precio + (consumo - 60)*0.35);
        }
        System.out.println("Precio por el consumo de agua: "+precio);
        double precioalc = precio * alc ;
        precio = precio + precioalc + tbas + dat;
        System.out.printf("Impuesto de alcantarillado del 35 porciento: %.2f\n",precioalc);
        System.out.println("Taza de recorrecion de basura: "+tbas);
        System.out.println("Taza por precesamiento de datos: "+dat);
        System.out.println("El precio a pagar es: "+precio);
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método calcula el costo de una llamada internacional basado en la clave del país y la duración de la llamada.
     * @param clave Código del país a llamar
     * @param tiempo Duracion de la llamada en minutos
     */
    // Llamadas telefónicas.
    public void LlamadaTelefonica(int clave, int tiempo){
        float precio = 0.0f;
        double cost = com.veAcces(clave);
        if (cost == 404){
            System.out.println("Codigo de pais no encontrado");
        } else {
            precio = (float) (tiempo * cost);
            System.out.println("El preio de su llamada es: "+precio);
        }
    }
    //--------------------------------------------------------------------------------------------
    /**
     * Este método implementa un sistema de validación de credenciales con las siguientes características:
     * Verificación de usuario existente
     * Límite de 3 intentos para la contraseña
     * Detección de intentos fallidos de usuario
     */
    //Control de acceso en un sistema de seguridad.
    public void ContraseñaValidar(){
        Scanner sc = new Scanner(System.in);
        String usuario;
        String cont;
        int intento = 1;
        int seg = 0;
        boolean sed = true;
        do {
            System.out.println("Ingrese su usuario");
            usuario = sc.nextLine();
            cont = com.UseAcces(usuario);
            if (cont.equals("null")) {
                System.out.println("usuario no encontrado");
                seg++;
            }
            if (seg >= 5) {
                System.out.println("Se ha registrado demasioados ataques el sistema sera cerrado");
                sed = false;
                break;
            }
        } while ((cont.equals("null")));
        if (sed) {
            System.out.println("usuario encontrado");
            while (intento < 3) {
                System.out.println("Ingrese la contraseña de " + usuario);
                String contra = sc.nextLine();
                if (cont.equals(contra)) {
                    System.out.println("contraseña correcta");
                    System.out.println("se registraron " + seg + " ataques");
                    break;
                } else {
                    System.out.println("Intento numero " + intento + ". contraseña incorrecta");
                    intento++;
                }
                if (intento >= 3) {
                    System.out.println("Limite de intentos alcanzado");
                    System.out.println("demasiados intentos fallidos el usurio " + usuario + " sera bloqueado");
                }
            }
        }

    }
}
