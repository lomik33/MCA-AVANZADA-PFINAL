/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohilos;

/**
 *
 * @author CoreMac
 */
public class ProyectoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Corredor a= new Corredor('a');
        Corredor b= new Corredor('b');
        Thread ta= new Thread(a);
        Thread tb= new Thread(b);
        ta.start();
        tb.start();
       
        
    }
    
}
