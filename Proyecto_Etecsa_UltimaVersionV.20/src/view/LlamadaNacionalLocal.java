/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lino
 */
public class LlamadaNacionalLocal extends javax.swing.JFrame {
    /**
     * Creates new form LlamadaNacionalInterprovincial
     */
    public LlamadaNacionalLocal() {
        initComponents();
        setLocationRelativeTo(null);
        
        
    }
    
    
       
    
           boolean addDatos;
    
         public void validacionTelefonoTarifa(java.awt.event.KeyEvent evento){
         if       ((Character.isDigit(evento.getKeyChar())==false)                                         //Números
           && (Character.isISOControl(evento.getKeyChar())==false)){                               //Back Space
                   evento.consume();
                   JOptionPane.showMessageDialog(this, "No se permiten caracteres no numéricos");
         }
      }
        
        
         public void longitudNumeroOrigen(java.awt.event.KeyEvent evento){
          if (numOrigen.getText().length()>=8) {
              evento.consume();
          }         
         }
          
          
          
          public void longitudNumeroDestino(java.awt.event.KeyEvent evento){
          if (numDestino.getText().length()>=12) {
              evento.consume();
          }         
          }
            
         
         
           public void conteoCharsNumeroDestino(java.awt.event.KeyEvent evento){
         if (numDestino.getText().length()<12) {
         avisoNumDestino.setText(String.valueOf(11-numDestino.getText().length()));
         }
     }
     
           
              public void conteoCharsNumeroOrigen(java.awt.event.KeyEvent evento){
         if (numOrigen.getText().length()<8) {
         avisoNumOrigen.setText(String.valueOf(7-numOrigen.getText().length()));
         }
     }
     
     public boolean habilitacionNoAgregarCamposVacios(){
         if ((numOrigen.getText().isEmpty()) 
         || (numDestino.getText().isEmpty())){    
        addDatos=false;
         }else{
             addDatos=true;
         }
         return addDatos;
     }
     
       public boolean obtenerFechaHora(){
            Date fecha = new Date ();
            if (obtenerDatos()==true){
            String diaUsuario= dia.getSelectedItem().toString();
            String mesUsuario=mes.getSelectedItem().toString();
            String horaUsuario=horaHora.getSelectedItem().toString();
             String minUsuario=minHora.getSelectedItem().toString();
            Date datefechaUsuario=new Date();
            datefechaUsuario.setDate(Integer.valueOf(diaUsuario));
            datefechaUsuario.setMonth(Integer.valueOf(mesUsuario)-1);
            datefechaUsuario.setYear(123);
            datefechaUsuario.setHours(Integer.valueOf(horaUsuario));
            datefechaUsuario.setMinutes(Integer.valueOf(minUsuario));
            datefechaUsuario.setSeconds(0);
            if(datefechaUsuario.after(fecha)==true){
             JOptionPane.showMessageDialog(this, "Usted ha establecido una fecha que excede a la fecha actual");
              addDatos=false;
     }else{
              String addFechaLlamada=diaUsuario + "/" + mesUsuario + "/" + "2023";
              String addHoraLlamada=horaUsuario+ ":" + minUsuario;
               addDatos=true;
            }
            } 
            return addDatos;
     } 
                  
       public boolean revisionFinalLongitudnumOrigen(){
       if (numOrigen.getText().length()<8){
            addDatos=false;
       }else if (numOrigen.getText().length()==8){
            addDatos=true;
       }else{
           numOrigen.setText("");
            addDatos=false;
       }
       return addDatos;
    }
       
        public boolean revisionFinalLongitudnumDestino(){
       if (numDestino.getText().length()<12){
            addDatos=false;
       }else if (numDestino.getText().length()==12){
            addDatos=true;
       }else{
           numDestino.setText("");
            addDatos=false;
       }
       return addDatos;
    }

        
         
         public boolean revisionFinalnumOrigen(){
         for (int i=0; i<numOrigen.getText().length();i++){  
            int ascii=(int) numOrigen.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numOrigen.setText("");
                    addDatos=false;
          }else{ 
              addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
         
          public boolean revisionFinalnumDestino(){
          for (int i=0; i<numDestino.getText().length();i++){  
            int ascii=(int) numDestino.getText().charAt(i);
            if    ((Character.isDigit(ascii)==false)){                             //Número
                    numDestino.setText("");
                     addDatos=false;
          }else{ 
             addDatos=true;   
         }
         } 
          return addDatos;
         } 
         
         
         
                public boolean obtenerDatos(){
       if ((habilitacionNoAgregarCamposVacios()==true )
       &&(revisionFinalLongitudnumDestino()==true)
       &&(revisionFinalLongitudnumOrigen()==true)
       &&(revisionFinalnumOrigen()==true)
       &&(revisionFinalnumDestino()==true)){
           String duracionLlamada=horaHora.getSelectedItem().toString()+ ":" + minHora.getSelectedItem().toString();
           String addnumOrigen=numOrigen.getText();
           String addnumDestino=numDestino.getText();
           String addDuracion=duracionLlamada;
            avisoAgregar.setText("");
            addDatos=true;
       }else{
            avisoAgregar.setText("Puede que usted no haya introducido algunos datos de la manera correcta");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numOrigen = new javax.swing.JFormattedTextField();
        numDestino = new javax.swing.JFormattedTextField();
        avisoNumOrigen = new javax.swing.JLabel();
        avisoNumDestino = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        horaHora = new javax.swing.JComboBox();
        minHora = new javax.swing.JComboBox();
        horaDuracion = new javax.swing.JComboBox();
        minDuracion = new javax.swing.JComboBox();
        agregar = new javax.swing.JButton();
        avisoAgregar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número de origen:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de destino:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha en que ocurrió:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora en que ocurrió:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Duración de llamada:");

        numOrigen.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOrigenActionPerformed(evt);
            }
        });
        numOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numOrigenKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numOrigenKeyTyped(evt);
            }
        });

        numDestino.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        numDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDestinoActionPerformed(evt);
            }
        });
        numDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numDestinoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numDestinoKeyTyped(evt);
            }
        });

        avisoNumOrigen.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumOrigen.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumOrigen.setText("-");

        avisoNumDestino.setBackground(new java.awt.Color(255, 255, 255));
        avisoNumDestino.setForeground(new java.awt.Color(204, 204, 204));
        avisoNumDestino.setText("-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("H");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("M");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("H");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("M");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("D");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("M");

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });

        horaHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        horaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaHoraActionPerformed(evt);
            }
        });

        minHora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", " " }));
        minHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minHoraActionPerformed(evt);
            }
        });

        horaDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        horaDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaDuracionActionPerformed(evt);
            }
        });

        minDuracion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", " " }));
        minDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minDuracionActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(204, 204, 204));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(71, 71, 71)
                .addComponent(jLabel17)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(numOrigen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(avisoNumDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                    .addComponent(avisoNumOrigen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel12)
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(horaHora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(minHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(horaDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(minDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel14)
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel15))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avisoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumOrigen)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avisoNumDestino)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(horaDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(40, 40, 40)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avisoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOrigenActionPerformed

    }//GEN-LAST:event_numOrigenActionPerformed

    private void numOrigenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenKeyReleased

    }//GEN-LAST:event_numOrigenKeyReleased

    private void numOrigenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOrigenKeyTyped
        longitudNumeroOrigen(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroOrigen(evt);
    }//GEN-LAST:event_numOrigenKeyTyped

    private void numDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numDestinoActionPerformed

    private void numDestinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoKeyReleased

    }//GEN-LAST:event_numDestinoKeyReleased

    private void numDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numDestinoKeyTyped
        longitudNumeroDestino(evt);
        validacionTelefonoTarifa(evt);
        conteoCharsNumeroDestino(evt);
    }//GEN-LAST:event_numDestinoKeyTyped

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void horaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaHoraActionPerformed

    private void minHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minHoraActionPerformed

    private void horaDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaDuracionActionPerformed

    private void minDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minDuracionActionPerformed

    private void agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseClicked
          revisionFinalnumOrigen();
         revisionFinalnumDestino();
         revisionFinalLongitudnumOrigen();
         revisionFinalLongitudnumDestino();
         obtenerDatos();
            if(obtenerFechaHora()==true){
              setVisible(false);
         }   
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
            java.util.logging.Logger.getLogger(LlamadaNacionalLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LlamadaNacionalLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LlamadaNacionalLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LlamadaNacionalLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LlamadaNacionalLocal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel avisoAgregar;
    private javax.swing.JLabel avisoNumDestino;
    private javax.swing.JLabel avisoNumOrigen;
    private javax.swing.JComboBox dia;
    private javax.swing.JComboBox horaDuracion;
    private javax.swing.JComboBox horaHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mes;
    private javax.swing.JComboBox minDuracion;
    private javax.swing.JComboBox minHora;
    private javax.swing.JFormattedTextField numDestino;
    private javax.swing.JFormattedTextField numOrigen;
    // End of variables declaration//GEN-END:variables
}
