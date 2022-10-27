/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PrimerExamen.service;

import com.example.PrimerExamen.entity.cantante;
import com.example.PrimerExamen.repository.cantanteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Alonso
 */
public class cantanteService implements iCantanteService{
    @Autowired
    private cantanteRepository cantanteRepository;
    @Override
    public List<cantante> getALLCantante(){
        return (List<cantante>)cantanteRepository.findAll();
    }
    @Override
    public void saveCantante(cantante cantante){
        cantanteRepository.save(cantante);
    }
    @Override
    public void delete(long id){
        cantanteRepository.deleteById(id);
    }

    @Override
    public cantante getCantanteBylId(long idCantante) {
        return cantanteRepository.findById(id).orElse(null);
    }

}
