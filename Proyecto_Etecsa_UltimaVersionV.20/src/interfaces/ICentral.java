/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Cliente;
import domain.Cliente_Residenial;
import domain.Llamada;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ICentral {
    public void cambiarEstadoContrato(Cliente cliente);
    public boolean addCliente(Cliente cliente);
    public List<Llamada> listaLlamadasCliente(Cliente cliente, Cliente_Residenial clienteResidencial);
    public Cliente datosClienteMasUtilizaServicio();
    public List<Llamada> getLlamadasInternacionalesEInterprovinciales();
    public double cantidadMinutosHabladosTeleSeleccion(String nombre);
    public double pagoPorSuperarmetrado(Cliente cliente);
}
