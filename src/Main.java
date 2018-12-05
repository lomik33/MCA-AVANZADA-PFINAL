
import entidades.Curso;
import entidades.Producto;
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

    public static void main(String args[]) throws JRException, FileNotFoundException {

        //Main m = new Main();
        //m.generaReporte();
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });

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

  

}
