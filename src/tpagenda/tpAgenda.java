package tpagenda;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class tpAgenda extends javax.swing.JFrame {
    static int tam = 10;  // indica el tamaño de la agenda (max num de registros)

    String[] noms;
    String[] tels;
    String[] emls;
    String[] dirs;
    int[] dias;
    int[] mess;
    int[] anis;
    
    
    public tpAgenda() {
        this.noms = new String[tam];
        this.tels = new String[tam];
        this.emls = new String[tam];
        this.dirs = new String[tam];
        this.dias = new int[tam];
        this.mess = new int[tam];
        this.anis = new int[tam];
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/assets/contactos_128.png")).getImage());
        
        // Prueba de registros
        this.noms[0] = "Pedro";
        this.tels[0] = "155808080";
        this.emls[0] = "pedro@mail.com";
        
        this.noms[1] = "Carlos";
        this.tels[1] = "155808081";
        this.emls[1] = "carlos@mail.com";
        
        cargar_registros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCnt = new javax.swing.JList<>();
        spV = new javax.swing.JSeparator();
        lblNom = new javax.swing.JLabel();
        entNom = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        entTel = new javax.swing.JTextField();
        lblEml = new javax.swing.JLabel();
        entEml = new javax.swing.JTextField();
        lblDir = new javax.swing.JLabel();
        entDir = new javax.swing.JTextField();
        lblFec = new javax.swing.JLabel();
        entD = new javax.swing.JTextField();
        entM = new javax.swing.JTextField();
        entY = new javax.swing.JTextField();
        spH = new javax.swing.JSeparator();
        botAdd = new javax.swing.JButton();
        botSav = new javax.swing.JButton();
        botDel = new javax.swing.JButton();
        labAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TP - Agenda");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setSize(new java.awt.Dimension(500, 350));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        lstCnt.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCnt.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCntValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCnt);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        spV.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(spV, gridBagConstraints);

        lblNom.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblNom, gridBagConstraints);

        entNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entNom, gridBagConstraints);

        lblTel.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblTel, gridBagConstraints);

        entTel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entTel, gridBagConstraints);

        lblEml.setText("E-Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblEml, gridBagConstraints);

        entEml.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entEml, gridBagConstraints);

        lblDir.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblDir, gridBagConstraints);

        entDir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entDir, gridBagConstraints);

        lblFec.setText("Fecha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(lblFec, gridBagConstraints);

        entD.setColumns(5);
        entD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entD, gridBagConstraints);

        entM.setColumns(5);
        entM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entM, gridBagConstraints);

        entY.setColumns(5);
        entY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(entY, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(spH, gridBagConstraints);

        botAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/account-plus.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(botAdd, gridBagConstraints);

        botSav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/content-save.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(botSav, gridBagConstraints);

        botDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash-can.png"))); // NOI18N
        botDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(botDel, gridBagConstraints);

        labAutor.setFont(new java.awt.Font("Roboto Mono", 2, 10)); // NOI18N
        labAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/contactos_16.png"))); // NOI18N
        labAutor.setText("Programación III - Ismael Tolaba (2023)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(labAutor, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDelActionPerformed
        // Eliminar registro
        int opcion;
        String nombre_contacto = "John Doe";
        
        opcion = JOptionPane.showConfirmDialog(this, "Está seguro que desea eliminar el contacto [" + nombre_contacto + "]?", "Eliminar Contacto", JOptionPane.OK_CANCEL_OPTION);
        System.out.println("Opción seleccionada: " + opcion);
    }//GEN-LAST:event_botDelActionPerformed

    private void lstCntValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCntValueChanged
        // Cambio en la selección de los registros
        String registro;
        
        registro = lstCnt.getSelectedValue();
        System.out.println(registro);
        
        mostrar_registro(registro);
    }//GEN-LAST:event_lstCntValueChanged

    
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
            java.util.logging.Logger.getLogger(tpAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tpAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tpAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tpAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tpAgenda agenda = new tpAgenda();
                agenda.setVisible(true);
                agenda.setLocationRelativeTo(null);
            }
        });
    }
    
    private void cargar_registros(){
        // Carga la lista de contactos
        DefaultListModel modelo = new DefaultListModel();
        
        for(int i=0; i<tam; i++){
            if (this.noms[i] != null){
                modelo.addElement(this.noms[i]);
            }
        }
        
        lstCnt.setModel(modelo);
    }
    
    private void mostrar_registro(String registro){
        // Mostrar los campos del registro en los campos del formulario
        System.out.println("Mostrando el registro de: " + registro);
        
        // Recorre la lista de registros para encontrar el seleccionado
        for(int r=0; r<tam; r++){
            
            // Si no quedan más registros válidos entonces salir del bucle
            if(this.noms[r] == null){
                break;
            }
            
            // Mostrar los campos del registro
            if(this.noms[r].equals(registro)){
                entNom.setText(this.noms[r]);
                entTel.setText(this.tels[r]);
                entEml.setText(this.emls[r]);
                entDir.setText(this.dirs[r]);
                entD.setText(String.valueOf(this.dias[r]));
                entM.setText(String.valueOf(this.mess[r]));
                entY.setText(String.valueOf(this.anis[r]));
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botAdd;
    private javax.swing.JButton botDel;
    private javax.swing.JButton botSav;
    private javax.swing.JTextField entD;
    private javax.swing.JTextField entDir;
    private javax.swing.JTextField entEml;
    private javax.swing.JTextField entM;
    private javax.swing.JTextField entNom;
    private javax.swing.JTextField entTel;
    private javax.swing.JTextField entY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labAutor;
    private javax.swing.JLabel lblDir;
    private javax.swing.JLabel lblEml;
    private javax.swing.JLabel lblFec;
    private javax.swing.JLabel lblNom;
    private javax.swing.JLabel lblTel;
    private javax.swing.JList<String> lstCnt;
    private javax.swing.JSeparator spH;
    private javax.swing.JSeparator spV;
    // End of variables declaration//GEN-END:variables
    String[] personas = new String[10];
}
