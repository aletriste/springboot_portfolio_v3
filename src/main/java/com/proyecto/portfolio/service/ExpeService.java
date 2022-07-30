
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Expe;
import com.proyecto.portfolio.repository.ExpeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpeService implements IExpeService {
    @Autowired
    ExpeRepository expeRepo;
    
    @Override
    public List<Expe> getExpe() {
        return expeRepo.findAll();
    }

    @Override
    public void addExpe(Expe expe) {
        expeRepo.save(expe);
    }

    @Override
    public void deleteExpe(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public void editExpe(Expe expe) {
        expeRepo.save(expe);
    }

    @Override
    public Expe findExpe(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

   
    
}
