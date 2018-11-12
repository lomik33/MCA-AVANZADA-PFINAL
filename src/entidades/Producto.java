package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CoreMac
 */
public class Producto {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTasaIva() {
        return tasaIva;
    }

    public void setTasaIva(int tasaIva) {
        this.tasaIva = tasaIva;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getPrecioUnitarioUsd() {
        return precioUnitarioUsd;
    }

    public void setPrecioUnitarioUsd(int precioUnitarioUsd) {
        this.precioUnitarioUsd = precioUnitarioUsd;
    }
   
    /**
     * Id
     */
    private int id;
    /**
     * Clave para efectos internos del sistema
     */
   private String clave;
   /***
    * Nombre del producto
    */
   private String nombre;
   /**
    * Descripcion detallada del producto
    */
   private String descripcion;
  
   /***
    * precioUnitario del producto
    */
   
   private int precioUnitario;
   
   
   
   /**
    * Precio unitario en dolares
    */
   private int precioUnitarioUsd;
   /**
    * Tasa de Iva 0,16
    */
   
   private int tasaIva;
   
   
     /**
    * Valor del IVA
    */
   private int iva;
 
   
    
}
