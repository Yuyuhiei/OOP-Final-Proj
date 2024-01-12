/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package regenrolmentsys;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author harley
 */
public class StudentHome extends javax.swing.JPanel {
    private MainFrame mf = null;
    private StudentMenu sm = null;
    private String currentUser = "";
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    /**
     * Creates new form StudentHome
     */
    public StudentHome(MainFrame mf, StudentMenu sm) {
        initComponents();
        this.sm = sm;
        this.mf = mf;
        this.currentUser = mf.getUserID();
    }
    
    public void setUserID(String userID) {
        this.currentUser = userID;
        lblTempID.setText("Current ID: " + userID);
    }
    
    public void setUserName(){
        con = ConnectDB.connect();
        try{
            rs = con.prepareStatement("SELECT * FROM finals.STUDENT WHERE student_no ='"+mf.getUserID()+"'").executeQuery();
            while (rs.next())
                lblUserName.setText(rs.getString("first_name"));
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        BTNProfile = new com.k33ptoo.components.KButton();
        BTNEnrollment = new com.k33ptoo.components.KButton();
        BTNSchedule = new com.k33ptoo.components.KButton();
        BTNGrade = new com.k33ptoo.components.KButton();
        BTNLogout = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        Student = new javax.swing.JLabel();
        lblTempID = new javax.swing.JLabel();
        shadow = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MainLBL = new javax.swing.JLabel();
        PLMLogo = new javax.swing.JLabel();
        MinimizeBTN = new javax.swing.JButton();
        CloseBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jSplitPane1.setDividerLocation(450);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BTNProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/1.png"))); // NOI18N
        BTNProfile.setText("Profile");
        BTNProfile.setToolTipText("");
        BTNProfile.setBorderPainted(false);
        BTNProfile.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        BTNProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTNProfile.setIconTextGap(100);
        BTNProfile.setkBorderRadius(20);
        BTNProfile.setkEndColor(new java.awt.Color(255, 255, 102));
        BTNProfile.setkHoverEndColor(new java.awt.Color(204, 153, 0));
        BTNProfile.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BTNProfile.setkHoverStartColor(new java.awt.Color(204, 0, 0));
        BTNProfile.setkStartColor(new java.awt.Color(204, 0, 0));
        BTNProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNProfileActionPerformed(evt);
            }
        });

        BTNEnrollment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/2.png"))); // NOI18N
        BTNEnrollment.setText("Enrollment");
        BTNEnrollment.setBorderPainted(false);
        BTNEnrollment.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        BTNEnrollment.setIconTextGap(100);
        BTNEnrollment.setkBorderRadius(20);
        BTNEnrollment.setkHoverEndColor(new java.awt.Color(0, 204, 51));
        BTNEnrollment.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BTNEnrollment.setkHoverStartColor(new java.awt.Color(51, 153, 0));
        BTNEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEnrollmentActionPerformed(evt);
            }
        });

        BTNSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/3.png"))); // NOI18N
        BTNSchedule.setText("Schedule");
        BTNSchedule.setBorderPainted(false);
        BTNSchedule.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        BTNSchedule.setIconTextGap(100);
        BTNSchedule.setkBorderRadius(20);
        BTNSchedule.setkEndColor(new java.awt.Color(51, 255, 255));
        BTNSchedule.setkHoverEndColor(new java.awt.Color(102, 102, 255));
        BTNSchedule.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BTNSchedule.setkHoverStartColor(new java.awt.Color(51, 0, 204));
        BTNSchedule.setkStartColor(new java.awt.Color(153, 0, 255));
        BTNSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNScheduleActionPerformed(evt);
            }
        });

        BTNGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4.png"))); // NOI18N
        BTNGrade.setText("Grade");
        BTNGrade.setBorderPainted(false);
        BTNGrade.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        BTNGrade.setIconTextGap(100);
        BTNGrade.setkBorderRadius(20);
        BTNGrade.setkEndColor(new java.awt.Color(255, 255, 51));
        BTNGrade.setkHoverEndColor(new java.awt.Color(204, 153, 0));
        BTNGrade.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BTNGrade.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        BTNGrade.setkStartColor(new java.awt.Color(255, 102, 51));
        BTNGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGradeActionPerformed(evt);
            }
        });

        BTNLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/5.png"))); // NOI18N
        BTNLogout.setText("Log-out");
        BTNLogout.setBorderPainted(false);
        BTNLogout.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        BTNLogout.setIconTextGap(100);
        BTNLogout.setkBorderRadius(20);
        BTNLogout.setkEndColor(new java.awt.Color(255, 0, 255));
        BTNLogout.setkHoverEndColor(new java.awt.Color(153, 0, 153));
        BTNLogout.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        BTNLogout.setkHoverStartColor(new java.awt.Color(102, 0, 102));
        BTNLogout.setkStartColor(new java.awt.Color(153, 0, 153));
        BTNLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BTNProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(BTNEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(BTNSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(BTNGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(BTNLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(185, 185, 185))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setLayout(null);

        Welcome.setFont(new java.awt.Font("Poppins", 1, 72)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("WELCOME!");
        jPanel1.add(Welcome);
        Welcome.setBounds(690, 130, 470, 90);

        lblUserName.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("name");
        jPanel1.add(lblUserName);
        lblUserName.setBounds(840, 210, 180, 70);

        Student.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        Student.setForeground(new java.awt.Color(255, 255, 255));
        Student.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Student.setText("student");
        jPanel1.add(Student);
        Student.setBounds(870, 250, 120, 60);

        lblTempID.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        lblTempID.setForeground(new java.awt.Color(255, 255, 255));
        lblTempID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempID.setText("current ID: ");
        jPanel1.add(lblTempID);
        lblTempID.setBounds(750, 290, 370, 50);

        shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SHADOW.png"))); // NOI18N
        jPanel1.add(shadow);
        shadow.setBounds(470, -60, 1370, 510);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LogInShortFinal.gif"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 30, 1280, 470);

        jPanel3.setBackground(new java.awt.Color(254, 86, 86));
        jPanel3.setLayout(null);

        MainLBL.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        MainLBL.setForeground(new java.awt.Color(255, 255, 255));
        MainLBL.setText("Enrollment System for Regular Students");
        jPanel3.add(MainLBL);
        MainLBL.setBounds(40, 0, 290, 30);

        PLMLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PLM_Seal_2013.png"))); // NOI18N
        jPanel3.add(PLMLogo);
        PLMLogo.setBounds(10, 0, 30, 30);

        MinimizeBTN.setBackground(new java.awt.Color(254, 86, 86));
        MinimizeBTN.setFont(new java.awt.Font("Boldfinger", 0, 24)); // NOI18N
        MinimizeBTN.setForeground(new java.awt.Color(255, 255, 255));
        MinimizeBTN.setText("-");
        MinimizeBTN.setToolTipText("");
        MinimizeBTN.setBorder(null);
        MinimizeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeBTNMouseExited(evt);
            }
        });
        MinimizeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeBTNActionPerformed(evt);
            }
        });
        jPanel3.add(MinimizeBTN);
        MinimizeBTN.setBounds(1220, 0, 30, 30);

        CloseBTN.setBackground(new java.awt.Color(254, 86, 86));
        CloseBTN.setFont(new java.awt.Font("Boldfinger", 0, 18)); // NOI18N
        CloseBTN.setForeground(new java.awt.Color(255, 255, 255));
        CloseBTN.setText("X");
        CloseBTN.setBorder(null);
        CloseBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseBTNMouseExited(evt);
            }
        });
        CloseBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBTNActionPerformed(evt);
            }
        });
        jPanel3.add(CloseBTN);
        CloseBTN.setBounds(1250, 0, 30, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 1280, 30);

        jSplitPane1.setTopComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    private void BTNProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNProfileActionPerformed
        // TODO add your handling code here:
        mf.switchCard("StudentMenuCard");
        sm.getTabs().setSelectedIndex(3);
        sm.toggleSelected(0);
        sm.profileStudentsTab();

    }//GEN-LAST:event_BTNProfileActionPerformed

    private void BTNGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGradeActionPerformed
        // TODO add your handling code here:
         mf.switchCard("StudentMenuCard");
        sm.getTabs().setSelectedIndex(2);
        sm.toggleSelected(3);
        sm.loadGradesTab();

    }//GEN-LAST:event_BTNGradeActionPerformed

    private void BTNEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEnrollmentActionPerformed
        // TODO add your handling code here:
        mf.switchCard("StudentMenuCard");
        sm.loadEnrolmentTab();
        sm.getTabs().setSelectedIndex(0);
        sm.toggleSelected(1);

    }//GEN-LAST:event_BTNEnrollmentActionPerformed

    private void BTNScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNScheduleActionPerformed
        // TODO add your handling code here:
          mf.switchCard("StudentMenuCard");
        sm.studentScheduleTab();
        sm.getTabs().setSelectedIndex(1);
        sm.toggleSelected(2);

    }//GEN-LAST:event_BTNScheduleActionPerformed

    private void BTNLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLogoutActionPerformed
        // TODO add your handling code here:
                int response = JOptionPane.showConfirmDialog(null, "Do you really want to log-out?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (response == 0){
            mf.setUserID("");
            mf.switchCard("LoginCard");
        }
        else{
            JOptionPane.showMessageDialog(null, "Canceled");
        }
    }//GEN-LAST:event_BTNLogoutActionPerformed

    private void CloseBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBTNActionPerformed
        mf.close();
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBTNActionPerformed

    private void CloseBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBTNMouseExited
        CloseBTN.setBackground(new Color(254, 86, 86));
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBTNMouseExited

    private void CloseBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBTNMouseEntered
        CloseBTN.setBackground(new Color(203,68,68));
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseBTNMouseEntered

    private void MinimizeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeBTNActionPerformed
        mf.minimize();
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeBTNActionPerformed

    private void MinimizeBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeBTNMouseExited
        MinimizeBTN.setBackground(new Color(254, 86, 86));
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeBTNMouseExited

    private void MinimizeBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeBTNMouseEntered
        MinimizeBTN.setBackground(new Color(203,68,68));
        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeBTNMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private com.k33ptoo.components.KButton BTNEnrollment;
    private com.k33ptoo.components.KButton BTNGrade;
    private com.k33ptoo.components.KButton BTNLogout;
    private com.k33ptoo.components.KButton BTNProfile;
    private com.k33ptoo.components.KButton BTNSchedule;
    private javax.swing.JButton CloseBTN;
    private javax.swing.JLabel MainLBL;
    private javax.swing.JButton MinimizeBTN;
    private javax.swing.JLabel PLMLogo;
    private javax.swing.JLabel Student;
    private javax.swing.JLabel Welcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblTempID;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel shadow;
    // End of variables declaration//GEN-END:variables
}
