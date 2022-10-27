package com.example.PrimerExamen.service;
import com.example.PrimerExamen.entity.cantante;
import com.example.PrimerExamen.entity.evento;
import java.util.List;
/**
 *
 * @author Alonso
 */
public interface iCantanteService {
    public List<cantante> getALLCantante();
    public cantante getCantanteBylId(long idCantante);
    public void saveCantante(cantante cantante);
    public void delete(long idCantante);
}
