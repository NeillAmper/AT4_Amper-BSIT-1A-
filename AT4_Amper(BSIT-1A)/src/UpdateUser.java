
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UpdateUser extends javax.swing.JFrame {

    private static final String FILE_PATH = "src/Data.json";
    private static final JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public UpdateUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NewUserName = new javax.swing.JTextField();
        NewPsswrd = new javax.swing.JTextField();
        NewType = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel1.setText("New Username:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setText("New Password:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("New Type:");

        jLabel4.setText("UPDATE USER");

        NewUserName.setText("Enter New Username");
        NewUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserNameActionPerformed(evt);
            }
        });

        NewPsswrd.setText("Enter New Password");
        NewPsswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPsswrdActionPerformed(evt);
            }
        });

        NewType.setText("Admin/Member");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Username:");

        UserName.setFont(new java.awt.Font("Didot", 0, 13)); // NOI18N
        UserName.setText("Enter Existing User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Back)
                            .addGap(33, 33, 33)
                            .addComponent(Clear)
                            .addGap(134, 134, 134))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)))
                                .addComponent(jLabel5))
                            .addGap(95, 95, 95)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NewType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(Update))
                                .addComponent(NewPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addComponent(NewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NewPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NewType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Clear)
                    .addComponent(Update))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserNameActionPerformed
        
    }//GEN-LAST:event_NewUserNameActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        UserName.setText("");
        NewUserName.setText("");
        NewPsswrd.setText("");
        NewType.setText("");
        //This sets or clears the Text Field to blank.
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin a = new Admin();
        a.setVisible(true); //This redirects or goes back to the Admin JFrame.
        setVisible(false); //This closes the UpdateUser JFrame after redirecting.
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String username = UserName.getText().trim();
        String newUserName = NewUserName.getText().trim();
        String newPassword = NewPsswrd.getText().trim();
        String newType = NewType.getText().trim();
        //These lines of code retrieve user input from text fields and remove any spaces, declaring and initializing to store the input.

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an existing Username.", "Input needed", JOptionPane.ERROR_MESSAGE);
            return;
            // These lines of code prompts and checks if the username field is empty, asking the user to enter an existing username.
        }

        try {
            filecheck();
            boolean userFound = false; //This checks if there is an existing user data that matches in the json file.
            boolean isUpdated = false; //This checks if there is an update that was made.

            for (Object obj : userlist) {
                JSONObject userObject = (JSONObject) obj;
                if (username.equals(userObject.get("username"))) {
                    userFound = true;
                    //These lines of code gets the stored data in the json file.

                    if (!newUserName.isEmpty()) {
                        userObject.put("username", newUserName);
                        isUpdated = true;
                        // These lines of code checks if the new username is not empty, then updates it.
                    }
                    if (!newPassword.isEmpty()) {
                        userObject.put("password", newPassword);
                        isUpdated = true;
                        // These lines of code checks if the new password is not empty, then updates it.
                    }
                    if (!newType.isEmpty()) {
                        userObject.put("type", newType);
                        isUpdated = true;
                        // These lines of code checks if the new type is not empty, then updates it.
                    }
                    break;
                }
            }

            if (!userFound) {
                JOptionPane.showMessageDialog(null, "User not found!", "Update Failed", JOptionPane.ERROR_MESSAGE);
                return;
                //If user was not found, it will prompt an error message.
            }

            if (!isUpdated) {
                JOptionPane.showMessageDialog(null, "Nothing was updated. Please enter new inputs.", "No Changes Made", JOptionPane.INFORMATION_MESSAGE);
                return;
                //If no updates were made, it will prompt that nothing was updated.
            }

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to update the user details?",
                    "Confirm Update",
                    JOptionPane.YES_NO_OPTION);
                    // These lines of code shows a confirmation prompt, having two options such as yes and no.

            if (confirm == JOptionPane.YES_OPTION) {
                saveToFile();
                JOptionPane.showMessageDialog(null, "User details updated successfully!");
                //This prompts if the user pressed Yes.
            } else {
                JOptionPane.showMessageDialog(null, "Update canceled.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
                //This if No.
            }

        } catch (IOException | ParseException e) {
            Logger.getLogger(UpdateUser.class.getName()).log(Level.SEVERE, "Error updating user details", e);
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            //This lines of code handles errors and prompts an error message.
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void NewPsswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPsswrdActionPerformed
        
    }//GEN-LAST:event_NewPsswrdActionPerformed

    public void filecheck() throws IOException, ParseException {
        if (Files.exists(Path.of(FILE_PATH))) {
            String content = Files.readString(Path.of(FILE_PATH)).trim();
            if (!content.isEmpty()) {
                record = (JSONObject) jsonParser.parse(content);
                userlist = (JSONArray) record.get("users");
                
            }
        }
    }

    public void saveToFile() throws IOException {
        record.put("users", userlist);
        try (var writer = new FileWriter(FILE_PATH)) {
            writer.write(record.toJSONString());
            writer.flush(); 
            //These lines of code makes sure that all the data written to the FileWriter is immediately updated in the file.
        }
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new UpdateUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField NewPsswrd;
    private javax.swing.JTextField NewType;
    private javax.swing.JTextField NewUserName;
    private javax.swing.JButton Update;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
