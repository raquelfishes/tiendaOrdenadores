/*
 * 
 * 
 */
package tiendaOrdenadores;

public class jpAñadeTienda extends javax.swing.JPanel{

    public jpAñadeTienda() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        lDireccion = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        lHorarioApertura = new javax.swing.JLabel();
        tHorarioApertura = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Añadir Escuderia"));

        lNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lNombre.setText("Nombre:");

        tNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombreActionPerformed(evt);
            }
        });

        lDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lDireccion.setText("Dirección:");

        lHorarioApertura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lHorarioApertura.setText("Horario Apertura:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lNombre)
                            .addComponent(lDireccion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tDireccion)
                            .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lHorarioApertura)
                        .addGap(18, 18, 18)
                        .addComponent(tHorarioApertura, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDireccion)
                    .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHorarioApertura)
                    .addComponent(tHorarioApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombreActionPerformed

    public String getNombre () {
        String s= "Sin Nombre";
        if (!tNombre.getText().equals("")){
            return tNombre.getText();
        }else{
            return s;
        }
    }
    
    public String getDireccion () {
        String s= "Sin Direccion";
        if (!tDireccion.getText().equals("")){
            return tDireccion.getText();
        }else{
            return s;
        }
    }
    
    public String getHorarioApertura () {
        String s= "Sin Horario";
        if (!tHorarioApertura.getText().equals("")){
            return tHorarioApertura.getText();
        }else{
            return s;
        }
        
        
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lHorarioApertura;
    private javax.swing.JLabel lNombre;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tHorarioApertura;
    private javax.swing.JTextField tNombre;
    // End of variables declaration//GEN-END:variables

}
