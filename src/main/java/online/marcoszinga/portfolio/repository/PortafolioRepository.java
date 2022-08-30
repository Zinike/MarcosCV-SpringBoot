package online.marcoszinga.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.marcoszinga.portfolio.model.PortafolioModel;

@Repository
public interface PortafolioRepository extends JpaRepository<PortafolioModel,Long>{
    
}
