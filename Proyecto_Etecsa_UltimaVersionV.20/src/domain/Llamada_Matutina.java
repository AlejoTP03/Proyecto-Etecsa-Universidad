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
public class Llamada_Matutina extends Llamada {

    public Llamada_Matutina(String numeroLlamante, String numeroLlamado, Date fecha, Cliente cliente) {
        super(numeroLlamante, numeroLlamado, fecha, cliente);
    }

           
    @Override
    public double precioLlamada() {
        return 0;
    }
    
    
    
    
    
}
