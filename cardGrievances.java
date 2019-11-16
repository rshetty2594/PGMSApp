/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmsapp;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author urn
 */
public class cardGrievances extends javax.swing.JPanel {

    /**
     * Creates new form cardGrievances
     */
    int x=0;
    private boolean up;
    private int ut;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rsGrievance;
    private String dbName="db_grievance";
    private String uName;
    public cardGrievances() {
        initComponents();
         panelGShow.setVisible(true);
        panelGView.setVisible(false);
         try {
            up=false;
            ut=0;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
          //  panelMain.setVisible(false);
           // panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from "+dbName);
           // ps.setString(1, email);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(this, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }        // TODO
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
        panelGShow = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUGrievance = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cbUType = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        panelGView = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfGCategory = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfLandMark = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();
        lblImage = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableUGrievance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableUGrievance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableUGrievance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableUGrievance.setToolTipText("");
        tableUGrievance.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableUGrievance.setAutoscrolls(false);
        tableUGrievance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableUGrievance.setGridColor(new java.awt.Color(0, 0, 0));
        tableUGrievance.setRowMargin(5);
        tableUGrievance.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableUGrievance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUGrievanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUGrievance);

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnModify.setText("View in Details");
        btnModify.setToolTipText("");
        btnModify.setBorder(null);
        btnModify.setBorderPainted(false);
        btnModify.setContentAreaFilled(false);
        btnModify.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModify.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModify.setInheritsPopupMenu(true);
        btnModify.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnModify.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Grievance Type");

        cbUType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbUType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Public Grievances", "NGO Grievances" }));
        cbUType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUTypeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Grievance List");

        javax.swing.GroupLayout panelGShowLayout = new javax.swing.GroupLayout(panelGShow);
        panelGShow.setLayout(panelGShowLayout);
        panelGShowLayout.setHorizontalGroup(
            panelGShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGShowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGShowLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbUType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGShowLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(panelGShowLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelGShowLayout.setVerticalGroup(
            panelGShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGShowLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(panelGShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(panelGShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 420));

        panelGView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Grievance Details-");
        panelGView.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 27));

        tfName.setEditable(false);
        tfName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGView.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Category : ");
        panelGView.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 27));

        tfGCategory.setEditable(false);
        tfGCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGView.add(tfGCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 150, 30));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfAddress.setEditable(false);
        tfAddress.setBackground(new java.awt.Color(240, 240, 240));
        tfAddress.setColumns(20);
        tfAddress.setLineWrap(true);
        tfAddress.setRows(4);
        jScrollPane3.setViewportView(tfAddress);

        panelGView.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 150, 50));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Address");
        panelGView.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 72, 27));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Landmark");
        panelGView.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 27));

        tfLandMark.setEditable(false);
        tfLandMark.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGView.add(tfLandMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Grievance Description");
        panelGView.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, 27));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfDescription.setEditable(false);
        tfDescription.setBackground(new java.awt.Color(240, 240, 240));
        tfDescription.setColumns(20);
        tfDescription.setLineWrap(true);
        tfDescription.setRows(4);
        jScrollPane2.setViewportView(tfDescription);

        panelGView.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 70));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setToolTipText("");
        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        panelGView.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 180, 180));

        tfCity.setEditable(false);
        tfCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGView.add(tfCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 140, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Uploaded Image");
        panelGView.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 174, 27));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("City");
        panelGView.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 40, 27));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Name");
        panelGView.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 72, 27));

        btnGoBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnGoBack.setText("Go Back");
        btnGoBack.setToolTipText("");
        btnGoBack.setBorder(null);
        btnGoBack.setBorderPainted(false);
        btnGoBack.setContentAreaFilled(false);
        btnGoBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGoBack.setInheritsPopupMenu(true);
        btnGoBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnGoBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });
        panelGView.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 240, 80));

        add(panelGView, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 530, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void tableUGrievanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUGrievanceMouseClicked
        // TODO add your handling code here:
        x=tableUGrievance.getSelectedRow();
        if(x>-1)
        {
            btnModify.setEnabled(true);
        }
    }//GEN-LAST:event_tableUGrievanceMouseClicked

    public DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        try {
            // TODO add your handling code here:
            String gName=(String) tableUGrievance.getValueAt(x, 2);
            uName=(String) tableUGrievance.getValueAt(x, 1);
            String gCity=(String) tableUGrievance.getValueAt(x, 3);
            String gAddress=(String) tableUGrievance.getValueAt(x, 4);
            String gLandMark=(String) tableUGrievance.getValueAt(x, 5);
            String gCategory=(String) tableUGrievance.getValueAt(x, 6);
            String gDescription=(String) tableUGrievance.getValueAt(x, 7);
            rsGrievance.previous();
            Blob filenameBlob = rsGrievance.getBlob("g_image");
         byte[] img = filenameBlob.getBytes(1L,(int)filenameBlob.length());
           // byte[] img = rsGrievance.getBytes("g_image");
            // gId=(long) tableUGrievance.getValueAt(x, 0);
            
            tfName.setText(uName);
            tfAddress.setText(gAddress);
            
            tfCity.setText(gCity);
            tfGCategory.setText(gCategory);
            tfDescription.setText(gDescription);
            tfLandMark.setText(gLandMark);
            ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    lblImage.setIcon(newImage);
            panelGShow.setVisible(false);
            panelGView.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(cardGrievances.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void cbUTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUTypeActionPerformed
        // TODO add your handling code here:
        if(cbUType.getSelectedIndex()==0)
            dbName="db_grievance";
        else
            dbName="db_ngo_grievance";
        
        try {
            up=false;
            ut=0;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
          //  panelMain.setVisible(false);
           // panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from "+dbName);
           // ps.setString(1, email);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(this, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }        // TODO
    }//GEN-LAST:event_cbUTypeActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        panelGView.setVisible(false);
        panelGShow.setVisible(true);
       // panelGView.setEnabled(false);
    }//GEN-LAST:event_btnGoBackActionPerformed
public static void main(String args[])
{
    new cardGrievances().setVisible(true);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnModify;
    private javax.swing.JComboBox<String> cbUType;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel panelGShow;
    private javax.swing.JPanel panelGView;
    private javax.swing.JTable tableUGrievance;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JTextField tfGCategory;
    private javax.swing.JTextField tfLandMark;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}