
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.model.Expe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ExpeRepository extends JpaRepository<Expe, Long> {
    
}
