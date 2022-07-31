
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.About;
import com.proyecto.portfolio.service.IAboutService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "https://pagina-portfolio-v3.web.app")
public class AboutController {
    
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
