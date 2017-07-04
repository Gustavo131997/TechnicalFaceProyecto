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
public class TechnicalFaceTest {
    
    public TechnicalFaceTest() {
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

    /**
     * Test of getNombreRedSocial method, of class TechnicalFace.
     */
    @Test
    public void testGetNombreRedSocial() {
        System.out.println("getNombreRedSocial");
        TechnicalFace instance = new TechnicalFace();
        String expResult = "";
        String result = instance.getNombreRedSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreRedSocial method, of class TechnicalFace.
     */
    @Test
    public void testSetNombreRedSocial() {
        System.out.println("setNombreRedSocial");
        String nombreRedSocial = "";
        TechnicalFace instance = new TechnicalFace();
        instance.setNombreRedSocial(nombreRedSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadRegistroTecnico method, of class TechnicalFace.
     */
    @Test
    public void testCantidadRegistroTecnico() {
        System.out.println("cantidadRegistroTecnico");
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.cantidadRegistroTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class TechnicalFace.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        TechnicalFace instance = new TechnicalFace();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarios method, of class TechnicalFace.
     */
    @Test
    public void testSetUsuarios() {
        System.out.println("setUsuarios");
        ArrayList<Usuario> usuarios = null;
        TechnicalFace instance = new TechnicalFace();
        instance.setUsuarios(usuarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnicos method, of class TechnicalFace.
     */
    @Test
    public void testGetTecnicos() {
        System.out.println("getTecnicos");
        TechnicalFace instance = new TechnicalFace();
        ArrayList<Tecnico> expResult = null;
        ArrayList<Tecnico> result = instance.getTecnicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnicos method, of class TechnicalFace.
     */
    @Test
    public void testSetTecnicos() {
        System.out.println("setTecnicos");
        ArrayList<Tecnico> tecnicos = null;
        TechnicalFace instance = new TechnicalFace();
        instance.setTecnicos(tecnicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerminos_condiciones method, of class TechnicalFace.
     */
    @Test
    public void testGetTerminos_condiciones() {
        System.out.println("getTerminos_condiciones");
        TechnicalFace instance = new TechnicalFace();
        String expResult = "";
        String result = instance.getTerminos_condiciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerminos_condiciones method, of class TechnicalFace.
     */
    @Test
    public void testSetTerminos_condiciones() {
        System.out.println("setTerminos_condiciones");
        String terminos_condiciones = "";
        TechnicalFace instance = new TechnicalFace();
        instance.setTerminos_condiciones(terminos_condiciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarSistema method, of class TechnicalFace.
     */
    @Test
    public void testCargarSistema() {
        System.out.println("cargarSistema");
        TechnicalFace instance = new TechnicalFace();
        instance.cargarSistema();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerId_personaTecnico method, of class TechnicalFace.
     */
    @Test
    public void testObtenerId_personaTecnico() {
        System.out.println("obtenerId_personaTecnico");
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.obtenerId_personaTecnico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPosTecnico method, of class TechnicalFace.
     */
    @Test
    public void testObtenerPosTecnico() {
        System.out.println("obtenerPosTecnico");
        Tecnico tec = null;
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.obtenerPosTecnico(tec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarTecnico method, of class TechnicalFace.
     */
    @Test
    public void testActualizarTecnico() {
        System.out.println("actualizarTecnico");
        int index = 0;
        Tecnico tec = null;
        TechnicalFace instance = new TechnicalFace();
        instance.actualizarTecnico(index, tec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPosUsuario method, of class TechnicalFace.
     */
    @Test
    public void testObtenerPosUsuario() {
        System.out.println("obtenerPosUsuario");
        Usuario usu = null;
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.obtenerPosUsuario(usu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarUsuario method, of class TechnicalFace.
     */
    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        int index = 0;
        Usuario usu = null;
        TechnicalFace instance = new TechnicalFace();
        instance.actualizarUsuario(index, usu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarUsuario method, of class TechnicalFace.
     */
    @Test
    public void testVerificarUsuario() {
        System.out.println("verificarUsuario");
        Usuario usu = null;
        TechnicalFace instance = new TechnicalFace();
        boolean expResult = false;
        boolean result = instance.verificarUsuario(usu);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarTecnico method, of class TechnicalFace.
     */
    @Test
    public void testVerificarTecnico() {
        System.out.println("verificarTecnico");
        Tecnico tec = null;
        TechnicalFace instance = new TechnicalFace();
        boolean expResult = false;
        boolean result = instance.verificarTecnico(tec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerId_personaUsuario method, of class TechnicalFace.
     */
    @Test
    public void testObtenerId_personaUsuario() {
        System.out.println("obtenerId_personaUsuario");
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.obtenerId_personaUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerRegistroTecnico method, of class TechnicalFace.
     */
    @Test
    public void testObtenerRegistroTecnico() {
        System.out.println("obtenerRegistroTecnico");
        int i = 2;
        TechnicalFace instance = new TechnicalFace();
        instance.setTecnicos(new ArrayList<>());
        instance.anadirTecnico(new Tecnico());
        Tecnico expResult = new Tecnico();
        Tecnico result = instance.obtenerRegistroTecnico(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarTecnico method, of class TechnicalFace.
     */
    @Test
    public void testGuardarTecnico() {
        System.out.println("guardarTecnico");
        Tecnico tecnico = null;
        TechnicalFace instance = new TechnicalFace();
        instance.guardarTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirTecnico method, of class TechnicalFace.
     */
    @Test
    public void testAnadirTecnico() {
        System.out.println("anadirTecnico");
        Tecnico tecnico = null;
        TechnicalFace instance = new TechnicalFace();
        instance.anadirTecnico(tecnico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class TechnicalFace.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        TechnicalFace instance = new TechnicalFace();
        instance.actualizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarUsuario method, of class TechnicalFace.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        Usuario usu = null;
        TechnicalFace instance = new TechnicalFace();
        instance.guardarUsuario(usu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadRegistroUsuario method, of class TechnicalFace.
     */
    @Test
    public void testCantidadRegistroUsuario() {
        System.out.println("cantidadRegistroUsuario");
        TechnicalFace instance = new TechnicalFace();
        int expResult = 0;
        int result = instance.cantidadRegistroUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerRegistroUsuario method, of class TechnicalFace.
     */
    @Test
    public void testObtenerRegistroUsuario() {
        System.out.println("obtenerRegistroUsuario");
        int i = 0;
        TechnicalFace instance = new TechnicalFace();
        Usuario expResult = null;
        Usuario result = instance.obtenerRegistroUsuario(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerRegistroUsuarioId method, of class TechnicalFace.
     */
    @Test
    public void testObtenerRegistroUsuarioId() {
        System.out.println("obtenerRegistroUsuarioId");
        int id = 0;
        TechnicalFace instance = new TechnicalFace();
        Usuario expResult = null;
        Usuario result = instance.obtenerRegistroUsuarioId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerRegistroTecnicoId method, of class TechnicalFace.
     */
    @Test
    public void testObtenerRegistroTecnicoId() {
        System.out.println("obtenerRegistroTecnicoId");
        int id = 0;
        TechnicalFace instance = new TechnicalFace();
        Tecnico expResult = null;
        Tecnico result = instance.obtenerRegistroTecnicoId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirUsuario method, of class TechnicalFace.
     */
    @Test
    public void testAnadirUsuario() {
        System.out.println("anadirUsuario");
        Usuario usu = null;
        TechnicalFace instance = new TechnicalFace();
        instance.anadirUsuario(usu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class TechnicalFace.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object obj = null;
        TechnicalFace instance = new TechnicalFace();
        instance.eliminar(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarDatosEvaluaciones method, of class TechnicalFace.
     */
    @Test
    public void testCargarDatosEvaluaciones() {
        System.out.println("cargarDatosEvaluaciones");
        TechnicalFace instance = new TechnicalFace();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.cargarDatosEvaluaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
