
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel1.setText("Username:");

        UserName.setText("Enter Username to Delete");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Clear)
                        .addGap(38, 38, 38)
                        .addComponent(Delete)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
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
        if (confirm != JOptionPane.YES_OPTION) {
            return;
            //These lines of code makes the Confirmation JOptionPane prompt, asking the user if they want to confirm the deletion of a user.

        } else {
            JOptionPane.showMessageDialog(null, "User deletion canceled.", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            //If no, it will cancel the deletion.
        }

        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "User data file not found!");
                return; //This prompts whenever the user inputted does not exist in the json file when checked.
            }

            JSONParser jsonParser = new JSONParser();
            JSONObject record;
            try (FileReader reader = new FileReader(FILE_PATH)) {
                record = (JSONObject) jsonParser.parse(reader);
            }

            JSONArray usersArray = (JSONArray) record.get("users");
            if (usersArray == null) {
                JOptionPane.showMessageDialog(null, "No users found in the file.");
                return;
            }

            JSONArray updatedUsers = new JSONArray();
            boolean userDeleted = false;

            for (Object obj : usersArray) {
                JSONObject user = (JSONObject) obj;
                if (user.get("username").equals(usernameToDelete)) {
                    userDeleted = true;
                } else {
                    updatedUsers.add(user);
                }
            }

            if (userDeleted) {
                record.put("users", updatedUsers);
                try (FileWriter writer = new FileWriter(FILE_PATH)) {
                    writer.write(record.toJSONString());
                }

                JOptionPane.showMessageDialog(null, "User deleted successfully...");
            } else {
                JOptionPane.showMessageDialog(null, "User not found.");
            }

        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the user...");
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
