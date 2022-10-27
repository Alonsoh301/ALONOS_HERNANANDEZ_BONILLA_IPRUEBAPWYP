package com.example.PrimerExamen.Service;
import com.example.PrimerExamen.entity.organizadorDelEvento;
import java.util.List;
/**
 *
 * @author Alonso
 */
public interface iOrganizadorService {
    public List<organizadorDelEvento> getALLorganizador();
    public organizadorDelEvento getOrganizadorBylId(long idOrganizador);
    public void saveOrganizador(organizadorDelEvento organizadorDelEvento);
    public void delete(long idOrganizador);
}
