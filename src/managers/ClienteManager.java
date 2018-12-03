/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import com.opencsv.CSVReader;
import entidades.Cliente;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.FileUtil;

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
        session.saveOrUpdate(entity);        
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
        session.close();
        return items;
    }
    
     public Cliente toSelect(String rfc){
            Cliente centinela=null;
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT e FROM Cliente e where e.rfc='"+rfc+"'");
        List<Cliente> items = query.list();
         if(!items.isEmpty())
            centinela=items.get(0);
        session.close();
        return centinela;
    }

    @Override
    public Cliente toSelect(int id) {
         Cliente centinela=null;
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT p FROM Cliente p where p.id="+id);
        List<Cliente> items = query.list();
        if(!items.isEmpty())
            centinela=items.get(0);
        session.close();
        return centinela;
    }
    
      public List<Cliente> Search(String cadena){
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT e FROM Cliente e where e.rfc like '%"+cadena+"%' or e.nombre like '%"+cadena+"%'");
        List<Cliente> items = query.list();
        session.close();
        return items;
    }
      
         /***
     * Importar el archivo csv en base a la base de datos
     * @param origenDatos
     * @return 
     * @throws FileNotFoundException
     * @throws IOException 
     */
      public static int importarCsv(File origenDatos) throws FileNotFoundException, IOException {
        int countImportados=0;
        // Codifique aquí
        CSVReader reader = new CSVReader(new FileReader(origenDatos));
        // Crea un CSVReader de un
        reader.readNext(); // Avanza una línea que es el encabezado
       List<String[]> records = reader.readAll();      
        ClienteManager manager= new ClienteManager();
        for(String[] line:records){            
            Cliente item= new Cliente(line[0], line[1], line[2]);
            Cliente existe=manager.toSelect(item.getRfc());
            //Si la clave ya esta registrada entonces se actualiza la informacion en caso de que se desee editar un registro
            if(existe!=null)
                item.setId(existe.getId());
            if(manager.toSave(item)>0)
            {
                countImportados++;
                System.out.println("Importados o actualizado correctamente "+item);
            }          
            
        }   
        return countImportados;
    }
    
      
      public static void main(String []args) throws IOException{
          File file= new File(FileUtil.getRutaSrc()+"Catalogo_Clientes.csv");
          System.out.println("Clientes importados: "+ClienteManager.importarCsv(file));
          
      }
    
}
