/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author PC
 */
public class Ticket{

    private double duracionLlamda;
    private String numeroLlamante;
    private String numeroLlamado;
    private String fecha;
    private int hora;

    public Ticket(double duracionLlamda, String numeroLlamante, String numeroLlamado, String fecha, int hora) {
        this.duracionLlamda = duracionLlamda;
        this.numeroLlamante = numeroLlamante;
        this.numeroLlamado = numeroLlamado;
        this.fecha = fecha;
        this.hora = hora;
    }

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
}
