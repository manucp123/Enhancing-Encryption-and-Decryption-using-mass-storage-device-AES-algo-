/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author Vishal_kumar
 */
public class Encryption extends javax.swing.JFrame {

    /**
     * Creates new form Encryption
     */
    public Encryption() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        pin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("File ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(350, 270, 140, 30);

        jTextField1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jTextField1.setText("Path name");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(530, 199, 350, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(910, 200, 100, 29);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(510, 270, 380, 200);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Enter Pin");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(380, 530, 140, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1180, 100, 83, 29);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("SHIELD");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(680, 90, 90, 32);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 0));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(190, 540, 68, 29);

        pin.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel2.add(pin);
        pin.setBounds(520, 530, 310, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Encrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(910, 530, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setText("Select File");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(350, 200, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    FileReader ff=null;
    File inputFile;
    
    static String a=null;
       public static void GengateKeyUsingSha(String password)
   {   
        try{
                    //   System.out.println("From here Sha"); 
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

      byte mdbytes[] = md.digest();
       byte[] byteData = new byte[mdbytes.length / 2];
            // byte byteData[]=md.digest();
            System.arraycopy(mdbytes, 0, byteData, 0, byteData.length); // Choice 1 for using only 128 bits of the 256 generated
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        a=sb.toString();
      a=a.substring(0,16);  // This key will be in use.
        System.out.println("Hex format : " + sb.toString()+"\n  Required "+a);
        CryptoUtilsTest.encryption_Dec();
        a=null;
        }catch(Exception e)
        {
           System.out.println("Eception"+e); 
        }
   }

//***************************************************************************************************
      void KeyModify(String s)
    {    s=s.trim();
       // System.out.println(s);
       String  n=pin.getText();
       n=n.trim();
       String s1=s+n;
      // System.out.println(s1);
        GengateKeyUsingSha(s1);
    }   
      //**********************************************************************************************
      String s1=null,s2=null;
      void KeyComp(String s,int i )
      { 
          if(i==3)
              s1=s;
          else s2=s;
          if(i==5)
          {
              int l1=s1.length();
              int l2=s2.length();
              if(l1>l2)
                  KeyModify(s1);
              else KeyModify(s2);
          }
      }
      //***********************************************************************************************************
      int count1=0;
      void count_number_of_loop_done()
      {
         StringBuffer HDD_Serial=new StringBuffer();
    String HDD_Number;
    Long t;
    Runtime rt = Runtime.getRuntime();
    try {
        Process process=rt.exec(new String[]{"CMD", "/C", "WMIC diskdrive get serialnumber"});
        String s = null;
        //Reading sucessful output of the command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = reader.readLine()) != null) {
            HDD_Serial.append(s);   count1++ ; }  
      //  System.out.println("Value of count is"+count1);
      }catch (IOException e) {
            System.out.println("Exception  "+e);
    }
      }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser =new JFileChooser();
       int a= chooser.showOpenDialog(null);
       if(a==JFileChooser.APPROVE_OPTION)
       {
         inputFile= chooser.getSelectedFile();
          File encryptedFile = new File("document.jpg");
        //  File decryptedFile = new File("document1.jpg");
        jTextField1.setText(inputFile.getAbsolutePath());
        jTextField1.setText(inputFile.getAbsolutePath());
        File filename= inputFile.getAbsoluteFile();
        try {
            ff=new FileReader(inputFile);
            area.read(ff,"");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (IOException ex) {
                Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
            }
        
      
        
        finally{
                   try{
                       ff.close();
                   }
                   catch(IOException e)
                   {
                        Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, e);
                   }
               }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Login ob=new Login();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         Home ob= new Home();
        ob.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
            count_number_of_loop_done();

        StringBuffer HDD_Serial=new StringBuffer();
        String HDD_Number;
        Long t;
        Runtime rt = Runtime.getRuntime();
        try {
            Process process=rt.exec(new String[]{"CMD", "/C", "WMIC diskdrive get serialnumber"});
            String s = null;
            //Reading sucessful output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            int i=0,j=count1;count1=0;
            if(j>6 && j<9)
            { i=0;
                while ((s = reader.readLine()) != null) {
                    HDD_Serial.append(s);
                    // System.out.print(s);
                    i++;
                    if(i==3||i==5)
                    KeyComp(s,i);
                }
                // System.out.println("mkp"+i );
            }   else
                  JOptionPane.showMessageDialog(null,"Please check Usb_port of System ,it may have no usb device or more than one Usb device");
            // Reading error if any
            reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

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
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encryption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encryption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField pin;
    // End of variables declaration//GEN-END:variables
}
