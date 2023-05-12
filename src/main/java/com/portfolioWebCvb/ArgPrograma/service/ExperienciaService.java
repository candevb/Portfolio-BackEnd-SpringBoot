package com.portfolioWebCvb.ArgPrograma.service;
import com.portfolioWebCvb.ArgPrograma.model.Experiencia;
import com.portfolioWebCvb.ArgPrograma.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia exp) {
        expeRepo.save(exp);

    }

   

}
