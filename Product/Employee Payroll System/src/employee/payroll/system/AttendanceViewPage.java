/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shauryanratan
 */
public class AttendanceViewPage extends javax.swing.JFrame {

    /**
     * Creates new form AttendancePage
     */
    public AttendanceViewPage() {
        initComponents();
        ArrayList<Integer> list = getEmployeesList();
        for (int a = 0; a < list.size(); a++) {
            cmb_Profile.addItem(list.get(a)+"");
        }
        updateTable("All Employees");
    }

    public ArrayList<Integer> getEmployeesList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String sql = "select id from employee";
        Connection con = DB.connect();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                list.add(id);
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Employee IDs couldn't be fetched");
            System.out.println(ex);
        }
        return list;
    }
    public static double getSalary(int id) {
        String sql = "select salary from employee where id = "+id;
        Connection con = DB.connect();
        double salary = -1;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                salary = rs.getInt("salary");
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Employee Salaries couldn't be fetched");
            System.out.println(ex);
        }
        return salary;
    }
    public ArrayList<AttendanceModel> getEmployeesAttendance(String filter) {
        ArrayList<AttendanceModel> list = new ArrayList<AttendanceModel>();
        String sql = "";
        if(filter.equals("All Employees")){
            sql = "select * from attendance";
        }
        else
            sql = "select * from attendance where id = "+filter;
        Connection con = DB.connect();
        AttendanceModel user = null;
        try{
            list.clear();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String date = rs.getString("date");
                int id = rs.getInt("id");
                String att = rs.getString("att");
                String type = rs.getString("type");
                String reason = rs.getString("reason");
                user = new AttendanceModel(date,id,att,type,reason);
                list.add(user);
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Attendance couldn't be fetched", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        return list;
    }

    public void updateTable(String filter) {
        ArrayList<AttendanceModel> list = getEmployeesAttendance(filter);
        DefaultTableModel model = (DefaultTableModel) tbl_Attendance.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getDate();
            row[1] = list.get(i).getId();
            row[2] = list.get(i).getAtt();
            row[3] = list.get(i).getType();
            row[4] = list.get(i).getReason();

            model.addRow(row);
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

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_EmpCode = new javax.swing.JTextField();
        cmb_Attendance = new javax.swing.JComboBox<>();
        cmb_AbType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_AbReason = new javax.swing.JTextArea();
        btn_Insert = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        lbl_Date = new javax.swing.JLabel();
        txt_Date = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Attendance = new javax.swing.JTable();
        cmb_Profile = new javax.swing.JComboBox<>();

        jLabel8.setText("Type of Absence :");

        jLabel9.setText("Type of Absence :");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Employees Attendance ");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Employee Code :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Attendance :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Date :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Type of Absence :");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setText("Reason of Absence :");

        txt_EmpCode.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        cmb_Attendance.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cmb_Attendance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Present", "Absent", "Half-day" }));
        cmb_Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_AttendanceActionPerformed(evt);
            }
        });

        cmb_AbType.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        cmb_AbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Unpaid" }));

        txt_AbReason.setColumns(20);
        txt_AbReason.setRows(5);
        jScrollPane1.setViewportView(txt_AbReason);

        btn_Insert.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Update.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        tbl_Attendance.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        tbl_Attendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Employee Code", "Absences", "Type of Absence", "Absence Reason"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AttendanceMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_Attendance);

        cmb_Profile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Employees" }));
        cmb_Profile.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmb_ProfilePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmb_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(261, 261, 261)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmb_AbType, 0, 171, Short.MAX_VALUE)
                                            .addComponent(txt_EmpCode))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(cmb_Attendance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Back))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_Insert)
                        .addGap(95, 95, 95)
                        .addComponent(btn_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reset)
                        .addGap(110, 110, 110)
                        .addComponent(btn_Delete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(cmb_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Back)
                    .addComponent(lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmb_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_EmpCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_AbType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jScrollPane4.getAccessibleContext().setAccessibleParent(cmb_Attendance);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txt_EmpCode.setText(null);
        txt_Date.setDate(null);
        cmb_Attendance.setSelectedIndex(0);
        cmb_AbType.setSelectedIndex(0);
        txt_AbReason.setText(null);

    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        int id = -1;
        if(!txt_EmpCode.getText().equals(""))
            id = Integer.parseInt(txt_EmpCode.getText());
        String date = null;
        try{
            Date d = new Date(txt_Date.getDate().getTime());
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyy");
            date = f.format(d);
        }
        catch(Exception ex){}
        String attendance = cmb_Attendance.getSelectedItem().toString();
        String type = cmb_AbType.getSelectedItem().toString();
        String reason = txt_AbReason.getText();
        if(id == -1 || date == null || attendance == null || type == null){
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //fetching ids from database to check if the employee exists
            ArrayList<Integer> ids = getEmployeesList();
            //get the remaining leaves
            int leaves = getLeaves(id);
            if(ids.contains(id)){
                String query = "INSERT INTO attendance(date,id,att,type,reason) "
                        + "VALUES(?,?,?,?,?)";
                try {
                    Connection con = DB.connect();
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, date);
                    pst.setInt(2, id);
                    pst.setString(3, attendance);
                    pst.setString(4, type);
                    pst.setString(5, reason);
                    txt_EmpCode.setText(null);
                    txt_Date.setDate(null);
                    cmb_Attendance.setSelectedIndex(0);
                    cmb_AbType.setSelectedIndex(0);
                    txt_AbReason.setText(null);
                    if(!attendance.equals("Present") && leaves > 0){
                        pst.executeUpdate();
                        updateLeaves(id, "minus");
                    }
                    else if(attendance.equals("Present")){
                        pst.executeUpdate();
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Attendance not saved. You have no leaves left!");
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Please Enter Valid Employee ID", "Error", JOptionPane.ERROR_MESSAGE);
            int ID = Integer.parseInt(cmb_Profile.getSelectedItem().toString());
            updateTable(ID+"");
        }
    }//GEN-LAST:event_btn_InsertActionPerformed
    public static void updateLeaves(int id, String type){
        int leaves = getLeaves(id);
        double salary = getSalary(id);
        double deduct = salary/30;
        salary = salary - deduct;
        String query = "UPDATE employee SET leaves = ?, salary = ? WHERE id = "+id;
        try {
            Connection con = DB.connect();
            PreparedStatement pst = con.prepareStatement(query);
            if(type.equals("minus")){
                pst.setInt(1, leaves-1);
                pst.setDouble(2, salary);
            }
            else if(type.equals("add")){
                pst.setInt(1, leaves+1);
            }
            pst.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static int getLeaves(int id){
        int leaves = -1;
        String sql = "select leaves from employee where id = "+id;
        Connection con = DB.connect();
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                leaves = rs.getInt("leaves");
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Attendance couldn't be fetched", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        return leaves;
    }
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String filter = cmb_Profile.getSelectedItem().toString();
        ArrayList<AttendanceModel> list = getEmployeesAttendance(filter);
        int i = -1;
        try{
            i = tbl_Attendance.getSelectedRow();
        }
        catch(Exception ex){}
        if(i != -1){
            int id = list.get(i).getId();
            String date = list.get(i).getDate();
            String query = "DELETE FROM attendance WHERE date = ? and id = ?";


            try {
                Connection con = DB.connect();
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, date);
                pst.setInt(2, id);
                pst.executeUpdate();
                filter = cmb_Profile.getSelectedItem().toString();
                updateTable(filter);
                JOptionPane.showMessageDialog(null, "Attendance Updated!");
                txt_Date.setDateFormatString("");
                cmb_Attendance.setSelectedIndex(0);
                txt_Date.setEnabled(true);
                txt_EmpCode.setText("");
                txt_EmpCode.setEditable(true);
                txt_AbReason.setText("");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No row is selected from the table", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void tbl_AttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AttendanceMouseClicked
        txt_Date.setEnabled(false);
        txt_EmpCode.setEditable(false);
        int ID = Integer.parseInt(cmb_Profile.getSelectedItem().toString());
        ArrayList<AttendanceModel> list = getEmployeesAttendance(ID+"");
        int i = tbl_Attendance.getSelectedRow();
        int id = list.get(i).getId();
        String date = list.get(i).getDate();
        
        java.util.Date d;
        java.sql.Date sDate = null;
        try {
            d = new SimpleDateFormat("dd/MM/yyy").parse(date);
            sDate = new java.sql.Date(d.getTime());
        } catch (ParseException ex) {
            Logger.getLogger(AttendanceViewPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        txt_Date.setDate(sDate);
        txt_EmpCode.setText(id+"");
        cmb_Attendance.setSelectedItem(list.get(i).getAtt());
        cmb_AbType.setSelectedItem(list.get(i).getType());
        txt_AbReason.setText(list.get(i).getReason());
        
        
    }//GEN-LAST:event_tbl_AttendanceMouseClicked

    private void txt_DateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DateKeyPressed
        
    }//GEN-LAST:event_txt_DateKeyPressed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        String filter = cmb_Profile.getSelectedItem().toString();
        ArrayList<AttendanceModel> list = getEmployeesAttendance(filter);
        int i = -1;
        try{
            i = tbl_Attendance.getSelectedRow();
        }
        catch(Exception ex){}
        if(i != -1){
            int id = list.get(i).getId();
            String date = list.get(i).getDate();

            String att = cmb_Attendance.getSelectedItem().toString();
            String type = cmb_AbType.getSelectedItem().toString();
            String reason = txt_AbReason.getText();


            String query = "UPDATE attendance SET att = ? , type = ? , reason = ? WHERE id = ? and date = ?";

            try {
                Connection con = DB.connect();
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, att);
                pst.setString(2, type);
                pst.setString(3, reason);
                pst.setInt(4, id);
                pst.setString(5, date);
                pst.executeUpdate();
                filter = cmb_Profile.getSelectedItem().toString();
                updateTable(filter);
                JOptionPane.showMessageDialog(null, "Attendance Updated!");
                txt_Date.setDateFormatString("");
                cmb_Attendance.setSelectedIndex(0);
                txt_Date.setEnabled(true);
                txt_EmpCode.setText("");
                txt_EmpCode.setEditable(true);
                txt_AbReason.setText("");
                
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No row is selected from the table", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        int exit = (JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the form", "Exit", JOptionPane.YES_NO_CANCEL_OPTION));
        if (exit == 0) {
            MainPage page = new MainPage();
            page.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btn_BackActionPerformed

    private void cmb_AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_AttendanceActionPerformed
        if(cmb_Attendance.getSelectedItem().equals("Present")){
            cmb_AbType.setEnabled(false);
            txt_AbReason.setEnabled(false);
        }
        else{
            cmb_AbType.setEnabled(true);
            txt_AbReason.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_AttendanceActionPerformed

    private void cmb_ProfilePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmb_ProfilePopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmb_ProfilePopupMenuWillBecomeInvisible

    private void cmb_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ProfileActionPerformed
        String filter = cmb_Profile.getSelectedItem().toString();
        updateTable(filter);
    }//GEN-LAST:event_cmb_ProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> cmb_AbType;
    private javax.swing.JComboBox<String> cmb_Attendance;
    private javax.swing.JComboBox<String> cmb_Profile;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JTable tbl_Attendance;
    private javax.swing.JTextArea txt_AbReason;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JTextField txt_EmpCode;
    // End of variables declaration//GEN-END:variables

}
