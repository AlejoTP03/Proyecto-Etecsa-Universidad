/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import central.Etecsa;
import domain.Cliente;
import domain.Cliente_Estatal;
import domain.Cliente_Residenial;
import domain.Llamada;
import domain.Llamada_Internacional;
import domain.Llamada_Local;
import interfaces.ICentral;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ICentral central = new Etecsa ;
        
        
        
        Cliente c1 = new Cliente_Residenial(true, true, "Jose", "03100373186", "Cespedes", "55555555", true);
        Cliente c2 = new Cliente_Estatal(true, "Pepe", "03111872958", "Marti", "55749028", true);
        Cliente c3 = new Cliente_Residenial(false, false, "Ricardo", "02111875684", "Colon", "58877414", false);
        
        Llamada llama1 = new Llamada
            
           
        
        }    

}    