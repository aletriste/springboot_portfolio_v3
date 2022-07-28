
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.About;
import java.util.List;


public interface IAboutService {
    public List<About> getAbout();
    public void addAbout(About about);
    public void editAbout(About about);
    public void deleteAbout(Long id);
    public About findAbout(Long id);
    
}
