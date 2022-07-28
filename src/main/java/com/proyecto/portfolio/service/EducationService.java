
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Education;
import com.proyecto.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducationService implements IEducationService{
    @Autowired
    public EducationRepository educationRepo;
    
    @Override
    public List<Education> getEducation() {
        return educationRepo.findAll();
    }

    @Override
    public void addEducation(Education education) {
        educationRepo.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }

    @Override
    public void editEducation(Education education) {
        educationRepo.save(education);
    }

    @Override
    public Education findEducation(Long id) {
        return educationRepo.findById(id).orElse(null);
    }
    
}
