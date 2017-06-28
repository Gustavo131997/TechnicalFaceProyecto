package TechnicalFace;
  
public class Direccion {

	private String region;
	private String provincia;
	private String comuna;
	private String calle;
	private String num_calle;
	private String num_dep;

	public String getRegion() {  
		return this.region;
	}

	/**
	 * 
	 * @param region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	public String getProvincia() {
		return this.provincia;
	}

	/**
	 * 
	 * @param provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getComuna() {
		return this.comuna;
	}

	/**
	 * 
	 * @param comuna
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getCalle() {
		return this.calle;
	}

	/**
	 * 
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNum_calle() {
		return this.num_calle;
	}

	/**
	 * 
	 * @param Num_calle
	 */
	public void setNum_calle(String Num_calle) {
		this.num_calle = Num_calle;
	}

	public String getNum_dep() {
		return this.num_dep;
	}

	/**
	 * 
	 * @param num_dep
	 */
	public void setNum_dep(String num_dep) {
		this.num_dep = num_dep;
	}

    @Override
    public String toString() {
        return ""+ region + " , " + provincia + " , " + comuna + " , " + calle + " , " + num_calle + " , " + num_dep + " , ";
    }
        
        
}