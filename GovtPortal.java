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
public class GovtPortal extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement ps;
    private String email;
    private ResultSet rsGrievance;
    private ResultSet rs;
    int x;
    int ut;
    private boolean up;
    private String dbName;
    private String uName;
    private long gId;
    private String gDomain;
    private String uDomain;
    private PreparedStatement ps2;
    private String gResolution;
    private PreparedStatement ps3;
    private ResultSet rsGrievanceImg;

    /**
     * Creates new form NgoPortal
     */
    public GovtPortal(ResultSet rs) throws SQLException {
        initComponents();
         dbName="db_grievance";
        panelGView.setVisible(false);
         btnModify.setEnabled(false);
        //panelMain.setVisible();
        this.rs=rs;
        tfUName.setText(rs.getString("u_name"));
        ut=rs.getInt("u_type");
        email=rs.getString("u_email");
        //uDomain=rs.getString("u_domain");
      //  panelGStatus.setVisible(false);
       // lblHello.setText("Hello "+rs.getString("u_name")+", how can we help you? (Choose an option)" );
       try {
           uDomain=rs.getString("u_domain");
           tfGovtType.setText(uDomain);
            up=false;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
          //  panelMain.setVisible(false);
            panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from db_grievance where g_Category = ?");
           ps.setString(1, uDomain);
           // ps.setString(1, email);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(rootPane, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGStatus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUGrievance = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbNgoGrievance = new javax.swing.JRadioButton();
        rbPublicGrievance = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        tfUName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfGovtType = new javax.swing.JTextField();
        btnLogOut = new javax.swing.JButton();
        btnFundRaiser = new javax.swing.JButton();
        panelGView = new javax.swing.JPanel();
        panelGInfo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfResolution = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfAddress = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        tfGCategory = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnSetViewStatus = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        btnUpdateGrievance1 = new javax.swing.JButton();
        tfLandMark = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NGO Portal");
        setLocation(new java.awt.Point(200, 200));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Select any Grievance to View/Give Resolution", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        panelGStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelGStatus.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 500, 270));

        btnModify.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnModify.setText("View Details");
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
        panelGStatus.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 240, 70));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Select Grievance Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(453, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbNgoGrievance);
        rbNgoGrievance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbNgoGrievance.setText("NGO Grievances");
        rbNgoGrievance.setContentAreaFilled(false);
        rbNgoGrievance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbNgoGrievance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbNgoGrievance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rbNgoGrievance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        rbNgoGrievance.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        rbNgoGrievance.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        rbNgoGrievance.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        rbNgoGrievance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNgoGrievanceActionPerformed(evt);
            }
        });
        jPanel1.add(rbNgoGrievance, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, 70));

        buttonGroup1.add(rbPublicGrievance);
        rbPublicGrievance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbPublicGrievance.setSelected(true);
        rbPublicGrievance.setText("Public Grievance");
        rbPublicGrievance.setContentAreaFilled(false);
        rbPublicGrievance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbPublicGrievance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbPublicGrievance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rbPublicGrievance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        rbPublicGrievance.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        rbPublicGrievance.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        rbPublicGrievance.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        rbPublicGrievance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPublicGrievanceActionPerformed(evt);
            }
        });
        jPanel1.add(rbPublicGrievance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 70));

        panelGStatus.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 330, 470, 90));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Authority Name");
        panelGStatus.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 27));

        tfUName.setEditable(false);
        tfUName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGStatus.add(tfUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Category Associated with ");
        panelGStatus.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 27));

        tfGovtType.setEditable(false);
        tfGovtType.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGStatus.add(tfGovtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, 30));

        btnLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.setToolTipText("");
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogOut.setInheritsPopupMenu(true);
        btnLogOut.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnLogOut.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        panelGStatus.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 70));

        btnFundRaiser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFundRaiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnFundRaiser.setText("View Fundraisers");
        btnFundRaiser.setToolTipText("");
        btnFundRaiser.setBorder(null);
        btnFundRaiser.setBorderPainted(false);
        btnFundRaiser.setContentAreaFilled(false);
        btnFundRaiser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFundRaiser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFundRaiser.setInheritsPopupMenu(true);
        btnFundRaiser.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnFundRaiser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnFundRaiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFundRaiserActionPerformed(evt);
            }
        });
        panelGStatus.add(btnFundRaiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 70));

        getContentPane().add(panelGStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 490));

        panelGView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Griveance Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 0, 51))); // NOI18N
        panelGInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Resolution");
        panelGInfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 27));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("City");
        panelGInfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 45, 27));

        tfName.setEditable(false);
        tfName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGInfo.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 53, 312, -1));

        tfCity.setEditable(false);
        tfCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGInfo.add(tfCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 310, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Grievence Category : ");
        panelGInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 95, -1, 27));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Name");
        panelGInfo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 50, 72, 27));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfResolution.setColumns(20);
        tfResolution.setLineWrap(true);
        tfResolution.setRows(4);
        jScrollPane2.setViewportView(tfResolution);

        panelGInfo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 272, 310, 80));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Address");
        panelGInfo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 72, 27));

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfAddress.setEditable(false);
        tfAddress.setBackground(new java.awt.Color(240, 240, 240));
        tfAddress.setColumns(20);
        tfAddress.setLineWrap(true);
        tfAddress.setRows(4);
        jScrollPane3.setViewportView(tfAddress);

        panelGInfo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 140, 312, 52));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Landmark");
        panelGInfo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 203, 80, 27));

        tfGCategory.setEditable(false);
        tfGCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGInfo.add(tfGCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 230, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Uploaded Image");
        panelGInfo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 174, 27));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setToolTipText("");
        lblImage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        panelGInfo.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 230, 160));

        btnSetViewStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSetViewStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnSetViewStatus.setText("Mak as Viewed");
        btnSetViewStatus.setToolTipText("");
        btnSetViewStatus.setBorder(null);
        btnSetViewStatus.setBorderPainted(false);
        btnSetViewStatus.setContentAreaFilled(false);
        btnSetViewStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSetViewStatus.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_viewed.png"))); // NOI18N
        btnSetViewStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSetViewStatus.setInheritsPopupMenu(true);
        btnSetViewStatus.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnSetViewStatus.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnSetViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetViewStatusActionPerformed(evt);
            }
        });
        panelGInfo.add(btnSetViewStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 221, 60));

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
        panelGInfo.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 240, 80));

        btnUpdateGrievance1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdateGrievance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_normal.png"))); // NOI18N
        btnUpdateGrievance1.setText("Give a Resolution");
        btnUpdateGrievance1.setToolTipText("");
        btnUpdateGrievance1.setBorder(null);
        btnUpdateGrievance1.setBorderPainted(false);
        btnUpdateGrievance1.setContentAreaFilled(false);
        btnUpdateGrievance1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateGrievance1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateGrievance1.setInheritsPopupMenu(true);
        btnUpdateGrievance1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_clicked.png"))); // NOI18N
        btnUpdateGrievance1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pgmsapp/button_mouseover.png"))); // NOI18N
        btnUpdateGrievance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGrievance1ActionPerformed(evt);
            }
        });
        panelGInfo.add(btnUpdateGrievance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 221, 60));

        tfLandMark.setEditable(false);
        tfLandMark.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panelGInfo.add(tfLandMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 203, 310, -1));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfDescription.setEditable(false);
        tfDescription.setBackground(new java.awt.Color(240, 240, 240));
        tfDescription.setColumns(20);
        tfDescription.setLineWrap(true);
        tfDescription.setRows(4);
        jScrollPane4.setViewportView(tfDescription);

        panelGInfo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 220, 90));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Description");
        panelGInfo.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 110, 27));

        panelGView.add(panelGInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        getContentPane().add(panelGView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 790, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private void tableUGrievanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUGrievanceMouseClicked
        // TODO add your handling code here:
        x=tableUGrievance.getSelectedRow();
        if(x>-1)
        {
            btnModify.setEnabled(true);
        }
    }//GEN-LAST:event_tableUGrievanceMouseClicked

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
            gId=(long) tableUGrievance.getValueAt(x, 0);
            //gResolution=(String) tableUGrievance.getValueAt(x, 8);
            
            tfName.setText(uName);
            tfAddress.setText(gAddress);
            
            tfCity.setText(gCity);
            tfGCategory.setText(gCategory);
            tfDescription.setText(gDescription);
            tfLandMark.setText(gLandMark);
            
            ps3=con.prepareStatement("select g_image from db_grievance where g_id = ?");
           ps3.setLong(1, gId);
           // ps.setString(1, email);
            rsGrievanceImg=ps.executeQuery();
            if(rsGrievanceImg.next())
            {
            //rsGrievanceImg.previous();
            Blob filenameBlob = rsGrievanceImg.getBlob("g_image");
            byte[] img = filenameBlob.getBytes(1L,(int)filenameBlob.length());
            ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newImage = new ImageIcon(myImg);
                    lblImage.setIcon(newImage);
            }
            
            
            
            panelGStatus.setVisible(false);
            panelGView.setVisible(true);
            // new GrievanceUpdate(gId,gName,gCity,gAddress,gLandMark,gDescription,ut,up).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GovtPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void rbPublicGrievanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPublicGrievanceActionPerformed
        // TODO add your handling code here:
        try {
            dbName="db_grievance";
            up=false;
            ut=0;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
          //  panelMain.setVisible(false);
            panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from db_grievance where g_Category = ?");
           ps.setString(1, uDomain);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(rootPane, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }        // TODO
        
    }//GEN-LAST:event_rbPublicGrievanceActionPerformed

    private void rbNgoGrievanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNgoGrievanceActionPerformed
        // TODO add your handling code here:
        ut=1;
         dbName="db_ngo_grievance";
                try {
                    
            up=true;
            btnModify.setEnabled(false);
            // TODO add your handling code here:
  //          panelMain.setVisible(false);
            panelGStatus.setVisible(true);
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps=con.prepareStatement("select * from db_ngo_grievance where g_Category=?");
            ps.setString(1, uDomain);
            rsGrievance=ps.executeQuery();
            if(!rsGrievance.next())
            {
                JOptionPane.showMessageDialog(rootPane, "No records found");
            }
            rsGrievance.previous();
            tableUGrievance.setModel(buildTableModel(rsGrievance));
            // tableUGrievance=new JTable(buildTableModel(rsGrievance));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_rbNgoGrievanceActionPerformed

    private void btnUpdateGrievance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGrievance1ActionPerformed
        try {
            
            gResolution=tfResolution.getText();
            if(gResolution.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please enter Resolution First");
            }
            else{
            // TODO add your handling code here:
            con=DriverManager.getConnection("jdbc:mysql://localhost/ugms","root","");
            ps2=con.prepareStatement("update "+dbName+" set g_resolution=? where g_id=?");
             ps2.setString(1, gResolution);
            ps2.setLong(2, gId);
           int r= ps2.executeUpdate();
           if(r>0)
           {
            JOptionPane.showMessageDialog(this, "Resolution has been Updated");
           }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GovtPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateGrievance1ActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        panelGView.setVisible(false);
        panelGStatus.setVisible(true);
        btnSetViewStatus.setEnabled(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnSetViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetViewStatusActionPerformed
        try {

            // TODO add your handling code here:
            con = DriverManager.getConnection("jdbc:mysql://localhost/ugms", "root", "");
            dbName="db_grievance";
            switch(ut)
            {
                case 0:
                dbName="db_grievance";
                up=true;
                break;
                case 1:
                dbName="db_ngo_grievance";
                up=false;
                break;
            }
            ps = con.prepareStatement("update "+dbName+" set g_status='Viewed/Inprogress' where g_id=? and g_status='Pending'");
            // ps.setString(1,email );

            ps.setLong(1, gId);
            int r=ps.executeUpdate();
            if(r>0)
            {
                JOptionPane.showMessageDialog(rootPane, "Status updated");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Grievance already marked as viewed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GovtPortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    btnSetViewStatus.setText("Viewed");
    btnSetViewStatus.setEnabled(false);

    }//GEN-LAST:event_btnSetViewStatusActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
          try {
            // TODO add your handling code here:
            new PGMSLogin().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GrievanceMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnFundRaiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFundRaiserActionPerformed
        // TODO add your handling code here:
          this.dispose();
       new FundRaisers(rs).setVisible(true);
    }//GEN-LAST:event_btnFundRaiserActionPerformed

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
            java.util.logging.Logger.getLogger(GovtPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GovtPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GovtPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GovtPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GovtPortal(null).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GovtPortal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFundRaiser;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSetViewStatus;
    private javax.swing.JButton btnUpdateGrievance1;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblImage;
    private javax.swing.JPanel panelGInfo;
    private javax.swing.JPanel panelGStatus;
    private javax.swing.JPanel panelGView;
    private javax.swing.JRadioButton rbNgoGrievance;
    private javax.swing.JRadioButton rbPublicGrievance;
    private javax.swing.JTable tableUGrievance;
    private javax.swing.JTextArea tfAddress;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JTextField tfGCategory;
    private javax.swing.JTextField tfGovtType;
    private javax.swing.JTextField tfLandMark;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextArea tfResolution;
    private javax.swing.JTextField tfUName;
    // End of variables declaration//GEN-END:variables
}
