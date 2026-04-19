@Data

// RegisterRequest.java
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String phone;
    private Role role; // BUYER or SELLER
}