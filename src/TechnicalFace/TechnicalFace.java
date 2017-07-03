package TechnicalFace;

import Componentes.Mensajes;
import Datos.GestorArchDirecciones;
import Datos.GestorArchTecnico;
import Datos.GestorArchUsuario;
import java.util.*;

public class TechnicalFace {

	ArrayList<Usuario> usuarios;
	ArrayList<Tecnico> tecnicos;
	private String nombreRedSocial;   
	private String terminos_condiciones;

        public TechnicalFace() {
            this.nombreRedSocial = "TechnicalFace";
            this.terminos_condiciones = "";
        }
        
        

	public String getNombreRedSocial() {
		return this.nombreRedSocial;
	}

	/**
	 * 
	 * @param nombreRedSocial
	 */
	public void setNombreRedSocial(String nombreRedSocial) {
		this.nombreRedSocial = nombreRedSocial;
	}

        public int cantidadRegistroTecnico() {
            return this.tecnicos.size();
        }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public String getTerminos_condiciones() {
        return terminos_condiciones;
    }
    
    public void setTerminos_condiciones(String terminos_condiciones) {
        this.terminos_condiciones = terminos_condiciones;
    }
    public void cargarSistema(){
        GestorArchUsuario gestorUsu = new GestorArchUsuario();
       gestorUsu.cargarArchivo(this);
        GestorArchTecnico gestorTec = new GestorArchTecnico();
        gestorTec.cargarTecnicosGuardados(this);
        GestorArchDirecciones gestorDir = new GestorArchDirecciones();
        gestorDir.cargarDireccionesTecnico(this);
        gestorDir.cargarDireccionesUsuario(this);
    }
    public int obtenerId_personaTecnico(){
        if (this.cantidadRegistroTecnico() != 0) {
            int [] cod;
            cod = new int[this.cantidadRegistroTecnico()];
            for (int i = 0; i < this.cantidadRegistroTecnico(); i++) {
                Tecnico tec = this.obtenerRegistroTecnico(i);
                int cod1 = tec.getId_persona();
                cod[i] = cod1;
            }
            Arrays.sort(cod);
////            burbuja(cod);
            return cod[cod.length-1]+1;
        }else{
          return 0;  
        }
    }
    public void actualizarTecnico(int index, Tecnico tec){
        this.tecnicos.set(index, tec);
    }
    public boolean verificarUsuario(Usuario usu){
      return this.usuarios.contains(usu);
    }
    public boolean verificarTecnico(Tecnico tec){
        return this.tecnicos.contains(tec);
    }
    public int obtenerId_personaUsuario(){
        if (this.cantidadRegistroUsuario() != 0) {
            int [] cod;
            cod = new int[this.cantidadRegistroUsuario()];
            for (int i = 0; i < this.cantidadRegistroUsuario(); i++) {
                Usuario usu = this.obtenerRegistroUsuario(i);
                int cod1 = usu.getId_persona();
                cod[i] = cod1;
            }
            Arrays.sort(cod);
////            burbuja(cod);
            return cod[cod.length-1]+1;
        }else{
          return 0;  
        }
    }
    private void burbuja(int [] a){
         int i, j, aux;
         for(i=0;i<a.length-1;i++)
              for(j=0;j<a.length-i-1;j++)
                   if(a[j+1]<a[j]){
                      aux=a[j+1];
                      a[j+1]=a[j];
                      a[j]=aux;
                   }
    }
    public Tecnico obtenerRegistroTecnico(int i) {
        if (i>= 0) {
            return this.tecnicos.get(i);
        }
        return null;
    }
    
    public void guardarTecnico(Tecnico tecnico){
        if (!validarExistenciaTecnico(tecnico)) {
            anadirTecnico(tecnico);
            GestorArchTecnico gestorTec = new GestorArchTecnico();
            gestorTec.guardar(this);
            GestorArchDirecciones gestorDir = new GestorArchDirecciones();
            gestorDir.guardarDireccionTecnico(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    public void anadirTecnico(Tecnico tecnico){
        try{
            if (tecnico != null) {
                this.tecnicos.add(tecnico);
            }
        }catch(NullPointerException m){
            Mensajes.informacion("El arrayList de tecnicos no ha sido Instanciado");
        }
            
    }
    private boolean validarExistenciaTecnico(Tecnico tecnico){
        return this.tecnicos.contains(tecnico);
    }
    public void actualizar(){
        GestorArchUsuario gestorUsu = new GestorArchUsuario();
        gestorUsu.guardar(this);
        GestorArchDirecciones gestorDir = new GestorArchDirecciones();
        gestorDir.guardarDireccionUsuario(this);
        GestorArchTecnico gestorTec = new GestorArchTecnico();
        gestorTec.guardar(this);
        gestorDir.guardarDireccionTecnico(this);
    }
    public void guardarUsuario(Usuario usu){
        if (!validarExistenciaUsuario(usu)) {
            anadirUsuario(usu);
            GestorArchUsuario gestorUsu = new GestorArchUsuario();
            gestorUsu.guardar(this);
            GestorArchDirecciones gestorDir = new GestorArchDirecciones();
            gestorDir.guardarDireccionUsuario(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    public int cantidadRegistroUsuario() {
        return this.usuarios.size();
    }
  
    public Usuario obtenerRegistroUsuario(int i) {
        if (i>= 0) {
            System.out.println(i);
            return this.usuarios.get(i);
        }else{
            return null;
        }
    }
    public Usuario obtenerRegistroUsuarioId(int id){
        for (int i = 0; i < this.cantidadRegistroUsuario(); i++) {
            Usuario usu = this.obtenerRegistroUsuario(i);
            if (usu.getId_persona() == id) {
                return usu;
            }
        }
        return null;
    }
    public Tecnico obtenerRegistroTecnicoId(int id){
        for (int i = 0; i < this.cantidadRegistroTecnico(); i++) {
            Tecnico tec = this.obtenerRegistroTecnico(i);
            if (tec.getId_persona() == id) {
                return tec;
            }
        }
        return null;
    }

    private boolean validarExistenciaUsuario(Usuario usu) {
        return this.usuarios.contains(usu);
    }

    public void anadirUsuario(Usuario usu) {
        try{
            if (usu != null) {
                this.usuarios.add(usu);
            }
        }catch(NullPointerException m){
            Mensajes.informacion("El arrayList de usuarios no ha sido Instanciado");
        }
    }
    
    public void eliminar(Object obj) {
         if (obj instanceof Usuario) {
            Usuario usu = (Usuario)obj;
             if (usu instanceof Tecnico) {
                 Tecnico tec = (Tecnico)usu;
                 int index = this.tecnicos.indexOf(tec);
                 if (index != -1) {
                     tec.borrarPuntajes();
                     this.tecnicos.remove(index);
                     
                 }else{
                     Mensajes.error("No existe el que quiere eliminar");
                 }
             }else{
                int index = this.usuarios.indexOf(usu);
                if ( index != -1) {
                    this.usuarios.remove(index);
                }else{
                    Mensajes.error("No existe usuario que quiere eliminar");
                }
             }
             
        }
    }
    
}