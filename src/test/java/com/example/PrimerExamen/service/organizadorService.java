package com.example.PrimerExamen.service;
import com.example.PrimerExamen.entity.organizadorDelEvento;
import com.example.PrimerExamen.repository.organizadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Alonso
 */
public class organizadorService implements iOrganizadorService{
    @Autowired
    private organizadorRepository organizadorRepository;
    @Override
    public List<organizadorDelEvento> getALLorganizador(){
        return (List<organizadorDelEvento>)organizadorRepository.findAll();
    }
    @Override
    public void saveorganizador(organizadorDelEvento organizador){
        organizadorRepository.save(organizador);
    }
    @Override
    public void delete(long id){
        organizadorRepository.deleteById(id);
    }

    @Override
    public organizadordelEvento getOrganizadorBylId(long id) {
        return organizadorRepository.findById(id).orElse(null);
    }

}
