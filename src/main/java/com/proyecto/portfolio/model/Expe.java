
package com.proyecto.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Expe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String empresa;
    private String ubicacion;
    private String cargo;
    private String desde;
    private String hasta;

    public Expe() {
    }

    public Expe(Long id, String empresa, String ubicacion, String cargo, String desde, String hasta) {
        this.id = id;
        this.empresa = empresa;
        this.ubicacion = ubicacion;
        this.cargo = cargo;
        this.desde = desde;
        this.hasta = hasta;
    }
    
    
}
