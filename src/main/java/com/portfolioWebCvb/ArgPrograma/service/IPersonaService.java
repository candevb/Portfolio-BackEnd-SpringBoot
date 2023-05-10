package com.portfolioWebCvb.ArgPrograma.service;

import com.portfolioWebCvb.ArgPrograma.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public Persona verPersona();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);    

    public void modificarPersona(Persona per);

   
    
}
