
public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        AdminMenuBar = new javax.swing.JMenuBar();
        AddUserMenu = new javax.swing.JMenu();
        AddUserMenuItem = new javax.swing.JMenuItem();
        DeleteUserMenu = new javax.swing.JMenu();
        DeleteUserMenuItem = new javax.swing.JMenuItem();
        UpdateUserMenu = new javax.swing.JMenu();
        UpdateUserMenuItem = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Welcome, Admin!");

        Logout.setFont(new java.awt.Font("Palatino", 0, 13)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(Logout)
                .addGap(64, 64, 64))
        );

        AddUserMenu.setText("Add");
        AddUserMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserMenuActionPerformed(evt);
            }
        });

        AddUserMenuItem.setText("Add User");
        AddUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserMenuItemActionPerformed(evt);
            }
        });
        AddUserMenu.add(AddUserMenuItem);

        AdminMenuBar.add(AddUserMenu);

        DeleteUserMenu.setText("Delete");

        DeleteUserMenuItem.setText("Delete User");
        DeleteUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserMenuItemActionPerformed(evt);
            }
        });
        DeleteUserMenu.add(DeleteUserMenuItem);

        AdminMenuBar.add(DeleteUserMenu);

        UpdateUserMenu.setText("Update");

        UpdateUserMenuItem.setText("Update User");
        UpdateUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateUserMenuItemActionPerformed(evt);
            }
        });
        UpdateUserMenu.add(UpdateUserMenuItem);

        AdminMenuBar.add(UpdateUserMenu);

        setJMenuBar(AdminMenuBar);

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

    private void AddUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserMenuItemActionPerformed
        AddUsers a = new AddUsers();
        a.setVisible(true); //This redirects or opens the AddUsers JFrame.
        setVisible(false); //This closes the Admin JFrame after redirecting.
    }//GEN-LAST:event_AddUserMenuItemActionPerformed

    private void UpdateUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateUserMenuItemActionPerformed
        UpdateUser b = new UpdateUser();
        b.setVisible(true); //This redirects or opens the UpdateUser JFrame.
        setVisible(false); //This closes the Admin JFrame after redirecting.
    }//GEN-LAST:event_UpdateUserMenuItemActionPerformed

    private void AddUserMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserMenuActionPerformed
        
    }//GEN-LAST:event_AddUserMenuActionPerformed

    private void DeleteUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserMenuItemActionPerformed
        DeleteUsers c = new DeleteUsers();
        c.setVisible(true); //This redirects or opens the DeleteUsers JFrame.
        setVisible(false); //This closes the Admin JFrame after redirecting.
    }//GEN-LAST:event_DeleteUserMenuItemActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login a = new Login();
        a.setVisible(true); //This logouts the Admin account, redirecting it back to the Login JFrame.
        setVisible(false); //This closes the Admin JFrame after redirecting.
    }//GEN-LAST:event_LogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddUserMenu;
    private javax.swing.JMenuItem AddUserMenuItem;
    private javax.swing.JMenuBar AdminMenuBar;
    private javax.swing.JMenu DeleteUserMenu;
    private javax.swing.JMenuItem DeleteUserMenuItem;
    private javax.swing.JButton Logout;
    private javax.swing.JMenu UpdateUserMenu;
    private javax.swing.JMenuItem UpdateUserMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
