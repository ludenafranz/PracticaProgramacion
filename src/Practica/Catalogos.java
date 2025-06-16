/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author franz
 */
public class Catalogos {
    public enum cat {
        AMERICANORTE(12, 2.75),
        AMERICACENTRAL(15, 1.89),
        AMERICASUR(18, 1.60),
        EUROPA(19, 3.5),
        ASIA(23, 4.5),
        AFRICA(25, 3.1),
        OCEANIA(29, 3),
        RESTODELMUNDO(39, 6),;
        private int clave;
        private double minuto;
        private cat(int clave, double minuto) {
            this.clave = clave;
            this.minuto = minuto;
        }
        public int getClave() {
            return clave;
        }
        public double getMinuto() {
            return minuto;
        }
    }
    public enum Contrasena {
        USUARIO1("martines", "sol1234"),
        USUARIO2("diego_fernandez", "gato2025"),
        USUARIO3("carlagomez", "luna567"),
        USUARIO4("therrera", "hola123"),
        USUARIO5("mariape", "scasa789"),
        USUARIO6("sanchez87", "perro321"),
        USUARIO7("andrea_castro", "azul456"),
        USUARIO8("pjimenez", "clave001"),
        USUARIO9("sofia_v", "rojo999"),
        USUARIO10("mateomorales", "nube2024");
        private String usuario;
        private String contra;
        private Contrasena(String usuario, String contra) {
            this.usuario = usuario;
            this.contra = contra;
        }
        public String getUsuario() {
            return usuario;
        }
        public String getContrasena() {
            return contra;
        }
    }
}

