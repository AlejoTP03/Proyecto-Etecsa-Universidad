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
public class Llamada_Interprovincial extends Llamada {

    public Llamada_Interprovincial(String numeroLlamante, String numeroLlamado, Date fecha, Cliente cliente) {
        super(numeroLlamante, numeroLlamado, fecha, cliente);
    }

    
    @Override
    public double precioLlamada() {
       double valorllamada = 0.0;
       double a = Integer.parseInt(numeroLlamanteSeparado[0]);
       double b = Integer.parseInt(numeroLlamadoSeparado[1]);
       
        
        valorllamada = Math.abs(a-b);
        
     return super.getDuracionLlamda() * valorllamada;   
    }
 
    
}
