/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package central;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import domain.Cliente;
import domain.Cliente_Residenial;
import domain.Llamada;
import domain.Llamada_Internacional;
import domain.Llamada_Interprovincial;
import domain.Llamada_Local;
import interfaces.ICentral;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class Etecsa implements ICentral {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Llamada> llamadas = new ArrayList<>();
    
    
        
    
    @Override
    public boolean addCliente(Cliente cliente) {
        return clientes.add(cliente);
    }
    
    
    @Override
    public void cambiarEstadoContrato(Cliente cliente) {
        if(cliente.getEstadoContrato() == true){
            cliente.setEstadoContrato(false);
        }else
            cliente.setEstadoContrato(true);

    
    }

       
    @Override
    public List<Llamada> listaLlamadasCliente(Cliente cliente, Cliente_Residenial clienteResidencial) {
         List<Llamada> listaLlamadaACliente = new ArrayList<>();
            
            if(cliente.getEstadoContrato() == true && clienteResidencial.getRastreoLlamada() == true){
            
            for(Llamada llamada : llamadas){
                if(clienteResidencial.getNumeroAsignado().equals(llamada.getNumeroLlamado()))
                    listaLlamadaACliente.add(llamada);
            }
        }
         
    return listaLlamadaACliente;
    
    }

    
    @Override
    public Cliente datosClienteMasUtilizaServicio() {
        if (clientes == null || clientes.isEmpty()) {
            return null; // Devolver null si la lista está vacía o es nula
        }
        
        
        Cliente clienteMasPago = clientes.get(0); // Suponemos que el primer cliente tiene el pago más alto

        for (Cliente cliente : clientes) {
            if (cliente.calcularPagoMensual() > clienteMasPago.calcularPagoMensual()) {
                clienteMasPago = cliente; // Si encontramos un cliente con un pago más alto, actualizamos el cliente con el pago más alto
            }
        }

        return clienteMasPago;
    }

    
    
    @Override
    public List<Llamada> getLlamadasInternacionalesEInterprovinciales() {
        List<Llamada> listaLlamadaTeleSeleccion = new ArrayList<>();
        for(Llamada llamada : llamadas){
            if(llamada instanceof Llamada_Internacional || llamada instanceof Llamada_Interprovincial)
                listaLlamadaTeleSeleccion = ((List<Llamada>) llamada);
        
        }
      return listaLlamadaTeleSeleccion;
    }


    
    @Override
    public double cantidadMinutosHabladosTeleSeleccion(String nombre) {
           double valorTotalTeleSeleccion = 0.0;
        List<Llamada> lista = getLlamadasInternacionalesEInterprovinciales();
        for(Llamada llamada : lista){
            if(llamada.getCliente().getNombre().equals(nombre));
            valorTotalTeleSeleccion += llamada.precioLlamada();
        }
        
    return valorTotalTeleSeleccion;
    }

    @Override
    public List<Llamada> getLlamadasLocales() {
        List<Llamada> llamadasLocales = new ArrayList<>();
        for(Llamada llamadaLocal : llamadas){
            if(llamadaLocal instanceof Llamada_Local){
               llamadasLocales.add(llamadaLocal);
            }
        }
    return llamadasLocales;
    }


    
    
    @Override
    public double pagoPorSuperarMetrado() {
        List<Llamada> llamadasLocales = getLlamadasLocales();
        double valorMetrado = 0.0;
        
        for(Llamada llamadaLocal : llamadasLocales){
            valorMetrado+=llamadaLocal.getDuracion();
            
        }
        
        if(valorMetrado > 300){
            valorMetrado = Math.abs(valorMetrado - 300);
            valorMetrado *= 0.05;
        }
        
        return valorMetrado;
    }

    
          
    

        

    

}
    
    
