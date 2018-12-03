
import entidades.Curso;
import entidades.Producto;
import entidades.TipoIva;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.HashMap;
import managers.ProductoManager;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Map;
import org.hibernate.service.ServiceRegistry;
import utils.FileUtil;

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
    
    
    public static void  main(String args[]) throws JRException, FileNotFoundException{

        Main m= new Main();
        m.generaReporte();

        //Producto producto= new Producto();
////       Curso producto= new Curso();        
////producto.setId(1);
////        producto.setClave("P003");
////        producto.setNombre("Fanta");
////        producto.setDescripcion("600 ml");
////        producto.setPrecioUnitario(10);
////        producto.setPrecioUnitarioUsd(0);
////        producto.setTasa(TipoIva.TASA16);
////        producto.setIva(1);
////        producto.setFechainicio(LocalDateTime.now());
////        producto.setFechafin(LocalDateTime.now());
////        producto.setCupo(30);
////        producto.setHorario("horarioo");
////        manager.toSave(producto);
//// 
//for(Producto p:manager.toSelect())
  //          System.out.println(p.getNombre());
   
    
  
       
    }

    
    
    private void generaReporte() throws JRException, FileNotFoundException{
        JasperReport jasperReport = JasperCompileManager
               .compileReport(FileUtil.getRutaSrc()+"SampleReport.jrxml");
 
       // Parameters for report
       HashMap<String, Object> parameters = new HashMap<String, Object>();
       parameters.put("Parameter1", new String("Dr. Juan Manuel "));
       parameters.put("Parameter2", "Prueba 2");
       parameters.put("Parameter3", "Prueba 3");
       parameters.put("Parameter4", "Prueba 4");
       parameters.put("Parameter5", "Prueba 5");
       parameters.put("Parameter6", "Prueba 6");
       parameters.put("Parameter7", "Prueba 7");
       parameters.put("Parameter8", "2000");
       
 
       // DataSource
       // This is simple example, no database.
       // then using empty datasource.
       JRDataSource dataSource = new JREmptyDataSource();
 
       JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
               parameters, dataSource);
 
    
       // Make sure the output directory exists.
       String rutaReportes=FileUtil.getRuta()+"reportes"+File.separator;
       File outDir = new File(rutaReportes);
       outDir.mkdirs();
 
       // Export to PDF.
       JasperExportManager.exportReportToPdfFile(jasperPrint,
              rutaReportes+"ejempls.pdf");
        
       
       JRDocxExporter exporter = new JRDocxExporter();
    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));      
    File exportReportFile = new File(rutaReportes + "ejemplo.docx");
    exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
    exporter.exportReport();
    
    
       System.out.println("Done!");
    }
    
    }
