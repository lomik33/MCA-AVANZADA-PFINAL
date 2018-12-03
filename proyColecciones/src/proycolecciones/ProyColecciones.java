/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycolecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author CoreMac
 */
public class ProyColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//
//            List<String> ml= new ArrayList<String>();
//            ml.add("VW");
//            ml.add("Toyota");
//            ml.add("Ford");
//            System.out.println(ml.get(1));
//
//            for(String dato:ml)
//                System.out.println(dato);
//
//            Set<String> mc= new HashSet<String>();
//            mc.add("VW");
//            mc.add("Toyota");
//            mc.add("Ford");
//                    mc.add("VW");
//
//            System.out.println("Conjuntos");
//
//            for(String dato:ml)
//                System.out.println(dato);
//
//            Map<String, String> map = new HashMap<>();
//            map.put("XYZ","Dodge");
//            map.put("Y1A","Aveo");
//            map.put("XBC","Toyota");
//
//            System.out.println(map.get("XBC"));

        ProyColecciones m = new ProyColecciones();
        List<Escuela> listaEscuelas = m.cargarInformacion();
        Set<String> localidades = new HashSet<String>();
        for (Escuela escuela : listaEscuelas) {
            localidades.add(escuela.getLocalidad());
        }
        System.out.println("Localidades:" + localidades.size());
        Map<String, Integer> mapaDocentesHombres = new HashMap<String, Integer>();
        Map<String, Integer> mapaDocentesMujeres = new HashMap<String, Integer>();
        Map<String, Integer> mapaAlumnosMujeres = new HashMap<String, Integer>();
        Map<String, Integer> mapaAlumnosHombres = new HashMap<String, Integer>();

        for (String localidad : localidades) {
           // System.out.println(localidad);
            int docentesMujeres = 0;
            int docentesHombres = 0;
            int alumnosHombres = 0;
            int alumnosMujeres = 0;

            for (Escuela escuela : listaEscuelas) {
                if (escuela.getLocalidad().equals(localidad)) {
                    docentesMujeres += escuela.getDocentesMujeres();
                    docentesHombres += escuela.getDocentesHombres();
                    alumnosHombres += escuela.getAlumnosHombres();
                    alumnosMujeres += escuela.getAlumnosMujeres();

                }
            }
            mapaDocentesMujeres.put(localidad, docentesMujeres);
            mapaDocentesHombres.put(localidad, docentesHombres);

            mapaAlumnosHombres.put(localidad, alumnosHombres);
            mapaAlumnosMujeres.put(localidad, alumnosMujeres);

        }
//        System.out.println("Docentes Mujeres");
//        for (String va : mapaDocentesMujeres.keySet()) {
//            System.out.println(va + ":" + mapaDocentesMujeres.get(va));
//        }
//
//        System.out.println("Docentes Hombres");
//        for (String va : mapaDocentesHombres.keySet()) {
//            System.out.println(va + ":" + mapaDocentesHombres.get(va));
//        }
//
//        System.out.println("Alumnos Mujeres");
//        for (String va : mapaAlumnosMujeres.keySet()) {
//            System.out.println(va + ":" + mapaAlumnosMujeres.get(va));
//        }
//
//        System.out.println("Alumnos Hombres");
//        for (String va : mapaAlumnosHombres.keySet()) {
//            System.out.println(va + ":" + mapaAlumnosHombres.get(va));
//        }
//        
//        
//List<Integer> numeros=s.stream()
//                .map(x->Integer.parseInt(x))
//                .map(x->x*x)
//                .filter(x->x<100)
//                .collect(Collectors.toList());
//        numeros.forEach(System.out::println);
List<Escuela> escuelasCoatepec=
        listaEscuelas.stream().filter(x->x.getLocalidad().equals("COATEPEC") 
                && x.getDocentesHombres()>5).collect(Collectors.toList());
         escuelasCoatepec.forEach(System.out::println);

    }

    private List<Escuela> cargarInformacion() {

        Path currentRelativePath = Paths.get("");

        String ruta = currentRelativePath.toAbsolutePath().toString()
                + File.separator
                + "src"
                + File.separator;
        String[] misDatos = leerArchivo(ruta + "testData.csv").split(System.lineSeparator());
        Map<String, Escuela> mapa = new HashMap<String, Escuela>();
        Set<Escuela> conjuntoEscuelas = new HashSet<Escuela>();
        List<Escuela> listaEscuelas = new ArrayList<Escuela>();
        for (String registro : misDatos) {
            String[] valores = registro.split(",");
            String localidad = valores[0];
            String clave = valores[1];
            String turno = valores[2];
            String nombre = valores[3];
            int docentesMujeres = Integer.parseInt(valores[9]);
            int docentesHombres = Integer.parseInt(valores[10]);
            int alumnosMujeres = Integer.parseInt(valores[11]);

            int alumnosHombres = Integer.parseInt(valores[12]);

            Escuela escuela = new Escuela(nombre, localidad, clave, turno);
            escuela.setAlumnosHombres(alumnosHombres);
            escuela.setAlumnosMujeres(alumnosMujeres);
            escuela.setDocentesHombres(docentesHombres);
            escuela.setDocentesMujeres(docentesMujeres);
            listaEscuelas.add(escuela);
            if (!conjuntoEscuelas.add(escuela)) {
                mapa.put(clave, escuela);
            }

        }

//          
//          
//          System.out.println("Lista de escuelas");
//          for(Escuela e:listaEscuelas)
//              System.out.println(e);
//          
//          
//          System.out.println("Mapa de escuelas");
//          for(Escuela e:mapa.values())
//              System.out.println(e);
//         
//        
//          System.out.println("Conjunto de escuelas");
//          for(Escuela e:conjuntoEscuelas)
//              System.out.println(e);
        //Reportar cuantas localidades
        //estadisticas de profesores mujeres, hombres, niñas
        return listaEscuelas;

    }

    /**
     * Utilitario para leer un archivo y regresar el contenido en una cadena de
     * texto a partir de una ruta
     *
     * @param ruta
     * @return
     */
    public static String leerArchivo(String ruta) {
        String contenido = "";
        File file = new File(ruta);
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);
                contenido = reader.readLine() + System.lineSeparator();
                String linea = "";
                while ((linea = reader.readLine()) != null) {
                    contenido += linea;
                    contenido += System.lineSeparator();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(ProyColecciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return contenido;
    }

}
