package TechnicalFace;
 /**
 * Esta clase es abstracta y representa la persona en la realidad 
 * atributos:
 *          -id_persona: Representa el identificador que tendra toda persona dentro de la red social
 *          -nombre: Representa el nombre de la persona
 *          -ap_paterno: Representa el apellido paterno de la persona
 *          -ap_materno: Representa el apellido materno de toda persona
 *          -celular: Representa el celular de la persona
 *          -telefono: Representa el telefono fijo de la persona
 * @author Gustavo Huerta
 */
public abstract class Persona {
  
	protected Direccion direccion;
	protected int id_persona;
	protected String nombre;
	protected String ap_paterno;
	protected String ap_materno;
	protected String celular;
	protected String telefono;

	public int getId_persona() {  
		return this.id_persona;
	}

	/**
	 * 
	 * @param id_persona
	 */
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_paterno() {
		return this.ap_paterno;
	}

	/**
	 * 
	 * @param ap_paterno
	 */
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return this.ap_materno;
	}

	/**
	 * 
	 * @param ap_materno
	 */
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public String getCelular() {
		return this.celular;
	}

	/**
	 * 
	 * @param celular
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 19 * hash + this.id_persona;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Persona other = (Persona) obj;
            if (this.id_persona != other.id_persona) {
                return false;
            }
            return true;
        }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
        
        
        
}