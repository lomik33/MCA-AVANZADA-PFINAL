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
   private double iva;
 
  
   
   /**
    * Tasa de Iva 0,16
    */
   
   private TipoIva tasa;

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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public TipoIva getTasa() {
        return tasa;
    }

    public void setTasa(TipoIva tasa) {
        this.tasa = tasa;
    }

  
   
   
   
   
    
}
