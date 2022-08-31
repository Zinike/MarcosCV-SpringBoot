package online.marcoszinga.portfolio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
    Optional<LoginModel> findByEmail(String email);
}
