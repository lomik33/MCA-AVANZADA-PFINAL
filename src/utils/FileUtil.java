/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author CoreMac
 */
public class FileUtil {
    
    /***
     * Devuelve la ruta absoluta del folder del proyecto
     * @return 
     */
    public static String getRuta(){
        Path currentRelativePath = Paths.get("");
        String ruta = currentRelativePath.toAbsolutePath().toString()
                + File.separator;
                 return ruta;       
    }
    
    /*Devue la tura absoluta del folder src del proyecto*/
    public static String getRutaSrc(){
        return getRuta()+ "src"
                + File.separator;
       
    }
    
}
