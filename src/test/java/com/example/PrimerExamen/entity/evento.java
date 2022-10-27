package com.example.PrimerExamen.entity;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Alonso
 */
@Entity
@Table(name = "evento")
public class evento implements Serializable {

    private int idEvento;
    private String nombreEvento;
    private int capacidad;
    private int costo;
    private LocalDate fecha;
    private int idcantante;
    private int idOrganizador;
    @ManyToOne
    @JoinColumn(name = "idCantante")
    private cantante cantanteEvento;
    
    @ManyToOne
    @JoinColumn(name = "idOrganizador")
    private organizadorDelEvento organizadorEvento;

    public int getIdEvento() {
        return idEvento;
    }

    public int getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(int idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public cantante getCantanteEvento() {
        return cantanteEvento;
    }

    public void setCantanteEvento(cantante cantanteEvento) {
        this.cantanteEvento = cantanteEvento;
    }

    public organizadorDelEvento getOrganizadorEvento() {
        return organizadorEvento;
    }

    public void setOrganizadorEvento(organizadorDelEvento organizadorEvento) {
        this.organizadorEvento = organizadorEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdcantante() {
        return idcantante;
    }

    public void setIdcantante(int idcantante) {
        this.idcantante = idcantante;
    }
}
