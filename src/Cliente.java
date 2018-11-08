/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 enum TipoCliente{empresa, escuela, gobierno, particular}
/**
 *
 * @author CoreMac
 */
public class Cliente {
   private String nombre;
   private String RFC;
   private String direccion;
   private TipoCliente tipoCliente;

    public String getNombre() {
        return nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
  
}
