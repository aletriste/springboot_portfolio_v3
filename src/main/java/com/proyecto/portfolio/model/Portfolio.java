
package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String subtitulo; 
    private String text;
    private String imageUrl;
    private String linkUrl;

    public Portfolio() {
    }

    public Portfolio(Long id, String titulo, String subtitulo, String text, String imageUrl) {
        this.id = id;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.text = text;
        this.imageUrl = imageUrl;
    }
    
    
}
