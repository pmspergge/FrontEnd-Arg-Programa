package com.portfolio.ms.Repository;

import com.portfolio.ms.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mati
 */
@Repository 
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
