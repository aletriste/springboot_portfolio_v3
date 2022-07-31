
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Skill;
import com.proyecto.portfolio.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://pagina-portfolio-v3.web.app")
public class SkillController {
    @Autowired
    public ISkillService skillServ;
    
    
    @GetMapping("/skill/list")
    @ResponseBody
    public List<Skill> getSkill(){
        return skillServ.getSkill();
    }
    
    
    @PostMapping("/skill/add")
    public void addSkill(@RequestBody Skill skill){
        skillServ.addSkill(skill);
    }
    
    
    @DeleteMapping("/skill/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillServ.deleteSkill(id);
    }
    
    
    @PutMapping("/skill/edit")
    public void editSkill(@RequestBody Skill skill){
        skillServ.editSkill(skill);
    }
    
    
    @GetMapping("/skill/find/{id}")
    @ResponseBody
    public Skill findSkill(@PathVariable Long id){
        return skillServ.findSkill(id);
    }
    @PutMapping("/skill/edit/{id}")
    public Skill editPersona(@PathVariable Long id,
                               @RequestParam("name") String newName,
                               @RequestParam("porc") Long newPorc)
                               {
        Skill skill = skillServ.findSkill(id);
        
        skill.setName(newName) ;
        skill.setPorc(newPorc);         
        skillServ.editSkill(skill); ;
        return skill;
    }
    
     
}
