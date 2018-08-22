/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author 311015
 */
public class optionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form optionsFrame
     */
    ArrayList<Object> fieldsListArray;
    ArrayList<Object> fieldsERListArray;
    ArrayList<Object> fieldsFRListArray;
    
    public optionsFrame() {
        initComponents();
        fieldsListArray = new ArrayList<Object>();
        fieldsERListArray = new ArrayList<Object>();
        fieldsFRListArray = new ArrayList<Object>();
        readFromFile();
    }
    
    public ArrayList<Object> getFieldsListArray(){
        return this.fieldsListArray;
    }
    
    public ArrayList<Object> getERFieldsListArray(){
        return this.fieldsERListArray;
    }
    
    public ArrayList<Object> getFRFieldsListArray(){
        return this.fieldsFRListArray;
    }
    
    public boolean getEROptionState(){
        return erOptionBox.getModel().isSelected();
    }
    
    public boolean getOReportOptionState(){
        return onlyReportsCheckBox.getModel().isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        assCriteriaDelButton = new javax.swing.JButton();
        assFieldAddButton = new javax.swing.JButton();
        assignedFieldsLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        assignedFieldsList = new java.awt.List();
        assignedERFieldsList = new java.awt.List();
        assignedFRFieldsList = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        erOptionBox = new javax.swing.JCheckBox();
        onlyReportsCheckBox = new javax.swing.JCheckBox();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        optionsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        optionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        optionsLabel.setText("OPTIONS");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        assCriteriaDelButton.setText("Del");
        assCriteriaDelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assCriteriaDelButtonActionPerformed(evt);
            }
        });

        assFieldAddButton.setText("Add");
        assFieldAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assFieldAddButtonActionPerformed(evt);
            }
        });

        assignedFieldsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignedFieldsLabel.setText("Assigned Fields");

        assignedFieldsList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.addTab("BD", assignedFieldsList);
        jTabbedPane1.addTab("ER", assignedERFieldsList);
        jTabbedPane1.addTab("FR", assignedFRFieldsList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(assignedFieldsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(assFieldAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(assCriteriaDelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignedFieldsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assFieldAddButton)
                    .addComponent(assCriteriaDelButton))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        erOptionBox.setSelected(true);
        erOptionBox.setText("                            Include ER");

        onlyReportsCheckBox.setText("                          Only Reports");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(erOptionBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onlyReportsCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(erOptionBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onlyReportsCheckBox)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        applyButton.setText("Apply");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(optionsLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(applyButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void assFieldAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assFieldAddButtonActionPerformed
        // TODO add your handling code here:

        //        Object[] options = DatabaseObj.getDevicesList().toArray();
        //
        String fieldName = (String)JOptionPane.showInputDialog(
            this,
            new JLabel("Enter Criteria", SwingConstants.CENTER),
            "Add Criteria",
            JOptionPane.PLAIN_MESSAGE);

        if(fieldName != null){

            if(assignedFieldsList.isShowing()){
                if(!fieldsListArray.contains(fieldName)){
                    fieldsListArray.add(fieldName);
                }else{
                    JOptionPane.showMessageDialog(this,"Field Already Exists","Try Again", JOptionPane.WARNING_MESSAGE);
                }
            }else if(assignedERFieldsList.isShowing()){
                if(!fieldsERListArray.contains(fieldName)){
                    fieldsERListArray.add(fieldName);
                }else{
                    JOptionPane.showMessageDialog(this,"Field Already Exists","Try Again", JOptionPane.WARNING_MESSAGE);
                }
            }else if(assignedFRFieldsList.isShowing()){
                if(!fieldsFRListArray.contains(fieldName)){
                    fieldsFRListArray.add(fieldName);
                }else{
                    JOptionPane.showMessageDialog(this,"Field Already Exists","Try Again", JOptionPane.WARNING_MESSAGE);
                }
            }

            updateAssignedFieldsList();
  
        }
    }//GEN-LAST:event_assFieldAddButtonActionPerformed

    private void updateAssignedFieldsList(){
        
        assignedFieldsList.removeAll();
        assignedERFieldsList.removeAll();
        assignedFRFieldsList.removeAll();
        
        for(Object field:fieldsListArray){
            assignedFieldsList.add((String)field);
        }
        for(Object field:fieldsERListArray){
            assignedERFieldsList.add((String)field);
        }
        for(Object field:fieldsFRListArray){
            assignedFRFieldsList.add((String)field);
        }
        
        writeToFile();
    }
    private void assCriteriaDelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assCriteriaDelButtonActionPerformed
        // TODO add your handling code here:

        if(assignedFieldsList.isShowing()){
            if(assignedFieldsList.getSelectedItems().length>0){

                String fieldName = assignedFieldsList.getSelectedItem();

                if(fieldName != null){

                    if(fieldsListArray.contains(fieldName)){
                        fieldsListArray.remove(fieldName);
                    }
                }
            }  
        }else if(assignedERFieldsList.isShowing()){
            if(assignedERFieldsList.getSelectedItems().length>0){

                String fieldName = assignedERFieldsList.getSelectedItem();

                if(fieldName != null){

                    if(fieldsERListArray.contains(fieldName)){
                        fieldsERListArray.remove(fieldName);
                    }
                }
            }
        }else if(assignedFRFieldsList.isShowing()){
            if(assignedFRFieldsList.getSelectedItems().length>0){

                String fieldName = assignedFRFieldsList.getSelectedItem();

                if(fieldName != null){

                    if(fieldsFRListArray.contains(fieldName)){
                        fieldsFRListArray.remove(fieldName);
                    }
                }
            }
        }
        
        updateAssignedFieldsList();
        

    }//GEN-LAST:event_assCriteriaDelButtonActionPerformed

    private void readFromFile(){
        try{
            
            File file = new File("fields.txt");
            File erFile = new File("ERFields.txt");
            File frFile = new File("FRFields.txt");
            
            if(!file.exists()){
                file.createNewFile();
            }
            if(!erFile.exists()){
                erFile.createNewFile();
            }
            if(!frFile.exists()){
                frFile.createNewFile();
            }
 
            fieldsListArray = (ArrayList)Files.readAllLines(Paths.get(file.getAbsolutePath()));
            fieldsERListArray = (ArrayList)Files.readAllLines(Paths.get(erFile.getAbsolutePath()));
            fieldsFRListArray = (ArrayList)Files.readAllLines(Paths.get(frFile.getAbsolutePath()));
            
            updateAssignedFieldsList();
            
        }catch(Exception e){
            System.out.println("error");
            
        }
    }
    private void writeToFile(){
        
        try{
            
            PrintWriter writer = new PrintWriter("fields.txt", "UTF-8");
            PrintWriter erWriter = new PrintWriter("ERFields.txt", "UTF-8");
            PrintWriter frWriter = new PrintWriter("FRFields.txt", "UTF-8");

            for(Object field:fieldsListArray){
                writer.println(field);
            }
            for(Object field:fieldsERListArray){
                erWriter.println(field);
            }
            for(Object field:fieldsFRListArray){
                frWriter.println(field);
            }
            
            writer.close();
            erWriter.close();
            frWriter.close();
            
        }catch(Exception e){
            System.out.println("error");
            
        }
        
    }
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
            java.util.logging.Logger.getLogger(optionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(optionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(optionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(optionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JButton assCriteriaDelButton;
    private javax.swing.JButton assFieldAddButton;
    private java.awt.List assignedERFieldsList;
    private java.awt.List assignedFRFieldsList;
    private javax.swing.JLabel assignedFieldsLabel;
    private java.awt.List assignedFieldsList;
    private javax.swing.JCheckBox erOptionBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JCheckBox onlyReportsCheckBox;
    private javax.swing.JLabel optionsLabel;
    // End of variables declaration//GEN-END:variables
}
