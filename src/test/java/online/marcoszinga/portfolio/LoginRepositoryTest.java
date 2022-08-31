package online.marcoszinga.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import online.marcoszinga.portfolio.model.LoginModel;
import online.marcoszinga.portfolio.repository.LoginRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class LoginRepositoryTest {
    
    @Autowired
    LoginRepository loginRepository;

    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "12345678";
        String encodePassword = passwordEncoder.encode(rawPassword);
        LoginModel newLogin = new LoginModel("marcoszinga94@gmail.com", encodePassword);
        LoginModel savedLogin = loginRepository.save(newLogin);
        assertThat(savedLogin).isNotNull();
        assertThat(savedLogin.getId()).isGreaterThan(0);
    }
}
