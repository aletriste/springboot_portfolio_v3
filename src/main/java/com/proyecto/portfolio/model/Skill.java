
package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private Long porc;

    public Skill() {
    }

    public Skill(Long id, String name, Long porc) {
        this.id = id;
        this.name = name;
        this.porc = porc;
    }
    
    
}
