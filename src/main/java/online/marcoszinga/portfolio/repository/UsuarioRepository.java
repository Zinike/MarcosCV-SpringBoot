package online.marcoszinga.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.marcoszinga.portfolio.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long>{

}
