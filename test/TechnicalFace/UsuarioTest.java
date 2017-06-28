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
public class UsuarioTest {
    Tecnico tec;
    Usuario usu;
    Evaluacion eva ;
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tec = new Tecnico();
        usu = new Usuario();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTipoPerfil method, of class Usuario.
     */
    @Test
    public void testGetTipoPerfil() {
        System.out.println("getTipoPerfil");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipoPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoPerfil method, of class Usuario.
     */
    @Test
    public void testSetTipoPerfil() {
        System.out.println("setTipoPerfil");
        String tipoPerfil = "";
        Usuario instance = new Usuario();
        instance.setTipoPerfil(tipoPerfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Usuario.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Usuario.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Usuario instance = new Usuario();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = new Usuario();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirFotoPerfil method, of class Usuario.
     */
    @Test
    public void testGetDirFotoPerfil() {
        System.out.println("getDirFotoPerfil");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDirFotoPerfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirFotoPerfil method, of class Usuario.
     */
    @Test
    public void testSetDirFotoPerfil() {
        System.out.println("setDirFotoPerfil");
        String dirFotoPerfil = "";
        Usuario instance = new Usuario();
        instance.setDirFotoPerfil(dirFotoPerfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Usuario.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Usuario.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Usuario instance = new Usuario();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluados method, of class Usuario.
     */
    @Test
    public void testGetEvaluados() {
        System.out.println("getEvaluados");
        Usuario instance = new Usuario();
        ArrayList<Tecnico> expResult = null;
        ArrayList<Tecnico> result = instance.getEvaluados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluados method, of class Usuario.
     */
    @Test
    public void testSetEvaluados() {
        System.out.println("setEvaluados");
        ArrayList<Tecnico> evaluados = null;
        Usuario instance = new Usuario();
        instance.setEvaluados(evaluados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IngresarEvaluacion method, of class Usuario.
     */
    @Test
    public void testIngresarEvaluacion() {
        System.out.println("IngresarEvaluacion");
        eva =  Evaluacion.MUYBIEN;
        tec = new Tecnico();
        usu = new Usuario();
        tec.puntajes = new ArrayList<>();
        usu.ingresarEvaluacion(tec,eva);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
