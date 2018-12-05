package entidades;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

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
        this.items= new HashSet<ProductoCotizacion>();
    }   
    
    private LocalDateTime fecha;
   

    public LocalDateTime getFecha() {
        return fecha;
    }

  
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

  
    
    private double total;
    private double subTotal;
    private double impuestos;
    private String clave;
    private int id;
    private Cliente cliente;

    public Set getItems() {
        return items;
    }

    public void setItems(Set items) {
        this.items = items;
    }
    private Set<ProductoCotizacion> items;
    

    public Cotizacion(LocalDateTime fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "fecha=" + fecha + ", total=" + total + ", subTotal=" + subTotal + ", impuestos=" + impuestos + ", clave=" + clave + ", id=" + id + ", cliente=" + cliente + ", items=" + items + '}';
    }
    
    
    public void agregarProducto(ProductoCotizacion producto){
        this.items.add(producto);
    }
    
}
