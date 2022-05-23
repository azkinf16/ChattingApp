package chatting;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FormRegister extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    Koneksi DB;
    
    public FormRegister() {
        initComponents();
        DB = new Koneksi();
        DB.init();
        con = DB.conn;
        stat = DB.stm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_register = new javax.swing.JPanel();
        lbl_register = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        btn_cancel = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_register.setBackground(new java.awt.Color(51, 204, 255));

        lbl_register.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lbl_register.setForeground(new java.awt.Color(51, 0, 102));
        lbl_register.setText("Register Form");

        lbl_nama.setText("Name :");

        lbl_email.setText("E mail :");

        lbl_pass.setText("Password :");

        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(102, 0, 102));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(102, 0, 102));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_registerLayout = new javax.swing.GroupLayout(pnl_register);
        pnl_register.setLayout(pnl_registerLayout);
        pnl_registerLayout.setHorizontalGroup(
            pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registerLayout.createSequentialGroup()
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_registerLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_email)
                            .addComponent(lbl_nama)
                            .addComponent(lbl_pass))
                        .addGap(32, 32, 32)
                        .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_registerLayout.createSequentialGroup()
                                .addComponent(btn_cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerBtn))
                            .addComponent(nameField)
                            .addComponent(emailField)
                            .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_registerLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lbl_register)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnl_registerLayout.setVerticalGroup(
            pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nama)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(pnl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(btn_cancel))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String name = nameField.getText();
        String email = emailField.getText();
        String pass = passField.getText();
        
        try{
            sql = "INSERT into user(nama, email, pass, status) VALUES (" + "'" +name+ "'" + "," + "'" +email+ "'" + "," + "'" +pass+ "'" + "," + "'" +0+ "'"+")";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Registration Success, You Can Login Now !!!");
            this.dispose();
            FormLogin l = new FormLogin();
            l.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        
        this.dispose();
        FormLogin l = new FormLogin();
        l.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_register;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPanel pnl_register;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
