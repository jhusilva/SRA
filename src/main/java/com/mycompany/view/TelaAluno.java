/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.bean.Aluno;
import com.mycompany.model.dao.alunoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author alan
 */
public class TelaAluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAlunoI
     */
    public TelaAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jBSalvar = new javax.swing.JButton();
        jCTurma = new javax.swing.JComboBox<>();
        jCTurno = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTMatricula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBSalvar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        jCTurma.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jCTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º ano", "2º ano", "3º ano" }));
        jPanel1.add(jCTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 340, -1));

        jCTurno.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jCTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        jPanel1.add(jCTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 340, -1));

        jLabel6.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Turma:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 240, 60, 20));

        jLabel5.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Turno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 50, 20));

        jLabel4.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        jLabel3.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 50, 20));
        jPanel1.add(jTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 340, -1));

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 120, 80, 20));

        jTMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jTMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 340, -1));

        jLabel7.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CADASTRO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 310, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("- CEEP Prefeito João Mendes Olímpio de Melo -");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 260, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 340, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        Aluno naluno = new Aluno();
        alunoDAO dao = new alunoDAO();
        //naluno.setId(Long.valueOf(jLid.getText()));
        naluno.setMatricula(jTMatricula.getText());
        naluno.setNome(jTNome.getText());
        naluno.setSenha(jTSenha.getText());
        naluno.setTurma(jCTurma.getSelectedItem().toString());
        naluno.setTurno(jCTurno.getSelectedItem().toString());

        try{
            dao.salva(naluno);
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMatriculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCTurma;
    private javax.swing.JComboBox<String> jCTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTMatricula;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
