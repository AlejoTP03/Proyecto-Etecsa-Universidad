/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wiew;


import javax.swing.JOptionPane;

/**
 *
 * @author Lino
 */
public class Clientes extends javax.swing.JDialog {

    /**
     * Creates new form Clientes
     */
    public Clientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        opResidencial.setSelected(true);
        opArrendada.setSelected(true);
    }
    
        
     boolean addDatos;
    
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
    
    
    public void obtenerDatos(){
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
           this.setVisible(false);
            { 
       }
     }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opsTipoCliente = new javax.swing.ButtonGroup();
        opsTipoLinea = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        avisoNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        avisoDireccion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carnet = new javax.swing.JFormattedTextField();
        avisoTelefono = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        direccion = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        telefono = new javax.swing.JFormattedTextField();
        nombre = new javax.swing.JFormattedTextField();
        avisoCarnet = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        opEstatal = new javax.swing.JRadioButton();
        opResidencial = new javax.swing.JRadioButton();
        tabbed = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jlabel10 = new javax.swing.JLabel();
        opMatutino = new javax.swing.JRadioButton();
        opRastreo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        opArrendada = new javax.swing.JRadioButton();
        opNoArrendada = new javax.swing.JRadioButton();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        avisoNombre.setForeground(new java.awt.Color(204, 204, 204));
        avisoNombre.setText("-");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de carnet:");

        avisoDireccion.setForeground(new java.awt.Color(204, 204, 204));
        avisoDireccion.setText("-");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número telefónico:");

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

        avisoTelefono.setForeground(new java.awt.Color(204, 204, 204));
        avisoTelefono.setText("-");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");

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

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dirección:");

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

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de cliente:");

        opEstatal.setForeground(new java.awt.Color(255, 255, 255));
        opEstatal.setText("Estatal");
        opEstatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEstatalActionPerformed(evt);
            }
        });

        opResidencial.setForeground(new java.awt.Color(255, 255, 255));
        opResidencial.setText("Residencial");
        opResidencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opResidencialActionPerformed(evt);
            }
        });

        tabbed.setBackground(new java.awt.Color(0, 51, 153));
        tabbed.setVerifyInputWhenFocusTarget(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jlabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel10.setForeground(new java.awt.Color(255, 255, 255));
        jlabel10.setText("Tipo de servicios:");

        opMatutino.setForeground(new java.awt.Color(255, 255, 255));
        opMatutino.setText("Matutino");
        opMatutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMatutinoActionPerformed(evt);
            }
        });

        opRastreo.setForeground(new java.awt.Color(255, 255, 255));
        opRastreo.setText("Rastreo de llamadas");
        opRastreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRastreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(opMatutino)
                .addGap(87, 87, 87)
                .addComponent(opRastreo)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opMatutino)
                    .addComponent(opRastreo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed.addTab("", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo de linea:");

        opArrendada.setForeground(new java.awt.Color(255, 255, 255));
        opArrendada.setText("Arrendada");
        opArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opArrendadaActionPerformed(evt);
            }
        });

        opNoArrendada.setForeground(new java.awt.Color(255, 255, 255));
        opNoArrendada.setText("No arrendada");
        opNoArrendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNoArrendadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(opArrendada)
                .addGap(81, 81, 81)
                .addComponent(opNoArrendada)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opArrendada)
                    .addComponent(opNoArrendada)))
        );

        tabbed.addTab("", jPanel3);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(opResidencial)
                        .addGap(78, 78, 78)
                        .addComponent(opEstatal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(avisoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(avisoNombre)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(avisoCarnet)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(avisoDireccion)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoTelefono))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opResidencial)
                    .addComponent(opEstatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

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

    private void opMatutinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMatutinoActionPerformed

    }//GEN-LAST:event_opMatutinoActionPerformed

    private void opRastreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRastreoActionPerformed
 
    }//GEN-LAST:event_opRastreoActionPerformed

    private void opResidencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opResidencialActionPerformed
        opsTipoCliente.add(opResidencial);
        tabbed.add(jPanel2);
        tabbed.remove(jPanel3);
    }//GEN-LAST:event_opResidencialActionPerformed

    private void opEstatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEstatalActionPerformed
       opsTipoCliente.add(opEstatal);
       tabbed.add(jPanel3);
       tabbed.remove(jPanel2);
    }//GEN-LAST:event_opEstatalActionPerformed

    private void opNoArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNoArrendadaActionPerformed
      opsTipoLinea.add(opNoArrendada);
    }//GEN-LAST:event_opNoArrendadaActionPerformed

    private void opArrendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opArrendadaActionPerformed
       opsTipoLinea.add(opArrendada);
    }//GEN-LAST:event_opArrendadaActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        revisionFinalLongitudTelefono();
        revisionFinalLongitudCarnet();
        obtenerDatos();
    }//GEN-LAST:event_agregarMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

    }//GEN-LAST:event_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Clientes dialog = new Clientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel avisoCarnet;
    private javax.swing.JLabel avisoDireccion;
    private javax.swing.JLabel avisoNombre;
    private javax.swing.JLabel avisoTelefono;
    private javax.swing.JFormattedTextField carnet;
    private javax.swing.JFormattedTextField direccion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JFormattedTextField nombre;
    private javax.swing.JRadioButton opArrendada;
    private javax.swing.JRadioButton opEstatal;
    private javax.swing.JRadioButton opMatutino;
    private javax.swing.JRadioButton opNoArrendada;
    private javax.swing.JRadioButton opRastreo;
    private javax.swing.JRadioButton opResidencial;
    private javax.swing.ButtonGroup opsTipoCliente;
    private javax.swing.ButtonGroup opsTipoLinea;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JFormattedTextField telefono;
    // End of variables declaration//GEN-END:variables
}
