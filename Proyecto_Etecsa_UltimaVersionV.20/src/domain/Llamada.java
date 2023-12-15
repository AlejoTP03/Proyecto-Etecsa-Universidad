/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;



/**
 *
 * @author PC
 */
public abstract class Llamada {
    protected long duracion;
    protected String numeroLlamante;
    protected String numeroLlamado;
    protected Date fecha;
    protected int hora;
    protected Cliente cliente;
    

    //Constructor
    public Llamada(long duracion,String numeroLlamante, String numeroLlamado, Date fecha, int hora, Cliente cliente) {
        this.duracion = duracion;
        this.numeroLlamante = numeroLlamante;
        this.numeroLlamado = numeroLlamado;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
    }

        
    //Formato numero telefonico
    String[] numeroLlamanteSeparado = numeroLlamante.split("-");
    String[] numeroLlamadoSeparado = numeroLlamado.split("-"); 
    
    //Getter and Setter
    public long getDuracion() {
        return duracion;
    }

    public void setDuracion(long duracion) {
        this.duracion = duracion;
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
