/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author PC
 */
public class LlamadaInternacional extends Llamada{
    private double tarifaPais;
    
    //Constructor
    public LlamadaInternacional(double tarifaPais, String numeroLlamante, long duracion, String numeroLlamado, Date fecha, int hora, Cliente cliente) {
        super(duracion, numeroLlamante, numeroLlamado, fecha, hora, cliente);
        this.tarifaPais = tarifaPais;
    }
    
    
    //Getter and Setter
   
    public double getTarifaPais() {
        return tarifaPais;
    }

    public void setTarifaPais(double tarifaPais) {
        this.tarifaPais = tarifaPais;
    }

    @Override
    public double precioLlamada() {
        if(super.hora > 2300 && super.hora < 0500){
            return duracion * tarifaPais;
        }else
            return duracion * (tarifaPais + 0.50);
    }
    
    
    
    
}
