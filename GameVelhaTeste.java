/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogodavelha;

/**
 *
 * @author 021.900803
 */
public class GameVelha extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameVelha.class.getName());

    /**
     * Creates new form GameVelha
     */
    String simb="O";
    String[] caminho = new String [9]; //declara vetor
    int nj=0, j1=0, j2=0, emp=0;
    String nome1= "", nome2 = "";
    boolean enc=false;
    
    
    public GameVelha() {
        initComponents();
    }

    public void inicializar(){
        
        for(int i=0; i<9; i++){
        caminho[i]="";
    }
    
    B1.setText("");
    B2.setText("");
    B3.setText("");
    B4.setText("");
    B5.setText("");
    B6.setText("");
    B7.setText("");
    B8.setText("");
    B9.setText("");
    
    enc=false;
    //estatistica();
    nj=0;
    
    }
    
    public String simbolo(){
        
        if(simb.equals("O")){
            simb = "X";
            //idNome.setText(nome2);
        }else{
            simb="O";
            //idNome.setText(nome1);
        }
        nj++;
        return simb;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton18 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();

        jButton18.setText("jButton10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B2.addActionListener(this::B2ActionPerformed);
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 110, 90));

        B3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B3.addActionListener(this::B3ActionPerformed);
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 110, 90));

        B4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B4.addActionListener(this::B4ActionPerformed);
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 80));

        B5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B5.addActionListener(this::B5ActionPerformed);
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 110, 80));

        B6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B6.addActionListener(this::B6ActionPerformed);
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 110, 80));

        B7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B7.addActionListener(this::B7ActionPerformed);
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 80));

        B8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B8.addActionListener(this::B8ActionPerformed);
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 80));

        B9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 110, 80));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B1.addActionListener(this::B1ActionPerformed);
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 90));

        pack();
    }// </editor-fold>                        

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B3.getText().equals("")) {
            B3.setText(simbolo());
            caminho[3]+=B3.getText();
            caminho[4]+=B3.getText();
            caminho[8]+=B3.getText();
            
        }//if(nj>=5)
                //resultado();
        
    }                                  

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B7.getText().equals("")){
            B7.setText(simbolo());
            caminho[6]+=B7.getText();
            caminho[1]+=B7.getText();
            caminho[8]+=B7.getText();
            
        }  //if(nj>=5)
               // resultado();
        
    }                                  

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B5.getText().equals("")){
            B5.setText(simbolo());
            caminho[5]+=B5.getText();
            caminho[2]+=B5.getText();
            caminho[7]+=B5.getText();
            caminho[8]+=B5.getText();
            
        } //if(nj>=5)
               // resultado();
        
    }                                  

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B2.getText().equals("")) {
            B2.setText(simbolo());
            caminho[4]+=B2.getText();
            caminho[5]+=B2.getText();
            caminho[6]+=B2.getText();
        }// if(nj>=5)
              //  resultado();
            
        
    }                                  

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B1.getText().equals("")){
            B1.setText(simbolo());
            caminho[1]+=B1.getText();
            caminho[4]+=B1.getText();
            caminho[7]+=B1.getText();
            
        }//if(nj>=5)
               // resultado();
        
        
        
    }                                  

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if( B4.getText().equals("")){
            B4.setText (simbolo());
            caminho[4]+=B4.getText();
            caminho[2]+=B4.getText();
        }//if(nj>=5)
               // resultado();
          
        
    }                                  

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(B6.getText().equals("")){
            B6.setText(simbolo());
            caminho[3]+=B6.getText();
            caminho[5]+=B6.getText();
            
        }//  if(nj>=5)
               // resultado();
        
    }                                  

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
         if(B8.getText().equals("")){
             B8.setText(simbolo());
             caminho[2]+=B8.getText();
             caminho[6]+=B8.getText();
             
         }// if(nj>=5)
              //  resultado();
              
         
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GameVelha().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton jButton18;
    // End of variables declaration                   
}
