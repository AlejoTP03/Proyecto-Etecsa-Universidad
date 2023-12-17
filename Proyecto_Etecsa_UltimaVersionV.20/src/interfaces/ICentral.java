/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import domain.Cliente;
import domain.ClienteResidenial;
import domain.Llamada;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ICentral {
    public void cambiarEstadoContrato(Cliente cliente);
    public boolean addCliente(Cliente cliente);
    public List<Llamada> listaLlamadasCliente(Cliente cliente, ClienteResidenial clienteResidencial);
    public Cliente datosClienteMasUtilizaServicio();
    public double cantidadMinutosHabladosTeleSeleccion(String nombre);
    public double pagoPorSuperarMetrado();
    public List<Llamada> getLlamadasInternacionalesEInterprovinciales();
    public List<Llamada> getLlamadasLocales();
}
