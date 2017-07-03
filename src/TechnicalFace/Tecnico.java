package TechnicalFace;

import Datos.GestorArchPuntajes;
import java.util.*;

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
	 * @param especialidad
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getAnoExperencia() {
		return this.anoExperencia;
	}

	/**
	 * 
	 * @param anoExperencia
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
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
        
        public void anadirEvaluacion(Evaluacion eva){
            this.puntajes.add(eva);
        }
	

	/**
         * 
         * @param index
         * @return 
         */
        public Evaluacion getEvaluacion(int index){
            return this.puntajes.get(index);
        }
        
        public void cargarPuntajes(){
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.cargarPuntajes(this);
        }
        /**
         * 
         * @return nu int que es el calculo 
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
        public void ingresarNotaConfianza(Evaluacion eva) {
	    this.puntajes.add(eva);
        }
 
        @Override
        public String toString() {
            return " "+super.id_persona+ " , "+super.nombre+ " , "+super.ap_paterno+ " , "+super.ap_materno +" , "+super.tipoPerfil+" , "+super.user+ " , "+ super.password+ " , "+super.correo+" , "+super.celular+" , "+super.telefono+" , "+ especialidad + " , " + anoExperencia + " , " + nivel_confianza + " , " + descripcion + " , "+super.dirFotoPerfil;
        }
        
        public String toStringPuntajes(){
            String cadena = ""+getId_persona()+" , "+evaluador.getId_persona() ;
            for (int i = 0; i < this.puntajes.size(); i++) {
                cadena += "\n "+puntajes.get(i).toString()+";\n";
            }
            return cadena;
        }
        
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

        public void borrarPuntajes() {
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.vaciarArch(this);
        }
        
}



