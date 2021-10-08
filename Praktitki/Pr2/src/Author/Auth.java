package Author;

public class Auth {
    private String name;
    private String email;
    private char gender;

    public Auth(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public char getGender() {
        return this.gender;
    }
    public String toString() {
        return "Author " + this.name + "(" + this.gender + ") Email: " + this.email;
    }
}