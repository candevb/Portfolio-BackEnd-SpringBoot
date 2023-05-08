package com.portfolioWebCvb.ArgPrograma.service;

import com.portfolioWebCvb.ArgPrograma.model.Skills;
import java.util.List;


public interface ISkillsService {
    
     public List<Skills> verSkills();
    
    public void crearSkill(Skills ski);
    
    public void borrarSkill(Long id);
    
    public Skills buscarSkill(Long id);    

    public void modificarSkill(Skills ski);

    
}
