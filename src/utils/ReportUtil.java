/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entidades.Cotizacion;
import entidades.Curso;
import entidades.Producto;
import entidades.ProductoCotizacion;
import interfaz.Desktop;

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


/**
 *
 * @author lomik
 */
public class ReportUtil {
    
    public static void generaReporte(String rutaDirectorio,Cotizacion cotizacion) throws JRException, FileNotFoundException {
        System.out.println(rutaDirectorio);
        
       
        generaReporte(cotizacion);
        
//        JasperReport jasperReport = JasperCompileManager
//                .compileReport(FileUtil.getRutaSrc() + "SampleReport1.jrxml");
//
//        // Parameters for report
//        HashMap<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("Parameter1", "Dr. Juan Manuel ");
//        parameters.put("Parameter2", "");
//        parameters.put("Parameter3", cotizacion.getTotal());
//        parameters.put("Parameter4", "Prueba 4");
//        parameters.put("Parameter5", "Prueba 5");
//        parameters.put("Parameter6", "Prueba 6");
//        parameters.put("Parameter7", "Prueba 7");
//        parameters.put("Parameter8", "2000");
//
//        // DataSource
//        // This is simple example, no database.
//        // then using empty datasource.
//        JRDataSource dataSource = new JREmptyDataSource();
//
//        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
//                parameters, dataSource);
//
//        // Make sure the output directory exists.
//        //String rutaReportes = FileUtil.getRuta() + "reportes" + File.separator;
//        //File outDir = new File(rutaReportes);
//        //outDir.mkdirs();
//
//        // Export to PDF.
//        JasperExportManager.exportReportToPdfFile(jasperPrint,
//                rutaDirectorio + "ejempls.pdf");
//
////       JRDocxExporter exporter = new JRDocxExporter();
////    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));      
////    File exportReportFile = new File(rutaReportes + "ejemplo.docx");
////    exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
////    exporter.exportReport();
//        System.out.println("Done!");
    }
    
    
      public static void generaReporte(Cotizacion cotizacion) throws JRException, FileNotFoundException {
        JasperReport jasperReport = JasperCompileManager
                .compileReport(FileUtil.getRutaSrc() + "SampleReport1.jrxml");
        
        
        
        String productos="";
        String total = "";
        
        for(ProductoCotizacion pc:cotizacion.getItems()){
            productos+=pc.toString()+System.lineSeparator();
        }
        // Parameters for report}
        HashMap<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("Parameter1", cotizacion.getFecha().toString());
        parameters.put("Parameter2", cotizacion.getCliente().toString());
        parameters.put("Parameter3", productos);
        parameters.put("Parameter4", "cotizacion.getTotal()");
       

        // DataSource
        // This is simple example, no database.
        // then using empty datasource.
        JRDataSource dataSource = new JREmptyDataSource();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                parameters, dataSource);

        // Make sure the output directory exists.
        String rutaReportes = FileUtil.getRuta() + "reportes" + File.separator;
        File outDir = new File(rutaReportes);
        outDir.mkdirs();

        // Export to PDF.
        JasperExportManager.exportReportToPdfFile(jasperPrint,
                rutaReportes + "ejempls.pdf");

       JRDocxExporter exporter = new JRDocxExporter();
    exporter.setExporterInput(new SimpleExporterInput(jasperPrint));      
    File exportReportFile = new File(rutaReportes + "ejemplo.docx");
    exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
    exporter.exportReport();
        System.out.println("Done!");
    }
}
