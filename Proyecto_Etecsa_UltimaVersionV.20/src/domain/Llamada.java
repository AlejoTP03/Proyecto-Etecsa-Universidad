/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.time.LocalDate;
import java.util.Date;



/**
 *
 * @author PC
 */
public abstract class Llamada {
    protected long duracionLlamda;
    protected String numeroLlamante;
    protected String numeroLlamado;
    protected Date fecha;
    protected int hora;
    protected Cliente cliente;
    

    //Constructor
    public Llamada(String numeroLlamante, String numeroLlamado, Date fecha, int hora, Cliente cliente) {
        this.numeroLlamante = numeroLlamante;
        this.numeroLlamado = numeroLlamado;
        this.fecha = fecha;
        duracionLlamda = Math.abs((new Date()).getTime() - fecha.getTime()) / 60000; 
        this.hora = hora;
        this.cliente = cliente;
    }

        
    //Formato numero telefonico
    String[] numeroLlamanteSeparado = numeroLlamante.split("-");
    String[] numeroLlamadoSeparado = numeroLlamado.split("-"); 
    
    //Getter and Setter
    public long getDuracionLlamda() {
        return duracionLlamda;
    }

    public void setDuracionLlamda(long duracionLlamda) {
        this.duracionLlamda = duracionLlamda;
    }

    public String getNumeroLlamante() {
        return numeroLlamante;
    }

    public void setNumeroLlamante(String numeroLlamante) {
        this.numeroLlamante = numeroLlamante;
    }

    public String getNumeroLlamado() {
        return numeroLlamado;
    }

    public void setNumeroLlamado(String numeroLlamado) {
        this.numeroLlamado = numeroLlamado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    public abstract double precioLlamada();
    
}
