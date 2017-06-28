package TechnicalFace;

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

	/**
	 * 
	 * @param puntajes
	 */
	private int sumaTotalEvaluaciones(ArrayList<Evaluacion> puntajes) {
             int total = 0;
            for (int i = 0; i < puntajes.size(); i++) {
                if (puntajes.get(i).getNota() != 0) {
                    total =+ puntajes.get(i).getNota();
                }
            }
            return total;
	}

	/**
	 * 
	 * @param totalEvaluaciones
	 */
	private void calculoNivelConfianza(int totalEvaluaciones) {
           int cal1 = totalEvaluaciones * 100;
           int cal2 = puntajes.size()*10;
           this.nivel_confianza = (int)cal1/cal2;
            System.out.println(this.nivel_confianza);
	}
  
  
        public void ingresarNotaConfianza(Evaluacion eva) {
            System.out.println("Nota: "+eva.getNota());
	    this.puntajes.add(eva);
            int total = this.sumaTotalEvaluaciones(puntajes);
            System.out.println("Total: "+total);
            calculoNivelConfianza(total);
        }

        @Override
        public String toString() {
            return " "+super.id_persona+ " , "+super.nombre+ " , "+super.ap_paterno+ " , "+super.ap_materno +" , "+super.tipoPerfil+" , "+super.user+ " , "+ super.password+ " , "+super.correo+" , "+super.celular+" , "+super.telefono+" , "+ especialidad + " , " + anoExperencia + " , " + nivel_confianza + " , " + descripcion + " , "+super.dirFotoPerfil;
        }
        
}



