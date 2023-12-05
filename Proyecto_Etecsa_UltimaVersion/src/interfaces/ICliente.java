/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Cliente;

/**
 *
 * @author PC
 */
public interface ICliente {
    public boolean cambiarEstadoContrato(Cliente c);
    public abstract double calcularPagoMensual();
}
