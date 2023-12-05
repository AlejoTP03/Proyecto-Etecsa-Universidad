/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import utils.Fecha;
import utils.Hora;
import domain.Cliente;

/**
 *
 * @author PC
 */
public class Llamada_Matutina extends Llamada {

    public Llamada_Matutina(double duracionLlamda, String numeroLlamante, String numeroLlamado, Fecha fecha, Hora hora) {
        super(duracionLlamda, numeroLlamante, numeroLlamado, fecha, hora);
    }

    @Override
    public void setDuracionLlamda(double duracionLlamda) {
        super.duracionLlamda = 0;
    }

    
    @Override
    public double precioLlamada() {
        return 0;
    }
    
    
    
    
    
}
