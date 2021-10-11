
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DevMike
 */
public class MainForm extends javax.swing.JFrame {
    final static String fileName = "src/users.txt";
    ArrayList<User> users = new ArrayList<User>();

    public boolean isConfirmSave() {
        return confirmSave;
    }

    public void setConfirmSave(boolean confirmSave) {
        this.confirmSave = confirmSave;
    }
    private boolean confirmSave = false;
    /**
     * Creates new form MainFrame
     */
    public MainForm() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtId = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        radGenderMale = new javax.swing.JRadioButton();
        radGenderFemale = new javax.swing.JRadioButton();
        btnInsert = new javax.swing.JButton();
        chkIsAlive = new javax.swing.JCheckBox();
        btnLoad = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsers = new javax.swing.JTextArea();
        btnShowEncuestaDialog = new javax.swing.JButton();
        btnShowEncuestaDialog2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Manager");
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtId.setText("Id");
        txtId.setName(""); // NOI18N
        txtId.setNextFocusableComponent(txtFirstName);
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
        });

        txtFirstName.setText("FirstName");
        txtFirstName.setNextFocusableComponent(txtLastName);
        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
        });

        txtLastName.setText("LastName");
        txtLastName.setNextFocusableComponent(txtBirthDate);
        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
        });

        txtBirthDate.setText("BirthDate");
        txtBirthDate.setNextFocusableComponent(chkIsAlive);
        txtBirthDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBirthDateFocusGained(evt);
            }
        });

        buttonGroup1.add(radGenderMale);
        radGenderMale.setSelected(true);
        radGenderMale.setText("Male");
        radGenderMale.setNextFocusableComponent(radGenderFemale);

        buttonGroup1.add(radGenderFemale);
        radGenderFemale.setText("Female");
        radGenderFemale.setNextFocusableComponent(btnInsert);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        chkIsAlive.setText("Alive");
        chkIsAlive.setNextFocusableComponent(btnInsert);

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtUsers.setColumns(20);
        txtUsers.setRows(5);
        jScrollPane1.setViewportView(txtUsers);

        btnShowEncuestaDialog.setText("Encuesta");
        btnShowEncuestaDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowEncuestaDialogActionPerformed(evt);
            }
        });

        btnShowEncuestaDialog2.setText("Encuesta2");
        btnShowEncuestaDialog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowEncuestaDialog2ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInsert)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radGenderMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radGenderFemale))
                                    .addComponent(chkIsAlive, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnShowEncuestaDialog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowEncuestaDialog2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowEncuestaDialog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radGenderMale)
                    .addComponent(radGenderFemale)
                    .addComponent(btnShowEncuestaDialog2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkIsAlive))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnLoad)
                    .addComponent(btnSave))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
        LocalDate birthDate = LocalDate.now();
        try {
            birthDate = LocalDate.parse(txtBirthDate.getText());
            
            String maleOrFemale;
            if (radGenderMale.isSelected()) {
                maleOrFemale = "Male";
            }
            else 
                maleOrFemale = "Female";
            User newUser = new User(txtId.getText(), txtFirstName.getText(), txtLastName.getText(), birthDate, maleOrFemale, chkIsAlive.isSelected());
            users.add(newUser);

    //        for (User u: users) {
    //            u.
    //        }

            txtUsers.append(newUser.toString());
        }
        catch (Exception ex) {
            EncuestaDialog encuesta = new EncuestaDialog(this, true);
            encuesta.getLblMessage().setText(ex.getMessage());
            encuesta.setVisible(true);
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
        // TODO add your handling code here:
        txtId.selectAll();
    }//GEN-LAST:event_txtIdFocusGained

    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusGained
        txtFirstName.selectAll();
    }//GEN-LAST:event_txtFirstNameFocusGained

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        txtLastName.selectAll();
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtBirthDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBirthDateFocusGained
        txtBirthDate.selectAll();
    }//GEN-LAST:event_txtBirthDateFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SwingUtilities.getRootPane(this).setDefaultButton(btnInsert);
    }//GEN-LAST:event_formWindowOpened

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        ConfirmSaveDialog saveDialog = new ConfirmSaveDialog(this, true);
        saveDialog.setVisible(true);
        
        if (this.confirmSave) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                for(User u: users) {
                    String formattedDate = u.getBirthDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    String userString = u.getId() + "," + u.getLastName() + ","
                            + u.getFirstName() + ","
                            + formattedDate
                            + "," + u.getGender() + "," + (u.isIsAlive() ? "Alive" : "Dead") 
                            + System.lineSeparator();
                    writer.append(userString);
                }
                writer.close();
            }
            catch(IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        
        try {
            users.clear();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String[] fields = currentLine.split(",");
                User user = new User(fields[0], fields[2], fields[1],
                        LocalDate.parse(fields[3]), fields[4],
                        fields[5].equals("Alive")); 
//                boolean isAlive;
//                if (fields[5].equals("Alive"))
//                    isAlive = true;
//                else
//                    isAlive = false;
                
                users.add(user);
                currentLine = reader.readLine();
            }
            
        }
        catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }

        for (User u: users) {
            txtUsers.append(u.toString());
        }
        
//        for (int i = 0; i < users.size(); i++) {
//            txtUsers.append(users.get(i).toString());
//        }
        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnShowEncuestaDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowEncuestaDialogActionPerformed
        EncuestaDialog encuesta = new EncuestaDialog(this, false);
        encuesta.getLblMessage().setText("Missatge des de el MainForm");
        encuesta.setVisible(true);
    }//GEN-LAST:event_btnShowEncuestaDialogActionPerformed

    private void btnShowEncuestaDialog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowEncuestaDialog2ActionPerformed
        EncuestaDialog encuesta2 = new EncuestaDialog(this, false);
        encuesta2.setVisible(true);
    }//GEN-LAST:event_btnShowEncuestaDialog2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowEncuestaDialog;
    private javax.swing.JButton btnShowEncuestaDialog2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkIsAlive;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radGenderFemale;
    private javax.swing.JRadioButton radGenderMale;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtUsers;
    // End of variables declaration//GEN-END:variables
}
