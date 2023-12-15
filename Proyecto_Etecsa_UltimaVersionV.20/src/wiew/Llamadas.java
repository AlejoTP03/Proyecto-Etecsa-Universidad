/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wiew;


import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lino
 */
public class Llamadas extends javax.swing.JDialog {

    /**
     * Creates new form Llamadas
     */
    public Llamadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        opInterprov.setSelected(true);
    }
     boolean addDatos;
      int longitudInterp=10;
      int longitudInternac=12; 
      int longitudLocal=8;

      
      
      
      public void invalidarLlamadasContratoInvalido(){
         boolean estadoContrato=true;
         if (estadoContrato==false){
              JOptionPane.showMessageDialog(rootPane, "Su contrato está cancelado temporalmente. Usted no puede realizar llamadas", "Error", JOptionPane.ERROR_MESSAGE);
              this.setVisible(false);
         }
      }
      
         public void validacionTelefonoTarifa(java.awt.event.KeyEvent evento){
         if       ((Character.isDigit(evento.getKeyChar())==false)                                         //Números
           && (Character.isISOControl(evento.getKeyChar())==false)){                               //Back Space
                   evento.consume();
         }
      }
         
         
        
         public void longitudNumeroOrigenInterprov(java.awt.event.KeyEvent evento){
          if (numOrigenInterprov.getText().length()>=longitudInterp) {
              evento.consume();
          }         
         }
          
             public void longitudNumeroOrigenInternac(java.awt.event.KeyEvent evento){
          if (numOrigenInternac.getText().length()>=longitudInternac) {
              evento.consume();
          }         
         }
             
              public void longitudNumeroOrigenLocal(java.awt.event.KeyEvent evento){
          if (numOrigenLocal.getText().length()>=longitudLocal) {
              evento.consume();
          }         
         }
          
          public void longitudNumeroDestinoInterprov(java.awt.event.KeyEvent evento){
          if (numDestinoInterprov.getText().length()>=longitudInterp) {
              evento.consume();
          }         
          }
          
               public void longitudNumeroDestinoInternac(java.awt.event.KeyEvent evento){
          if (numDestinoInternac.getText().length()>=longitudInternac) {
              evento.consume();
          }         
          }   
               
               public void longitudNumeroDestinoLocal(java.awt.event.KeyEvent evento){
          if (numDestinoLocal.getText().length()>=longitudLocal) {
              evento.consume();
          }         
          }   
               
               
           public void conteoCharsNumeroOrigenInterprov(java.awt.event.KeyEvent evento){
         if (numOrigenInterprov.getText().length()<longitudInterp) {
         avisoNumOrigenInterprov.setText(String.valueOf((longitudInterp-1)-numOrigenInterprov.getText().length()));
         }
     }

                     
           public void conteoCharsNumeroOrigenInternac(java.awt.event.KeyEvent evento){
         if (numOrigenInternac.getText().length()<longitudInternac) {
         avisoNumOrigenInternac.setText(String.valueOf((longitudInternac-1)-numOrigenInternac.getText().length()));
         }
     }
           
           
           public void conteoCharsNumeroOrigenLocal(java.awt.event.KeyEvent evento){
         if (numOrigenLocal.getText().length()<longitudLocal) {
         avisoNumOrigenLocal.setText(String.valueOf((longitudLocal-1)-numOrigenLocal.getText().length()));
         }
     }
           
           
           public void conteoCharsNumeroDestinoInterprov(java.awt.event.KeyEvent evento){
         if (numDestinoInterprov.getText().length()<longitudInterp) {
         avisoNumDestinoInterprov.setText(String.valueOf((longitudInterp-1)-numDestinoInterprov.getText().length()));
         }
     }
           
           
                     public void conteoCharsNumeroDestinoInternac(java.awt.event.KeyEvent evento){
         if (numDestinoInternac.getText().length()<longitudInternac) {
         avisoNumDestinoInternac.setText(String.valueOf((longitudInternac-1)-numDestinoInternac.getText().length()));
         }
     }
     
                     
                         
                     public void conteoCharsNumeroDestinoLocal(java.awt.event.KeyEvent evento){
         if (numDestinoLocal.getText().length()<longitudLocal) {
         avisoNumDestinoLocal.setText(String.valueOf((longitudLocal-1)-numDestinoLocal.getText().length()));
         }
     }
           
                     
                     
     public boolean habilitacionNoAgregarCamposVaciosInterprov(){
         if ((numOrigenInterprov.getText().isEmpty()) 
         || (numDestinoInterprov.getText().isEmpty())){    
        addDatos=false;
         }else{
             addDatos=true;
         }
         return addDatos;
     }
     
     
       public boolean habilitacionNoAgregarCamposVaciosInternac(){
         if ((numOrigenInternac.getText().isEmpty()) 
         || (numDestinoInternac.getText().isEmpty())
         || (tarifa.getText().isEmpty())){    
        addDatos=false;
         }else{
             addDatos=true;
         }
         return addDatos;
     }
       
       
          public boolean habilitacionNoAgregarCamposVaciosLocal(){
         if ((numOrigenLocal.getText().isEmpty()) 
         || (numDestinoLocal.getText().isEmpty())){    
        addDatos=false;
         }else{
             addDatos=true;
         }
         return addDatos;
     }
       
       public boolean obtenerFechaHora(){
            Date fechaActual = new Date ();
            Date fechaUsuario = (Date) fecha.getModel().getValue();
            if(fechaUsuario.after(fechaActual)==true){
             JOptionPane.showMessageDialog(this, "Usted ha establecido una fecha que excede a la fecha actual");
              addDatos=false;
     }else{
               addDatos=true;
            } 
            return addDatos;
     } 
     

                  
       public boolean revisionFinalLongitudnumOrigenInterprov(){
       if (numOrigenInterprov.getText().length()<longitudInterp){
            addDatos=false;
       }else if (numOrigenInterprov.getText().length()==longitudInterp){
            addDatos=true;
       }else{
           numOrigenInterprov.setText("");
            addDatos=false;
       }
       return addDatos;
    }
      
       
          public boolean revisionFinalLongitudnumOrigenInternac(){
       if (numOrigenInternac.getText().length()<longitudInternac){
            addDatos=false;
       }else if (numOrigenInternac.getText().length()==longitudInternac){
            addDatos=true;
       }else{
           numOrigenInternac.setText("");
            addDatos=false;
       }
       return addDatos;
    }
       
          
           public boolean revisionFinalLongitudnumOrigenLocal(){
       if (numOrigenLocal.getText().length()<longitudLocal){
            addDatos=false;
       }else if (numOrigenLocal.getText().length()==longitudLocal){
            addDatos=true;
       }else{
           numOrigenLocal.setText("");
            addDatos=false;
       }
       return addDatos;
    }
           
           
           
        public boolean revisionFinalLongitudnumDestinoInterprov(){
       if (numDestinoInterprov.getText().length()<longitudInterp){
            addDatos=false;
       }else if (numDestinoInterprov.getText().length()==longitudInterp){
            addDatos=true;
       }else{
           numDestinoInterprov.setText("");
            addDatos=false;
       }
       return addDatos;
    }
        
        
        
          public boolean revisionFinalLongitudnumDestinoInternac(){
       if (numDestinoInternac.getText().length()<longitudInternac){
            addDatos=false;
       }else if (numDestinoInternac.getText().length()==longitudInternac){
            addDatos=true;
       }else{
           numDestinoInternac.setText("");
            addDatos=false;
       }
       return addDatos;
    }
          
          
            
          public boolean revisionFinalLongitudnumDestinoLocal(){
       if (numDestinoLocal.getText().length()<longitudLocal){
            addDatos=false;
       }else if (numDestinoLocal.getText().length()==longitudLocal){
            addDatos=true;
       }else{
           numDestinoLocal.setText("");
            addDatos=false;
       }
       return addDatos;
    }

         public boolean revisionFinalTarifa(){
          
          for (int i=0; i<tarifa.getText().length();i++){  
           int ascii=(int) tarifa.getText().charAt(i);
           if    ((Character.isDigit(ascii)==false)){                             //Número
                    tarifa.setText("");
                    addDatos=false;
            }else{ 
            addDatos=true;   
         }
         } 
          return addDatos;
         } 
        
         
         public boolean revisionFinalnumOrigenInterprov(){
         for (int i=0; i<numOrigenInterprov.getText().length();i++){  
            int ascii=(int) numOrigenInterprov.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numOrigenInterprov.setText("");
                    addDatos=false;
          }else{ 
              addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
         
         
            public boolean revisionFinalnumOrigenInternac(){
         for (int i=0; i<numOrigenInternac.getText().length();i++){  
            int ascii=(int) numOrigenInternac.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numOrigenInternac.setText("");
                    addDatos=false;
          }else{ 
              addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
            
            
            
            public boolean revisionFinalnumOrigenLocal(){
         for (int i=0; i<numOrigenLocal.getText().length();i++){  
            int ascii=(int) numOrigenLocal.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numOrigenLocal.setText("");
                    addDatos=false;
          }else{ 
              addDatos=true;   
         }
         } 
          return addDatos;
         } 
            
            
            
          public boolean revisionFinalnumDestinoInterprov(){
          for (int i=0; i<numDestinoInterprov.getText().length();i++){  
            int ascii=(int) numDestinoInterprov.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numDestinoInterprov.setText("");
                     addDatos=false;
          }else{ 
             addDatos=true;   
         }
         } 
          return addDatos;
         } 
          
          
            public boolean revisionFinalnumDestinoInternac(){
          for (int i=0; i<numDestinoInternac.getText().length();i++){  
            int ascii=(int) numDestinoInternac.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numDestinoInternac.setText("");
                     addDatos=false;
          }else{ 
             addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
            
               public boolean revisionFinalnumDestinoLocal(){
          for (int i=0; i<numDestinoLocal.getText().length();i++){  
            int ascii=(int) numDestinoLocal.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numDestinoLocal.setText("");
                     addDatos=false;
          }else{ 
             addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
     
      
               
        public int obtenerDatos(){ 
           String addDuracion;
           String addnumOrigen;
           String addnumDestino;
           String addFecha;
           String addTarifa;
                   
                   if(opInterprov.isSelected()){
                       if ((habilitacionNoAgregarCamposVaciosInterprov()==true )
       &&(revisionFinalLongitudnumDestinoInterprov()==true)
       &&(revisionFinalLongitudnumOrigenInterprov()==true)
       &&(obtenerFechaHora()==true)                        
       &&(revisionFinalnumOrigenInterprov()==true)
       &&(revisionFinalnumDestinoInterprov()==true)){
           addDuracion=minDuracion.getSelectedItem().toString()+ ":" + segDuracion.getSelectedItem().toString();
           addnumOrigen=numOrigenInterprov.getText();
           addnumDestino=numDestinoInterprov.getText();
           addFecha= (String) fecha.getModel().getValue();
            avisoAgregar.setText("");
            JOptionPane.showMessageDialog(this, "Seha agregado la llamada nacional interprovincial");  
                
      }
           
               
               
               }else if (opInternac.isSelected()){
                  if ((habilitacionNoAgregarCamposVaciosInternac()==true )
       &&(revisionFinalLongitudnumDestinoInternac()==true)
       &&(revisionFinalLongitudnumOrigenInterprov()==true)
       &&(revisionFinalLongitudnumOrigenInternac()==true)
       &&(revisionFinalnumOrigenInternac()==true)
       &&(revisionFinalnumDestinoInternac()==true)
       &&(revisionFinalTarifa()==true)){
           addDuracion=minDuracion.getSelectedItem().toString()+ ":" + segDuracion.getSelectedItem().toString();
           addnumOrigen=numOrigenInternac.getText();
           addnumDestino=numDestinoInternac.getText();
           addTarifa=tarifa.getText();
           addFecha= (String) fecha.getModel().getValue();
            avisoAgregar.setText("");
            JOptionPane.showMessageDialog(this, "Seha agregado la llamada internacional");  
            
      }
               
               }else{
               if ((habilitacionNoAgregarCamposVaciosLocal()==true)
       &&(revisionFinalLongitudnumDestinoLocal()==true)
       &&(revisionFinalLongitudnumOrigenInterprov()==true)
       &&(revisionFinalLongitudnumOrigenLocal()==true)
       &&(revisionFinalnumOrigenLocal()==true)
       &&(revisionFinalnumDestinoLocal()==true)){
           addDuracion=minDuracion.getSelectedItem().toString()+ ":" + segDuracion.getSelectedItem().toString();
           addnumOrigen=numOrigenLocal.getText();
           addnumDestino=numDestinoLocal.getText();
           addFecha= (String) fecha.getModel().getValue();
            avisoAgregar.setText("");
            JOptionPane.showMessageDialog(this,"Seha agregado la llamada nacional"); 
      }    
    }   
                   return 0;
    }     
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opsTipoLlamada = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        opInternac = new javax.swing.JRadioButton();
        opInterprov = new javax.swing.JRadioButton();
        opLocal = new javax.swing.JRadioButton();
        tabbed = new javax.swing.JTabbedPane();
        Interprovincial = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numOrigenInterprov = new javax.swing.JFormattedTextField();
        numDestinoInterprov = new javax.swing.JFormattedTextField();
        avisoNumOrigenInterprov = new javax.swing.JLabel();
        avisoNumDestinoInterprov = new javax.swing.JLabel();
        Local = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        numOrigenLocal = new javax.swing.JFormattedTextField();
        numDestinoLocal = new javax.swing.JFormattedTextField();
        avisoNumOrigenLocal = new javax.swing.JLabel();
        avisoNumDestinoLocal = new javax.swing.JLabel();
        Internacional = new javax.swing.JPanel();
        numOrigenInternac = new javax.swing.JFormattedTextField();
        numDestinoInternac = new javax.swing.JFormattedTextField();
        avisoNumOrigenInternac = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        avisoNumDestinoInternac = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tarifa = new javax.swing.JFormattedTextField();
        avisoTarifa = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        avisoAgregar = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        minDuracion = new javax.swing.JComboBox();
        fecha = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        segDuracion = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        opInternac.setForeground(new java.awt.Color(255, 255, 255));
        opInternac.setText("Internacional");
        opInternac.setPreferredSize(new java.awt.Dimension(150, 15));
        opInternac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInternacActionPerformed(evt);
            }
        });
        opInternac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                opInternacKeyTyped(evt);
            }
        });

        opInterprov.setForeground(new java.awt.Color(255, 255, 255));
        opInterprov.setText("Nacional Interprovincial");
        opInterprov.setPreferredSize(new java.awt.Dimension(150, 15));
        opInterprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opInterprovActionPerformed(evt);
            }
        });

        opLocal.setForeground(new java.awt.Color(255, 255, 255));
        opLocal.setText("Nacional Local");
        opLocal.setPreferredSize(new java.awt.Dimension(150, 15));
        opLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLocalActionPerformed(evt);
            }
        });

        tabbed.setBackground(new java.awt.Color(0, 51, 153));

        Interprovincial.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número de origen:");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 15));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de destino:");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 15));

        numOrigenInterprov.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numOrigenInterprov.setPreferredSize(new java.awt.Dimension(100, 25));
        numOrigenInterprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOrigenInterprovActionPerformed(evt);
            }
        });
        numOrigenInterprov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numOrigenInterprovKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numOrigenInterprovKeyTyped(evt);
            }
        });

        numDestinoInterprov.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numDestinoInterprov.setPreferredSize(new java.awt.Dimension(100, 25));
        numDestinoInterprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDestinoInterprovActionPerformed(evt);
            }
        });
        numDestinoInterprov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numDestinoInterprovKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numDestinoInterprovKeyTyped(evt);
            }
        });

        avisoNumOrigenInterprov.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumOrigenInterprov.setText("-");

        avisoNumDestinoInterprov.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumDestinoInterprov.setText("-");

        javax.swing.GroupLayout InterprovincialLayout = new javax.swing.GroupLayout(Interprovincial);
        Interprovincial.setLayout(InterprovincialLayout);
        InterprovincialLayout.setHorizontalGroup(
            InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InterprovincialLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numOrigenInterprov, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(numDestinoInterprov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(avisoNumDestinoInterprov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(avisoNumOrigenInterprov, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InterprovincialLayout.setVerticalGroup(
            InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InterprovincialLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOrigenInterprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumOrigenInterprov))
                .addGap(36, 36, 36)
                .addGroup(InterprovincialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDestinoInterprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumDestinoInterprov)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tabbed.addTab("", Interprovincial);

        Local.setBackground(new java.awt.Color(0, 51, 153));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Número de origen:");
        jLabel23.setPreferredSize(new java.awt.Dimension(150, 15));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Número de destino:");
        jLabel24.setPreferredSize(new java.awt.Dimension(150, 15));

        numOrigenLocal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numOrigenLocal.setPreferredSize(new java.awt.Dimension(100, 25));
        numOrigenLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOrigenLocalActionPerformed(evt);
            }
        });
        numOrigenLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numOrigenLocalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numOrigenLocalKeyTyped(evt);
            }
        });

        numDestinoLocal.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numDestinoLocal.setPreferredSize(new java.awt.Dimension(100, 25));
        numDestinoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDestinoLocalActionPerformed(evt);
            }
        });
        numDestinoLocal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numDestinoLocalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numDestinoLocalKeyTyped(evt);
            }
        });

        avisoNumOrigenLocal.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumOrigenLocal.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumOrigenLocal.setText("-");

        avisoNumDestinoLocal.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumDestinoLocal.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumDestinoLocal.setText("-");

        javax.swing.GroupLayout LocalLayout = new javax.swing.GroupLayout(Local);
        Local.setLayout(LocalLayout);
        LocalLayout.setHorizontalGroup(
            LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numDestinoLocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(numOrigenLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoNumDestinoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumOrigenLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LocalLayout.setVerticalGroup(
            LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LocalLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOrigenLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumOrigenLocal)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(LocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDestinoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumDestinoLocal)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        tabbed.addTab("", Local);

        Internacional.setBackground(new java.awt.Color(0, 51, 153));

        numOrigenInternac.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numOrigenInternac.setPreferredSize(new java.awt.Dimension(100, 25));
        numOrigenInternac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOrigenInternacActionPerformed(evt);
            }
        });
        numOrigenInternac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numOrigenInternacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numOrigenInternacKeyTyped(evt);
            }
        });

        numDestinoInternac.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numDestinoInternac.setPreferredSize(new java.awt.Dimension(100, 25));
        numDestinoInternac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDestinoInternacActionPerformed(evt);
            }
        });
        numDestinoInternac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numDestinoInternacKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numDestinoInternacKeyTyped(evt);
            }
        });

        avisoNumOrigenInternac.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumOrigenInternac.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumOrigenInternac.setText("-");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de origen:");
        jLabel20.setPreferredSize(new java.awt.Dimension(150, 15));

        avisoNumDestinoInternac.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumDestinoInternac.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumDestinoInternac.setText("-");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Número de destino:");
        jLabel21.setPreferredSize(new java.awt.Dimension(150, 15));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarifa del país:");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 15));

        tarifa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tarifa.setPreferredSize(new java.awt.Dimension(100, 25));
        tarifa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tarifaKeyTyped(evt);
            }
        });

        avisoTarifa.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        avisoTarifa.setForeground(new java.awt.Color(255, 255, 255));
        avisoTarifa.setText("$");

        javax.swing.GroupLayout InternacionalLayout = new javax.swing.GroupLayout(Internacional);
        Internacional.setLayout(InternacionalLayout);
        InternacionalLayout.setHorizontalGroup(
            InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternacionalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InternacionalLayout.createSequentialGroup()
                        .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numDestinoInternac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numOrigenInternac, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(avisoNumDestinoInternac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avisoNumOrigenInternac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(InternacionalLayout.createSequentialGroup()
                        .addComponent(tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(avisoTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InternacionalLayout.setVerticalGroup(
            InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternacionalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(avisoTarifa))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOrigenInternac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumOrigenInternac)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(InternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDestinoInternac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumDestinoInternac)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        tabbed.addTab("", Internacional);

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

        avisoAgregar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");

        minDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        minDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minDuracionActionPerformed(evt);
            }
        });

        fecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.HOUR));
        fecha.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Fecha en que ocurrió:");
        jLabel22.setPreferredSize(new java.awt.Dimension(150, 15));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Duración de llamada:");
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 15));

        segDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " ", " " }));
        segDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segDuracionActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("S");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("M");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(opInterprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(opInternac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(opLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(avisoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(minDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(segDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel19)
                                                .addGap(73, 73, 73)
                                                .addComponent(jLabel18))))))
                            .addComponent(tabbed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opInterprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opInternac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(avisoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbed.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opInternacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInternacActionPerformed
        opsTipoLlamada.add(opInternac);
        tabbed.add(Internacional);
        tabbed.remove(Interprovincial);
        tabbed.remove(Local);
    }//GEN-LAST:event_opInternacActionPerformed

    private void opInterprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opInterprovActionPerformed
        opsTipoLlamada.add(opInterprov);
        tabbed.add(Interprovincial);
        tabbed.remove(Local);
        tabbed.remove(Internacional);
    }//GEN-LAST:event_opInterprovActionPerformed

    private void opLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLocalActionPerformed
        opsTipoLlamada.add(opLocal);
        tabbed.add(Local);
        tabbed.remove(Interprovincial);
        tabbed.remove(Internacional);
    }//GEN-LAST:event_opLocalActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
        invalidarLlamadasContratoInvalido();
        obtenerFechaHora();
         if(opInterprov.isSelected()){
       habilitacionNoAgregarCamposVaciosInterprov();
       revisionFinalLongitudnumDestinoInterprov();
       revisionFinalLongitudnumOrigenInterprov();
       obtenerFechaHora();                        
       revisionFinalnumOrigenInterprov();
       revisionFinalnumDestinoInterprov();
         }else if(opInternac.isSelected()){
             habilitacionNoAgregarCamposVaciosInternac();
       revisionFinalLongitudnumDestinoInternac();
       revisionFinalLongitudnumOrigenInternac();
       obtenerFechaHora();                        
       revisionFinalnumOrigenInternac();
       revisionFinalnumDestinoInternac();
         }else if(opLocal.isSelected()){
             habilitacionNoAgregarCamposVaciosLocal();
       revisionFinalLongitudnumDestinoLocal();
       revisionFinalLongitudnumOrigenLocal();
       obtenerFechaHora();                        
       revisionFinalnumOrigenLocal();
       revisionFinalnumDestinoLocal();
         }
         obtenerDatos();
    }//GEN-LAST:event_agregarMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

    }//GEN-LAST:event_agregarActionPerformed

    private void minDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minDuracionActionPerformed

    private void segDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_segDuracionActionPerformed

    private void tarifaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarifaKeyTyped
        validacionTelefonoTarifa(evt);
    }//GEN-LAST:event_tarifaKeyTyped

    private void numDestinoInterprovKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoInterprovKeyTyped
        longitudNumeroDestinoInterprov(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroDestinoInterprov(evt);
    }//GEN-LAST:event_numDestinoInterprovKeyTyped

    private void numDestinoInterprovKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoInterprovKeyReleased

    }//GEN-LAST:event_numDestinoInterprovKeyReleased

    private void numDestinoInterprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDestinoInterprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDestinoInterprovActionPerformed

    private void numOrigenInterprovKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenInterprovKeyTyped
        longitudNumeroOrigenInterprov(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroOrigenInterprov(evt);
    }//GEN-LAST:event_numOrigenInterprovKeyTyped

    private void numOrigenInterprovKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenInterprovKeyReleased

    }//GEN-LAST:event_numOrigenInterprovKeyReleased

    private void numOrigenInterprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOrigenInterprovActionPerformed

    }//GEN-LAST:event_numOrigenInterprovActionPerformed

    private void numOrigenLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOrigenLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOrigenLocalActionPerformed

    private void numOrigenLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenLocalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numOrigenLocalKeyReleased

    private void numOrigenLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenLocalKeyTyped
        longitudNumeroOrigenLocal(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroOrigenLocal(evt);
    }//GEN-LAST:event_numOrigenLocalKeyTyped

    private void numDestinoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDestinoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDestinoLocalActionPerformed

    private void numDestinoLocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoLocalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numDestinoLocalKeyReleased

    private void numDestinoLocalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoLocalKeyTyped
        longitudNumeroDestinoLocal(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroDestinoLocal(evt);
    }//GEN-LAST:event_numDestinoLocalKeyTyped

    private void numDestinoInternacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoInternacKeyTyped
        longitudNumeroDestinoInternac(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroDestinoInternac(evt);
    }//GEN-LAST:event_numDestinoInternacKeyTyped

    private void numDestinoInternacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoInternacKeyReleased

    }//GEN-LAST:event_numDestinoInternacKeyReleased

    private void numDestinoInternacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDestinoInternacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDestinoInternacActionPerformed

    private void numOrigenInternacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenInternacKeyTyped
        longitudNumeroOrigenInternac(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroOrigenInternac(evt);
    }//GEN-LAST:event_numOrigenInternacKeyTyped

    private void numOrigenInternacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenInternacKeyReleased

    }//GEN-LAST:event_numOrigenInternacKeyReleased

    private void numOrigenInternacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOrigenInternacActionPerformed

    }//GEN-LAST:event_numOrigenInternacActionPerformed

    private void opInternacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opInternacKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_opInternacKeyTyped

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
            java.util.logging.Logger.getLogger(Llamadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Llamadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Llamadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Llamadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Llamadas dialog = new Llamadas(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Internacional;
    private javax.swing.JPanel Interprovincial;
    private javax.swing.JPanel Local;
    private javax.swing.JButton agregar;
    private javax.swing.JLabel avisoAgregar;
    private javax.swing.JLabel avisoNumDestinoInternac;
    private javax.swing.JLabel avisoNumDestinoInterprov;
    private javax.swing.JLabel avisoNumDestinoLocal;
    private javax.swing.JLabel avisoNumOrigenInternac;
    private javax.swing.JLabel avisoNumOrigenInterprov;
    private javax.swing.JLabel avisoNumOrigenLocal;
    private javax.swing.JLabel avisoTarifa;
    private javax.swing.JSpinner fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox minDuracion;
    private javax.swing.JFormattedTextField numDestinoInternac;
    private javax.swing.JFormattedTextField numDestinoInterprov;
    private javax.swing.JFormattedTextField numDestinoLocal;
    private javax.swing.JFormattedTextField numOrigenInternac;
    private javax.swing.JFormattedTextField numOrigenInterprov;
    private javax.swing.JFormattedTextField numOrigenLocal;
    private javax.swing.JRadioButton opInternac;
    private javax.swing.JRadioButton opInterprov;
    private javax.swing.JRadioButton opLocal;
    private javax.swing.ButtonGroup opsTipoLlamada;
    private javax.swing.JComboBox segDuracion;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JFormattedTextField tarifa;
    // End of variables declaration//GEN-END:variables
}
