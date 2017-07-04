package TechnicalFace;

import Datos.GestorArchPuntajes;
import java.util.*;
/**
 * Esta clase representa al tecnico que se va a ser evaluado por un usuario a traves de la app y es hija de la clase Usuario
 * atributos:
 *          -tipoPerfil : Representa diferenciacion entre tres perfiles admin, Usuario y Tecnico el cual cada uno tendra
 *          -user: Representa el nombre de usuario por el cual va logearse 
 *          -password: Representa la contraseña por el cual va logearse el usuario
 *          -dirFotoPerfil: Representa la direccion donde se encuentra la foto de perfil de un usuario
 *          -correo:: es el correo de un usuario
 * @author Gustavo Huerta
 */
public class Tecnico extends Usuario {

	Usuario evaluador;
	ArrayList<Evaluacion> puntajes;
	private String especialidad;
	private String anoExperencia;
	private int nivel_confianza;
	private String descripcion;
        
   
        public Tecnico() {
            super.tipoPerfil = "Tecnico";
        }
        
	public String getEspecialidad() {
		return this.especialidad;
	}

        public Usuario getEvaluador() {
            return evaluador;
        }

        public void setEvaluador(Usuario evaluador) {
            this.evaluador = evaluador;
        }

        public ArrayList<Evaluacion> getPuntajes() {
            return puntajes;
        }

        public void setPuntajes(ArrayList<Evaluacion> puntajes) {
            this.puntajes = puntajes;
        }
        
	/**
	 * 
	 * @param especialidad es la especialidad de un tecnico
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getAnoExperencia() {
		return this.anoExperencia;
	}

	/**
	 * 
	 * @param anoExperencia son el intervalo de años que lleva desarrollado su especialidad y es de tipo String 
	 */
	public void setAnoExperencia(String anoExperencia) {
		this.anoExperencia = anoExperencia;
	}

        public void setNivel_confianza(int nivel_confianza) {
            this.nivel_confianza = nivel_confianza;
        }
        
	public int getNivel_confianza() {
		return this.nivel_confianza;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion es de tipo String 
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
        /**
         * Este metodo añade una evaluacion a un Tecnico al ArrayList Puntajes
         * @param eva es de tipo Evaluacion y es la evaluacion que se quiere ingresar
         */
        public void anadirEvaluacion(Evaluacion eva){
            this.puntajes.add(eva);
        }
	

	/**
         * Retorna una evaluacion 
         * @param index es un int y representa la posicion de la evaluacion que se quiere obtener
         * @return es de tipo Evaluacion
         */
        public Evaluacion getEvaluacion(int index){
            return this.puntajes.get(index);
        }
        /**
         * CArgas todos los puntajes desde el archivo al objeto usando la clase GestorArchPuntajes el metodo cargarPuntajes de la clase
         */
        public void cargarPuntajes(){
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.cargarPuntajes(this);
        }
        /**
         * Este es el metodo calcula el atributo nivel_confianza en razon del total obtenido y el puntaje total ideal(maximo) multiplicado por cien 
         * @return un int que es el calculo del atributo nivel_confianza 
         */
        public int calculoConfianza(){
            int total = 0;
            int calculo = 0;
            if (!this.puntajes.isEmpty()) {
                for (int i = 0; i < this.cantidadPuntajes(); i++) {
                Evaluacion eva = this.getEvaluacion(i);
                total += eva.getNota();
            }
            int cal1 = total * 100;
            int cal2 = this.puntajes.size()*10;
            calculo = (int)cal1/cal2 ;
            this.setNivel_confianza(calculo);
            }
            return calculo;
        }
        /**
         * ESte emetodo ingresa una Evalaucion a un Tecnico
         * @param eva es de tipo Evalauacion y es la evaluacion que se quiere ingresar
         */
        public void ingresarNotaConfianza(Evaluacion eva) {
	    this.puntajes.add(eva);
        }
 
        @Override
        public String toString() {
            return " "+super.id_persona+ " , "+super.nombre+ " , "+super.ap_paterno+ " , "+super.ap_materno +" , "+super.tipoPerfil+" , "+super.user+ " , "+ super.password+ " , "+super.correo+" , "+super.celular+" , "+super.telefono+" , "+ especialidad + " , " + anoExperencia + " , " + nivel_confianza + " , " + descripcion + " , "+super.dirFotoPerfil;
        }
        
        /**
         * Es metodo retorna la cantidad de puntajes que el tecnico tiene ingresado en su ArrayList puntajes
         * @return es de tipo int y representa la cantidad de puntajes
         */
        public int cantidadPuntajes(){
            return this.puntajes.size();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int hashCode() {
            return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
        }
        /**
         * Este metodo borra todo los puntajes del archivo a traves del metodo vaciarArch que es de la clase GestorArchPuntajes
         */
        public void borrarPuntajes() {
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.vaciarArch(this);
        }
        
}



