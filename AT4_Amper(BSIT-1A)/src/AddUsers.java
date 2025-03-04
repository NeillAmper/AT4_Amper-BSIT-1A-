
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddUsers extends javax.swing.JFrame {

    private static String addname, addpass, addtype;

    private static final String FILE_PATH = "src/Data.json";
    private static final JSONParser jsonParser2 = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public AddUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddUserName = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        AddUser = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AddType = new javax.swing.JTextField();
        AddPsswrd = new javax.swing.JPasswordField();
        AddCnfrmPsswrd = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel3.setText("Confirm Password:");

        AddUserName.setText("Enter Username");

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        AddUser.setText("Add");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel4.setText("Type:");

        AddType.setText("Admin/Member");

        AddPsswrd.setText("jPasswordField1");

        AddCnfrmPsswrd.setText("jPasswordField1");
        AddCnfrmPsswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCnfrmPsswrdActionPerformed(evt);
            }
        });

        jLabel5.setText("ADD USER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddCnfrmPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(Clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(AddUser)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AddUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AddPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AddCnfrmPsswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(AddUser)
                    .addComponent(Clear))
                .addGap(40, 40, 40))
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
        AddUserName.setText("");
        AddPsswrd.setText("");
        AddCnfrmPsswrd.setText("");
        AddType.setText("");
        //This sets or clears the Text Field to blank.
    }//GEN-LAST:event_ClearActionPerformed

    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
        String password = AddPsswrd.getText();
        String confirmPassword = AddCnfrmPsswrd.getText();
        String userType = AddType.getText();
        //These lines of code retrieve user input from text fields and remove any spaces, declaring and initializing to store the input.

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match! Please enter matching passwords.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
            // These lines of code prompts and checks if the password field does not match, asking the user to enter exact same password.
        }

        if (!userType.equalsIgnoreCase("Admin") && !userType.equalsIgnoreCase("Member")) {
            JOptionPane.showMessageDialog(null, "Invalid user type! Please enter 'Admin' or 'Member' only.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
            // These lines of code prompts and checks if the tyoe field contains only Admin or Member, asking the user to choose either of the two.
        }

        int confirm = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to add this user?",
                "Confirm User Addition",
                JOptionPane.YES_NO_OPTION);
                // These lines of code shows a confirmation prompt, having two options such as yes and no.

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                filecheck();
                addname = AddUserName.getText();
                addpass = AddPsswrd.getText();
                addtype = AddType.getText();

                JSONObject newUser = new JSONObject();
                newUser.put("username", addname);
                newUser.put("password", addpass);
                newUser.put("type", addtype);

                userlist.add(newUser);
                record.put("users", userlist);

                save();
                JOptionPane.showMessageDialog(null, "Successfully Added into the Database...");
                //This prompts if the user pressed Yes. Therefore adding it to the json file.
                
            } catch (IOException | ParseException ex) {
                Logger.getLogger(AddUsers.class.getName()).log(Level.SEVERE, null, ex);
                ////This lines of code handles errors and prompts an error message.
            }
        } else {
            JOptionPane.showMessageDialog(null, "User addition canceled.", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            //This if no.
        }
    }//GEN-LAST:event_AddUserActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin a = new Admin();
        a.setVisible(true); //This redirects or goes back to the Admin JFrame.
        setVisible(false); //This closes the AddUsers JFrame after redirecting.
    }//GEN-LAST:event_BackActionPerformed

    private void AddCnfrmPsswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCnfrmPsswrdActionPerformed
        
    }//GEN-LAST:event_AddCnfrmPsswrdActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new AddUsers().setVisible(true);
        });
    }

    public void filecheck() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(FILE_PATH);

        if (reader.ready()) {
            Scanner scan = new Scanner(reader);
            String line = "";

            while (scan.hasNext()) {
                line = line + scan.nextLine();
            }
            reader.close();
            if (!line.equals("")) {
                reader.close();
                try (FileReader reader2 = new FileReader(FILE_PATH)) {
                    record = (JSONObject) jsonParser2.parse(reader2);
                    userlist = (JSONArray) record.get("users");
                } catch (IOException a) {
                    System.out.println("error");
                }
            }
        }
    }

    public static void save() throws IOException {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(record.toJSONString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AddCnfrmPsswrd;
    private javax.swing.JPasswordField AddPsswrd;
    private javax.swing.JTextField AddType;
    private javax.swing.JButton AddUser;
    private javax.swing.JTextField AddUserName;
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
