/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopj;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Arya
 */
public class Homepg extends javax.swing.JFrame {

    /**
     * Creates new form Homepg
     */
    public Homepg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        passfld = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        namefld = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login To Claim");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 370, 80));

        passfld.setFont(new java.awt.Font("Eras Medium ITC", 2, 18)); // NOI18N
        passfld.setForeground(new java.awt.Color(51, 153, 0));
        passfld.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passfldActionPerformed(evt);
            }
        });
        getContentPane().add(passfld, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 230, 50));

        password.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        password.setForeground(new java.awt.Color(0, 204, 204));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        namefld.setFont(new java.awt.Font("Eras Medium ITC", 2, 18)); // NOI18N
        namefld.setForeground(new java.awt.Color(0, 153, 0));
        namefld.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(namefld, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 230, 50));

        username.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        username.setForeground(new java.awt.Color(0, 204, 204));
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, 40));

        loginbtn.setBackground(new java.awt.Color(0, 204, 102));
        loginbtn.setFont(new java.awt.Font("Eras Medium ITC", 2, 24)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 150, 50));

        resetbtn.setBackground(new java.awt.Color(0, 204, 102));
        resetbtn.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("Reset");
        resetbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 170, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Star Gaze Mile Lottery Site");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 590, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patil\\Downloads\\wallpaperflare.com_wallpaper (5).jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passfldActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
    try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/profile","root","Secreteng@4307");
        String username = namefld.getText();
        String password = passfld.getText();
        Statement stm =con.createStatement();
        String sql = "select * from login where Username='"+username+"' and Password='"+password+"'";
        ResultSet rs = stm.executeQuery(sql);
        if(rs.next()){
           dispose();
            JOptionPane.showMessageDialog(this, "Successfull");
            Welcome hpage =new Welcome();
            hpage.show();
        } else {
            JOptionPane.showMessageDialog(this, "username or password wrong");
            namefld.setText("");
            passfld.setText("");
        }
        con.close();
        
        }catch(Exception e) 
        {
            System.out.println(e.getMessage());  
        }
        




// TODO add your handling code here:
    }//GEN-LAST:event_loginbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Homepg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField namefld;
    private javax.swing.JPasswordField passfld;
    private javax.swing.JLabel password;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
