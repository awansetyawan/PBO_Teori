package Login;

import Akun.*;
import Koneksi.Koneksi;
import SignUp.SignUp_Form;
        
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

public class Login_Form extends javax.swing.JFrame {
    
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    Preferences preference;
    
    public Login_Form() {
        initComponents();
                
        // Inisialisasi objek Preferences
        preference = Preferences.userRoot().node(getClass().getName());

        // Cek preferensi Remember Me
        boolean rememberMe = preference.getBoolean("rememberMe", false);
        cRemember.setSelected(rememberMe);

        if (rememberMe) {
            // Jika Remember Me diaktifkan, isi kembali username dan password
            String username = preference.get("username", "");
            String password = preference.get("password", "");
            txtUsername.setText(username);
            txtPassword.setText(password);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Hide = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSigIn = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        cRemember = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(246, 241, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/call-center (2).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 53, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 167, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Wanz Service");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 327, 236, -1));

        jPanel2.setBackground(new java.awt.Color(175, 211, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(175, 211, 226));
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 228, 35));

        txtPassword.setBackground(new java.awt.Color(175, 211, 226));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setText("Password");
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 228, 35));

        jSeparator1.setBackground(new java.awt.Color(20, 108, 148));
        jSeparator1.setForeground(new java.awt.Color(20, 108, 148));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 228, 10));

        jSeparator2.setBackground(new java.awt.Color(20, 108, 148));
        jSeparator2.setForeground(new java.awt.Color(20, 108, 148));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 228, 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (3).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        Hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hide (1).png"))); // NOI18N
        Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HideMouseClicked(evt);
            }
        });
        jPanel2.add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        Hide.getAccessibleContext().setAccessibleName("hide");

        Show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/view.png"))); // NOI18N
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jPanel2.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 108, 148));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hello! Lets get started");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        btnSigIn.setBackground(new java.awt.Color(25, 167, 206));
        btnSigIn.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnSigIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSigIn.setText("Sign In");
        btnSigIn.setBorder(null);
        btnSigIn.setFocusPainted(false);
        btnSigIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigInMouseClicked(evt);
            }
        });
        jPanel2.add(btnSigIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 70, 30));

        btnSignUp.setBackground(new java.awt.Color(25, 167, 206));
        btnSignUp.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(null);
        btnSignUp.setFocusPainted(false);
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 70, 30));

        cRemember.setBackground(new java.awt.Color(255, 255, 255));
        cRemember.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 12)); // NOI18N
        cRemember.setForeground(new java.awt.Color(255, 255, 255));
        cRemember.setText("Remember Me");
        cRemember.setFocusPainted(false);
        cRemember.setOpaque(false);
        jPanel2.add(cRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HideMouseClicked
        txtPassword.setEchoChar((char)0);
        Hide.setVisible(false);
        Hide.setEnabled(false);
        Show.setEnabled(true);
        Show.setEnabled(true);
    }//GEN-LAST:event_HideMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        txtPassword.setEchoChar((char)8226);
        Hide.setVisible(true);
        Hide.setEnabled(true);
        Show.setEnabled(false);
        Show.setEnabled(false);
    }//GEN-LAST:event_ShowMouseClicked

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().isEmpty() || txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (txtPassword.getPassword().length == 0 || new String(txtPassword.getPassword()).equals("Password")) {
            txtPassword.setText("");
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().isEmpty()) {
            txtUsername.setText("Username");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getPassword().length == 0) {
            txtPassword.setText("Password");
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnSigInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigInMouseClicked
        if (cRemember.isSelected()) {
            // Jika CheckBox dipilih, simpan preferensi Remember Me
            preference.putBoolean("rememberMe", true);
            preference.put("username", txtUsername.getText());
            preference.put("password", new String(txtPassword.getPassword()));
        } else {
            // Jika CheckBox tidak dipilih, hapus preferensi Remember Me
            preference.remove("rememberMe");
            preference.remove("username");
            preference.remove("password");
        }
        
        Akun akun = new Akun();
        Karyawan karyawan = new Karyawan();
        Admin admin = new Admin();

        String username = txtUsername.getText();
        akun.setUsername(username);

        String password = new String(txtPassword.getPassword());
        akun.setPassword(password);
        
        if (txtUsername.getText().equals("Username") && new String(txtPassword.getPassword()).equals("Password")) {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                conn = Koneksi.getConnection();
                stmt = conn.createStatement();
                String SqlAuthenticate = "SELECT * FROM Akun WHERE Username='%s' AND KataSandi='%s'";
                SqlAuthenticate = String.format(SqlAuthenticate, akun.getUsername(), akun.getPassword());
                
                rs = stmt.executeQuery(SqlAuthenticate);
                
                if (rs.next()) {
                    String role = rs.getString("Status");
                    String getUser = rs.getString("Username");
                    
                    if (role.equals(admin.getStatus()) && akun.getUsername().equals(getUser)) {
                        JOptionPane.showMessageDialog(rootPane, "Welcome, Admin " + getUser + "!");
                    } else if(role.equals(karyawan.getStatus()) && akun.getUsername().equals(getUser)) {
                        JOptionPane.showMessageDialog(rootPane, "Welcome, Karyawan " + getUser + "!");
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Perhatikan Kembali Username atau Password", "Login Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username atau Password tidak sesuai", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception Error){
                System.out.println(""+Error);
            }
        }
    }//GEN-LAST:event_btnSigInMouseClicked

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        if (cRemember.isSelected()) {
            // Jika CheckBox dipilih, simpan preferensi Remember Me
            preference.putBoolean("rememberMe", true);
            preference.put("username", txtUsername.getText());
            preference.put("password", new String(txtPassword.getPassword()));
        } else {
            // Jika CheckBox tidak dipilih, hapus preferensi Remember Me
            preference.remove("rememberMe");
            preference.remove("username");
            preference.remove("password");
        }
        
        SignUp_Form form = new SignUp_Form();

        form.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hide;
    private javax.swing.JLabel Show;
    private javax.swing.JButton btnSigIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox cRemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}