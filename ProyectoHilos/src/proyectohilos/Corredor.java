/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CoreMac
 */
public class Corredor implements Runnable {
    
    private String carrera;
    
    private char corredor;
    
    private long tiempo;
    
    public Corredor(char corredor){
        this.corredor=corredor;
        this.carrera="";
        tiempo=(long)Math.random()*500+300;
    }
    
    public void corre() throws InterruptedException{
        carrera+=corredor;
        System.out.println(carrera);
        Thread.sleep(tiempo);
    }

    @Override
    public void run() {

        for(int i=0;i<50;i++){
            try {
                corre();
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
