/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entidades.Cotizacion;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author lomik
 */
public class CotizacionManager implements Repository<Cotizacion> {

    @Override
    public int toSave(Cotizacion entity) {
       int centinela=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(entity);        
        tx.commit();
        centinela=entity.getId();
        session.close();
        return centinela;    }

    @Override
    public List<Cotizacion> toSelect() {
       Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT e FROM Cotizacion e");
        List<Cotizacion> items = query.list();
        session.close();
        return items;
    }

    @Override
    public Cotizacion toSelect(int id) {
       Cotizacion centinela=null;
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT p FROM Cotizacion p where p.id="+id);
        List<Cotizacion> items = query.list();
        if(!items.isEmpty())
            centinela=items.get(0);
        session.close();
        return centinela;
    }
    
    
    
    public static void main(String []args){
        CotizacionManager manager= new CotizacionManager();
        
        for(Cotizacion c:manager.toSelect())
            System.out.println(c);
    }
    
}
