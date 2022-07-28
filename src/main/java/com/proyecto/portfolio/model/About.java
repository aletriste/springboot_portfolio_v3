
package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long age;
    private String ocupation;
    private String text;
    private String imageUrl;

    public About() {
    }

    public About(Long id, String name, Long age, String ocupation, String text, String imageUrl) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ocupation = ocupation;
        this.text = text;
        this.imageUrl = imageUrl;
    }
    
    
}
