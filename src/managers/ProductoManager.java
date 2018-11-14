/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entidades.Producto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author CoreMac
 */
public class ProductoManager {
    
    public int toSave(Producto producto){
        int centinela=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(producto);
        
        tx.commit();
        centinela=producto.getId();
        session.close();
        return centinela;
        
    }
    
    public List<Producto> toSelect(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Query query;
        query = session.createQuery("SELECT p FROM Producto p");
        List<Producto> productos = query.list();
        return productos;
    }
    
}
