package Interface;

import Persistencia.ConsultaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class jifconsulta extends javax.swing.JInternalFrame {

   int resultados; 
    public jifconsulta() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jctipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb1 = new javax.swing.JTable();
        jbcap = new javax.swing.JButton();
        jbsair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Clientes");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "RG", "CPF" }));

        jLabel1.setText("Consultar por:");

        jTextField1.setText(" ");

        jLabel2.setText("Digite o Argumento:");

        jtb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "CPF", "Telefone", "Status"
            }
        ));
        jScrollPane1.setViewportView(jtb1);

        jbcap.setText("Capturar");
        jbcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcapActionPerformed(evt);
            }
        });

        jbsair.setText("Sair");
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbcap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jctipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbcap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        setBounds(500, 40, 944, 525);
    }// </editor-fold>//GEN-END:initComponents

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsairActionPerformed
    dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsairActionPerformed

    private void jbcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcapActionPerformed
    
    String tipo="";
    String escolha = jctipo.getSelectedItem().toString().trim();
    if (escolha== "Nome"){
        tipo = " " + "pes_nome";
    } if (escolha== "RG") {
        tipo = " " + "pes_rg";
    } if (escolha== "CPF") 
        tipo = " " + "pes_cpf";
    String arg = jTextField1.getText();
    DefaultTableModel mp1 = (DefaultTableModel) jtb1.getModel();
            int l=mp1.getRowCount();

        if(1>0)
        {
            while(l>0)
            {
                ((DefaultTableModel) jtb1.getModel()).removeRow(1-1);
                l--;
            }
        }

        try{
            ResultSet rs = ConsultaDAO.filtrar (tipo, arg);

            DefaultTableModel mp = (DefaultTableModel) jtb1.getModel();
        while(rs.next())
            {
                resultados++;
                String Coluna0 = rs.getString("pes_nome").toString().trim();
                String Coluna1 = rs.getString("pes_rg").toString().trim();
                String Coluna2 = rs.getString("pes_CPF").toString().trim();
                String Coluna3 = rs.getString("pes_Tel").toString().trim();
                String Coluna4 = rs.getString("pes_Status").toString().trim();
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
        jLabel1.setText( resultados +" resulatados encontrados");
// TODO add your handling code here:
    }//GEN-LAST:event_jbcapActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    DefaultTableModel mp1 = (DefaultTableModel) jtb1.getModel();
            int l=mp1.getRowCount();

        if(1>0)
        {
            while(l>0)
            {
                ((DefaultTableModel) jtb1.getModel()).removeRow(1-1);
                l--;
            }
        }

        try{
            ResultSet rs = ConsultaDAO.carregaTabela ();

            DefaultTableModel mp = (DefaultTableModel) jtb1.getModel();
        while(rs.next())
            {
                String Coluna0 = rs.getString("pes_nome").toString().trim();
                String Coluna1 = rs.getString("pes_rg").toString().trim();
                String Coluna2 = rs.getString("pes_CPF").toString().trim();
                String Coluna3 = rs.getString("pes_Tel").toString().trim();
                String Coluna4 = rs.getString("pes_Status").toString().trim();
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4});
            
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
        jLabel1.setText( resultados +" resulatados encontrados");
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbcap;
    private javax.swing.JButton jbsair;
    private javax.swing.JComboBox<String> jctipo;
    private javax.swing.JTable jtb1;
    // End of variables declaration//GEN-END:variables
}
