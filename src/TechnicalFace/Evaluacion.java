package TechnicalFace;

import Datos.GestorArchPuntajes;
/**
 * Esta clase se utiliza para evaluar a tecnico, es de tipo enum y tiene los siguientes objetos 
 * MUYBIEN, BIEN, REGULAR, MAL Y MUYMAL
 * @author Gustavo Huerta
 */
public enum Evaluacion {
        /**
         * Este objeto evalua con muy bien a un tecnico por usuario su id = 1, nota = 10, nom_evalua = Muy Bien y nom_desp = El tecnico hizo muy bien su trabajo, respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio
         */
	MUYBIEN(1, 10, "Muy Bien", "El tecnico hizo muy bien su trabajo, respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        /**
         * Este objeto evalua con bien a un tecnico por usuario su id = 2, nota = 7, nom_evalua = Bien y nom_desp = El tecnico hizo  bien su trabajo, no respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio
         */
        BIEN(2, 7, "Bien","El tecnico hizo  bien su trabajo, no respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        /**
         * Este objeto evalua con bien a un tecnico por usuario su id = 3, nota = 5, nom_evalua = Regular y nom_desp = El tecnico hizo regular su trabajo, no  respeto los tiempos acordados, y el precio fue acorde a una calidad regular del servicio
         */
        REGULAR(3, 5,"Regular","El tecnico hizo regular su trabajo, no  respeto los tiempos acordados, y el precio fue acorde a una calidad regular del servicio"),
        /**
         * Este objeto evalua con bien a un tecnico por usuario su id = 4, nota = 3, nom_evalua = Mal y nom_desp = El tecnico hizo mal su trabajo, se sobrepaso un poco los tiempos acordados, y el precio fue acorde a una calidad mala del servicio
         */
        MAL(4, 3,"Mal","El tecnico hizo mal su trabajo, se sobrepaso un poco los tiempos acordados, y el precio fue acorde a una calidad mala del servicio\""),
        /**
         * Este objeto evalua con bien a un tecnico por usuario su id = 5, nota = 1, nom_evalua = Muy Mal y nom_desp = El tecnico no sabia hacer el trabajo 
         */
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
	 * @param id 
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
        /**
         * Este metodo utiliza de la clase GestorArchPuntajes el metodo guardarDatos para 
         * guardar los suientes atributos: id_tecnico evaluado, id_usuario evaluado y fechaEvaluacion 
         */
        public void guardarDatosEvaluacion(){
            GestorArchPuntajes gestor = new GestorArchPuntajes();
            gestor.guardarDatos(this);
        }

}