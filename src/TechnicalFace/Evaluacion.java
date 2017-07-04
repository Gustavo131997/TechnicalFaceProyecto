package TechnicalFace;

import Datos.GestorArchPuntajes;

public enum Evaluacion {
        
	MUYBIEN(1, 10, "Muy Bien", "El tecnico hizo muy bien su trabajo, respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        BIEN(2, 7, "Bien","El tecnico hizo  bien su trabajo, no respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        REGULAR(3, 5,"Regular","El tecnico hizo regular su trabajo, no  respeto los tiempos acordados, y el precio fue acorde a una calidad regular del servicio"),
        MAL(4, 3,"Mal","El tecnico hizo mal su trabajo, se sobrepaso un poco los tiempos acordados, y el precio fue acorde a una calidad mala del servicio\""),
        MUYMAL(5, 1,"Muy Mal","El tecnico no sabia hacer el trabajo");
        
        private final int id;
	private final int nota;
	private final String nom_evalua;
	private final String desc_evalua;
        private String fechaEvaluacion;
        private String id_tecnico;
        private String id_usuario;
     
        private Evaluacion() {
            nota = 0;
            nom_evalua = "";
            desc_evalua = "";
            id = 0;
        }
        
        
	/**
	 * 
	 * @param nota
	 * @param nom_evalua
	 * @param desc_evalua
	 */
	private Evaluacion(int id ,int nota, String nom_evalua, String desc_evalua) {
		this.nota = nota;
                this.nom_evalua = nom_evalua;
                this.desc_evalua = desc_evalua;
		this.id = id;
	}

        public int getId() {
            return id;
        }
        
        public String getFechaEvaluacion() {
            return fechaEvaluacion;
        }

        public void setFechaEvaluacion(String fechaEvaluacion) {
            this.fechaEvaluacion = fechaEvaluacion;
        }

        public String getId_tecnico() {
            return id_tecnico;
        }

        public void setId_tecnico(String id_tecnico) {
            this.id_tecnico = id_tecnico;
        }

        public String getId_usuario() {
            return id_usuario;
        }

        public void setId_usuario(String id_usuario) {
            this.id_usuario = id_usuario;
        }

        
        
	public int getNota() {
            return this.nota;
	}

	public String getNom_evalua() {
            return this.nom_evalua;
	}

	public String getDesc_evalua() {
            return this.desc_evalua;
	}
        
        @Override
        public String toString() {
            return super.toString() + ",";
        }
        
        public void guardarDatosEvaluacion(){
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.guardarDatos(this);
        }

}