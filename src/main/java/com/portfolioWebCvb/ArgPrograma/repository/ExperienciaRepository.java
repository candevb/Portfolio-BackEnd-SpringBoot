package com.portfolioWebCvb.ArgPrograma.repository;

import com.portfolioWebCvb.ArgPrograma.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{

    public boolean existsById(int id);
    
}
