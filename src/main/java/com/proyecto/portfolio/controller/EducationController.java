
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Education;
import com.proyecto.portfolio.service.IEducationService;
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
@CrossOrigin(origins = "https://pagina-portfolio-v3.web.app")
public class EducationController {
    
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
    
}
