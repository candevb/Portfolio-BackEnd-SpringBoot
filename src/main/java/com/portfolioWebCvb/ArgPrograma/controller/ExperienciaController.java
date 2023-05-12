package com.portfolioWebCvb.ArgPrograma.controller;

import com.portfolioWebCvb.ArgPrograma.model.Experiencia;
import com.portfolioWebCvb.ArgPrograma.service.IExperienciaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/experiencia")
public class ExperienciaController {

    @Autowired
    private IExperienciaService expeServ;
    
  
    @PostMapping("/new")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expeServ.verExperiencia();
    }

    @DeleteMapping("/delete/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }
    
    @PutMapping("/modificar")
    public void modificarExperiencia(@RequestBody Experiencia exp){
        expeServ.modificarExperiencia(exp);
    }    
    

}
