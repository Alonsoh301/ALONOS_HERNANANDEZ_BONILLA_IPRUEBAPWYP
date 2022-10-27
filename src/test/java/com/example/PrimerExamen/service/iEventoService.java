package com.example.PrimerExamen.service;
import com.example.PrimerExamen.entity.evento;
import java.util.List;
/**
 *
 * @author Alonso
 */
public interface iEventoService {
    public List<evento> getALLEvento();
    public evento getEventoBylId(long idEvento);
    public void saveEvento(evento evento);
    public void delete(long idEvento);
}
