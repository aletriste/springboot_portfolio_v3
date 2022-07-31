
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Expe;
import com.proyecto.portfolio.service.IExpeService;
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
public class ExpeController {
    
       
    @Autowired
    public IExpeService expeServ;
    
    
    @GetMapping("/expe/list")
    @ResponseBody
    public List<Expe> getExpe(){
        return expeServ.getExpe();
    }
    
    @PostMapping("/expe/add")
    public void addExpe(@RequestBody Expe expe){
        expeServ.addExpe(expe);
    }
    
    @DeleteMapping("/expe/delete/{id}")
    public void deleteExpe(@PathVariable Long id){
        expeServ.deleteExpe(id);
    }
    
    @GetMapping("/expe/find/{id}")
    @ResponseBody
    public Expe findExpe(@PathVariable Long id){
        return expeServ.findExpe(id);
    }
    
    @PutMapping("/expe/edit/")
    public void editExpe(@RequestBody Expe expe){
        expeServ.editExpe(expe);
    }
    
}
