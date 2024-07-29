/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Principal {

    public static void main(String[] args) {

        Comprador comprador1 = new Comprador("Lady Robalino", "12345");
        TipoSedan sedan1 = new TipoSedan(comprador1, "Tesla", 30000, 10);
        sedan1.establecerValorDescuento();
        sedan1.establecerSeguroAdicionalMecanico();

        Comprador comprador2 = new Comprador("Sergi Alabana", "11125847");
        TipoSedan sedan2 = new TipoSedan(comprador2, "Toyota", 22000, 7);
        sedan2.establecerValorDescuento();
        sedan2.establecerSeguroAdicionalMecanico();

        Comprador comprador3 = new Comprador("Maya Martinez", "11254788");
        TipoSuv suv1 = new TipoSuv(comprador3, "Zuzuki", 30000, 10);
        suv1.establecerSeguroPersonas();

        Comprador comprador4 = new Comprador("Lana Rey", "1125175874");
        TipoCamioneta camioneta1 = new TipoCamioneta(comprador4, "Chevrolet",
                35000, 10);
        camioneta1.establecerValorAdicionalImportacion();
        camioneta1.establecerSeguroAdicionalMantenimiento();

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(sedan1);
        listaVehiculos.add(sedan2);
        listaVehiculos.add(suv1);
        listaVehiculos.add(camioneta1);

        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).calcularPrecioFinal();
        }

        Concensionaria conce = new Concensionaria("Centro del Concensionario",
                listaVehiculos);

        conce.establecerVentasTotales();
        conce.establecerVehiculoMasBarato();
        conce.establecerVehiculoMasCaro();

        System.out.println(conce);
    }
}
