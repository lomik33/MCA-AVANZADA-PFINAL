package entidades;


import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CoreMac
 */
public class Curso extends Producto   {
    
    private LocalDateTime fechainicio;
    private LocalDateTime fechafin;
    private int cupo;
    private String horario;

    public LocalDateTime getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDateTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDateTime getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDateTime fechafin) {
        this.fechafin = fechafin;
    }

   
    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
