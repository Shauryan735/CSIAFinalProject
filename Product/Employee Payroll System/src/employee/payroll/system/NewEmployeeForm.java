/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author shauryanratan
 */
public class NewEmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form NewEmployeeForm
     */
    public NewEmployeeForm() {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_EmpPhone = new javax.swing.JTextField();
        txt_FName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmb_Sex = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_EmpEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_EmpAddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cmb_DepCode = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmb_DesCode = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btn_Confirm = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        btn_MainPage = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_EmpID = new javax.swing.JTextField();
        txt_EmpSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_EmpJoined = new com.toedter.calendar.JDateChooser();
        txt_EmpDOB = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txt_MName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_LName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("R.K. Transports and Services");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 7, 239, 22));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("New Employee Form ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 38, -1, 48));

        jLabel3.setText("Employee ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setText("First Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));
        getContentPane().add(txt_EmpPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 140, -1));
        getContentPane().add(txt_FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 149, -1));

        jLabel5.setText("Date of Birth :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel6.setText("Sex :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        cmb_Sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Male", "Female", "Other", "Not Preferred" }));
        cmb_Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_SexActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_Sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel7.setText("Phone Number : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel8.setText("Email : ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 52, -1));
        getContentPane().add(txt_EmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 150, -1));

        jLabel9.setText("Address : ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        txt_EmpAddress.setColumns(20);
        txt_EmpAddress.setRows(5);
        jScrollPane1.setViewportView(txt_EmpAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 400, 70));

        jLabel10.setText("Department:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        cmb_DepCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "Accounts", "Marketing", "Purchase", "Logistics", "Maintenance", "HR & Legal" }));
        cmb_DepCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DepCodeActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_DepCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 109, -1));

        jLabel11.setText("Designation:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        cmb_DesCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Proprietor", "Secretary", "General Manager", "Manager", "Assistant", "Reception", "Peon", "Trainee" }));
        cmb_DesCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DesCodeActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_DesCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 120, -1));

        jLabel12.setText("Date Joined :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        btn_Confirm.setText("Confirm");
        btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        btn_MainPage.setText("Main Menu");
        btn_MainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainPageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MainPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -10, -1, -1));

        txt_EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmpIDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_EmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));
        getContentPane().add(txt_EmpSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 110, -1));

        jLabel13.setText("Salary:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));
        getContentPane().add(txt_EmpJoined, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 120, -1));
        getContentPane().add(txt_EmpDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jLabel14.setText("Middle Name:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        getContentPane().add(txt_MName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 140, -1));

        jLabel15.setText("Last Name:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));
        getContentPane().add(txt_LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 149, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmActionPerformed
        int id = -1;
        try {
            id = Integer.parseInt(txt_EmpID.getText());
        } catch (Exception e) {
            id = -1;
        }
        String fname = txt_FName.getText();
        String mname = txt_MName.getText();
        String lname = txt_LName.getText();
        String dob = "";
        try{
            Date d = new Date(txt_EmpDOB.getDate().getTime());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
            dob = format.format(d);
        }
        catch (Exception e) {
            dob = "";
        }
        String sex = cmb_Sex.getSelectedItem().toString();
        String phone = txt_EmpPhone.getText();
        String email = txt_EmpEmail.getText();
        String address = txt_EmpAddress.getText();
        String dep = cmb_DepCode.getSelectedItem().toString();
        String des = cmb_DesCode.getSelectedItem().toString();
        double salary = -1;
        try{
            salary = Double.parseDouble(txt_EmpSalary.getText());
        } catch (Exception e) {
            salary = -1;
        }
        String joined = "";
        try{
            Date d = new Date(txt_EmpJoined.getDate().getTime());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
            joined = format.format(d);
        }
        catch (Exception e) {
            joined = "";
        }
        if(id == -1 || fname.equals("") || mname.equals("") || lname.equals("") || dob.equals("") || sex.equals("") || phone.equals("") || email.equals("")
                || address.equals("") || dep.equals("") || des.equals("") || joined.equals("") || txt_EmpSalary.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!(Pattern.matches("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$", email))) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                
                String query = "INSERT INTO employee(id,fname,mname,lname,dob,sex,phone,mail,address,dept,designation,salary,leaves,joined) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    Connection con = DB.connect();
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setInt(1, id);
                    pst.setString(2, fname);
                    pst.setString(3, mname);
                    pst.setString(4, lname);
                    pst.setString(5, dob);
                    pst.setString(6, sex);
                    pst.setString(7, phone);
                    pst.setString(8, email);
                    pst.setString(9, address);
                    pst.setString(10, dep);
                    pst.setString(11, des);
                    pst.setDouble(12, salary);
                    pst.setInt(13, 14); 
                    pst.setString(14, joined);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Inserted");
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
                
                //resetting the feilds
                txt_EmpID.setText(null);
                txt_FName.setText(null);
                txt_MName.setText(null);
                txt_LName.setText(null);
                txt_EmpDOB.setDate(null);
                cmb_Sex.setSelectedItem(null);
                txt_EmpAddress.setText(null);
                txt_EmpPhone.setText(null);
                txt_EmpEmail.setText(null);
                cmb_DepCode.setSelectedItem(null);
                cmb_DesCode.setSelectedItem(null);
                txt_EmpSalary.setText(null);
                txt_EmpJoined.setDate(null);
            }
        }
    }//GEN-LAST:event_btn_ConfirmActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        //resetting the feilds
        txt_EmpID.setText(null);
        txt_FName.setText(null);
        txt_MName.setText(null);
        txt_LName.setText(null);
        txt_EmpDOB.setDate(null);
        cmb_Sex.setSelectedItem(null);
        txt_EmpAddress.setText(null);
        txt_EmpPhone.setText(null);
        txt_EmpEmail.setText(null);
        cmb_DepCode.setSelectedItem(null);
        cmb_DesCode.setSelectedItem(null);
        txt_EmpSalary.setText(null);
        txt_EmpJoined.setDate(null);
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        int exit = (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the form", "Exit", JOptionPane.YES_NO_CANCEL_OPTION));
        if (exit == 0) {
            MainPage page = new MainPage();
            page.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_MainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainPageActionPerformed
        MainPage page = new MainPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_MainPageActionPerformed

    private void cmb_DepCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DepCodeActionPerformed
        
    }//GEN-LAST:event_cmb_DepCodeActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        MainPage page = new MainPage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void cmb_SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_SexActionPerformed

    private void txt_EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmpIDActionPerformed

    private void cmb_DesCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DesCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_DesCodeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Confirm;
    private javax.swing.JButton btn_MainPage;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JComboBox<String> cmb_DepCode;
    private javax.swing.JComboBox<String> cmb_DesCode;
    private javax.swing.JComboBox<String> cmb_Sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_EmpAddress;
    private com.toedter.calendar.JDateChooser txt_EmpDOB;
    private javax.swing.JTextField txt_EmpEmail;
    private javax.swing.JTextField txt_EmpID;
    private com.toedter.calendar.JDateChooser txt_EmpJoined;
    private javax.swing.JTextField txt_EmpPhone;
    private javax.swing.JTextField txt_EmpSalary;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_MName;
    // End of variables declaration//GEN-END:variables
}
