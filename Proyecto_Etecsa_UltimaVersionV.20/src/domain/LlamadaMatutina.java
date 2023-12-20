/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import domain.Cliente;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author PC
 */
public class LlamadaMatutina extends Llamada {

    public LlamadaMatutina(long duracionLlamda, String numeroLlamante, String numeroLlamado, Calendar fecha, int hora, Cliente cliente) {
        super(duracionLlamda, numeroLlamante, numeroLlamado, fecha, hora, cliente);
    }

    

           
    @Override
    public double precioLlamada() {
        return 0;
    }
    
    
    
    
    
}
