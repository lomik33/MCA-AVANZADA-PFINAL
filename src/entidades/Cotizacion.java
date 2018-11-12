package entidades;


import entidades.Producto;
import java.time.LocalDateTime;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CoreMac
 */
public class Cotizacion {
    
    public Cotizacion(){
        
    }
    
    
    private LocalDateTime fecha;
    //cambio camilo 2
    
//    private List<Producto> items;

    public LocalDateTime getFecha() {
        return fecha;
    }

  //  public List<Producto> getItems() {
   //     return items;
   // }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

   // public void setItems(List<Producto> items) {
    //    this.items = items;
    //}
    
    private double total;
    private String clave;
    private int id;
    private Cliente cliente;
    
    
}
