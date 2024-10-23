package Project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class OptionPage extends javax.swing.JFrame {

    /**
     * Creates new form OptionPage
     */
    public OptionPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        optionPagePanel = new javax.swing.JPanel();
        optionPageLabel1 = new javax.swing.JLabel();
        addPeople = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        searchPeople2 = new javax.swing.JButton();
        editPeople1 = new javax.swing.JButton();
        allPeople1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Address Book Application");

        optionPagePanel.setBackground(new java.awt.Color(0, 51, 51));
        optionPagePanel.setForeground(new java.awt.Color(153, 153, 153));

        optionPageLabel1.setFont(new java.awt.Font("Broadway", 0, 48)); // NOI18N
        optionPageLabel1.setForeground(new java.awt.Color(102, 102, 102));
        optionPageLabel1.setText("Select Option");

        addPeople.setBackground(new java.awt.Color(51, 51, 51));
        addPeople.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        addPeople.setForeground(new java.awt.Color(240, 240, 240));
        addPeople.setText("Add New Contatct");
        addPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeopleActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(240, 240, 240));
        exit.setText("Contacts");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        searchPeople2.setBackground(new java.awt.Color(51, 51, 51));
        searchPeople2.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        searchPeople2.setForeground(new java.awt.Color(240, 240, 240));
        searchPeople2.setText("Search Contact");
        searchPeople2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPeople2ActionPerformed(evt);
            }
        });

        editPeople1.setBackground(new java.awt.Color(51, 51, 51));
        editPeople1.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        editPeople1.setForeground(new java.awt.Color(240, 240, 240));
        editPeople1.setText("Edit Contact");
        editPeople1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPeople1ActionPerformed(evt);
            }
        });

        allPeople1.setBackground(new java.awt.Color(51, 51, 51));
        allPeople1.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        allPeople1.setForeground(new java.awt.Color(240, 240, 240));
        allPeople1.setText("Exit");
        allPeople1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPeople1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPagePanelLayout = new javax.swing.GroupLayout(optionPagePanel);
        optionPagePanel.setLayout(optionPagePanelLayout);
        optionPagePanelLayout.setHorizontalGroup(
                optionPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionPagePanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(optionPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(allPeople1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editPeople1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchPeople2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(optionPageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        optionPagePanelLayout.setVerticalGroup(
                optionPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionPagePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(optionPageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(addPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(searchPeople2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(editPeople1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(allPeople1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(optionPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(optionPagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void addPeopleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new AddNewContatct().setVisible(true);
    }

    private void searchPeople2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new SearchContact().setVisible(true);
    }

    private void editPeople1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new EditContact().setVisible(true);
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new Contacts().setVisible(true);
    }

    private void allPeople1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new Exit().setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(OptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addPeople;
    private javax.swing.JButton allPeople1;
    private javax.swing.JButton editPeople1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel optionPageLabel1;
    private javax.swing.JPanel optionPagePanel;
    private javax.swing.JButton searchPeople2;
    // End of variables declaration
}
