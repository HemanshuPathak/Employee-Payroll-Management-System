
package employee.payroll.system;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;


public class MainMenu extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public MainMenu() {
        initComponents();
         conn=db.java_db();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        txt_emp.setText(String.valueOf(Emp.empId).toString());
        
    }
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add_employee = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_emp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        btn_menu = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/logout.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(950, 10, 40, 30);

        jButton7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Payment.png"))); // NOI18N
        jButton7.setText("Payment");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(770, 310, 197, 57);

        jButton3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Deduction.png"))); // NOI18N
        jButton3.setText("Deduction");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(550, 310, 197, 57);

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Allowance.png"))); // NOI18N
        jButton2.setText("Allowance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(550, 240, 197, 57);

        add_employee.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        add_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Add_Employee.png"))); // NOI18N
        add_employee.setText("Employee Manager");
        add_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_employeeActionPerformed(evt);
            }
        });
        jPanel2.add(add_employee);
        add_employee.setBounds(550, 170, 197, 57);

        jButton4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Search.png"))); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(770, 170, 197, 57);

        jButton5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/Update.png"))); // NOI18N
        jButton5.setText("Update Salary");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(770, 240, 197, 57);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/ViewCerti.png"))); // NOI18N
        jButton1.setText("View Certifications");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(550, 380, 200, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/system/Images/AdminP.jpg")));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 620);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged in As :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 590, 90, 16);

        txt_emp.setForeground(new java.awt.Color(255, 255, 255));
        txt_emp.setText("Employee ID");
        jPanel2.add(txt_emp);
        txt_emp.setBounds(90, 590, 80, 16);

        jMenu1.setText("Employee");

        jMenuItem1.setText("Employee Registeration");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Reports");

        jMenuItem6.setText("Employees RP");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Employee Total Allowance RP");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem2.setText("Employee Total Deduction RP");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        btn_menu.setText("Audit");

        jMenuItem13.setText("Add User");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        btn_menu.add(jMenuItem13);

        jMenuItem5.setText("Audit Trail");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        btn_menu.add(jMenuItem5);

        jMenuBar1.add(btn_menu);

        jMenu7.setText("About");

        jMenuItem3.setText("Version 1.0");
        jMenu7.add(jMenuItem3);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        
        users x = new users();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Audit_details x = new Audit_details();
        x.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        updateSalary x = new updateSalary();
        x.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        searchEmployee e = new searchEmployee();
        e.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void add_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_employeeActionPerformed
        // TODO add your handling code here:
        addEmployee x = new addEmployee();
        x.setVisible(true);
    }//GEN-LAST:event_add_employeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Allowance x = new Allowance();
        x.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        login x = new login();
        x.setVisible(true);
        this.dispose();
        
          try{
                   Date currentDate = GregorianCalendar.getInstance().getTime();
                  DateFormat df = DateFormat.getDateInstance();
                  String dateString = df.format(currentDate);

                  Date d = new Date();
                  SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                  String timeString = sdf.format(d);

                  String value0 = timeString;
                  String values = dateString;
                   
                   
                   int value = Emp.empId;
                   String reg = "insert into Audit (emp_id,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged out')";
                   pst=conn.prepareStatement(reg);
                   pst.execute();
                   this.dispose();
          }catch (Exception e){
              
               JOptionPane.showMessageDialog(null, e);

        }
        finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
                
            }
              
          }
        
        
        

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
       addEmployee x = new addEmployee();
        x.setVisible(true);
        

        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("Employees Report.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            String sql ="select * from Staff_information";
            
 
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
           
           Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
           PdfPTable table = new PdfPTable(13);
           myDocument.open();
           
   
           float[] columnWidths = new float[] {3,8,7,5,5,9,8,9,6,6,6,8,8};
           table.setWidths(columnWidths);

           table.setWidthPercentage(100); //set table width to 100%
           
          
          myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
          myDocument.add(new Paragraph(new Date().toString()));
          myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
          table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Date of Birth",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Telephone",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Date Hired",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Job Title",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          
          while(rs.next())
            {
                
           
           table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(16),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(17),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(18),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
          
            }
           
           myDocument.add(table);
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
     }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
         
     }
     finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     }
   }
           
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("Employee Allowance Report.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            String sql ="select * from Allowance";
            
 
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
           
           Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
           PdfPTable table = new PdfPTable(11);
           myDocument.open();
           
   
           float[] columnWidths = new float[] { 3,7,7,5,5,9,6,5,8,8,8};
           table.setWidths(columnWidths);

           table.setWidthPercentage(100); //set table width to 100%
           
          
           myDocument.add(new Paragraph("Employees Allowance List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph(new Date().toString()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
          table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Overtime",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Bonus",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Other",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Rate",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Allowance",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          
          
          while(rs.next())
            {
                
           
           table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
          
            }
           
           myDocument.add(table);
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
     }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
         
     }
     finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     }
   }
        
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
        employeeDeductions x = new employeeDeductions();
         x.setVisible(true);
                                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         searchEmpSalarySlip x = new searchEmpSalarySlip();
         x.setVisible(true);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("Employee Deduction Report.pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            String sql ="select * from Deductions";
            
 
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
           
           Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
           PdfPTable table = new PdfPTable(8);
           myDocument.open();
           
   
           float[] columnWidths = new float[] { 3,7,7,5,5,9,6,5};
           table.setWidths(columnWidths);

           table.setWidthPercentage(100); //set table width to 100%
           
          
           myDocument.add(new Paragraph("Employees Deduction List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph(new Date().toString()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
          table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Deduction Amount",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Deduction Reason",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Created By",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
     
          
          
          while(rs.next())
            {
           table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
          
          
            }
           
           myDocument.add(table);
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
     }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
         
     }
     finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     }
   }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewCertifications x = new ViewCertifications();
         x.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_employee;
    private javax.swing.JMenu btn_menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_emp;
    // End of variables declaration//GEN-END:variables
}
