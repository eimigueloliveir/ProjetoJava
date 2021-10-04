package Interface;

public class jfprincipal extends javax.swing.JFrame {

    public jfprincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmcadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmconsulta = new javax.swing.JMenuItem();
        jmlistagem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Java");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jmcadastro.setText("Cadastro Clientes");
        jmcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jmcadastro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmconsulta.setText("Consultas Clientes");
        jmconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmconsultaActionPerformed(evt);
            }
        });
        jMenu2.add(jmconsulta);

        jmlistagem.setText("Listagem de Clientes");
        jmlistagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlistagemActionPerformed(evt);
            }
        });
        jMenu2.add(jmlistagem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    this.setExtendedState(MAXIMIZED_BOTH);


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jmcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcadastroActionPerformed
   
    jifcadastro obj = new jifcadastro();
    jdpprincipal.add(obj);
    obj.setVisible(true);
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jmcadastroActionPerformed

    private void jmconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmconsultaActionPerformed
    jifconsulta obj = new jifconsulta();
    jdpprincipal.add(obj);
    obj.setVisible(true);    
        
// TODO add your handling code here:
    }//GEN-LAST:event_jmconsultaActionPerformed

    private void jmlistagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlistagemActionPerformed
    jiflistagem obj = new jiflistagem();
    jdpprincipal.add(obj);
    obj.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlistagemActionPerformed

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenuItem jmcadastro;
    private javax.swing.JMenuItem jmconsulta;
    private javax.swing.JMenuItem jmlistagem;
    // End of variables declaration//GEN-END:variables

}
