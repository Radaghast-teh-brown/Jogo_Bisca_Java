/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototipobisca;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



/**
 *
 * @author alexandre-kde
 */
public class JanelaHospedagem extends javax.swing.JFrame {
        
    public JanelaHospedagem() {
        initComponents();
        jButton_Iniciar.addMouseListener(new MouseAdapter() {
            @Override
            
            //Essa parte é para abrir o o jogo
            
            public void mouseClicked(MouseEvent e){
               String ip = jTextField_EndereçoIP.getText();
               String codigo = jTextField_Codigo.getText();
               System.out.println("ip:" + ip);
               System.out.println("codigo:" + codigo);
               
               // ip.replaceAll("\\s+",""); 
               // codigo.replaceAll("\\s+",""); 
               boolean isNumeric = ip.chars().allMatch( Character::isDigit );
               System.out.println(isNumeric);
               
             /*  if(matchesOnlyText(ip)) {
                JOptionPane.showMessageDialog(null, "IP inválido");
                }*/
                int numeroPontos = ip.split("\\.", -1).length-1;
                   ip = ip.replaceAll("\\.", "");
                   if(!ip.matches("[0-9]*") || ip.equals("") || !codigo.matches("[A-Z]*") || codigo.equals("") || numeroPontos != 3) {
                       if(!ip.matches("[0-9]*") || ip.equals("") || numeroPontos != 3){
                           JOptionPane.showMessageDialog(null, "IP inválido");
                           jTextField_EndereçoIP.setText("");
                       }else{
                           JOptionPane.showMessageDialog(null, "Código inválido");
                           jTextField_Codigo.setText("");
                       }
                    
                    }else{
                            java.awt.EventQueue.invokeLater(new Runnable() {
                         @Override
                         public void run() {
                             JanelaMesa.executaTesteDePrototipo();
                             JanelaHospedagem.this.dispose();
                     }});
                       
                   }
            }
        });
        
     
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    
    public boolean matchesOnlyText(String text) {
        return text.matches("[^\\d]+"); 
    
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_EndereçoIP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_JogadoresConectados = new javax.swing.JTextField();
        jButton_Iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_EndereçoIP.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel1.setText("Endereço IP:");

        jTextField_Codigo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel2.setText("Código:");

        jLabel3.setText("Jogadores conectados:");

        jTextField_JogadoresConectados.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jButton_Iniciar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton_Iniciar.setText("Iniciar jogo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_EndereçoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_JogadoresConectados, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_EndereçoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_JogadoresConectados, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Iniciar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaHospedagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Codigo;
    private javax.swing.JTextField jTextField_EndereçoIP;
    private javax.swing.JTextField jTextField_JogadoresConectados;
    // End of variables declaration//GEN-END:variables
}
