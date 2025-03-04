
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
        BACK = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 71, 99));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 239, 239));
        jLabel1.setText("New Username:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 239, 239));
        jLabel2.setText("New Password:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 239, 239));
        jLabel3.setText("New Type:");

        jLabel4.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 248, 248));
        jLabel4.setText("UPDATE USER");

        NewUserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        NewUserName.setText("Enter New Username");
        NewUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserNameActionPerformed(evt);
            }
        });

        NewPsswrd.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        NewPsswrd.setText("Enter New Password");
        NewPsswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPsswrdActionPerformed(evt);
            }
        });

        NewType.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        NewType.setText("Admin/Member");

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(230, 91, 122));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(252, 239, 239));
        jLabel5.setText("Username:");

        UserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        UserName.setText("Enter Existing User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BACK)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewPsswrd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NewPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Clear)
                    .addComponent(BACK))
                .addGap(37, 37, 37))
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

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        Admin a = new Admin();
        a.setVisible(true); //This redirects or goes back to the Admin JFrame.
        setVisible(false); //This closes the UpdateUser JFrame after redirecting.
    }//GEN-LAST:event_BACKActionPerformed

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
    private javax.swing.JButton BACK;
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
