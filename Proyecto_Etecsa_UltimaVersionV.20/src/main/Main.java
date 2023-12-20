/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import central.Etecsa;
import domain.Cliente;
import domain.ClienteResidenial;
import domain.Llamada;
import domain.LlamadaLocal;
import interfaces.ICentral;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args){
        Cliente c1 = new ClienteResidenial(true, true, "Marcos Peres", "03111661825", "Camilo Cienfuegos #20A", "56151914", true);
        ICentral ic1 = new Etecsa();
        
        
        ic1.addCliente(c1);
        
        
     
        
    }
}
