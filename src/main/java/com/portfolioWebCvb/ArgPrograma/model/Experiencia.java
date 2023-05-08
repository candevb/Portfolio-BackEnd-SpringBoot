package com.portfolioWebCvb.ArgPrograma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String posicion;
    private String descripcion;
    private String inicio;
    private String fin;
    
    public Experiencia(){
    };

    public Experiencia(Long id, String empresa, String posicion, String descripcion, String inicio, String fin) {
        this.id = id;
        this.empresa = empresa;
        this.posicion = posicion;
        this.descripcion = descripcion;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    
}
