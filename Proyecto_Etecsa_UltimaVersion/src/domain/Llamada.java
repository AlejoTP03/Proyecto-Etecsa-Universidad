/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import utils.*;

/**
 *
 * @author PC
 */
public abstract class Llamada {
    protected double duracionLlamda;
    protected String numeroLlamante;
    protected String numeroLlamado;
    protected Fecha fecha;
    protected Hora hora;
    
    //Formato numero telefonico
    String[] numeroLlamanteSeparado = numeroLlamante.split("-");
    String[] numeroLlamadoSeparado = numeroLlamado.split("-");


    //Constructor
    public Llamada(double duracionLlamda, String numeroLlamante, String numeroLlamado, Fecha fecha, Hora hora) {
        this.duracionLlamda = duracionLlamda;
        this.numeroLlamante = numeroLlamante;
        this.numeroLlamado = numeroLlamado;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //Getter and Setter
    public double getDuracionLlamda() {
        return duracionLlamda;
    }

    public void setDuracionLlamda(double duracionLlamda) {
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

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    
    public abstract double precioLlamada();
    
}
