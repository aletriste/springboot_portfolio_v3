
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.model.Portfolio;
import com.proyecto.portfolio.service.IPortfolioService;
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
public class PortfolioController {
    
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
    
}
