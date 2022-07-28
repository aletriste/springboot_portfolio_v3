
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> getSkill();
    public void addSkill(Skill skill);
    public void deleteSkill(Long id);
    public void editSkill(Skill skill); 
    public Skill findSkill(Long id);
    
}
