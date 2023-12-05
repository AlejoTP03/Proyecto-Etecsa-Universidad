/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


/**
 *
 * @author Lino
 */
public class ClienteEstatal extends javax.swing.JFrame {

    /**
     * Creates new form newClienteEstatal
     */
    public ClienteEstatal() {
        initComponents();
        setLocationRelativeTo(null);
        opArrendada.setSelected(true);
    }
    
        
     public void validacionNombre(java.awt.event.KeyEvent evento){
           if    ((Character.isLetter(evento.getKeyChar())==false)                                  //Letras
          && (Character.isWhitespace(evento.getKeyChar())==false)                          //Espacio
          && (Character.isISOControl(evento.getKeyChar())==false)) {                       //Back Space 
                              evento.consume();
                }
          } 
     
       
      public void validacionDireccion(java.awt.event.KeyEvent evento){
          if     ((Character.isWhitespace(evento.getKeyChar())==false)                           //Espacio
          && (Character.isLetter(evento.getKeyChar())==false)                                     //Letras
          && (evento.getKeyChar() != 35)                                                                    //# Número
          && (evento.getKeyChar() != 46)                                                                    //. Punto
          && (Character.isISOControl(evento.getKeyChar())==false)                             //Back Space
          && (Character.isDigit(evento.getKeyChar())==false)){                                     //Números              
                              evento.consume();
           }
       } 

      
        public void validacionTelefonoCarnet(java.awt.event.KeyEvent evento){
         if       ((Character.isDigit(evento.getKeyChar())==false)                                         //Números
           && (Character.isISOControl(evento.getKeyChar())==false)){                               //Back Space
                   evento.consume();
         }
      }
     
     
     public void avisoConteoCharsTelefono (java.awt.event.KeyEvent evento){
        if (telefono.getText().length()<8) {
       avisoTelefono.setText(String.valueOf(7-telefono.getText().length()));
         }else{
         evento.consume();
        }
     }
     
     
     public void avisoConteoCharsCarnet (java.awt.event.KeyEvent evento){
        if (carnet.getText().length()<11) {
       avisoCarnet.setText(String.valueOf(10-carnet.getText().length()));
         }else{
         evento.consume();
        }
     }
     
     
      public boolean revisionFinalNombre(){
          addDatos=false;
         for (int i=0; i<nombre.getText().length();i++){  
            int ascii=(int) nombre.getText().charAt(i);
            if    ((Character.isLetter(ascii)==false)                                  //Letras
          && (Character.isWhitespace(ascii)==false)                          //Espacio
          && (Character.isISOControl(ascii)==false)) {                       //Back Space 
                              nombre.setText(""); 
     }else{ 
        addDatos=true;
     }       
     }  
         return addDatos;
     }  
      
      
         public boolean revisionFinalCarnet(){
          addDatos=false;
         for (int i=0; i<carnet.getText().length();i++){  
            int ascii=(int) carnet.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)                                         //Números
           && (Character.isISOControl(ascii)==false)){                               //Back Space
                    carnet.setText("");
     }else{ 
        addDatos=true;       
     }
     } 
         return addDatos;
     }
     
         
       public boolean revisionFinalDireccion(){
         addDatos=false;
         for (int i=0; i<direccion.getText().length();i++){  
          int ascii=(int) direccion.getText().charAt(i);
           if     ((Character.isWhitespace(ascii)==false)                         //Espacio
          && (Character.isLetter(ascii)==false)                                     //Letras
          && (ascii != 35)                                                                    //# Número
          && (ascii != 46)                                                                    //. Punto
          && (Character.isISOControl(ascii)==false)                             //Back Space
          && (Character.isDigit(ascii)==false)){                                     //Números              
                     direccion.setText("");
     }else{ 
        addDatos=true;
     }      
     }
            return addDatos;
     }
     
       
          public boolean revisionFinalTelefono(){
          addDatos=false;
         for (int i=0; i<telefono.getText().length();i++){  
            int ascii=(int) telefono.getText().charAt(i);
    if       ((Character.isDigit(ascii)==false)                                         //Números
           && (Character.isISOControl(ascii)==false)){                               //Back Space
                     telefono.setText("");
     }else{ 
        addDatos=true;
    }
     }
         return addDatos;
     }
   
       
     
     public void avisoCamposVacios(){
          if (nombre.getText().isEmpty()){
       avisoNombre.setText("Campo Obligatorio");
       }else{
       avisoNombre.setText("");
       }
     
              
          if (carnet.getText().isEmpty()){
       avisoCarnet.setText("Campo Obligatorio");
       }else{
       avisoCarnet.setText("");
       }
     
          
         if (direccion.getText().isEmpty()){
       avisoDireccion.setText("Campo Obligatorio");
       }else{
       avisoDireccion.setText("");
       }
         
         
                
         if (telefono.getText().isEmpty()){
       avisoTelefono.setText("Campo Obligatorio");
       }else{
       avisoTelefono.setText("");
       }
    }
     

     public boolean habilitacionNoAgregarCamposVacios(){
        if ((nombre.getText().isEmpty())
         || (carnet.getText().isEmpty())
         || (direccion.getText().isEmpty())
         || (telefono.getText().isEmpty())){    
        addDatos=false;
     }else{
          addDatos=true;
         }
        return addDatos;
     }
   
    public void habilitacionMarcarSoloUnaOpcion(){
        botones.add(opArrendada);
        botones.add(opNoArrendada);
    }
    
    
     public boolean revisionFinalLongitudCarnet(){
       if (carnet.getText().length()<11){
           avisoCarnet.setText("Faltan caracteres"); 
           addDatos=false;
       }else if (carnet.getText().length()==11){
           addDatos=true;
       }else{
           carnet.setText("");
           addDatos=false;
       }
       return addDatos;
    }
        
    
    public boolean revisionFinalLongitudTelefono(){
       if (telefono.getText().length()<8){
            addDatos=false;
             avisoTelefono.setText("Faltan caracteres"); 
       }else if (telefono.getText().length()==8){
            addDatos=true;
       }else{
           telefono.setText("");
            addDatos=false;
       }
       return addDatos;
    }
    
    
    
    public boolean obtenerDatos(){
       if ((habilitacionNoAgregarCamposVacios()==true )
       &&(revisionFinalTelefono()==true)
       &&(revisionFinalCarnet()==true)
       &&(revisionFinalNombre()==true)
       &&(revisionFinalDireccion()==true)
       &&(revisionFinalLongitudTelefono()==true)
       &&(revisionFinalLongitudCarnet()==true)){
           String addNombre=nombre.getText();
           String addCarnet=carnet.getText();
           String addTelefono=telefono.getText();
           String addDireccion=direccion.getText();
            Llamada ll = new Internacional(pais, duracion);
            addDatos=true;
       }else{
           addDatos=false;
       }
       return addDatos;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        avisoTelefono = new javax.swing.JLabel();
        direccion = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        avisoNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JFormattedTextField();
        avisoCarnet = new javax.swing.JLabel();
        avisoDireccion = new javax.swing.JLabel();
        carnet = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        opArrendada = new javax.swing.JRadioButton();
        opNoArrendada = new javax.swing.JRadioButton();
        agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        avisoTelefono.setForeground(new java.awt.Color(204, 204, 204));
        avisoTelefono.setText("-");

        direccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de línea");

        telefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número de carnet:");

        avisoNombre.setForeground(new java.awt.Color(204, 204, 204));
        avisoNombre.setText("-");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");

        nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        avisoCarnet.setForeground(new java.awt.Color(204, 204, 204));
        avisoCarnet.setText("-");

        avisoDireccion.setForeground(new java.awt.Color(204, 204, 204));
        avisoDireccion.setText("-");

        carnet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carnetActionPerformed(evt);
            }
        });
        carnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                carnetKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                carnetKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empresa o Institución:");

        opArrendada.setText("Arrendada");
        opArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArrendadaActionPerformed(evt);
            }
        });

        opNoArrendada.setText("No Arrendada");
        opNoArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNoArrendadaActionPerformed(evt);
            }
        });

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarBorroso.png"))); // NOI18N
        agregar.setContentAreaFilled(false);
        agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregarBorroso.png"))); // NOI18N
        agregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar.png"))); // NOI18N
        agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMouseClicked(evt);
            }
        });
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número telefónico:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opArrendada)
                                .addGap(18, 18, 18)
                                .addComponent(opNoArrendada))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avisoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoCarnet)
                    .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoDireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(opArrendada)
                        .addComponent(opNoArrendada))
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyReleased
        avisoCamposVacios();
    }//GEN-LAST:event_direccionKeyReleased

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        validacionDireccion(evt);
    }//GEN-LAST:event_direccionKeyTyped

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyReleased
        avisoCamposVacios();
    }//GEN-LAST:event_telefonoKeyReleased

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
       validacionTelefonoCarnet(evt);
        avisoConteoCharsTelefono(evt);
    }//GEN-LAST:event_telefonoKeyTyped

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        avisoCamposVacios();
    }//GEN-LAST:event_nombreKeyReleased

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        validacionNombre(evt);
    }//GEN-LAST:event_nombreKeyTyped

    private void carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carnetActionPerformed

    private void carnetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carnetKeyReleased
       avisoCamposVacios();
    }//GEN-LAST:event_carnetKeyReleased

    private void carnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_carnetKeyTyped
        validacionTelefonoCarnet(evt);
        avisoConteoCharsCarnet(evt);
    }//GEN-LAST:event_carnetKeyTyped

    private void opArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArrendadaActionPerformed
        habilitacionMarcarSoloUnaOpcion();
    }//GEN-LAST:event_opArrendadaActionPerformed

    private void opNoArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNoArrendadaActionPerformed
        habilitacionMarcarSoloUnaOpcion();
    }//GEN-LAST:event_opNoArrendadaActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
     
    }//GEN-LAST:event_agregarActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
       revisionFinalLongitudTelefono();
        revisionFinalLongitudCarnet();
        obtenerDatos();
        if(obtenerDatos()==true){
        setVisible(false);
       }
    }//GEN-LAST:event_agregarMouseClicked

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
            java.util.logging.Logger.getLogger(ClienteEstatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteEstatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteEstatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteEstatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteEstatal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel avisoCarnet;
    private javax.swing.JLabel avisoDireccion;
    private javax.swing.JLabel avisoNombre;
    private javax.swing.JLabel avisoTelefono;
    private javax.swing.ButtonGroup botones;
    private javax.swing.JFormattedTextField carnet;
    private javax.swing.JFormattedTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JRadioButton opArrendada;
    private javax.swing.JRadioButton opNoArrendada;
    private javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
