/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.time.LocalDate;
import java.util.Calendar;




/**
 *
 * @author PC
 */
public abstract class Llamada {
    protected long duracionLlamda;
    protected String numeroLlamante;
    protected String numeroLlamado;
    protected Calendar fecha;
    protected int hora;
    protected Cliente cliente;

    //Constructor
    public Llamada(long duracionLlamda, String numeroLlamante, String numeroLlamado, Calendar fecha, int hora, Cliente cliente) {
        this.duracionLlamda = duracionLlamda;
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

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
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

    public String[] getNumeroLlamanteSeparado() {
        return numeroLlamanteSeparado;
    }

    public void setNumeroLlamanteSeparado(String[] numeroLlamanteSeparado) {
        this.numeroLlamanteSeparado = numeroLlamanteSeparado;
    }

    public String[] getNumeroLlamadoSeparado() {
        return numeroLlamadoSeparado;
    }

    public void setNumeroLlamadoSeparado(String[] numeroLlamadoSeparado) {
        this.numeroLlamadoSeparado = numeroLlamadoSeparado;
    }
    
    
    public abstract double precioLlamada();
    
}
