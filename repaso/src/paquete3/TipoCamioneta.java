/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.*;

public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroAdicionalMantenimiento;

    public TipoCamioneta(Comprador pro, String ma, double precioB, double porAI) {
        super(pro, ma, precioB);
        porcentajeAdicionalImportacion = porAI;

    }

    public void establecerPorcentajeAdicionalImportacion(double n) {
        porcentajeAdicionalImportacion = n;
    }

    public void establecerValorAdicionalImportacion() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
    }

    public void establecerSeguroAdicionalMantenimiento() {
        seguroAdicionalMantenimiento = valorAdicionalImportacion * 1.5;
    }

    public double obtenerPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double obtenerValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double obtenerSeguroAdicionalMantenimiento() {
        return seguroAdicionalMantenimiento;
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + valorAdicionalImportacion
                + seguroAdicionalMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Vehiculo Tipo Camioneta: \n "
                + "%s "
                + "Porcentaje Adicional de Importacion: %.2f\n"
                + "Valor Adicional de Importacion: %.2f\n"
                + "Seguro Adicional de Mantenimiento: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeAdicionalImportacion,
                valorAdicionalImportacion,
                seguroAdicionalMantenimiento,
                precioFinal);

        return cadena;
    }
}
