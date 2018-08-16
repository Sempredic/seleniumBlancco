/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumblancco;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Vince
 */
public class seleniumFrame extends javax.swing.JFrame {

    /**
     * Creates new form seleniumFrame
     */
    KeyboardFocusManager manager;
    ArrayList<String> serialListArray;
    templateMgrFrame mgrFrame;
    LinkedHashMap<Object,LinkedHashMap<Object,Object>> serialObjects;
    DefaultListModel<deviceObject> listModel;
    LinkedHashMap<Object,ArrayList> errorObjects;
    
    public seleniumFrame() {
        listModel = new DefaultListModel<>();
        initComponents();
        serialListArray = new ArrayList<String>();
        mgrFrame = new templateMgrFrame();
        serialObjects = new LinkedHashMap<Object,LinkedHashMap<Object,Object>>();
        serialLists.setCellRenderer(new listRenderer());
        errorObjects = new LinkedHashMap<Object,ArrayList>();

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
        jPanel2 = new javax.swing.JPanel();
        caseField = new javax.swing.JTextField();
        serialNumberField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        serialLists = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        serialDataArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        errorTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        editTempMgrItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        caseField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caseField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caseFieldKeyPressed(evt);
            }
        });

        serialNumberField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        serialNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberFieldActionPerformed(evt);
            }
        });
        serialNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                serialNumberFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(caseField)
                    .addComponent(serialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caseField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(serialNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        serialLists.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        serialLists.setModel(listModel);
        serialLists.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                serialListsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(serialLists);

        serialDataArea.setColumns(20);
        serialDataArea.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        serialDataArea.setRows(5);
        jScrollPane1.setViewportView(serialDataArea);

        jTabbedPane1.addTab("Reports", jScrollPane1);

        errorTextArea.setColumns(20);
        errorTextArea.setRows(5);
        jScrollPane3.setViewportView(errorTextArea);

        jTabbedPane1.addTab("Errors", jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jMenu1.setText("File");

        editTempMgrItem.setText("Edit Template Mgr");
        editTempMgrItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTempMgrItemActionPerformed(evt);
            }
        });
        jMenu1.add(editTempMgrItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caseFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caseFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ENTER){
            
            manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
            manager.focusNextComponent();
        }
            
    }//GEN-LAST:event_caseFieldKeyPressed

    private void serialNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumberFieldActionPerformed

    private void serialNumberFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNumberFieldKeyPressed
        // TODO add your handling code here:
        int keyCode = evt.getKeyCode();
        if(keyCode == KeyEvent.VK_ENTER){
            
            if(serialNumberField.getText().trim().toUpperCase().equals("VALIDATE")){
                runSelenium();
                System.out.println("Validate!");
                serialNumberField.setText("");
            }else if(!serialListArray.contains(serialNumberField.getText())){
                if(serialNumberField.getText().length()>0){
                    serialListArray.add(serialNumberField.getText());
                    listModel.addElement(new deviceObject(serialNumberField.getText()));
                    serialNumberField.setText("");
                }
                
            }
        }
    }//GEN-LAST:event_serialNumberFieldKeyPressed

    private void editTempMgrItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTempMgrItemActionPerformed
        // TODO add your handling code here:
        mgrFrame.setVisible(true);
    }//GEN-LAST:event_editTempMgrItemActionPerformed

    private void serialListsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_serialListsValueChanged
        // TODO add your handling code here:
        String selectedSerial = serialLists.getSelectedValue().getName();
        deviceObject device = serialLists.getSelectedValue();
        StringBuilder builder = new StringBuilder();
        StringBuilder errorBuilder = new StringBuilder();
        
        serialDataArea.setText("");
        
        if(!device.getElementMap().isEmpty()){
            for(Map.Entry<Object,LinkedHashMap<Object,Object>> item:device.getElementMap().entrySet()){
                if(item.getKey().equals("BD")){
                    builder.append("BD REPORT \n");
                    builder.append("\n");
                    for(Object crit:item.getValue().entrySet()){
                        builder.append(crit+"\n");
                    }
                    builder.append("\n");
                }else if(item.getKey().equals("ER")){
                    builder.append("ERASURE REPORT \n");
                    builder.append("\n");
                    for(Object crit:item.getValue().entrySet()){
                        builder.append(crit+"\n");
                    }
                    builder.append("\n");
                }else if(item.getKey().equals("FR")){
                    builder.append("FACTORY REPORT \n");
                    builder.append("\n");
                    for(Object crit:item.getValue().entrySet()){
                        builder.append(crit+"\n");
                    }
                    builder.append("\n");
                }
            }
            serialDataArea.setText(builder.toString());
        }else{
            serialDataArea.setText("--NO REPORTS--");
        }
        
        if(!device.getErrorElementMap().isEmpty()){
            for(Map.Entry<Object,ArrayList> error:device.getErrorElementMap().entrySet()){
                errorBuilder.append(error.getValue()+"\n");
            }
            errorTextArea.setText(errorBuilder.toString());
        }else{
            errorTextArea.setText("--NO ERRORS--");
        }

    }//GEN-LAST:event_serialListsValueChanged

    private void runSelenium(){
        
        //ArrayList<Object> serialArray = new ArrayList<Object>();
//        serialArray.add("F9FTH2D1HP9X");//successful ipad reports
//        serialArray.add("F78PG1PUG5MH");//no erasure report with bd passed has 2 BD reports select most recent one
//        serialArray.add("ZY2249JSN8");//one report
//        serialArray.add("F78PG1PUG5M4");//no reports
//        serialArray.add("FTHSQ1V7GRWV");// failed bd report with erasure passed
//               
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://cloud.blancco.com/login");
        driver.findElement(By.id("login_usernameInput")).sendKeys("PreOwned");
        driver.findElement(By.id("login_passwordInput")).sendKeys("Welcome123!");
        driver.findElement(By.id("login_passwordInput")).sendKeys(Keys.RETURN);
        
        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();

        try{
            
            for(Object serials:serialListArray){
                
                System.out.println("Input Started");
                
                driver.findElement(By.id("reporting_processArea_customView_PreOwnedTech")).click();
                driver.findElement(By.id("reportFiltering_searchInput")).clear();
                driver.findElement(By.id("reportFiltering_searchInput")).sendKeys((String)serials);
                sleep(1000);
                driver.findElement(By.id("reportFiltering_searchInput")).sendKeys(Keys.RETURN);
                
                sleep(3000);
                
                System.out.println("View Started");
             
                if(driver.findElement(By.xpath("//*[@id=\"reporting_reportingPagination_reportCount\"]")).getText().trim().equals("0 reports")){
                    continue;
                }
                
                if(driver.findElement(By.xpath("//*[@id=\"reporting_reportingPagination_reportCount\"]")).getText().trim().equals("1 reports")){
                    driver.findElement(By.xpath("//*[@id=\"reporting_table\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/div/div/a[1]")).click();
                }else{
                    driver.findElement(By.xpath("//*[@id=\"reporting_table\"]/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[2]/div/div/a[1]")).click();
                    driver.findElement(By.xpath("//*[@id=\"reporting_table\"]/div[3]/div/div[2]/div/div/table/tbody/tr[2]/td[2]/div/div/a[1]")).click();
                }
                
                sleep(1000);

                ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
                newTab.remove(oldTab);
                // loop focus through new tabs and scrape data from each one
                for(String tabs:newTab){
                    driver.switchTo().window(tabs);

                    if(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/h1")).getText().trim().equals("Hardware Report")){
                        //title
                        System.out.println("BD Info");
                        //first section
                        
                        String serialL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[9]")).getText().trim();
                        String serialN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[10]")).getText().trim();
                        if(!serialL.equals("Serial:")){
                            serialL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[7]")).getText().trim();
                            serialN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[8]")).getText().trim();        
                        }
                        String modelL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[5]")).getText().trim();
                        String modelN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[6]")).getText().trim();                        
                        String erasureL = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]")).getText().trim();
                        String erasureN = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]")).getText().trim();
                        String fingerprintL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[3]/div[1]")).getText().trim();
                        String fingerprintN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[3]/div[2]")).getText().trim();
                        String wirelessChgL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[5]/div[1]")).getText().trim();
                        String wirelessChgN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[5]/div[2]")).getText().trim();
                        String faceIDL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/div[1]")).getText().trim();
                        String faceIDN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/div[2]")).getText().trim();
                        String headphoneL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[4]/div[1]")).getText().trim();
                        String headphoneN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[4]/div[2]")).getText().trim();
                        //first column
                        String wifiL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[1]/div[1]")).getText().trim();
                        String wifiN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[1]/div[2]/div")).getText().trim();
                        String batteryChgL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[3]/div[1]")).getText().trim();
                        String batteryChgN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[3]/div[2]/div")).getText().trim();
                        String touchL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[5]/div[1]")).getText().trim();
                        String touchN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[5]/div[2]/div")).getText().trim();
                        String proximityL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[7]/div[1]")).getText().trim(); 
                        String proximityN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[7]/div[2]/div")).getText().trim();
                        String vibrationL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[9]/div[1]")).getText().trim();
                        String vibrationN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[9]/div[2]/div")).getText().trim();
                        String volumeL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[11]/div[1]")).getText().trim();
                        String volumeN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[11]/div[2]/div")).getText().trim();
                        String screenL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[13]/div[1]")).getText().trim();
                        String screenN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[13]/div[2]/div")).getText().trim();
                        String fCameraL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[15]/div[1]")).getText().trim();
                        String fCameraN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[15]/div[2]/div")).getText().trim();
                        String batteryWearL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[17]/div[1]")).getText().trim();
                        String batteryWearN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[17]/div[2]/div")).getText().trim();
                        //second column
                        String speakerL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[2]/div[1]")).getText().trim();
                        String speakerN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[2]/div[2]/div")).getText().trim();
                        String lcdColorL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[4]/div[1]")).getText().trim();
                        String lcdColorN =driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[4]/div[2]/div")).getText().trim();
                        String lcdBackL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[6]/div[1]")).getText().trim();
                        String lcdBackN =driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[6]/div[2]/div")).getText().trim();
                        String usbL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[8]/div[1]")).getText().trim();
                        String usbN =driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[8]/div[2]/div")).getText().trim();
                        String homekeyL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[10]/div[1]")).getText().trim();
                        String homekeyN =driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[10]/div[2]/div")).getText().trim();
                        String screenLockL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[12]/div[1]")).getText().trim();
                        String screenLockN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[12]/div[2]/div")).getText().trim();
                        String cameraL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[14]/div[1]")).getText().trim();
                        String cameraN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[14]/div[2]/div")).getText().trim();
                        String multiTouchL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[16]/div[1]")).getText().trim();
                        String multiTouchN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[16]/div[2]/div")).getText().trim();
                        String btmMicL = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[18]/div[1]")).getText().trim();
                        String btmMicN = driver.findElement(By.xpath("/html/body/div/div[2]/div[6]/div[18]/div[2]/div")).getText().trim();

                        String overallL = driver.findElement(By.xpath("/html/body/div/div[2]/div[7]/div/div[1]/b")).getText().trim();
                        String overallN = driver.findElement(By.xpath("/html/body/div/div[2]/div[7]/div/div[2]/b/div")).getText().trim();
                        
                        LinkedHashMap<Object,Object> temp = new LinkedHashMap<Object,Object>();
                        temp.put(modelL, modelN);
                        temp.put(serialL, serialN);
                        temp.put(erasureL, erasureN);
                        temp.put(fingerprintL, fingerprintN);
                        temp.put(wirelessChgL, wirelessChgN);
                        temp.put(faceIDL, faceIDN);
                        temp.put(headphoneL, headphoneN);
                        
                        temp.put(wifiL, wifiN);
                        temp.put(batteryChgL, batteryChgN);
                        temp.put(touchL, touchN);
                        temp.put(proximityL, proximityN);
                        temp.put(vibrationL, vibrationN);
                        temp.put(volumeL, volumeN);
                        temp.put(screenL, screenN);
                        temp.put(fCameraL, fCameraN);
                        temp.put(batteryWearL, batteryWearN);
                        
                        temp.put(speakerL, speakerN);
                        temp.put(lcdColorL, lcdColorN);
                        temp.put(lcdBackL, lcdBackN);
                        temp.put(usbL, usbN);
                        temp.put(homekeyL, homekeyN);
                        temp.put(screenLockL, screenLockN);
                        temp.put(cameraL, cameraN);
                        temp.put(multiTouchL, multiTouchN);
                        temp.put(btmMicL, btmMicN);

                        for(int i=0;i<listModel.getSize();i++){                          
                            deviceObject current = listModel.getElementAt(i);
                            if(current.getName().equals(serialN)){
                                current.getElementMap().put("BD", temp);
                                break;
                            }
                        }

                    }else if(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/h1")).getText().trim().equals("Data Erasure Report")){
                        
                        System.out.println("Erasure Info");
                        
                        String erasureTechL = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]")).getText().trim();
                        String erasureTechN = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]")).getText().trim();
                        String modelL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[5]")).getText().trim();
                        String modelN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[6]")).getText().trim();
                        String serialL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[9]")).getText().trim();
                        String serialN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[10]")).getText().trim();
                        String statusL,statusN;
                        if(driver.findElements(By.xpath("/html/body/div/div[2]/div[3]/div[9]")).size()>0){
                           statusL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[9]")).getText().trim(); 
                           statusN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[10]/span")).getText().trim();
                        }else{
                            statusL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[9]")).getText().trim(); 
                            statusN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[10]/span")).getText().trim();
                        }
                        
                        LinkedHashMap<Object,Object> temp = new LinkedHashMap<Object,Object>();
                        
                        temp.put(erasureTechL, erasureTechN);
                        temp.put(modelL, modelN);
                        temp.put(serialL, serialN);
                        temp.put(statusL, statusN);
                        
                        for(int i=0;i<listModel.getSize();i++){                          
                            deviceObject current = listModel.getElementAt(i);
                            if(current.getName().equals(serialN)){
                                current.getElementMap().put("ER", temp);
                                break;
                            }
                        }
                        
                    }else if(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/h1")).getText().trim().equals("Factory Reset Report")){
                        
                        System.out.println("Factory Reset ER Info");
                        
                        String erasureTechL = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[1]")).getText().trim();
                        String erasureTechN = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div[2]")).getText().trim();
                        String modelL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[5]")).getText().trim();
                        String modelN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[6]")).getText().trim();
                        String serialL = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[7]")).getText().trim();
                        String serialN = driver.findElement(By.xpath("/html/body/div/div[2]/div[4]/div[8]")).getText().trim();
                        String statusL = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[9]")).getText().trim();
                        String statusN = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[10]/span")).getText().trim();
                        
                        LinkedHashMap<Object,Object> temp = new LinkedHashMap<Object,Object>();
                        
                        temp.put(erasureTechL, erasureTechN);
                        temp.put(modelL, modelN);
                        temp.put(serialL, serialN);
                        temp.put(statusL, statusN);
                        
                        for(int i=0;i<listModel.getSize();i++){                          
                            deviceObject current = listModel.getElementAt(i);
                            if(current.getName().equals(serialN)){
                                current.getElementMap().put("FR", temp);
                                break;
                            }
                        }  
                    }

                    driver.close();
                }

                // change focus back to old tab
                driver.switchTo().window(oldTab);
                
            }
         
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        System.out.println("SUCCESS!!!!");
        driver.quit();
        
        validateSerialObjects();
    }
    
    private void validateSerialObjects(){
        
        String deviceName = null;
        String reportType = null;
            
        for(int i=0;i<listModel.getSize();i++){        
            
            deviceObject current = listModel.getElementAt(i);
            
            if(!current.getElementMap().isEmpty()){
                if(current.getElementMap().containsKey("BD")){
                    reportType = "BD";
                }else if(current.getElementMap().containsKey("ER")){
                    reportType = "ER";
                }else if(current.getElementMap().containsKey("FR")){
                    reportType = "FR";
                }
               
                
                deviceName = (String)current.getElementMap().get(reportType).get("Model:");
                
                if(mgrFrame.getTemplateMap().containsKey(deviceName)){
                    for(Map.Entry<String,String> crit:mgrFrame.getTemplateMap().get(deviceName).getCriteria().entrySet()){
                        System.out.println(current.getElementMap().get(reportType).get(crit.getKey()+":"));
                        System.out.println(crit.getValue());
                        if(current.getElementMap().get(reportType).get(crit.getKey()+":").equals(crit.getValue().trim())){
                            if(current.getMatchBoolean()){
                                current.setMatchBoolean(true);
                            }
                            
                        }else{
                            current.setMatchBoolean(false);
                            if(!current.getErrorElementMap().containsKey(current.getName())){
                                ArrayList temp = new ArrayList();
                                temp.add(crit.getKey()+" "+crit.getValue());
                                current.getErrorElementMap().put(current.getName(),temp); 
                            }else{
                                if(!current.getErrorElementMap().get(current.getName()).contains(crit.getKey())){
                                    current.getErrorElementMap().get(current.getName()).add(crit.getKey()+" "+crit.getValue());
                                }
                                
                            } 
                            
                        }        
                    }
                }
            }else{
                current.setMatchBoolean(false);
            }   
        }        
        
        serialLists.repaint();
    }


    public void run(){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seleniumFrame().setVisible(true);
            }
        });
    }
    
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
            java.util.logging.Logger.getLogger(seleniumFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seleniumFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seleniumFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seleniumFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caseField;
    private javax.swing.JMenuItem editTempMgrItem;
    private javax.swing.JTextArea errorTextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea serialDataArea;
    private javax.swing.JList<deviceObject> serialLists;
    private javax.swing.JTextField serialNumberField;
    // End of variables declaration//GEN-END:variables
}
