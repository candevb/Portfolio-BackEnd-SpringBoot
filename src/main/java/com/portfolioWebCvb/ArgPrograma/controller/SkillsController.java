package com.portfolioWebCvb.ArgPrograma.controller;

import com.portfolioWebCvb.ArgPrograma.model.Skills;
import com.portfolioWebCvb.ArgPrograma.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://portfolio-frontend-cvb.web.app", "http://localhost:4200/"})
@RequestMapping("/skills")
public class SkillsController {
    
    @Autowired
    private ISkillsService skillsServ;
    
    @PostMapping("/new")
    public void agregarSkill(@RequestBody Skills skil) {
        skillsServ.crearSkill(skil);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Skills> verSkills() {
        return skillsServ.verSkills();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarSkill(@PathVariable Long id) {
        skillsServ.borrarSkill(id);
    }
    
    @PutMapping("/modificar")
    public void modificarSkill(@RequestBody Skills ski){
        skillsServ.modificarSkill(ski);
    }
    
    
}
