package TechnicalFace;

import Datos.GestorArchPuntajes;
import java.util.*;
 /**
 * Esta clase representa al usuario que se va utilizar la app para buscar y evaluar a tecnicos y es hija de la clase Persona
 * atributos:
 *          -tipoPerfil : Representa diferenciacion entre tres perfiles admin, Usuario y Tecnico el cual cada uno tendra
 *          -user: Representa el nombre de usuario por el cual va logearse 
 *          -password: Representa la contraseña por el cual va logearse el usuario
 *          -dirFotoPerfil: Representa la direccion donde se encuentra la foto de perfil de un usuario
 *          -correo:: es el correo de un usuario
 * @author Gustavo Huerta
 */
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
     * @param user es de tipo String 
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
    /**
     * 
     * @return el ArrayList de Tecnico evaluados
     */
    public ArrayList<Tecnico> getEvaluados() {
        return evaluados;
    }
    /**
     * 
     *  @param evaluados es un ArrayList de Tecnicos evaluados
     */
    public void setEvaluados(ArrayList<Tecnico> evaluados) {
        this.evaluados = evaluados;
    }

    /**
     * ESte metodo añade un tecnico evaluado por un usuario
     * @param tecnico es te tipo Tecnico y representa el Tecnico evaluado
     */
    public void anadirEvaluado(Tecnico tecnico) {
        this.evaluados.add(tecnico);
    }

    /**
     * ESte metodo obtiene un Tecnico 
     * @param i : index de posicion dentro del arraylist evaluados
     * @return un evaluado de tipo Tecnico si el index dentro tamaño del ArrayList si no una exception 
     */
    public Tecnico getEvaluado(int i) {
        return this.evaluados.get(i);
    }
    /**
     * ESte metodo sirve para guardar los tecnicos evaluados atraves de la clase GestorArchPuntajes con el metodo guardarTecnicosEvaluados
     */
    public void grabarTecnicosEvaluados() {
        GestorArchPuntajes gestor = new GestorArchPuntajes();
        gestor.guardarTecnicosEvaluados(this);
    }

    /**
     * Este metodo se utiliza para ingresar una evaluacion hecha por el usuario a un tecnico espefico 
     * @param tecnico es de tipo Tecnico y es el tecnico que se evalua
     * @param puntaje es te puntaje o nota que se le ingresa al tecnico
     */
    public void ingresarEvaluacion(Tecnico tecnico, Evaluacion puntaje) {
        tecnico.ingresarNotaConfianza(puntaje);
        GestorArchPuntajes gestor = new GestorArchPuntajes();
        gestor.guardarPuntajes(tecnico);
    }
    /**
     * Este retorna un String de la direccion de un Usuario y es la contatenacion de la id_persona del usuario con el to String de su direccion
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
    /**
     * Retorna la cantidad de evaluados existente en el ArrayList evaluados
     * @return es de tipo int 
     */
    public int cantidadTecnicoEvaluado() {
        return this.evaluados.size();
    }
    
    
}
