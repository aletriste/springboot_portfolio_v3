
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Skill;
import com.proyecto.portfolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SkillService implements ISkillService {
    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> getSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void addSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public void editSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public Skill findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
}
