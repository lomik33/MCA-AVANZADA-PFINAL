/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import com.opencsv.CSVReader;
import entidades.Producto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.FileUtil;

/**
 *
 * @author CoreMac
 */
public class ProductoManager implements Repository<Producto> {
    
    @Override
    public int toSave(Producto producto){
        int centinela=0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(producto);        
        tx.commit();
        centinela=producto.getId();
        session.close();
        return centinela;
        
    }
    
    @Override
    public List<Producto> toSelect(){
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT p FROM Producto p");
        List<Producto> productos = query.list();
           session.close();
        return productos;
    }
    
    
    @Override
    public Producto toSelect(int id){
        Producto centinela=null;
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT p FROM Producto p where p.id="+id);
        List<Producto> productos = query.list();
        if(!productos.isEmpty())
            centinela=productos.get(0);
        session.close();
        return centinela;
    }
    
        public Producto toSelect(String clave){
        Producto centinela=null;
        Session session = HibernateUtil.getSessionFactory().openSession();        
        Query query;
        query = session.createQuery("SELECT p FROM Producto p where p.clave='"+clave+"'");
        List<Producto> productos = query.list();
        if(!productos.isEmpty())
            centinela=productos.get(0);
           session.close();
        return centinela;
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
        Set<String> set= new HashSet<>();     
        ProductoManager manager= new ProductoManager();
        for(String[] line:records){  
              if(line!=null &&line.length>=6){
            Producto item= new Producto(line[0], line[1], line[2],Double.parseDouble(line[3]) ,Double.parseDouble(line[4]), Double.parseDouble(line[5]), Boolean.parseBoolean(line[6]));
            Producto existe=manager.toSelect(item.getClave());
            //Si la clave ya esta registrada entonces se actualiza la informacion en caso de que se desee editar un registro
            if(existe!=null)
                item.setId(existe.getId());
            if(manager.toSave(item)>0)
            {
                countImportados++;
                System.out.println("Importado o actualizado correctamente "+item);
            }         
          }
            
        }   
        return countImportados;
    }
    
      
      public static void main(String []args) throws IOException{
          File file= new File(FileUtil.getRutaSrc()+"Catalogo_Productos.csv");
          System.out.println("Productos importados: "+ProductoManager.importarCsv(file));
          
      }
}
