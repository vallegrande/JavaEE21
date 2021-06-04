package vista;

import java.util.List;
import modelo.ActividadModel;

public interface ICRUDactividad {

    public List<ActividadModel> listarActividad() throws Exception;

    void registrarActividad(ActividadModel actividad) throws Exception;
    
    void modificarActividad(ActividadModel actividad) throws Exception;

    void eliminarActividad(ActividadModel actividad) throws Exception;
}