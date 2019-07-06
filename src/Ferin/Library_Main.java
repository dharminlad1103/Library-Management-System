/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferin;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

/**
 *
 * @author Ferin
 */
public class Library_Main extends javax.swing.JFrame {

    /**
     * Creates new form Library_Main
     */
    public Library_Main() {
        setTitle(" Library Management System");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ferin.jpg")));
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

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        stu_name = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        enroll = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        book_name = new javax.swing.JTextField();
        branch = new javax.swing.JComboBox<>();
        book_id = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        author = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        edition = new javax.swing.JTextField();
        delete_book = new javax.swing.JButton();
        add_book = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_submit = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        label10 = new java.awt.Label();

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        label1.setText("Library Management System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1670, 800));
        jPanel1.setLayout(null);

        label2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label2.setText("Branch :");
        jPanel1.add(label2);
        label2.setBounds(30, 280, 169, 50);

        label3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label3.setText("Book Name :");
        jPanel1.add(label3);
        label3.setBounds(548, 150, 158, 40);

        stu_name.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(stu_name);
        stu_name.setBounds(209, 150, 224, 40);

        label4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label4.setText("Enrollment :");
        jPanel1.add(label4);
        label4.setBounds(30, 220, 169, 40);

        enroll.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(enroll);
        enroll.setBounds(209, 222, 224, 40);

        label5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label5.setText("Student Name:");
        jPanel1.add(label5);
        label5.setBounds(20, 150, 169, 40);

        label6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label6.setText("Date of Issue :");
        jPanel1.add(label6);
        label6.setBounds(550, 290, 158, 40);

        label7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label7.setText("Book ID :");
        jPanel1.add(label7);
        label7.setBounds(550, 220, 158, 40);

        book_name.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(book_name);
        book_name.setBounds(700, 150, 220, 40);

        branch.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "Enviroment", "Chemical", "Electrical", "Mechanical" }));
        jPanel1.add(branch);
        branch.setBounds(210, 290, 220, 40);

        book_id.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(book_id);
        book_id.setBounds(710, 222, 210, 40);

        label8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label8.setText("Edition :");
        jPanel1.add(label8);
        label8.setBounds(980, 220, 220, 40);

        author.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(author);
        author.setBounds(1220, 150, 270, 40);

        label9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label9.setText("Author/Publication :");
        jPanel1.add(label9);
        label9.setBounds(980, 150, 220, 40);

        edition.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(edition);
        edition.setBounds(1220, 220, 270, 40);

        delete_book.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        delete_book.setText("Delete ");
        delete_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bookActionPerformed(evt);
            }
        });
        jPanel1.add(delete_book);
        delete_book.setBounds(1410, 280, 140, 50);

        add_book.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        add_book.setText("Add Book");
        add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookActionPerformed(evt);
            }
        });
        jPanel1.add(add_book);
        add_book.setBounds(1220, 280, 140, 50);

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Book ID", "Publication", "Edition", "Date Of Issue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 370, 860, 402);

        btn_submit.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit);
        btn_submit.setBounds(1240, 660, 230, 80);

        btn_search.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn_search.setText("Return Book");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search);
        btn_search.setBounds(1240, 460, 230, 80);

        jDateChooser.setDateFormatString("d MMM , yyyy");
        jDateChooser.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jPanel1.add(jDateChooser);
        jDateChooser.setBounds(710, 290, 210, 40);

        label10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        label10.setText("Copyrights @ Ferin Patel");
        jPanel1.add(label10);
        label10.setBounds(1520, 780, 143, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
       
        int flag = 0;
        if(jTable1.getRowCount() < 1 && book_name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter Some Books");
        }
        else
        {
            String date1 = sdf.format(jDateChooser.getDate());
           try
           {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.prepareStatement("insert into student values (?,?,?)");
            st.setString(1,stu_name.getText());
            st.setString(2,enroll.getText());
            st.setString(3,branch.getSelectedItem().toString());
            st.execute();
           }
           catch(Exception e)
           {
               System.out.println("1st Try block");
               System.out.println("error "+e.getMessage());
           }
           
           try
           {
                   for(int i=0;i<jTable1.getRowCount();i++)
                   {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                        st = con.prepareStatement("insert into book values (?,?,?,?,?,?)");
                        st.setString(1,enroll.getText());
                        st.setString(2,jTable1.getModel().getValueAt(i,0).toString());
                        st.setString(3,jTable1.getModel().getValueAt(i,1).toString());
                        st.setString(4,jTable1.getModel().getValueAt(i,2).toString());
                        st.setString(5,jTable1.getModel().getValueAt(i,3).toString());
                        st.setString(6,date1);
                        st.execute();
                        flag = 1;
                   }    
           }
           catch(Exception e)
           {
               System.out.println("2nd try block");
               System.out.println(e.getMessage());
           }
           if (flag == 1)
           {
               System.out.println("Success");
               JOptionPane.showMessageDialog(null,"Data Enter Successfully");
               flag = 0;
           }
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd",Locale.getDefault());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
        String date1 = sdf.format(jDateChooser.getDate());
        
        model.addRow(new Object[]{book_name.getText(),book_id.getText(),author.getText(),edition.getText(),date1});
        
        book_name.setText("");
        book_id.setText("");
        author.setText("");
        edition.setText("");
        

    }//GEN-LAST:event_add_bookActionPerformed

    private void delete_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bookActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = jTable1.getSelectedRow();
        model.removeRow(row);
    }//GEN-LAST:event_delete_bookActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        new Search().setVisible(true);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Library_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_book;
    private javax.swing.JTextField author;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_name;
    private javax.swing.JComboBox<String> branch;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton delete_book;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField enroll;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField stu_name;
    // End of variables declaration//GEN-END:variables
}
