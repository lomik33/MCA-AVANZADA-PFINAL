/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author CoreMac
 */
public class ProyectoLambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> s= Arrays.asList("1","2","3","4");
        
        //s.forEach(System.out::println);
        
        List<Integer> numeros=s.stream()
                .map(x->Integer.parseInt(x))
                .map(x->x*x)
                .filter(x->x<100)
                .collect(Collectors.toList());
        numeros.forEach(System.out::println);
    }
    
}
