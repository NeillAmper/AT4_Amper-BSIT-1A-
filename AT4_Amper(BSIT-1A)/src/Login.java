
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login extends javax.swing.JFrame {

    private static String usname, pass;

    private static final String FILE_PATH = "src/Data.json";
    private static final JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jClear = new javax.swing.JButton();
        jLogin = new javax.swing.JButton();
        UserName = new javax.swing.JTextField();
        Psswrd = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 0, 13)); // NOI18N
        jLabel2.setText("Password:");

        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        UserName.setText("Enter Username");
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });

        Psswrd.setText("jPasswordField1");

        LoginLabel.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        LoginLabel.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jClear)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLogin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(LoginLabel)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LoginLabel)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jClear)
                    .addComponent(jLogin))
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        UserName.setText("");
        Psswrd.setText("");
        //This sets or clears the Text Field to blank.
    }//GEN-LAST:event_jClearActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        String username = UserName.getText().trim();
        String password = Psswrd.getText().trim();
        //These lines of code retrieve user input from text fields and remove any spaces, declaring and initializing to store the input.

        if (username.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an existing Username and Password.", "Input needed", JOptionPane.ERROR_MESSAGE);
            return;
            // These lines of code prompts and checks if both username and password fields are empty.
        }

        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an existing Username.", "Input needed", JOptionPane.ERROR_MESSAGE);
            return;
            // These lines of code prompts and checks if the username field is empty, asking the user to enter an existing username.
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Password.", "Input needed", JOptionPane.ERROR_MESSAGE);
            return;
            // These lines of code prompts and checks if the password field is empty, asking the user to enter an existing username's password.
        }

        try {
            usname = UserName.getText();
            pass = Psswrd.getText();
            // These lines of code retrieves the entered username and password from the text fields.

            filecheck(); //Calls the filecheck method to read the data in the json file.

            boolean userFound = false; //This checks if there is an existing user data that matches in the json file.
            String foundType = null; //This variable is used to store the type found in the json file(Admin or Member).

            for (Object obj : userlist) {
                JSONObject userobject = (JSONObject) obj;
                String foundusname = (String) userobject.get("username");
                String foundpass = (String) userobject.get("password");
                foundType = (String) userobject.get("type");
                //These lines of code gets the stored data in the json file.

                if (usname.equals(foundusname) && pass.equals(foundpass)) {
                    userFound = true;
                    break;
                    // These lines of code compares input username and password with the stored data and sets to true if it matches.
                }
            }

            if (!userFound) {
                JOptionPane.showMessageDialog(null, "No user found!", "Login Failed", JOptionPane.ERROR_MESSAGE);
                //If nothing was found, it will prompt and error message.
            } else {
                if (foundType != null && foundType.equalsIgnoreCase("Admin")) {
                    Admin x = new Admin();
                    x.setVisible(true);
                    setVisible(false);
                    //If the user has an Admin type, it will open the Admin JFrame then it will close the Login JFrame.
                    
                } else if (foundType != null && foundType.equalsIgnoreCase("Member")) {
                    Member m = new Member();
                    m.setVisible(true);
                    setVisible(false);
                    //If the user has a Member type, it will open the Member JFrame then it will close the Login JFrame.
                }
            }

        } catch (HeadlessException | IOException | ParseException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "An error occurred while logging in.", "Error!", JOptionPane.ERROR_MESSAGE);
            // These lines of code catches any errors that happen during the login process and shows an error message.
        }
    }//GEN-LAST:event_jLoginActionPerformed

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed

    }//GEN-LAST:event_UserNameActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
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
                    record = (JSONObject) jsonParser.parse(reader2);
                    userlist = (JSONArray) record.get("users");
                } catch (IOException a) {
                    System.out.println("error");
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField Psswrd;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
