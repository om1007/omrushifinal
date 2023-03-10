/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rushikeshgadewar
 */
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmployeeLogin extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    /**
     * Creates new form EmployeeLogin
     */
    public EmployeeLogin() {
        initComponents();
        this.setPreferredSize(new Dimension(1500, 1500));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Label_Logo_EL = new javax.swing.JLabel();
        Label_EmpID_EL = new javax.swing.JLabel();
        Button_Login_EL = new javax.swing.JButton();
        Emp_ID = new javax.swing.JTextField();
        Label_Pass_EL = new javax.swing.JLabel();
        Label_Emp_Login_EL = new javax.swing.JLabel();
        Emp_Pass = new javax.swing.JPasswordField();
        Button_Back_EL = new javax.swing.JButton();

        jLabel6.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        jLabel6.setText("NEW CUSTOMER REGISTRATION");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        Label_Logo_EL.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        Label_Logo_EL.setIcon(new javax.swing.ImageIcon("C:\\Users\\om\\Pictures\\Screenshots\\Screenshot (64).png")); // NOI18N

        Label_EmpID_EL.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_EmpID_EL.setText("EMPLOYEE ID");

        Button_Login_EL.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Login_EL.setText("LOGIN");
        Button_Login_EL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Login_ELMouseClicked(evt);
            }
        });
        Button_Login_EL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Login_ELActionPerformed(evt);
            }
        });

        Emp_ID.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Emp_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_IDActionPerformed(evt);
            }
        });

        Label_Pass_EL.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Pass_EL.setText("PASSWORD");

        Label_Emp_Login_EL.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_Emp_Login_EL.setText("EMPLOYEE LOGIN");

        Emp_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_PassActionPerformed(evt);
            }
        });

        Button_Back_EL.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Back_EL.setText("BACK");
        Button_Back_EL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Back_ELActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Emp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_EmpID_EL)
                    .addComponent(Label_Pass_EL)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Button_Back_EL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button_Login_EL))
                        .addComponent(Emp_Pass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label_Logo_EL, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Emp_Login_EL)
                .addGap(353, 353, 353))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Logo_EL)
                .addGap(18, 18, 18)
                .addComponent(Label_Emp_Login_EL)
                .addGap(51, 51, 51)
                .addComponent(Label_EmpID_EL)
                .addGap(18, 18, 18)
                .addComponent(Emp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Label_Pass_EL)
                .addGap(18, 18, 18)
                .addComponent(Emp_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Back_EL)
                    .addComponent(Button_Login_EL)))
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 30, 900, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Login_ELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Login_ELActionPerformed

         String employeeid = this.Emp_ID.getText();
        String password = this.Emp_Pass.getText();
        String passFromDb = null;
        
        if (employeeid != null && password != null) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel Management?user=root&password=Rushi12345$");
                ps = con.prepareStatement("select Emp_Pass from Employee where Emp_ID = ?");
                ps.setString(1, employeeid);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("Emp_Pass"));
                    passFromDb = rs.getString("Emp_Pass");
                }
                if (password.equals(passFromDb)) {
                     MainScreen ms = new MainScreen();
            ms.setVisible(true);
            ms.setLocationRelativeTo(null);
            this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(this, "Username or/and Password don't match!");
                }
            }
            catch(SQLException ex) {
                System.err.println(ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login_ELActionPerformed

    private void Emp_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_IDActionPerformed

    private void Emp_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_PassActionPerformed

    private void Button_Back_ELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Back_ELActionPerformed
        // TODO add your handling code here:
        HomeScreen hs = new HomeScreen();
            hs.setVisible(true);
            hs.setLocationRelativeTo(null);
            this.dispose();
      
    }//GEN-LAST:event_Button_Back_ELActionPerformed

    private void Button_Login_ELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login_ELMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_Button_Login_ELMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back_EL;
    private javax.swing.JButton Button_Login_EL;
    private javax.swing.JTextField Emp_ID;
    private javax.swing.JPasswordField Emp_Pass;
    private javax.swing.JLabel Label_EmpID_EL;
    private javax.swing.JLabel Label_Emp_Login_EL;
    private javax.swing.JLabel Label_Logo_EL;
    private javax.swing.JLabel Label_Pass_EL;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
