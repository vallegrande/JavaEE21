/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ZERO
 */
public class CuotaModel {
   private int IDcuota;
   private int CantidadCuota;
   private int MontoCuota;
   private String EstadoCuota;
   private Date FechaCuota;
   private int FKpersona;
   private int FKActividad;
   private String NombrePersona;
   private String NombreActividad;
    public int getIDcuota() {
        return IDcuota;
    }

    public void setIDcuota(int IDcuota) {
        this.IDcuota = IDcuota;
    }

    public int getCantidadCuota() {
        return CantidadCuota;
    }

    public void setCantidadCuota(int CantidadCuota) {
        this.CantidadCuota = CantidadCuota;
    }

    public int getMontoCuota() {
        return MontoCuota;
    }

    public void setMontoCuota(int MontoCuota) {
        this.MontoCuota = MontoCuota;
    }

    public String getEstadoCuota() {
        return EstadoCuota;
    }

    public void setEstadoCuota(String EstadoCuota) {
        this.EstadoCuota = EstadoCuota;
    }

    public Date getFechaCuota() {
        return FechaCuota;
    }

    public void setFechaCuota(Date FechaCuota) {
        this.FechaCuota = FechaCuota;
    }

    public int getFKpersona() {
        return FKpersona;
    }

    public void setFKpersona(int FKpersona) {
        this.FKpersona = FKpersona;
    }

    public int getFKActividad() {
        return FKActividad;
    }

    public void setFKActividad(int FKActividad) {
        this.FKActividad = FKActividad;
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public String getNombreActividad() {
        return NombreActividad;
    }

    public void setNombreActividad(String NombreActividad) {
        this.NombreActividad = NombreActividad;
    }

    
   
   
}
