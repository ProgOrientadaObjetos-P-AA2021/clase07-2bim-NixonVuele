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
public class TransporteAereo extends Transporte {

    private String aerolinea;

    public void establecerAerolinea(String n) {
        aerolinea = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerAerolinea() {
        return aerolinea;
    }

}
