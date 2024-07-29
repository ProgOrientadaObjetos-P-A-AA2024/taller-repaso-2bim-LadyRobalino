/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.ArrayList;
import paquete3.TipoSedan;

public class Concensionario {

    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;
    private double ventasTotales;
    private double vehiculoMasCaro;
    private double vehiculoMasBarato;

    public Concensionaria(String nom, ArrayList<Vehiculo> listaV) {
        nombre = nom;
        listaVehiculos = listaV;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerListaVehiculos(ArrayList<Vehiculo> n) {
        listaVehiculos = n;
    }

    public void establecerVentasTotales() {
        double suma = 0;
        for (int i = 0; i < listaVehiculos.size(); i++) {
            suma = suma + listaVehiculos.get(i).obtenerPrecioFinal();
        }
        ventasTotales = suma;
    }

    public void establecerVehiculoMasCaro() {
        double caro = 0;
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).obtenerPrecioFinal() > caro) {
                caro = listaVehiculos.get(i).obtenerPrecioFinal();
            }
            vehiculoMasCaro = caro;
        }
    }

    public void establecerVehiculoMasBarato() {
        double barato = 1000000;
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).obtenerPrecioFinal() < barato) {
                barato = listaVehiculos.get(i).obtenerPrecioFinal();
            }
            vehiculoMasBarato = barato;
        }
    }

    public String obtenerNombre() {
        return nombre;
    }

    public ArrayList<Vehiculo> obtenerListaVehiculos() {
        return listaVehiculos;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerVehiculoMasCaro() {
        return vehiculoMasCaro;
    }

    public double obtenerVehiculoMasBarato() {
        return vehiculoMasBarato;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s: \n", nombre);
        for (int i = 0; i < listaVehiculos.size(); i++) {
            cadena = String.format("%s %s\n", cadena,
                    listaVehiculos.get(i));
        }
        cadena = String.format("%s"
                + "Costo del vehiculo mas caro: %.2f\n "
                + "Costo del vehiculo menos caro: %.2f\n"
                + "Ventas Totales: %.2f\n",
                cadena,
                vehiculoMasCaro,
                vehiculoMasBarato,
                ventasTotales);

        return cadena;
    }
}
