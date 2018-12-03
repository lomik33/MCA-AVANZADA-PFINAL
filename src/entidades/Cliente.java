package entidades;


import entidades.TipoCliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author CoreMac
 */
public class Cliente {
    
   private int id;
   private String nombre;
   private String rfc;
   private String direccion;

    public String getNombre() {
        return nombre;
    }

    public String getRFC() {
        return rfc;
    }

    public String getDireccion() {
        return direccion;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
  
    
}
