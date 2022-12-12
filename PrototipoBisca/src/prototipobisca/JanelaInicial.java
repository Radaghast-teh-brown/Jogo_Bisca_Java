/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prototipobisca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandre-kde
 */
public class JanelaInicial extends javax.swing.JFrame {

    public JanelaInicial() {
        initComponents();
        jTextField_NomeJogador.setEditable(false);
        jTextField_NomeJogador.setText("");
        jButton_Alterar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                solicitarNomeJogador();
            }
        });
        
        JanelaInicial janelaInicial = this;
        jButton_HospedarJogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JanelaHospedagem janela = new JanelaHospedagem();
                janela.setVisible(true);
                janelaInicial.setVisible(false);
            }
        });
        
        entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JanelaEntrar janela = new JanelaEntrar();
                janela.setVisible(true);
                janelaInicial.setVisible(false);
            }
        });
        
        
        
        
        
    }
    
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            solicitarNomeJogador();
        }
    }
    
    public void solicitarNomeJogador() {
        String nome = JOptionPane.showInputDialog(null,
                "Informe seu nome", "Bisca",
                JOptionPane.QUESTION_MESSAGE);
        
        nome.replaceAll("\\s+","");
        // Utilizamos um replace para caso o usuário só digite espaços em branco.
        while(nome.equals("")){
            System.out.println("0k");
            nome = JOptionPane.showInputDialog(null,
                "Informe seu nome", "Bisca",
                JOptionPane.QUESTION_MESSAGE);
        }
        jTextField_NomeJogador.setText(nome);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_NomeJogador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton_Alterar = new javax.swing.JButton();
        jButton_HospedarJogo = new javax.swing.JButton();
        entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jTextField_NomeJogador.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel1.setText("Nome do jogador");

        jButton_Alterar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton_Alterar.setText("Alterar");
        jButton_Alterar.setMaximumSize(new java.awt.Dimension(179, 33));
        jButton_Alterar.setMinimumSize(new java.awt.Dimension(179, 33));
        jButton_Alterar.setPreferredSize(new java.awt.Dimension(179, 33));
        jButton_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_NomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_NomeJogador)
                    .addComponent(jButton_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton_HospedarJogo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton_HospedarJogo.setText("Hospedar jogo");
        jButton_HospedarJogo.setMaximumSize(new java.awt.Dimension(179, 33));
        jButton_HospedarJogo.setMinimumSize(new java.awt.Dimension(179, 33));
        jButton_HospedarJogo.setPreferredSize(new java.awt.Dimension(179, 33));
        jButton_HospedarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HospedarJogoActionPerformed(evt);
            }
        });

        entrar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        entrar.setText("Entrar em um jogo");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jButton_HospedarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(entrar)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_HospedarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_HospedarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HospedarJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_HospedarJogoActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entrarActionPerformed

    private void jButton_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_AlterarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton_Alterar;
    private javax.swing.JButton jButton_HospedarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_NomeJogador;
    // End of variables declaration//GEN-END:variables
}
