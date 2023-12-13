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
public class Llamada_Internacional extends Llamada{
    private double tarifaPais;
    
    //Constructor
    public Llamada_Internacional(double tarifaPais, String numeroLlamante, String numeroLlamado, Date fecha, Cliente cliente) {
        super(numeroLlamante, numeroLlamado, fecha, cliente);
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
//        if(super.getHora() > "2300" && super.getHora() < "0500"){
//            return duracionLlamda * tarifaPais;
//        }else
            return duracionLlamda * (tarifaPais + 0.50);
    }
    
    
    
    
}
