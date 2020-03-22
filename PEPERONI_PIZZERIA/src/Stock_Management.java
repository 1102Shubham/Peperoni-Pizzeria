
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RUDRA
 */
public class Stock_Management extends javax.swing.JFrame {

    /**
     * Creates new form Stock_Management
     */
    public Stock_Management() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 4), new java.awt.Dimension(0, 4), new java.awt.Dimension(32767, 4));
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SHOW_STOCK_ = new javax.swing.JButton();
        CLEAR_ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        UPDATE_ = new javax.swing.JButton();
        Update_id = new javax.swing.JTextField();
        Update_price = new javax.swing.JTextField();
        Update_name = new javax.swing.JTextField();
        DELETE_ = new javax.swing.JButton();
        Delete_id = new javax.swing.JTextField();
        INSERT_ = new javax.swing.JButton();
        Insert_id = new javax.swing.JTextField();
        Insert_name = new javax.swing.JTextField();
        Insert_price = new javax.swing.JTextField();
        BACK_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/peperoni_logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel10.setText("     PEPERONI PIZZERIA");

        jLabel13.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel13.setText("........all we Knead is LOVE !");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_Id", "Item_Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 60)); // NOI18N
        jLabel3.setText("MANAGEMENT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 60)); // NOI18N
        jLabel4.setText("STOCK ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        SHOW_STOCK_.setBackground(new java.awt.Color(255, 255, 255));
        SHOW_STOCK_.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        SHOW_STOCK_.setText("SHOW WHOLE STOCK");
        SHOW_STOCK_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOW_STOCK_ActionPerformed(evt);
            }
        });

        CLEAR_.setBackground(new java.awt.Color(255, 255, 255));
        CLEAR_.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        CLEAR_.setText("CLEAR");
        CLEAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR_ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel14.setText("   TO UPDATE Item_Name Or Price FROM STOCK");

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel15.setText("     TO DELETE AN ITEM FROM STOCK");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel16.setText("      TO INSERT AN ITEM TO STOCK");

        UPDATE_.setBackground(new java.awt.Color(255, 255, 255));
        UPDATE_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        UPDATE_.setText("UPDATE");
        UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_ActionPerformed(evt);
            }
        });

        Update_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Update_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Update_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        DELETE_.setBackground(new java.awt.Color(255, 255, 255));
        DELETE_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        DELETE_.setText("DELETE");
        DELETE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_ActionPerformed(evt);
            }
        });

        Delete_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        INSERT_.setBackground(new java.awt.Color(255, 255, 255));
        INSERT_.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        INSERT_.setText("INSERT");
        INSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_ActionPerformed(evt);
            }
        });

        Insert_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Insert_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Insert_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BACK_.setBackground(new java.awt.Color(255, 255, 255));
        BACK_.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        BACK_.setText("BACK");
        BACK_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACK_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4)
                                                    .addGap(112, 112, 112)))))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(49, 49, 49))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(146, 146, 146)
                                    .addComponent(DELETE_)
                                    .addGap(18, 18, 18)
                                    .addComponent(Delete_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(UPDATE_)
                                    .addGap(18, 18, 18)
                                    .addComponent(Update_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Update_name, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Update_price, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(47, 47, 47)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(INSERT_)
                        .addGap(18, 18, 18)
                        .addComponent(Insert_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BACK_)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Insert_name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Insert_price, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SHOW_STOCK_)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CLEAR_)
                        .addGap(59, 59, 59)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SHOW_STOCK_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CLEAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETE_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BACK_, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/menu_pasta.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Menu/menu_pizza.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(633, 633, 633))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    
    }//GEN-LAST:event_jLabel1MouseClicked
    
// THIS IS CREATED TO SHOW ENTIRE STOCK OR MENU
       private void show_table() {
       try  {
            DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
            rs = st.executeQuery("select * from menu");
            while (rs.next())  
            {  Object row[]={rs.getString(1),rs.getString(2),rs.getString(3)};
               t1.addRow(row); }       }
       catch (Exception e) {System.out.println(e.toString());}   
       }    
       
    private void SHOW_STOCK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOW_STOCK_ActionPerformed
    // WHEN THIS BUTTON IS CLICKED ENTIRE STOCK IS DISPLAYED 
       show_table();
    }//GEN-LAST:event_SHOW_STOCK_ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // THIS MAKES CONNECTION BETWEEN Net Beans AND MySQL    
       try
       {
        //Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.
        getConnection("jdbc:mysql://db4free.net:3306/peperonipizzeria","curiorimor","curiorimor");
        st=con.createStatement();
       }
       catch (Exception e) {System.out.println(e.toString());}
    }//GEN-LAST:event_formWindowOpened

    private void CLEAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR_ActionPerformed
    // WHEN CLEAR BUTTON IS CLICKED ENTIRE TABLE GETS CLEARED
       DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
       t1.setRowCount(0);
    }//GEN-LAST:event_CLEAR_ActionPerformed

    private void UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_ActionPerformed
    /* WHEN UPDATE BUTTON IS CLICKED, RESPECTIVE STOCK GETS UPDATED AND 
       THEN UPDATED STOCK IS DISPLAYED */        
       try
       {
        DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
        String i=Update_id.getText();
        String j=Update_name.getText();
        int k=Integer.parseInt(Update_price.getText());
        st.executeUpdate("update menu set Item_Name='"+j+"',"+
                         "Price="+k+" where Item_Id='"+i+"'");          
        
        Update_id.setText(" ");
        Update_price.setText(" ");
        Update_name.setText(" ");
        
        t1.setRowCount(0);
        show_table();
       }
       catch (Exception e) {System.out.println(e.toString());}

    }//GEN-LAST:event_UPDATE_ActionPerformed

    private void DELETE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_ActionPerformed
    /* WHEN DELETE BUTTON IS CLICKED, RESPECTIVE STOCK GETS DELETED AND 
       THEN REMAINING STOCK IS DISPLAYED */
       try
        {
         DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
         String i=Delete_id.getText();
         st.executeUpdate("delete from menu where Item_Id='"+i+"'");           
        
         Delete_id.setText(" ");        
         t1.setRowCount(0);
         show_table();
        }
       catch (Exception e) {System.out.println(e.toString());} 
    }//GEN-LAST:event_DELETE_ActionPerformed

    private void INSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_ActionPerformed
    /* WHEN INSERT BUTTON IS CLICKED, RESPECTIVE STOCK GETS ADDED TO STOCK
       AND THEN UPDATED STOCK IS DISPLAYED */
       try
       {
        DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
        String i=Insert_id.getText();
        String j=Insert_name.getText();
        int k=Integer.parseInt(Insert_price.getText());
        st.executeUpdate("insert into menu values('"+i+"' , '"+j+"', "+k+");");
       
        Insert_id.setText(" ");
        Insert_name.setText(" ");
        Insert_price.setText(" ");
        t1.setRowCount(0);
        show_table();
       }
       catch (Exception e) {System.out.println(e.toString());}         
    }//GEN-LAST:event_INSERT_ActionPerformed

    private void BACK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACK_ActionPerformed
    // WHEN BACK BUTTON IS CLICKED ADMIN PAGE IS DISPLAYED       
       Admin_Page ap=new Admin_Page();
       ap.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BACK_ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    /* WHEN ANY ROW FROM TABLE IS SELECTED THEN IT'S ITEM_ID IS DISPLAYED 
       FOR UPDATING OR DELETING RESPECTIVE STOCK */
       DefaultTableModel t1=(DefaultTableModel) jTable1.getModel();
       int r=jTable1.getSelectedRow();
       String i=(""+t1.getValueAt(r,0));
       Update_id.setText(""+i);
       Delete_id.setText(""+i);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Stock_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK_;
    private javax.swing.JButton CLEAR_;
    private javax.swing.JButton DELETE_;
    private javax.swing.JTextField Delete_id;
    private javax.swing.JButton INSERT_;
    private javax.swing.JTextField Insert_id;
    private javax.swing.JTextField Insert_name;
    private javax.swing.JTextField Insert_price;
    private javax.swing.JButton SHOW_STOCK_;
    private javax.swing.JButton UPDATE_;
    private javax.swing.JTextField Update_id;
    private javax.swing.JTextField Update_name;
    private javax.swing.JTextField Update_price;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
