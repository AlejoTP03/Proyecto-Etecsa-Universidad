/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class ClienteResidenial extends Cliente{
    
    private boolean rastreoLlamada;
    private boolean servicioMatutino;
    
    //Constructor
    public ClienteResidenial(boolean rastreoLlamada, boolean servicioMatutino, String nombre, String numeroCarnet, String direccion, String numeroAsignado, boolean estadoContrato, List<Llamada> listaLlamada) {
        super(nombre, numeroCarnet, direccion, numeroAsignado, estadoContrato, listaLlamada);
        this.rastreoLlamada = rastreoLlamada;
        this.servicioMatutino = servicioMatutino;
    }
    

            
    //Getter and Setter
    public boolean getRastreoLlamada() {
        return rastreoLlamada;
    }

    public void setRastreoLlamada(boolean rastreoLlamada) {
        this.rastreoLlamada = rastreoLlamada;
    }

    public boolean getServicioMatutino() {
        return servicioMatutino;
    }

    public void setServicioMatutino(boolean servicioMatutino) {
        this.servicioMatutino = servicioMatutino;
    }
    
    //pago mensual
    @Override
    public double calcularPagoMensual() {
        double pagoTotal = 0.0;
        if(getRastreoLlamada() == true)
            pagoTotal +=1;
        
        
        if(getServicioMatutino() == true)
            pagoTotal += 1;
        
        for(Llamada llamadas: listaLlamada)
            pagoTotal = llamadas.precioLlamada();
            
        
    return pagoTotal;    
    }
    
     
}
