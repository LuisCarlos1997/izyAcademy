package models;

public class RegisterModel {

    private String name;
    private String username;
    private String numeroid;
    private String email;
    private String password;
    private String verify_password;
    private String city;
    private String phone;

    public RegisterModel(String name, String username, String numeroid, String email, String password, String verify_password, String city, String phone) {
        this.name = name;
        this.username = username;
        this.numeroid = numeroid;
        this.email = email;
        this.password = password;
        this.verify_password = verify_password;
        this.city = city;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(String numeroid) {
        this.numeroid = numeroid;
    }

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

    public String getVerify_password() {
        return verify_password;
    }

    public void setVerify_password(String verify_password) {
        this.verify_password = verify_password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
