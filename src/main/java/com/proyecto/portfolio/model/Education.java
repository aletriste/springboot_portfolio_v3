
package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;
    private String centro;
    private String titulo;
    private String text;
    private String linkUrl;
    private String imageUrl;

    public Education() {
    }

    public Education(Long id, String centro, String titulo, String text, String linkUrl, String imageUrl) {
        this.id = id;
        this.centro = centro;
        this.titulo = titulo;
        this.text = text;
        this.linkUrl = linkUrl;
        this.imageUrl = imageUrl;
    }
    
    
    
}
