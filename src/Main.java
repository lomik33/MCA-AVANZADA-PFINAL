
import entidades.Producto;
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
         Configuration configuration = new Configuration();
        configuration.configure();
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
            configuration.getProperties()).build();
        SessionFactory factory= configuration.buildSessionFactory(serviceRegistry);
        
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Producto producto= new Producto();
        //producto.setId(1);
        producto.setClave("P001");
        producto.setNombre("Coca-Cola");
        producto.setDescripcion("600 ml");
        producto.setPrecioUnitario(10);
        producto.setPrecioUnitarioUsd(0);
        producto.setTasaIva(16);
        producto.setIva(1);
        session.persist(producto);
        tx.commit();
        session.close();
        
    }
}
