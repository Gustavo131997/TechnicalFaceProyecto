package TechnicalFace;

import Componentes.Mensajes;
import Datos.GestorArchDirecciones;
import Datos.GestorArchPuntajes;
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
    /**
     * Este metodo a todos los tecnicos y usuarios guardados con su respectivas direcciones usando los metodos cargarArchivo de GestorArchUsuario,
     *  cargarTecnicosGuardados de GestorArchTecnico, cargarDireccionesTecnico y cargarDireccionesTecnico de la clase GestorArchDirecciones.
     */
    public void cargarSistema(){
        GestorArchUsuario gestorUsu = new GestorArchUsuario();
       gestorUsu.cargarArchivo(this);
        GestorArchTecnico gestorTec = new GestorArchTecnico();
        gestorTec.cargarTecnicosGuardados(this);
        GestorArchDirecciones gestorDir = new GestorArchDirecciones();
        gestorDir.cargarDireccionesTecnico(this);
        gestorDir.cargarDireccionesTecnico(this);
    }
    /**
     * * Se obtiene id_persona para agregar otro Tecnico
     * @return de tipo int obtiene el id_persona maximo de Tecnico le suma uno y lo retorna
     *  y si no ningun tecnico registrado retorna cero.
     * Este metodo hace posible que el id_persona sea unico y correlativo
     */
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
            return cod[cod.length-1]+1;
        }else{
          return 0;  
        }
    }
    /**
     * Este metodo retorna la posicion tec
     * @param tec es de tipo Tecnico y es que se quiere saber la posicion que se encuentra
     * dentro del ArrayList tecnicos
     * @return de tipo int y es la posicion que se encuentra tec en el ArrayList tecnicos
     * sino se encuentra retorna -1.
     */
    public int obtenerPosTecnico(Tecnico tec){
        return this.tecnicos.indexOf(tec);
    }
    /**
     * Este metodo actualiza a un tecnico que se cambiaron algunos atributos solamente
     * @param index es la posicion del tecnico que se quiere actualizar
     * @param tec es el Tecnico que se actualizo
     */
    public void actualizarTecnico(int index, Tecnico tec){
        this.tecnicos.set(index, tec);
    }
    /**
     * Este metodo retorna la posicion usu
     * @param usu es de tipo Usuario y es que se quiere saber la posicion que se encuentra
     * dentro ArrayList usuarios
     * @return de tipo int y es la posicion que se encuentra tec en el ArrayList tecnicos
     * sino se encuentra retorna -1.
     */
     public int obtenerPosUsuario(Usuario usu){
        return this.usuarios.indexOf(usu);
    }
    /**
     * Este metodo actualiza a un tecnico que se cambiaron algunos atributos solamente
     * @param index es la posicion del tecnico que se quiere actualizar
     * @param usu es el Tecnico que se actualizo
     */
    public void actualizarUsuario(int index, Usuario usu){
        this.usuarios.set(index, usu);
    }
    /**
     * Verifica la existencia de un Usuario
     * @param usu es el Usuario en el cual se quiere verifcar su existencia
     * @return es de tipo boolean, y retorna true si existe el usuario y false si no existe en el ArrayList usuarios
     */
    public boolean verificarUsuario(Usuario usu){
      return this.usuarios.contains(usu);
    }
    /**
     * Verifica la existencia de un Tecnico
     * @param tec es el Usuario en el cual se quiere verifcar su existencia
     * @return es de tipo boolean, y retorna true si existe el tecnico y false si no existe en el ArrayList tecnicos
     */
    public boolean verificarTecnico(Tecnico tec){
        return this.tecnicos.contains(tec);
    }
    /**
     * Se obtiene id_persona para agregar otro Usuario
     * @return de tipo int obtiene el id_persona maximo de Tecnico le suma uno y lo retorna
     *  y si no ningun tecnico registrado retorna cero.
     * Este metodo hace posible que el id_persona sea unico y correlativo
     */
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
            return cod[cod.length-1]+1;
        }else{
          return 0;  
        }
    }
    /**
     * Este metodo sirve para obtener a un Tecnico de ArrayList tecnicos
     * @param i es la posicion de Tecnico que se quiere obtener
     * @return un Tecnico si el parametro i esta dentro del tamaño del ArrayList o sino lanzara la exception java.lang.IndexOutOfBoundsException y
     * se le ingresa un i negativo retorna null
     */
    public Tecnico obtenerRegistroTecnico(int i) {
        if (i>= 0) {
            return this.tecnicos.get(i);
        }
        return null;
    }
    /**
     * Este metodo guarda al tecnico que se ingresa como parametro, primero verificar con if si el tecnico a guardar
     *  existe dentro del ArrayList tecnicos, si no existe usa el metodo anadirTecnico y utiliza el metodo guardar de la clase GestorArchTecnico(vease package Datos) y el metodo guardarDireccionTecnico de la clase GestorArchDirecciones (vease package Datos)
     * @param tecnico es el Tecnico a guardar
     */
    public void guardarTecnico(Tecnico tecnico){
        if (!verificarTecnico(tecnico)) {
            anadirTecnico(tecnico);
            GestorArchTecnico gestorTec = new GestorArchTecnico();
            gestorTec.guardar(this);
            GestorArchDirecciones gestorDir = new GestorArchDirecciones();
            gestorDir.guardarDireccionTecnico(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    /**
     * Este metodo añade a tecnico al ArrayList tecnicos
     * @param tecnico es el Tecnico a añadir en el ArrayList tecnicos
     */
    public void anadirTecnico(Tecnico tecnico){
        try{
            if (tecnico != null) {
                this.tecnicos.add(tecnico);
            }
        }catch(NullPointerException m){
            Mensajes.informacion("El arrayList de tecnicos no ha sido Instanciado");
        }
            
    }
    
    /**
     * Este actualiza en el archivo todos los tecnicos 
     */
    public void actualizar(){
        GestorArchUsuario gestorUsu = new GestorArchUsuario();
        gestorUsu.guardar(this);
        GestorArchDirecciones gestorDir = new GestorArchDirecciones();
        gestorDir.guardarDireccionUsuario(this);
        GestorArchTecnico gestorTec = new GestorArchTecnico();
        gestorTec.guardar(this);
        gestorDir.guardarDireccionTecnico(this);
    }
    /**
     * 
     * @param usu
     */
    public void guardarUsuario(Usuario usu){
        if (!verificarUsuario(usu)) {
            anadirUsuario(usu);
            GestorArchUsuario gestorUsu = new GestorArchUsuario();
            gestorUsu.guardar(this);
            GestorArchDirecciones gestorDir = new GestorArchDirecciones();
            gestorDir.guardarDireccionUsuario(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    /**
     * 
     * @return 
     */
    public int cantidadRegistroUsuario() {
        return this.usuarios.size();
    }
    /**
     * 
     * @param i
     * @return 
     */
    public Usuario obtenerRegistroUsuario(int i) {
        if (i>= 0) {
            System.out.println(i);
            return this.usuarios.get(i);
        }else{
            return null;
        }
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Usuario obtenerRegistroUsuarioId(int id){
        for (int i = 0; i < this.cantidadRegistroUsuario(); i++) {
            Usuario usu = this.obtenerRegistroUsuario(i);
            if (usu.getId_persona() == id) {
                return usu;
            }
        }
        return null;
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Tecnico obtenerRegistroTecnicoId(int id){
        for (int i = 0; i < this.cantidadRegistroTecnico(); i++) {
            Tecnico tec = this.obtenerRegistroTecnico(i);
            if (tec.getId_persona() == id) {
                return tec;
            }
        }
        return null;
    }
    /**
     * 
     * @param usu 
     */
    public void anadirUsuario(Usuario usu) {
        try{
            if (usu != null) {
                this.usuarios.add(usu);
            }
        }catch(NullPointerException m){
            Mensajes.informacion("El arrayList de usuarios no ha sido Instanciado");
        }
    }
    /**
     * 
     * @param obj 
     */
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
    /**
     * 
     * @return 
     */
    public ArrayList<String> cargarDatosEvaluaciones(){
        GestorArchPuntajes gestor = new GestorArchPuntajes();
        return gestor.cargarDatos();
    }
    
}