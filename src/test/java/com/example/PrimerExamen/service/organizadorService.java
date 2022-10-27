package com.example.PrimerExamen.service;
import com.example.PrimerExamen.repository.organizadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Alonso
 */
public class organizadorService {
    @Autowired
    private organizadorRepository organizadorRepository;
    @Override
    public List<organizador> getALLPersona(){
        return (List<organizador>)organizadorRepository.findAll();
    }
    @Override
    public void saveorganizador(organizador organizador){
        organizadorRepository.save(organizador);
    }
    @Override
    public void delete(long id){
        organizadorRepository.deleteById(id);
    }

    @Override
    public organizador getPersonaBylId(long id) {
        return organizadorRepository.findById(id).orElse(null);
    }

}
