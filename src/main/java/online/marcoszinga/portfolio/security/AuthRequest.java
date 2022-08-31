package online.marcoszinga.portfolio.security;

public class AuthRequest {
    @Email
    @Lenght(min=8, max=50)
    private String email;
    @lenght(min=8, max=50)
    private String password;
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
