
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.About;
import com.proyecto.portfolio.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService {
    @Autowired
    public AboutRepository aboutRepo;
    @Override
    public List<About> getAbout() {
        return aboutRepo.findAll();
    }

    @Override
    public void editAbout(About about) {
        aboutRepo.save(about);
    }

    @Override
    public void addAbout(About about) {
        aboutRepo.save(about);
    }
    
    
    @Override
    public void deleteAbout(Long id) {
        aboutRepo.deleteById(id);
    }

    @Override
    public About findAbout(Long id) {
        return aboutRepo.findById(id).orElse(null);
    }
    
}
