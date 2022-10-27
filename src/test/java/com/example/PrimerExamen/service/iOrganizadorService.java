package com.example.PrimerExamen.Service;
import com.example.PrimerExamen.entity.organizadorDelEvento;
import java.util.List;
/**
 *
 * @author Alonso
 */
public interface iOrganizadorService {
    public List<organizadorDelEvento> getALLorganizador();
    public organizadorDelEvento getOrganizadorBylId(int idOrganizador);
    public void saveOrganizador(organizadorDelEvento organizadorDelEvento);
    public void delete(int idOrganizador);
}
