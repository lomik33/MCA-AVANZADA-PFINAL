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
   private double precioUnitario;
   /**
    * Precio unitario en dolares
    */
   private double precioUnitarioUsd;
   
    /**
    * Valor del IVA
    */
   private double tasaIva;
   
   private boolean aplicaUsd;

    public boolean isAplicaUsd() {
        return aplicaUsd;
    }

    public void setAplicaUsd(boolean aplicaUsd) {
        this.aplicaUsd = aplicaUsd;
    }

    public double getTasaIva() {
        return tasaIva;
    }

    public void setTasaIva(double tasaIva) {
        this.tasaIva = tasaIva;
    }
 
  
  

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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitarioUsd() {
        return precioUnitarioUsd;
    }

    public void setPrecioUnitarioUsd(double precioUnitarioUsd) {
        this.precioUnitarioUsd = precioUnitarioUsd;
    }

   

    public Producto() {
    }

    public Producto(String clave, String nombre, String descripcion, double precioUnitario, double precioUnitarioUsd, double tasaIva, boolean aplicaUsd) {
        this.clave = clave;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.precioUnitarioUsd = precioUnitarioUsd;
        this.tasaIva = tasaIva;
        this.aplicaUsd = aplicaUsd;
    }

    @Override
   public String toString() {
        String regresar = nombre + "("+clave+")"+ " Tasa IVA:"+Double.toString(tasaIva);
        return  regresar;
    }
    
    
    
}
