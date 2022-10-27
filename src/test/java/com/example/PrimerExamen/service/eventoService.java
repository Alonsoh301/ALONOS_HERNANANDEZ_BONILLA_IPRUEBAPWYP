/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PrimerExamen.service;

import com.example.PrimerExamen.entity.evento;
import com.example.PrimerExamen.repository.eventoRepository;
import com.example.PrimerExamen.repository.organizadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alonso
 */
public class eventoService implements iEventoServise{
    @Autowired
    private eventoRepository eventoRepository;
    @Override
    public List<evento> getALLEvento(){
        return (List<evento>)eventoRepository.findAll();
    }
    @Override
    public void saveEvento(evento organizador){
        eventoRepository.save(evento);
    }
    @Override
    public void delete(long id){
        eventoRepository.deleteById(idEvento);
    }

    @Override
    public evento getEventoBylId(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

}
