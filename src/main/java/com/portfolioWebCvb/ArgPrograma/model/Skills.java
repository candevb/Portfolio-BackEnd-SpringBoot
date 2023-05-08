package com.portfolioWebCvb.ArgPrograma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String hard;
    private String soft;
    
    public Skills(){
        
    }

    public Skills(String hard, String soft) {
        this.hard = hard;
        this.soft = soft;
    }
    
    
    
}
