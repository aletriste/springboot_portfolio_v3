
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.About;
import com.proyecto.portfolio.model.Education;
import com.proyecto.portfolio.model.Portfolio;
import com.proyecto.portfolio.model.Skill;
import com.proyecto.portfolio.service.IAboutService;
import com.proyecto.portfolio.service.IEducationService;
import com.proyecto.portfolio.service.IPortfolioService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
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
    
    @Autowired
    public IPortfolioService portfolioServ;
    
    @GetMapping("/portfolio/list")
    @ResponseBody
    public List<Portfolio> getPortfolio(){
        return portfolioServ.getPortfolio();
    }
    
    @PostMapping("/portfolio/add")
    public void addPortfolio(@RequestBody Portfolio portfolio){
        portfolioServ.addPortfolio(portfolio);
    }
    
    @PutMapping("/portfolio/edit")
    public void editPortfolio(@RequestBody Portfolio portfolio){
        portfolioServ.editPortfolio(portfolio);
    }
    
    @DeleteMapping("/portfolio/delete/{id}")
    public void deletePortfolio(@PathVariable Long id){
        portfolioServ.deletePortfolio(id);
    }
    
    @GetMapping("/portfolio/find/{id}")
    @ResponseBody
    public Portfolio findPortfolio(@PathVariable Long id){
        return portfolioServ.findPortfolio(id);
    }
    
    @Autowired
    public IEducationService educationServ;
    
    @GetMapping("/education/list")
    @ResponseBody
    public List<Education> getEducation(){
        return educationServ.getEducation();
    }
    
    @PostMapping("/education/add")
    public void addEducation(@RequestBody Education education){
        educationServ.addEducation(education);
    }
    
    @PutMapping("/education/edit")
    public void editEducation(@RequestBody Education education){
        educationServ.editEducation(education);
    }
    
    @DeleteMapping("/education/delete/{id}")
    public void deleteEducation(@PathVariable Long id){
        educationServ.deleteEducation(id);
    }
    
    @GetMapping("/education/find/{id}")
    @ResponseBody
    public Education findEducation(@PathVariable Long id){
        return educationServ.findEducation(id);
    }
    
    @Autowired
    public IAboutService aboutServ;
    
    @GetMapping("/about/list")
    @ResponseBody
    public List<About> getAbout(){
        return aboutServ.getAbout();
    }
    
    @PostMapping("/about/add")
    public void addAbout(@RequestBody About About){
        aboutServ.addAbout(About);
    }
    
    @PutMapping("/about/edit")
    public void editAbout(@RequestBody About about){
        aboutServ.editAbout(about);
    }
   
    @GetMapping("/about/find/{id}")
    @ResponseBody
    public About findAbout(@PathVariable Long id){
        return aboutServ.findAbout(id);
    }
}
