/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.Comprador;
import paquete2.Vehiculo;

public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroAdicionalMecanico;

    public TipoSedan(Comprador pro, String ma, double precioB, double porA) {
        super(pro, ma, precioB);
        porcentajeDescuento = porA;

    }

    public void establecerPorcentajeDescuento(double n) {
        porcentajeDescuento = n;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    public void establecerSeguroAdicionalMecanico() {
        seguroAdicionalMecanico = precioBase * 0.01;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroAdicionalMecanico() {
        return seguroAdicionalMecanico;
    }

    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase - valorDescuento + seguroAdicionalMecanico;
    }

    @Override
    public String toString() {
        String cadena = String.format("Vehiculo Tipo Sedan: \n "
                + "%s "
                + "Porcentaje Descuento: %.2f\n"
                + "Valor Adicional de Importacion: %.2f\n"
                + "Valor de Descuento: %.2f\n"
                + "Precio Final: %.2f\n",
                super.toString(),
                porcentajeDescuento,
                valorDescuento,
                seguroAdicionalMecanico,
                precioFinal);

        return cadena;
    }
}
