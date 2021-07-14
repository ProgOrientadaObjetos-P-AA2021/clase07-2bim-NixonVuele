/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author nixon
 */
public class TransporteMaritimo extends Transporte {

    private String nombreBarco;

    public void establecerNombreBarco(String n) {
        nombreBarco = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerNombreBarco() {
        return nombreBarco;
    }

}
