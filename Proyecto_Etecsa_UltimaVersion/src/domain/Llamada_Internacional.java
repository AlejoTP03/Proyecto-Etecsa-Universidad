/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import utils.Fecha;
import utils.Hora;

/**
 *
 * @author PC
 */
public class Llamada_Internacional extends Llamada{
    private double tarifaPais;
    
    //Constructor
    public Llamada_Internacional(double tarifaPais, double duracionLlamda, String numeroLlamante, String numeroLlamado, Fecha fecha, Hora hora) {
        super(duracionLlamda, numeroLlamante, numeroLlamado, fecha, hora);
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
        return duracionLlamda * (tarifaPais + 0.50);
    }
    
    
    
    
}
