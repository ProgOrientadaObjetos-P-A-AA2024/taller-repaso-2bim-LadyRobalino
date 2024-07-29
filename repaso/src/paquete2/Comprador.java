/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ladychan
 */
public class Comprador {
    private String nombre;
    private String cedula;

    public Comprador(String nom, String ced) {
        nombre = nom;
        cedula = ced;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Cedula: %s",
                nombre,
                cedula);
        
        return cadena;
    } 
}

