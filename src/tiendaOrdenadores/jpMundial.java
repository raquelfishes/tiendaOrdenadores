package tiendaOrdenadores;

import javax.swing.JOptionPane;

public class jpMundial extends javax.swing.JFrame {

    
    public jpMundial() {
        initComponents();
        this.setTitle ("Administrador");
        setDefaultCloseOperation(jpMundial.DISPOSE_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Agrupados = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();
        bEmpezarMundial = new javax.swing.JButton();
        bEstadisticasMundial = new javax.swing.JButton();
        bEstadisticasCarrera = new javax.swing.JButton();
        bEmpezarCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mundial URJC"));

        resultados.setColumns(20);
        resultados.setRows(5);
        jScrollPane1.setViewportView(resultados);

        bEmpezarMundial.setText("Empezar Mundial");
        bEmpezarMundial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmpezarMundialActionPerformed(evt);
            }
        });

        bEstadisticasMundial.setText("Estadisticas Mundial");
        bEstadisticasMundial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstadisticasMundialActionPerformed(evt);
            }
        });

        bEstadisticasCarrera.setText("Estadisticas Carrera");
        bEstadisticasCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstadisticasCarreraActionPerformed(evt);
            }
        });

        bEmpezarCarrera.setText("Empezar Carrera");
        bEmpezarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmpezarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bEstadisticasMundial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEstadisticasCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEmpezarMundial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEmpezarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bEmpezarMundial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEstadisticasMundial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bEstadisticasCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEmpezarCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEmpezarMundialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmpezarMundialActionPerformed
        String s="";
        Formula1UI.formula1.mundial.setSiguienteCarrera(0);
        resultados.setText(Formula1UI.formula1.mundial.empezarMundial());
}//GEN-LAST:event_bEmpezarMundialActionPerformed

    private void bEstadisticasMundialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstadisticasMundialActionPerformed
        resultados.setText(Formula1UI.formula1.mundial.mostrarEstadisticasMundial());
    }//GEN-LAST:event_bEstadisticasMundialActionPerformed

    private void bEstadisticasCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstadisticasCarreraActionPerformed
        jpConsultaCarrera pConsulta = new jpConsultaCarrera();
        if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar carrera",
           JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                resultados.setText (Formula1UI.formula1.mundial.mostrarEstadisticasCarrera(pConsulta.getNumero()-1));
            }
    }//GEN-LAST:event_bEstadisticasCarreraActionPerformed

    private void bEmpezarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmpezarCarreraActionPerformed
        if (Formula1UI.formula1.mundial.getSiguienteCarrera()+1 < 6)
            resultados.setText ("Se ha realizado la carrera " + (Formula1UI.formula1.mundial.getSiguienteCarrera()+1) + "\n" + 
                Formula1UI.formula1.mundial.empezarCarrera());
        else
            resultados.setText("El mundial ya ha terminado.");
        
    }//GEN-LAST:event_bEmpezarCarreraActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jpMundial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Agrupados;
    private javax.swing.JButton bEmpezarCarrera;
    private javax.swing.JButton bEmpezarMundial;
    private javax.swing.JButton bEstadisticasCarrera;
    private javax.swing.JButton bEstadisticasMundial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultados;
    // End of variables declaration//GEN-END:variables

}
