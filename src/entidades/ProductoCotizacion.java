/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author CoreMac
 */
public class ProductoCotizacion  {
    
    private int id;
  
   /*  
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

    public boolean isAplicaUsd() {
        return aplicaUsd;
    }

    public void setAplicaUsd(boolean aplicaUsd) {
        this.aplicaUsd = aplicaUsd;
    }
   
   private boolean aplicaUsd;
   /**
    * Precio unitario en dolares
    */
   private double precioUnitarioUsd;
   /**
    * Tasa de Iva 0,16
    */
   
   private double tipoCambio;
   
   private double cantidad;
   
   private double subtotal;
     
   private double impuesto;
   
   private double importe;
   
   private Cotizacion cotizacion;

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

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }
   


    
}
