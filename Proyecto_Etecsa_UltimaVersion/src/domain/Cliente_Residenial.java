/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import interfaces.ICliente;
import interfaces.ICliente_Residencial;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Cliente_Residenial extends Cliente implements ICliente,ICliente_Residencial{
    
    private boolean rastreoLlamada;
    private boolean servicioMatutino;
    
    //Constructor
    public Cliente_Residenial(boolean rastreoLlamada, boolean servicioMatutino, String nombre, String numeroCarnet, String direccion, String numeroAsignado, List<Llamada> listaLlamada) {
        super(nombre, numeroCarnet, direccion, numeroAsignado, listaLlamada);
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
    
    

    // Mostrar Lista de Llamadas realizadas a un cliente con servicio de rastreo de llamada habilitado
    @Override
    public List<Llamada> listaLlamadasCliente(List<Llamada> listaLlamadas){
        List<Llamada> listaLlamadaACliente = new ArrayList<>();
            
            if(getEstadoContrato() == true && getRastreoLlamada() == true){
            
            for(Llamada llamada : listaLlamadas){
                if(getNumeroAsignado() == llamada.getNumeroLlamado())
                    listaLlamadaACliente.add(llamada);
            }
        }
         
    return listaLlamadaACliente;    
    }
    
        
}
