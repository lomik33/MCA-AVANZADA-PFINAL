/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lomik
 */
public class ClienteManager implements Repository<Cliente> {
    
       @Override
    public int toSave(Cliente entity){
        int centinela=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(entity);        
        tx.commit();
        centinela=entity.getId();
        session.close();
        return centinela;
        
    }
    
    @Override
    public List<Cliente> toSelect(){
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT e FROM Cliente e");
        List<Cliente> items = query.list();
        return items;
    }
    
}
