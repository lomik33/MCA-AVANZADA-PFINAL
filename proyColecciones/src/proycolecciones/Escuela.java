/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycolecciones;

/**
 *
 * @author CoreMac
 */
public class Escuela {
    
    private String nombre;
    private String localidad;
    private String clave;
    private String turno;
    private int docentesHombres;
    private int docentesMujeres;
    
    private int alumnosMujeres;
    private int alumnosHombres;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTurno() {
        return turno;
    }

    

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Escuela(String nombre, String localidad, String clave, String turno) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.clave = clave;
        this.turno = turno;
    }
    
   
    public boolean equals(Object o){
        Escuela e= null;
        boolean r =false;
        if(o instanceof Escuela){
            e=(Escuela) o;
            r=e.getClave().equals(this.getClave());
        }
        return r;
    }
    
    
    public int hashCode(){
        return this.getClave().hashCode();
    }

    public int getDocentesHombres() {
        return docentesHombres;
    }

    public void setDocentesHombres(int docentesHombres) {
        this.docentesHombres = docentesHombres;
    }

    public int getDocentesMujeres() {
        return docentesMujeres;
    }

    public void setDocentesMujeres(int docentesMujeres) {
        this.docentesMujeres = docentesMujeres;
    }

    public int getAlumnosMujeres() {
        return alumnosMujeres;
    }

    public void setAlumnosMujeres(int alumnosMujeres) {
        this.alumnosMujeres = alumnosMujeres;
    }

    public int getAlumnosHombres() {
        return alumnosHombres;
    }

    public void setAlumnosHombres(int alumnosHombres) {
        this.alumnosHombres = alumnosHombres;
    }

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", localidad=" + localidad + ", clave=" + clave + ", turno=" + turno + ", docentesHombres=" + docentesHombres + ", docentesMujeres=" + docentesMujeres + ", alumnosMujeres=" + alumnosMujeres + ", alumnosHombres=" + alumnosHombres + '}';
    }
    
    
    
    
}
