/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author shauryanratan
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        //dbConn = dbConnMethod.dbConn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel6 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        btn_Enter = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        check_PassVis = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cmb_Level = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesPackage/Screen Shot 2018-09-17 at 2.51.56 PM copy.png"))); // NOI18N

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Welcome to the login page. ");

        btn_Enter.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Enter.setText("Enter");
        btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnterActionPerformed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Please fill the fields to log in.");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Username :");

        txt_Username.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Password : ");

        txt_Password.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        check_PassVis.setText("Show Password");
        check_PassVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_PassVisActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("Level :");

        cmb_Level.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cmb_Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "Accounts", "Marketing", "Purchase", "Logistics", "Maintenance", "HR & Legal" }));
        cmb_Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_LevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check_PassVis)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(cmb_Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(check_PassVis))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("Company Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Enter)
                                .addGap(87, 87, 87)
                                .addComponent(btn_Reset)
                                .addGap(88, 88, 88)
                                .addComponent(btn_Exit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(505, 505, 505)
                                .addComponent(jLabel7))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Enter)
                    .addComponent(btn_Reset)
                    .addComponent(btn_Exit))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<String> getLogins(){
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select id,name from login";
        Connection con = DB.connect();
        try{
            list.clear();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                list.add(id+" - "+name);
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Employees couldn't be fetched", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        return list;
    }
    private void btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnterActionPerformed
        ArrayList<String> list = new ArrayList<String>();
        String sql = "select * from login";
        Connection con = DB.connect();
        try{
            list.clear();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String user = rs.getString("username");
                String pass = rs.getString("password");
                String dept = rs.getString("dept");
                list.add(user+","+pass+","+dept);
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Logins couldn't be fetched", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        String user = txt_Username.getText();
        String pass = txt_Password.getText();
        String level = cmb_Level.getSelectedItem().toString();
        
        if(level.equalsIgnoreCase("Admin") && user.equals("admin") && pass.equals("admin")){
            MainPage mPage = new MainPage();
            mPage.setVisible(true);
            this.dispose();
        }
        else{
            boolean found = false;
            for (int a = 0; a < list.size(); a++) {
                String logins[] = list.get(a).split(",");
                if(logins[0].equals(user) && logins[1].equals(pass) && logins[2].equals(level)){
                    if(level.equals("Admin")){
                        found = true;
                        MainPage mPage = new MainPage();
                        mPage.setVisible(true);
                        this.dispose();
                        
                    }
                    else{
                        found = true;
                        MainPage_Emp mPage = new MainPage_Emp(user);
                        mPage.setVisible(true);
                        this.dispose();
                    }
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_EnterActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txt_Password.setText(null);
        txt_Username.setText(null);
        cmb_Level.setSelectedIndex(0);
        
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        int exit = (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the application", "Exit", JOptionPane.YES_NO_CANCEL_OPTION));
        if (exit == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void check_PassVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_PassVisActionPerformed
        // TODO add your handling code here:
        if (check_PassVis.isSelected()){
            txt_Password.setEchoChar((char)0);
        } else {
            txt_Password.setEchoChar('*');
        }
    }//GEN-LAST:event_check_PassVisActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void cmb_LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_LevelActionPerformed
      
    }//GEN-LAST:event_cmb_LevelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    createDB();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                new LoginPage().setVisible(true);
            }
        });
    }
    public static void createDB() throws ClassNotFoundException{
        Connection con = null;
        Statement st = null; 
        
        try{
            Class.forName(DB.DRIVER);
            con = DriverManager.getConnection(DB.URL,DB.USER,DB.PASS);
            st = con.createStatement();
            
            String query = "create database attendance_system";
            st.executeUpdate(query);
            System.out.println("Database Created!");
            st.close();
            con.close();
        }
        catch(SQLException ex){
        }
        createTables();
    }
    public static void createTables() {
        Connection con = null;
        Statement st = null;
        //CREATING TABLE FOR EMPLOYEES
        String sql = "CREATE TABLE IF NOT EXISTS Employee " +
                   "(id INTEGER NOT NULL AUTO_INCREMENT, " +
                   " fname VARCHAR(255), " + 
                   " mname VARCHAR(255), " + 
                   " lname VARCHAR(255), " + 
                   " dob VARCHAR(255), " + 
                   " sex VARCHAR(255), " + 
                   " phone VARCHAR(255), " + 
                   " mail VARCHAR(255), " + 
                   " address VARCHAR(255), " + 
                   " dept VARCHAR(255), " + 
                   " designation VARCHAR(255), " + 
                   " salary double, " + 
                   " leaves INTEGER, " +
                   " joined VARCHAR(255), " +
                   " PRIMARY KEY ( id ))";
        String sql2 = "CREATE TABLE IF NOT EXISTS Attendance " +
                    "(date VARCHAR(255) NOT NULL, " +
                    "id INTEGER, " +
                    "att VARCHAR(255), " +
                    "type VARCHAR(255), " +
                    "reason VARCHAR(255))";
        String sql3 = "CREATE TABLE IF NOT EXISTS Login " +
                   "(id INTEGER NOT NULL, " +
                   " username VARCHAR(255), " + 
                   " password VARCHAR(255), " +
                   " dept VARCHAR(255), " +
                   " PRIMARY KEY ( id ))";
        try {
            Class.forName(DB.DRIVER);
            con = DB.connect();
            st = con.createStatement();
            st.executeUpdate(sql);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            
        }
        catch (SQLException e ) {
            System.out.println("An error has occured on Table Creation");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("An Mysql drivers were not found");
        }
    }
                
                
                
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Enter;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Reset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox check_PassVis;
    private javax.swing.JComboBox<String> cmb_Level;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
