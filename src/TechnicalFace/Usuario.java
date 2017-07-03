package TechnicalFace;

import Datos.GestorArchPuntajes;
import java.util.*;

public class Usuario extends Persona {

    ArrayList<Tecnico> evaluados;
    protected String tipoPerfil;
    protected String user;
    protected String password;
    protected String dirFotoPerfil;
    protected String correo;
    ArrayList<Evaluacion> evaluaciones;

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

    /**
     *
     * @param tecnico
     */
    public void anadirEvaluado(Tecnico tecnico) {
        this.evaluados.add(tecnico);
    }

    /**
     *
     * @param i : index de posicion dentro del arraylist
     * @return
     */
    public Tecnico getEvaluado(int i) {
        return this.evaluados.get(i);
    }

    public void cargarTecnicosEvaluados() {
        GestorArchPuntajes gestor = new GestorArchPuntajes();
        gestor.cargarTecnicosEvaluados(this);
    }

    /**
     *
     * @param tecnico
     * @param puntaje
     */
    public void ingresarEvaluacion(Tecnico tecnico, Evaluacion puntaje) {
        tecnico.ingresarNotaConfianza(puntaje);
//            anadirEvaluado(tecnico);
//            this.evaluaciones.add(puntaje);
        GestorArchPuntajes gestor = new GestorArchPuntajes();
        gestor.guardarPuntajes(tecnico);
    }

    public int cantidadTecnicosEvaluados() {
        return this.evaluados.size();
    }

    /**
     *
     * @return tipo String
     */
    public String toStringDir() {
        return " " + super.id_persona + " , " + super.direccion.toString();
    }

    @Override
    public String toString() {
        return " " + super.id_persona + " , " + super.nombre + " , " + super.ap_paterno + " , " + super.ap_materno + " , " + tipoPerfil + " , " + user + " , " + password + " , " + correo + " , " + super.celular + " , " + super.telefono + " , " + dirFotoPerfil + " ";
    }

    @Override
    public int getId_persona() {
        return super.getId_persona(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.user);
        hash = 89 * hash + Objects.hashCode(this.password);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    public int cantidadTecnicoEvaluado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
