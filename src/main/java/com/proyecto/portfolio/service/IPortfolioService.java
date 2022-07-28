
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Portfolio;
import java.util.List;


public interface IPortfolioService {
    public List<Portfolio> getPortfolio();
    public void addPortfolio(Portfolio portfolio);
    public void deletePortfolio(Long id);
    public void editPortfolio(Portfolio portfolio);
    public Portfolio findPortfolio(Long id);
    
    
}
