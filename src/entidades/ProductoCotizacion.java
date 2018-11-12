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
   private int precioUnitario;
   
   
   /**
    * Precio unitario en dolares
    */
   private int precioUnitarioUsd;
   /**
    * Tasa de Iva 0,16
    */
   
   private TipoIva tasa;
   
   
   /**
    * Relacion conb producto
    */
   private Producto producto;
   

    
}
