/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.Random;

/**
 *
 * @author franz
 */
public class Complemeto {
    /**
     * Metodo complementario (carreraDado) para general los lanzamientos del dado
     * @param jugador La posicion del jugador (1 o 2)
     * @param jug El numero del jugador (1 o 2)
     * @return posicion del jugador despues de lanzar los dado
     */
    public int Complemeto1(int jugador, int jug){
        Random ra = new Random();
        System.out.println("Jugador "+jug+" lance los dados");
        int tirar = ra.nextInt(6) + 1;
        jugador = jugador + tirar;
        System.out.println("El jugador "+jug+" avanza " +tirar+ " casillas");
        System.out.println("Su posicion actual es: "+jugador);
        return jugador;
    }    
    /**
     * Metodo complementario (precioEdad) para calcula el tipo de edad por persona
     * @param edad La edad de la persona ingresada
     * @return numero correspondiente a la edad
     */
    public int personaEdad (int edad){
        if (edad >= 1 && edad <=12){
            return 1;
        } else if (edad > 12 && edad <= 60){
            return 2;
        } else {
            return 3;
        }
    }
    /**
     * Metodo complementario (LlamadaTelefonica) para recorrer el enum (cat)
     * @param clave Numero del pis al que quiere llamar
     * @return Regresa el precio por minuto del pais a llamar (si no se encuentra regresa 404)
     */
    public double veAcces(int clave) {
        for (Catalogos.cat cod : Catalogos.cat.values()) {
            if (cod.getClave() == clave) {
                return cod.getMinuto();
            }
        }
        return 404;
    }/**
     * Metodo complementario (ContraseñaValidar) para recorrer el enum (Contrasena)
     * @param usuario Nombre del ususrio a encontrar
     * @return Regresa la contraseña del usuario a comparar (si no se encuentra regresa null)
     * 
     */
    public String UseAcces(String usuario){
            for (Catalogos.Contrasena cont : Catalogos.Contrasena.values()){
                if(cont.getUsuario().equals(usuario)){
                    return cont.getContrasena();
                }
            }
        return "null";
        }
}
