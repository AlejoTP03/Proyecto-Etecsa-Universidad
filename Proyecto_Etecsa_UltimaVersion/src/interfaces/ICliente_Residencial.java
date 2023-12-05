/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Llamada;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ICliente_Residencial {
    public List<Llamada> listaLlamadasCliente(List<Llamada> listaLlamadas);
}
