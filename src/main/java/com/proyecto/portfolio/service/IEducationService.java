
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    public List<Education> getEducation();
    public void addEducation(Education education);
    public void deleteEducation(Long id);
    public void editEducation(Education education);
    public Education findEducation(Long id);
}
