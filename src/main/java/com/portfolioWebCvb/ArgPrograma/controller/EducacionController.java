package com.portfolioWebCvb.ArgPrograma.controller;

import com.portfolioWebCvb.ArgPrograma.model.Educacion;
import com.portfolioWebCvb.ArgPrograma.service.IEducacionService;

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
@CrossOrigin(origins = {"*"})
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired
     private IEducacionService eduServ;
    
     @PostMapping("/new")
    public void agregarEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
        
    
    @DeleteMapping("/delete/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping("/modificar")
    public void modificarEducacion(@RequestBody Educacion edu){
        eduServ.modificarEducacion(edu);
    }
    
}
