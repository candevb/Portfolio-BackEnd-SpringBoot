package com.portfolioWebCvb.ArgPrograma.controller;

import com.portfolioWebCvb.ArgPrograma.model.Persona;
import com.portfolioWebCvb.ArgPrograma.service.IPersonaService;
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
@RequestMapping("/personas")
public class PersonaController {
    
   @Autowired
   private IPersonaService persoServ;
    
    @PostMapping("/new")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
        
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public Persona verPersona(){
        return persoServ.verPersona();
    }
    
    
    @DeleteMapping("delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/modificar")
    public void modificarPersona(@RequestBody Persona pers){
        persoServ.modificarPersona(pers);
    }
    
  
    
    
   
}
    
    
    

