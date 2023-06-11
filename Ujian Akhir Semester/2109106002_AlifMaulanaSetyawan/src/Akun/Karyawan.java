package Akun;

public class Karyawan extends Akun {
    
    public final String Status = "KARYAWAN";

    public Karyawan(String namalengkap, String username, String password, String email) {
        super(namalengkap, username, password, email);
    }

    public Karyawan() {
    }

    public String getStatus() {
        return Status;
    }
}