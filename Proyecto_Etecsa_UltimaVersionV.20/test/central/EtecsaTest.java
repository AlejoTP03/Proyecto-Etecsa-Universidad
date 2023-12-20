/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package central;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;
import domain.Cliente;
import domain.ClienteEstatal;
import domain.ClienteResidenial;
import domain.Llamada;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class EtecsaTest {
    
    public EtecsaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    //Instanciasiones
    Cliente cliente = new ClienteEstatal(true, "Magdiel Rogel", "03111661825", "C Norte #7A", "56151914", true);
    Etecsa instance = new Etecsa();

    /**
     * Test para el metodo añadir cliente
     */
    @org.junit.Test
    public void testAddCliente() {
        System.out.println("addCliente");
        
        //Uso del metodo
        instance.addCliente(cliente);
        
        //variables
        boolean expResult = true;
        boolean result = false;
        
        //comprobacion del metodo
        for(Cliente c: instance.getClientes())
            if(c==cliente)
                result=true;
        
        assertEquals(expResult, result);
        
    }

    /**
     * Test para el metodo CambiarEstadoContrato
    */
    @org.junit.Test
    public void testCambiarEstadoContrato() {
        System.out.println("cambiarEstadoContrato");
        //Uso del metodo
        instance.cambiarEstadoContrato(cliente);
        
        //variables
        boolean expResult = false;
        boolean result = cliente.getEstadoContrato();
        
        //comprobacion del metodo
        assertEquals(expResult, result);

    }
    
    /*
    @org.junit.Test
    public void testDatosClienteMasUtilizaServicio() {
        System.out.println("datosClienteMasUtilizaServicio");
        Etecsa instance = new Etecsa();
        Cliente expResult = null;
        Cliente result = instance.datosClienteMasUtilizaServicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 

    @org.junit.Test
    public void testPagoPorSuperarMetrado() {
        System.out.println("pagoPorSuperarMetrado");
        Etecsa instance = new Etecsa();
        double expResult = 0.0;
        double result = instance.pagoPorSuperarMetrado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
