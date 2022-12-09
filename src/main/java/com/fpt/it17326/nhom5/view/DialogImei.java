/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.fpt.it17326.nhom5.view;

import com.fpt.it17326.nhom5.domainmodel.Imei;
import com.fpt.it17326.nhom5.domainmodel.SanPham;
import com.fpt.it17326.nhom5.response.ImeiResponse;
import com.fpt.it17326.nhom5.service.ImeiService;
import com.fpt.it17326.nhom5.service.impl.ImeiServiceImpl;
import com.fpt.it17326.nhom5.util.Util;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fpt.it17326.nhom5.view.ViewSanPham.DialogResponse;
//import javax.swing;

/**
 *
 * @author youngboizseetinh
 */
public class DialogImei extends javax.swing.JDialog {

    /**
     * Creates new form DialogImei
     */
    private ImeiService imeiService = new ImeiServiceImpl();
    private List<Imei> listImei;
    private List<Imei> listImeiDeleted;
    private int selectedRow;
    private DialogResponse response;

    public DialogImei(java.awt.Frame parent, boolean modal, DialogResponse response, List<ImeiResponse> imeiResponses) {
        super(parent, modal);
        initComponents();
        listImei = new ArrayList<>();
        getImeiList(imeiResponses);
//        if (tenSP == null) {
//            JOptionPane.showMessageDialog(this, "Nhập tên sản phẩm");
//            return;
//        }

        //loadData();
        //loadTableImei();
        this.response = response;
        setScreenCenter();
    }

    public void getImeiList(List<ImeiResponse> imeiResponses) {
        for (ImeiResponse imeiResponse : imeiResponses) {
            Imei imei = new Imei();
            imei.setImei(imeiResponse.getImei());
            listImei.add(imei);
        }
        loadTableImei();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtImei = new javax.swing.JTextField();
        btnThemImei = new javax.swing.JButton();
        btnXoaImei = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblImei = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Imei");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Imei");

        btnThemImei.setBackground(new java.awt.Color(0, 0, 102));
        btnThemImei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnThemImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemImeiActionPerformed(evt);
            }
        });

        btnXoaImei.setBackground(new java.awt.Color(0, 0, 102));
        btnXoaImei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnXoaImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaImeiActionPerformed(evt);
            }
        });

        tblImei.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblImei.setForeground(new java.awt.Color(0, 0, 102));
        tblImei.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Imei"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblImei.setGridColor(new java.awt.Color(0, 0, 102));
        tblImei.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblImei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImeiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblImei);
        if (tblImei.getColumnModel().getColumnCount() > 0) {
            tblImei.getColumnModel().getColumn(0).setResizable(false);
        }

        btnSave.setBackground(new java.awt.Color(0, 0, 102));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnExcel.setBackground(new java.awt.Color(0, 0, 102));
        btnExcel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnThemImei, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaImei, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtImei))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtImei, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaImei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemImei, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaImeiActionPerformed
        // TODO add your handling code here:
        int row = tblImei.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng trên bảng để xóa");
            return;
        }
        String ma = txtImei.getText();
        Imei imei = new Imei();
//        imei.setImei(ma);
//        imei.setDeleted(true);
//        imei.setUpdatedAt(Util.getCurrentDate());
//        String result = imeiService.delete(imei);
//        JOptionPane.showMessageDialog(this, result);
//        if (result.contains("thành công")) {
//            //loadData();
//        }
        listImei.remove(row);
        loadTableImei();
        txtImei.setText("");
    }//GEN-LAST:event_btnXoaImeiActionPerformed

    public void loadTableImei() {
        DefaultTableModel dtm = (DefaultTableModel) tblImei.getModel();
        dtm.setRowCount(0);
        for (Imei imei : listImei) {
            Object[] row = {
                imei.getImei(),};
            dtm.addRow(row);
        }
    }

    private void btnThemImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemImeiActionPerformed
        // TODO add your handling code here:

//        int option = JOptionPane.showConfirmDialog(this, "Xác nhận thêm", "Thêm dữ liệu", JOptionPane.OK_CANCEL_OPTION);
//        if (option == 0) {
//            //addImei();
//
//        }
        String imeiStr = txtImei.getText();
        if (imeiStr.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được để trống");
            txtImei.requestFocus();
            return;
        }
        Imei imei = new Imei();
        imei.setImei(imeiStr);
        listImei.add(imei);
        loadTableImei();
        txtImei.setText("");
    }//GEN-LAST:event_btnThemImeiActionPerformed

    private void tblImeiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImeiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblImei.getModel();
        int row = tblImei.getSelectedRow();
        txtImei.setText(dtm.getValueAt(row, 0).toString());
        selectedRow = row;
    }//GEN-LAST:event_tblImeiMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        this.response.getListImeiResponse(listImei);
        this.dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        FileFilter filter = new FileNameExtensionFilter("Excel file", "xls", "xlsx");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            ArrayList<String> data = readExcel(fileChooser.getSelectedFile().getAbsolutePath());
            listImei = new ArrayList<>();
            for (String item : data) {
                Imei imei = new Imei();
                imei.setImei(item);
                listImei.add(imei);
            }
            loadTableImei();
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private ArrayList<String> readExcel(String fileLocation) {
        ArrayList<String> data = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(fileLocation));
            Workbook workbook = new XSSFWorkbook(file);
            Sheet sheet = workbook.getSheetAt(0);
            int i = 0;
            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            data.add(cell.getStringCellValue());
                            break;
                        // case NUMERIC: ... break;
                        // case BOOLEAN: ... break;
                        // case FORMULA: ... break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
        }
        return data;
    }

    public void setScreenCenter() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - this.getWidth()) / 2 - 100;
        final int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
    }

    public void getAllImei(List<Imei> listImei) {
        DefaultTableModel dtm = (DefaultTableModel) tblImei.getModel();
        dtm.setRowCount(0);
        for (Imei imei : listImei) {
            Object[] row = {imei.getImei()};
            dtm.addRow(row);
        }
    }

//    public void getAllImeiDeleted(List<Imei> listImei) {
//        DefaultTableModel dtm = (DefaultTableModel) tblImeiLuuTru.getModel();
//        dtm.setRowCount(0);
//        for (Imei imei : listImei) {
//            Object[] row = {imei.getImei()};
//            dtm.addRow(row);
//        }
//    }
//    public void loadData() {
//        listImei = imeiService.getAllImeiBySanPham(WIDTH);
//        getAllImei(listImei);
//        listImeiDeleted = imeiService.getAllImeiDeletedBySanPham(WIDTH);
//        getAllImeiDeleted(listImeiDeleted);
//    }
//    public void addImei() {
//        String ma = txtMa.getText();
//        String ten = txtImei.getText();
//        String tenSP =
//        SanPham sp = new SanPham();
//        Imei imei = new Imei();
//        imei.setMaImel(ma);
//        imei.setSanPham();
//        imei.setImei(ten);
//        imei.setDeleted(false);
//        imei.setCreatedAt(Util.getCurrentDate());
//        String result = imeiService.add(imei);
//        JOptionPane.showMessageDialog(this, result);
//        if (result.contains("thành công")) {
//            loadData();
//        }
//    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DialogImei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DialogImei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DialogImei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DialogImei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DialogImei dialog = new DialogImei(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnThemImei;
    private javax.swing.JButton btnXoaImei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblImei;
    private javax.swing.JTextField txtImei;
    // End of variables declaration//GEN-END:variables
}
