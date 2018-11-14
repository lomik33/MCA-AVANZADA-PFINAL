
import entidades.Curso;
import entidades.Producto;
import entidades.TipoIva;
import java.time.LocalDateTime;
import managers.ProductoManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CoreMac
 */
public class Main {
    
    
    public static void  main(String args[]){

        ProductoManager manager= new ProductoManager();        
        
        //Producto producto= new Producto();
Curso producto= new Curso();        
//producto.setId(1);
        producto.setClave("P003");
        producto.setNombre("Fanta");
        producto.setDescripcion("600 ml");
        producto.setPrecioUnitario(10);
        producto.setPrecioUnitarioUsd(0);
        producto.setTasa(TipoIva.TASA16);
        producto.setIva(1);
        producto.setFechainicio(LocalDateTime.now());
        producto.setFechafin(LocalDateTime.now());
        producto.setCupo(30);
        producto.setHorario("horarioo");
        manager.toSave(producto);
        
    }
}
