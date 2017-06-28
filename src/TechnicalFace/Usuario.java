package TechnicalFace;

import java.util.*;

public class Usuario extends Persona {

	ArrayList<Tecnico> evaluados;
        protected String tipoPerfil; 
	protected String user;
	protected String password;
	protected String dirFotoPerfil;
	protected String correo;

        public String getTipoPerfil() {
            return tipoPerfil;
        }

        public void setTipoPerfil(String tipoPerfil) {
            this.tipoPerfil = tipoPerfil;
        }
        
        
	public String getUser() {
		return this.user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getDirFotoPerfil() {
		return this.dirFotoPerfil;
	}

	/**
	 * 
	 * @param dirFotoPerfil
	 */
	public void setDirFotoPerfil(String dirFotoPerfil) {
		this.dirFotoPerfil = dirFotoPerfil;
	}

	public String getCorreo() {
		return this.correo;
	}

	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

        public ArrayList<Tecnico> getEvaluados() {
            return evaluados;
        }

        public void setEvaluados(ArrayList<Tecnico> evaluados) {
            this.evaluados = evaluados;
        }   
        
        public void ingresarEvaluacion(Tecnico tecnico, Evaluacion puntaje){
            tecnico.ingresarNotaConfianza(puntaje);
        }
        public String toStringDir(){
            return " "+super.id_persona + " , "+super.direccion.toString();
        }
        @Override
        public String toString() {
            return " "+super.id_persona+" , "+super.nombre+ " , " +super.ap_paterno +" , "+super.ap_materno +" , " + tipoPerfil + " , " + user + " , " + password + " , " + correo +" , "+super.celular+" , "+super.telefono + " , " + dirFotoPerfil + " ";
        }
        
        
}
