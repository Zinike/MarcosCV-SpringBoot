package online.marcoszinga.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.marcoszinga.portfolio.model.CapacidadesModel;

@Repository
public interface CapacidadesRepository extends JpaRepository<CapacidadesModel,Long> {
    
}
