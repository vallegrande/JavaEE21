/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import dao.CuotaImpl;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelo.CuotaModel;

/**
 *
 * @author ZERO
 */
@Named(value = "cuotaC")
@SessionScoped
public class CuotaC implements Serializable {

   private CuotaModel cuot;
    private CuotaImpl dao;
    private List<CuotaModel> listadoCuot;
    
    public CuotaC() {
        cuot = new CuotaModel();
        dao = new CuotaImpl();
    }
    public void registrar() throws Exception {
        try {
            System.out.println(cuot);
            dao.registrar(cuot);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", "Modificado con éxito"));
            limpiar();
            listar();
        } catch (Exception e) {
            System.out.println("Error en registrarC " + e.getMessage());
        }
    }

    public void modificar() throws Exception {
        try {
            dao.modificar(cuot);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", "Modificado con éxito"));
            limpiar();
            listar();
        } catch (Exception e) {
            System.out.println("Error en modificarC " + e.getMessage());
        }
    }

    public void eliminar() throws Exception {
        try {
            dao.eliminar(cuot);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "OK", "Eliminado con éxito"));
            limpiar();
            listar();
        } catch (Exception e) {
            System.out.println("Error en eliminarC " + e.getMessage());
        }
    }
    
    public void limpiar() {
        cuot = new CuotaModel();
    }

    public void listar() {
        try {
            listadoCuot = dao.listarTodos();
        } catch (Exception e) {
            System.out.println("Error en listarC " + e.getMessage());
        }
    }
    
    public void obtenerCuota() throws Exception{
        
        try {
            if (cuot.getFKActividad()>0) {
               cuot.setCantidadCuota(dao.obtenerSaldoCuota(cuot.getFKActividad(),cuot.getFKpersona())); 
               
            }
        } catch (Exception e) {
            System.out.println("Error en obtener cuota " + e.getMessage());
        }
      
    }
    
    //Metodos Generados
    public CuotaModel getCuot() {
        return cuot;
    }

    public void setCuot(CuotaModel cuot) {
        this.cuot = cuot;
    }

    public CuotaImpl getDao() {
        return dao;
    }

    public void setDao(CuotaImpl dao) {
        this.dao = dao;
    }

    public List<CuotaModel> getListadoCuot() {
        return listadoCuot;
    }

    public void setListadoCuot(List<CuotaModel> listadoCuot) {
        this.listadoCuot = listadoCuot;
    }
    
}
