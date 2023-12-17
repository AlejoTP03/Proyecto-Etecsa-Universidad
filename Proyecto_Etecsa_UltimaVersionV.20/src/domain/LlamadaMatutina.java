/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import domain.Cliente;
import java.util.Date;

/**
 *
 * @author PC
 */
public class LlamadaMatutina extends Llamada {

    public LlamadaMatutina(long duracion, String numeroLlamante, String numeroLlamado, Date fecha, int hora, Cliente cliente) {
        super(duracion, numeroLlamante, numeroLlamado, fecha, hora, cliente);
    }

           
    @Override
    public double precioLlamada() {
        return 0;
    }
    
    
    
    
    
}
