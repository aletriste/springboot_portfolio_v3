
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Portfolio;
import com.proyecto.portfolio.repository.PortfolioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService {
    @Autowired
    public PortfolioRepository portfolioRepo;
    
    @Override
    public List<Portfolio> getPortfolio() {
        return portfolioRepo.findAll();
    }

    @Override
    public void addPortfolio(Portfolio portfolio) {
        portfolioRepo.save(portfolio);
    }

    @Override
    public void deletePortfolio(Long id) {
        portfolioRepo.deleteById(id);
    }

    @Override
    public void editPortfolio(Portfolio portfolio) {
        portfolioRepo.save(portfolio);
    }

    @Override
    public Portfolio findPortfolio(Long id) {
        return portfolioRepo.findById(id).orElse(null);

    }
    
}
