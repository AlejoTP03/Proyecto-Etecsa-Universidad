/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author PC
 */
public class LlamadaLocal extends Llamada{

    public LlamadaLocal(long duracionLlamda, String numeroLlamante, String numeroLlamado, Calendar fecha, int hora, Cliente cliente) {
        super(duracionLlamda, numeroLlamante, numeroLlamado, fecha, hora, cliente);
    }

    
        
    @Override
    public double precioLlamada() {
        double valorLlamada = 0.0;
        if(numeroLlamado.equals("777777")){
            valorLlamada = 1;
        }else
            valorLlamada = 0.05 / 3;
        
        return duracionLlamda * valorLlamada;
    }
    
    
    
}
