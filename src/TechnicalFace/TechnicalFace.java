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
        GestorArchUsuario.cargarArchivo(this);
        GestorArchTecnico.cargarTecnicosGuardados(this);
        GestorArchDirecciones.cargarDireccionesTecnico(this);
        GestorArchDirecciones.cargarDireccionesUsuario(this);
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
            añadirTecnico(tecnico);
            GestorArchTecnico.guardar(this);
            GestorArchDirecciones.guardarDireccionTecnico(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    public void añadirTecnico(Tecnico tecnico){
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
    public void guardarUsuario(Usuario usu){
        if (!validarExistenciaUsuario(usu)) {
            añadirUsuario(usu);
            GestorArchUsuario.guardar(this);
            GestorArchDirecciones.guardarDireccionUsuario(this);
        }else{
            Mensajes.informacion("Usted ya se encuentra registrado");
        }
            
    }
    public int cantidadRegistroUsuario() {
        return this.usuarios.size();
    }
  
    public Usuario obtenerRegistroUsuario(int i) {
        if (i>= 0) {
            return this.usuarios.get(i);
        }else{
            return null;
        }
    }
    

    private boolean validarExistenciaUsuario(Usuario usu) {
        return this.usuarios.contains(usu);
    }

    public void añadirUsuario(Usuario usu) {
        try{
            if (usu != null) {
                this.usuarios.add(usu);
            }
        }catch(NullPointerException m){
            Mensajes.informacion("El arrayList de usuarios no ha sido Instanciado");
        }
    }

}