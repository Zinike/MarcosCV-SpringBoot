package online.marcoszinga.portfolio.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import online.marcoszinga.portfolio.security.jwt.JwtTokenUtil;

@RestController
public class AuthApi {

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @PostMapping("/api/Login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthRequest request){
        new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword());

    }







}
