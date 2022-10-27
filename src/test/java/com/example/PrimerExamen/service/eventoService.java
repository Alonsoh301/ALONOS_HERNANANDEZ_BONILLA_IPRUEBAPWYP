/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PrimerExamen.service;

import com.example.PrimerExamen.entity.evento;
import com.example.PrimerExamen.repository.organizadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alonso
 */
public class eventoService {
    @Autowired
    private organizadorRepository organizadorRepository;
    @Override
    public List<evento> getALLPersona(){
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
