package SignUp;

import Akun.Karyawan;
import Koneksi.Koneksi;
import Login.Login_Form;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class SignUp_Form extends javax.swing.JFrame {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    public SignUp_Form() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(175, 211, 226));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 108, 148));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SIGN UP");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Lengkap");

        txtNamaLengkap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(20, 108, 148));
        jSeparator1.setForeground(new java.awt.Color(20, 108, 148));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Username");

        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Password");

        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSignUp2.setBackground(new java.awt.Color(25, 167, 206));
        btnSignUp2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnSignUp2.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp2.setText("Sign Up");
        btnSignUp2.setBorder(null);
        btnSignUp2.setFocusPainted(false);
        btnSignUp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUp2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Already have an account?");
        jLabel9.setToolTipText("");

        Login.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(20, 108, 148));
        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnSignUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(txtNamaLengkap)
                        .addComponent(txtPassword)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Login))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(246, 241, 241));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add-friend.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUp2MouseClicked
        Karyawan karyawan = new Karyawan();
    
        String NamaLengkap = txtNamaLengkap.getText();
        karyawan.setNamalengkap(NamaLengkap);

        String Email = txtEmail.getText();
        karyawan.setEmail(Email);

        String Username = txtUsername.getText();
        karyawan.setUsername(Username);

        String Password = new String(txtPassword.getPassword());
        karyawan.setPassword(Password);

        try {  
            conn = Koneksi.getConnection();
            stmt = conn.createStatement();
            String CheckSql = "SELECT COUNT(*) FROM Akun WHERE Username = '%s'";
            CheckSql = String.format(CheckSql, Username);

            rs = stmt.executeQuery(CheckSql);
            rs.next();

            int Count = rs.getInt(1);

            if (NamaLengkap.isEmpty()) {
                txtNamaLengkap.requestFocus();
                JOptionPane.showMessageDialog(this, "Nama Lengkap Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (Email.isEmpty() || !Email.contains("@")) {
                txtEmail.requestFocus();
                JOptionPane.showMessageDialog(this, "Email tidak valid. Silakan Coba Lagi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (Username.isEmpty()) {
                txtUsername.requestFocus();
                JOptionPane.showMessageDialog(this, "Username Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (Password.isEmpty()) {
                txtPassword.requestFocus();
                JOptionPane.showMessageDialog(this, "Password Tidak Boleh Kosong.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if (Count > 0) {
                
                String checkUser = "SELECT * FROM Akun WHERE Username = '%s'";
                checkUser = String.format(checkUser, Username);

                rs = stmt.executeQuery(checkUser);

                if (rs.next()) {
                    String existingUsername = rs.getString("Username");
                    if (existingUsername.equals(Username)) {
                        JOptionPane.showMessageDialog(this, "Username Sudah Digunakan. Silakan Pilih Username Lain.", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        // Query Simpan
                        String sql = "INSERT INTO Akun (Username, KataSandi, NamaLengkap, Email, Status) VALUE('%s', '%s', '%s', '%s', '%s')";
                        sql = String.format(sql, Username, Password, NamaLengkap, Email, karyawan.getStatus());

                        // Eksekusi
                        stmt.execute(sql);

                        JOptionPane.showMessageDialog(this, "Akun Telah Berhasil Didaftarkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE); 
                        
                        txtNamaLengkap.setText("");
                        txtEmail.setText("");
                        txtUsername.setText("");
                        txtPassword.setText("");
                        txtNamaLengkap.requestFocus();
                    }
                }
                
                //JOptionPane.showMessageDialog(this, "Username Sudah Digunakan. Silakan Pilih Username Lain.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                // Query Simpan
                String sql = "INSERT INTO Akun (Username, KataSandi, NamaLengkap, Email, Status) VALUE('%s', '%s', '%s', '%s', '%s')";
                sql = String.format(sql, Username, Password, NamaLengkap, Email, karyawan.getStatus());

                // Eksekusi
                stmt.execute(sql);

                JOptionPane.showMessageDialog(this, "Akun Telah Berhasil Didaftarkan!", "Informasi", JOptionPane.INFORMATION_MESSAGE); 
                
                txtNamaLengkap.setText("");
                txtEmail.setText("");
                txtUsername.setText("");
                txtPassword.setText("");
                txtNamaLengkap.requestFocus();
            }
            
        }catch (Exception Error) {
            System.out.println("" + Error);
        }
    }//GEN-LAST:event_btnSignUp2MouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        Login_Form form = new Login_Form();

        form.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LoginMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JButton btnSignUp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}