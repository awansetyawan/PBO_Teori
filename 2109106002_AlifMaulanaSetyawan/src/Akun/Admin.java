package Akun;

public class Admin extends Akun{
    
    public final String Status = "ADMIN";

    public Admin(String namalengkap, String username, String password, String email) {
        super(namalengkap, username, password, email);
    }

    public Admin() {
    }

    public String getStatus() {
        return Status;
    }
}