package Akun;

public class Akun {
    private String namalengkap;
    private String username;
    private String password;
    private String email;

    public Akun(String namalengkap, String username, String password, String email) {
        this.namalengkap = namalengkap;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Akun(){
    }
    
    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}