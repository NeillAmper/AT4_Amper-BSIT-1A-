
import java.io.*;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class DeleteUsers extends javax.swing.JFrame {

    private static final String FILE_PATH = "src/Data.json"; //This connects the Data.json file to this JFrame

    public DeleteUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 71, 99));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 239, 239));
        jLabel1.setText("Username:");

        UserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        UserName.setText("Enter Username to Delete");

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(230, 91, 122));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(248, 248, 248));
        jLabel2.setText("DELETE USER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Delete))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear)
                    .addComponent(Delete)
                    .addComponent(Back))
                .addGap(67, 67, 67))
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

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        UserName.setText("");
        //This sets or clears the UserName Text Field to blank.
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin a = new Admin();
        a.setVisible(true); //This redirects or goes back to the Admin JFrame.
        setVisible(false); //This closes the DeleteUsers JFrame after redirecting.
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String usernameToDelete = UserName.getText().trim();
        //This line of code retrieve user input from text fields and remove any spaces, declaring and initializing to store the input.

        if (usernameToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an existing username to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return; //This makes the error JOptionPane prompt if the Username Text Field is empty, asking the user to input an existing username to delete.
        }

        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to delete the user '" + usernameToDelete + "'?",
                "Confirm Deletion",
                JOptionPane.YES_NO_OPTION);
                //These lines of code makes the Confirmation JOptionPane prompt, asking the user if they want to confirm the deletion of a user.

        if (confirm != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "User deletion canceled.", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            return;
            //If no, the deletion will be canceled.
            
        }

        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "User data file not found!", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
                //These lines of code checks if the file exists, if not, it will prompt an error message.
            }

            JSONParser jsonParser = new JSONParser();
            JSONObject record;
            try (FileReader reader = new FileReader(FILE_PATH)) {
                record = (JSONObject) jsonParser.parse(reader);
                //These lines of code parses the file content into a JSONObject
            }

            JSONArray usersArray = (JSONArray) record.get("users");
            if (usersArray == null) {
                JOptionPane.showMessageDialog(null, "No users found in the file.", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
                //These lines of code checks is the users are not avaiable, then it will prompt an error message.
            }

            JSONArray updatedUsers = new JSONArray();
            boolean userDeleted = false;

            for (Object obj : usersArray) {
                JSONObject user = (JSONObject) obj;
                if (user.get("username").equals(usernameToDelete)) {
                    userDeleted = true;
                    //These lines of code checks if the username matches the input in the text field, then it will set to true if found and deleted.
                } else {
                    updatedUsers.add(user);
                }
            }

            if (userDeleted) {
                record.put("users", updatedUsers);
                try (FileWriter writer = new FileWriter(FILE_PATH)) {
                    writer.write(record.toJSONString());
                    //If the user was deleted, it will update the json file.
                }

                JOptionPane.showMessageDialog(null, "User deleted successfully...");
                //A JOptionPane will prompt that the user was deleted successfully.
            } else {
                JOptionPane.showMessageDialog(null, "User not found.", "Error!", JOptionPane.ERROR_MESSAGE);
                //An error message would be prompted if no user was found.
            }

        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the user...", "Error!", JOptionPane.ERROR_MESSAGE);
            //An error prompt would appear if an error occurs while deleting a user.
        }
    }//GEN-LAST:event_DeleteActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new DeleteUsers().setVisible(true));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
