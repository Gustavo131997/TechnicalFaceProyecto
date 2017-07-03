package TechnicalFace;

public enum Evaluacion {
    
	MUYBIEN(10,"Muy Bien", "El tecnico hizo muy bien su trabajo, respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        BIEN(7,"Bien","El tecnico hizo  bien su trabajo, no respeto los tiempos acordados, y el precio fue acorde a la calidad del servicio"),
        REGULAR(5,"Regular","El tecnico hizo regular su trabajo, no  respeto los tiempos acordados, y el precio fue acorde a una calidad regular del servicio"),
        MAL(3,"Mal","El tecnico hizo mal su trabajo, se sobrepaso un poco los tiempos acordados, y el precio fue acorde a una calidad mala del servicio\""),
        MUYMAL(1,"Muy Mal","El tecnico no sabia hacer el trabajo");

	private final int nota;
	private final String nom_evalua;
	private final String desc_evalua;
     
        private Evaluacion() {
            nota = 0;
            nom_evalua = "";
            desc_evalua = "";
        }
        
        
	/**
	 * 
	 * @param nota
	 * @param nom_evalua
	 * @param desc_evalua
	 */
	private Evaluacion(int nota, String nom_evalua, String desc_evalua) {
		this.nota = nota;
                this.nom_evalua = nom_evalua;
                this.desc_evalua = desc_evalua;
		
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
            return super.toString() + ';';
        }
        

}