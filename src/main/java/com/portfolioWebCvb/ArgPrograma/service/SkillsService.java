package com.portfolioWebCvb.ArgPrograma.service;

import com.portfolioWebCvb.ArgPrograma.model.Skills;
import com.portfolioWebCvb.ArgPrograma.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService{
    
    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void crearSkill(Skills ski) {
        skillsRepo.save(ski);
    }

    @Override
    public void borrarSkill(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkill(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarSkill(Skills ski) {
        skillsRepo.save(ski);
    }

   
    
    
}
