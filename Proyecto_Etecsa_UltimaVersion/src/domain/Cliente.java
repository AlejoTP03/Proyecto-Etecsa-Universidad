/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import interfaces.ICliente;
import java.util.List;

/**
 *
 * @author PC
 */
public abstract class Cliente implements ICliente{
    
    protected String nombre;
    protected String numeroCarnet;
    protected String direccion;
    protected String numeroAsignado;
    protected boolean estadoContrato = true;
    
    protected List<Llamada> listaLlamada;
    
    //Formato numero telefonico
    String[] numeroAsignadoSeparado = numeroAsignado.split("-");


    //Contructor
    
    public Cliente(String nombre, String numeroCarnet, String direccion, String numeroAsignado, List<Llamada> listaLlamada) {
        this.nombre = nombre;
        this.numeroCarnet = numeroCarnet;
        this.direccion = direccion;
        this.numeroAsignado = numeroAsignado;
        this.listaLlamada = listaLlamada;
    }

       
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(String numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroAsignado() {
        return numeroAsignado;
    }

    public void setNumeroAsignado(String numeroAsignado) {
        this.numeroAsignado = numeroAsignado;
    }

    public boolean getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(boolean estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    public List<Llamada> getListaLlamada() {
        return listaLlamada;
    }

    public void setListaLlamada(List<Llamada> listaLlamada) {
        this.listaLlamada = listaLlamada;
    }
    
    
    @Override
    public boolean cambiarEstadoContrato(Cliente c){
        if(c.getEstadoContrato() == true){
            c.setEstadoContrato(false);
        }else
            setEstadoContrato(true);
        
        return this.estadoContrato;    
    }
    
    
   
}
