package com.portfolioWebCvb.ArgPrograma.service;

import com.portfolioWebCvb.ArgPrograma.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion buscarEducacion(Long id);    

    public void modificarEducacion(Educacion edu);

    
    
}
