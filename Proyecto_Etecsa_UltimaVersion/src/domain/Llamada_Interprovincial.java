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
public class Llamada_Interprovincial extends Llamada {

    public Llamada_Interprovincial(double duracionLlamda, String numeroLlamante, String numeroLlamado, Fecha fecha, Hora hora) {
        super(duracionLlamda, numeroLlamante, numeroLlamado, fecha, hora);
    }

    @Override
    public double precioLlamada() {
       double valorllamada = 0.0;
       double a = Integer.parseInt(numeroLlamanteSeparado[0]);
       double b = Integer.parseInt(numeroLlamadoSeparado[1]);
       
        if(a>=b){
           valorllamada = a-b;
        }else
            valorllamada = b-a;
        
        valorllamada+=0.50;
        
     return duracionLlamda * valorllamada;   
    }
 
    
}
