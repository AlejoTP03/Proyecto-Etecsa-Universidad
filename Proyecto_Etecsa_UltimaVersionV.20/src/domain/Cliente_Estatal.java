/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.List;

/**
 *
 * @author PC
 */
public class Cliente_Estatal extends Cliente{
    
    private boolean lineaArrendada;
    
    //Constructor
    
    public Cliente_Estatal(boolean lineaArrendada, String nombre, String numeroCarnet, String direccion, String numeroAsignado, boolean estadoContrato) {
        super(nombre, numeroCarnet, direccion, numeroAsignado, estadoContrato);
        this.lineaArrendada = lineaArrendada;
    }

        
    //Getter and Setter
    public boolean getLineaArrendada() {
        return lineaArrendada;
    }

    public void setLineaArrendada(boolean lineaArrendada) {
        this.lineaArrendada = lineaArrendada;
    }

    @Override
    public double calcularPagoMensual() {
        double pagoTotal = 0.0;
        
        for(Llamada llamadas: listaLlamada)
            pagoTotal += llamadas.precioLlamada();
            
        
    return pagoTotal;
    }
    
    
    
}
