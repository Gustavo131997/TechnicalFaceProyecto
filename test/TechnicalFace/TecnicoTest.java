/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalFace;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class TecnicoTest {
    Usuario evaluador;
    Tecnico tecnico ;
    public TecnicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   
    @Before
    public void setUp(){
        evaluador = new Usuario();
        evaluador.setId_persona(0);
        tecnico = new Tecnico();
        tecnico.setId_persona(1); 
        tecnico.setEvaluador(evaluador);
        ArrayList<Evaluacion> puntajes = new ArrayList<>();
        puntajes.add(Evaluacion.BIEN);
        puntajes.add(Evaluacion.MUYBIEN);
        puntajes.add(Evaluacion.REGULAR);
        puntajes.add(Evaluacion.MUYMAL);
        puntajes.add(Evaluacion.MAL);
        tecnico.setPuntajes(puntajes);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEspecialidad method, of class Tecnico.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Tecnico instance = new Tecnico();
        String expResult = "";
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluador method, of class Tecnico.
     */
    @Test
    public void testGetEvaluador() {
        System.out.println("getEvaluador");
        Tecnico instance = new Tecnico();
        Usuario expResult = null;
        Usuario result = instance.getEvaluador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluador method, of class Tecnico.
     */
    @Test
    public void testSetEvaluador() {
        System.out.println("setEvaluador");
        Usuario evaluador = null;
        Tecnico instance = new Tecnico();
        instance.setEvaluador(evaluador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajes method, of class Tecnico.
     */
    @Test
    public void testGetPuntajes() {
        System.out.println("getPuntajes");
        Tecnico instance = new Tecnico();
        ArrayList<Evaluacion> expResult = null;
        ArrayList<Evaluacion> result = instance.getPuntajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntajes method, of class Tecnico.
     */
    @Test
    public void testSetPuntajes() {
        System.out.println("setPuntajes");
        ArrayList<Evaluacion> puntajes = null;
        Tecnico instance = new Tecnico();
        instance.setPuntajes(puntajes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspecialidad method, of class Tecnico.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "";
        Tecnico instance = new Tecnico();
        instance.setEspecialidad(especialidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoExperencia method, of class Tecnico.
     */
    @Test
    public void testGetAnoExperencia() {
        System.out.println("getAnoExperencia");
        Tecnico instance = new Tecnico();
        String expResult = "";
        String result = instance.getAnoExperencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoExperencia method, of class Tecnico.
     */
    @Test
    public void testSetAnoExperencia() {
        System.out.println("setAnoExperencia");
        String anoExperencia = "";
        Tecnico instance = new Tecnico();
        instance.setAnoExperencia(anoExperencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNivel_confianza method, of class Tecnico.
     */
    @Test
    public void testSetNivel_confianza() {
        System.out.println("setNivel_confianza");
        int nivel_confianza = 0;
        Tecnico instance = new Tecnico();
        instance.setNivel_confianza(nivel_confianza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNivel_confianza method, of class Tecnico.
     */
    @Test
    public void testGetNivel_confianza() {
        System.out.println("getNivel_confianza");
        Tecnico instance = new Tecnico();
        int expResult = 0;
        int result = instance.getNivel_confianza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Tecnico.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Tecnico instance = new Tecnico();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Tecnico.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Tecnico instance = new Tecnico();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarNotaConfianza method, of class Tecnico.
     */
    @Test
    public void testIngresarNotaConfianza() {
        System.out.println("ingresarNotaConfianza");
        Evaluacion eva = null;
        Tecnico instance = new Tecnico();
        instance.ingresarNotaConfianza(eva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tecnico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tecnico instance = new Tecnico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toStringPuntajes method, of class Tecnico.
     */
    @Test
    public void testToStringPuntajes() {
        System.out.println("toStringPuntajes");
        String result = tecnico.toStringPuntajes();
        assertNull(result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
