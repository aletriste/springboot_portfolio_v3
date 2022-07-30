/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.model.Expe;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface IExpeService {
    public List<Expe> getExpe();
    public void addExpe(Expe expe);
    public void deleteExpe(Long id);
    public void editExpe(Expe expe);
    public Expe findExpe(Long id);
    
}
