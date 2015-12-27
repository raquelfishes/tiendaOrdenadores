package tiendaOrdenadores;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class jpAdmin extends javax.swing.JFrame {

    public jpAdmin() {
        initComponents();
        this.setTitle ("Administrador");
        setDefaultCloseOperation(jpAdmin.DISPOSE_ON_CLOSE);
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
        jPanel2 = new javax.swing.JPanel();
        bAnyadirTienda = new javax.swing.JRadioButton();
        bModificarTienda = new javax.swing.JRadioButton();
        bBorrarTienda = new javax.swing.JRadioButton();
        bConsultarTienda = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        bAnyadirEmpleado = new javax.swing.JRadioButton();
        bModificarEmpleado = new javax.swing.JRadioButton();
        bBorrarEmpleado = new javax.swing.JRadioButton();
        bConsultarEmpleado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        Accion = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bAnyadirProducto = new javax.swing.JRadioButton();
        bModificarProducto = new javax.swing.JRadioButton();
        bBorrarProducto = new javax.swing.JRadioButton();
        bConfigurarOrdenador = new javax.swing.JRadioButton();
        bConsultarProducto2 = new javax.swing.JRadioButton();
        bVenderProducto = new javax.swing.JRadioButton();
        bConsultarProducto4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrador"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiendas:"));
        jPanel2.setToolTipText("");

        Agrupados.add(bAnyadirTienda);
        bAnyadirTienda.setText("Añadir Tienda");
        bAnyadirTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnyadirTiendaActionPerformed(evt);
            }
        });

        Agrupados.add(bModificarTienda);
        bModificarTienda.setText("Modificar Tienda");

        Agrupados.add(bBorrarTienda);
        bBorrarTienda.setText("Borrar Tienda");

        Agrupados.add(bConsultarTienda);
        bConsultarTienda.setText("Consultar Tienda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirTienda)
                    .addComponent(bModificarTienda)
                    .addComponent(bBorrarTienda)
                    .addComponent(bConsultarTienda))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(bAnyadirTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarTienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarTienda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados:"));

        Agrupados.add(bAnyadirEmpleado);
        bAnyadirEmpleado.setText("Añadir Empleado");
        bAnyadirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnyadirEmpleadoActionPerformed(evt);
            }
        });

        Agrupados.add(bModificarEmpleado);
        bModificarEmpleado.setText("Modificar Empleado");

        Agrupados.add(bBorrarEmpleado);
        bBorrarEmpleado.setText("Borrar Empleado");

        Agrupados.add(bConsultarEmpleado);
        bConsultarEmpleado.setText("Consultar Empleado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirEmpleado)
                    .addComponent(bModificarEmpleado)
                    .addComponent(bBorrarEmpleado)
                    .addComponent(bConsultarEmpleado))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bAnyadirEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarEmpleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Resultados.setColumns(20);
        Resultados.setRows(5);
        jScrollPane1.setViewportView(Resultados);

        Accion.setText("Realizar Accion");
        Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos:"));

        Agrupados.add(bAnyadirProducto);
        bAnyadirProducto.setText("Añadir Producto");

        Agrupados.add(bModificarProducto);
        bModificarProducto.setText("Modificar Producto");

        Agrupados.add(bBorrarProducto);
        bBorrarProducto.setText("Borrar Producto");

        Agrupados.add(bConfigurarOrdenador);
        bConfigurarOrdenador.setText("Configurar Ordenador");

        Agrupados.add(bConsultarProducto2);
        bConsultarProducto2.setText("Consultar Producto");

        Agrupados.add(bVenderProducto);
        bVenderProducto.setText("Vender Producto");
        bVenderProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVenderProductoActionPerformed(evt);
            }
        });

        Agrupados.add(bConsultarProducto4);
        bConsultarProducto4.setText("Consultar Catálogo");
        bConsultarProducto4.setToolTipText("");
        bConsultarProducto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarProducto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAnyadirProducto)
                    .addComponent(bModificarProducto)
                    .addComponent(bBorrarProducto)
                    .addComponent(bConfigurarOrdenador)
                    .addComponent(bConsultarProducto2)
                    .addComponent(bVenderProducto)
                    .addComponent(bConsultarProducto4))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bAnyadirProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModificarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bBorrarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarProducto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bVenderProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConfigurarOrdenador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bConsultarProducto4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(Accion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Accion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionActionPerformed

    //Añade Tienda
        if(bAnyadirTienda.isSelected()){
            jpAñadeTienda pAñade = new jpAñadeTienda();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Tienda",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Tienda tienda = new Tienda(pAñade.getNombre(), pAñade.getDireccion(),
                    pAñade.getHorarioApertura(), null);
                TiendaOrdenadoresUI.tiendaOrdenadores.añadirTienda(tienda);
                Resultados.setText ("La tienda se ha insertado satisfactoriamente");
            }
        }
    //Modificar Tienda
        else if(bModificarTienda.isSelected()){
          if(!TiendaOrdenadoresUI.tiendaOrdenadores.tiendas.isEmpty()){
            jpEditaTienda pEdita = new jpEditaTienda();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Tienda",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    TiendaOrdenadoresUI.tiendaOrdenadores.modificarTienda(pEdita.getNumero()-1, pEdita.getNombre(), pEdita.getDireccion(),
                            pEdita.getHorarioApertura());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("La tienda se ha modificado satisfactoriamente");
            }
          }else{
              Resultados.setText ("No hay tiendas");
            }
        }
    //Borrar Tienda
        else if(bBorrarTienda.isSelected()){
          if(!TiendaOrdenadoresUI.tiendaOrdenadores.tiendas.isEmpty()){
            jpBorraTienda pBorra = new jpBorraTienda();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Tienda",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Tienda tienda=TiendaOrdenadoresUI.tiendaOrdenadores.tiendas.get(pBorra.getNumero()-1);
                    TiendaOrdenadoresUI.tiendaOrdenadores.borrarTienda(tienda);
                    Resultados.setText ("La tienda se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay tiendas");
            }
        }
    //Consultar Tienda
        else if(bConsultarTienda.isSelected()){
          if(!TiendaOrdenadoresUI.tiendaOrdenadores.tiendas.isEmpty()){
            jpConsultaTienda pConsulta = new jpConsultaTienda();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Tienda",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    if ((pConsulta.getNumero()>0) && (pConsulta.getNumero()<TiendaOrdenadoresUI.tiendaOrdenadores.numeroTiendas()+1)){
                        Resultados.setText ("");
                        Tienda tienda=TiendaOrdenadoresUI.tiendaOrdenadores.tiendas.get(pConsulta.getNumero()-1);
                        Resultados.setText (tienda.toString());
                    }else{
                        Resultados.setText ("El identificador de tienda no es correcto");
                    }
                }
            }else{
                Resultados.setText ("No hay tiendas");
            }
        }
        
    //Añade Empleado
        if(bAnyadirEmpleado.isSelected()){
            jpAñadeEmpleado pAñade = new jpAñadeEmpleado();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Empleado",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Empleado empleado = new Empleado(pAñade.getNombre(), pAñade.getApellidos(),
                    pAñade.getSueldoBase());
                TiendaOrdenadoresUI.tiendaOrdenadores.añadirEmpleado(empleado, pAñade.getEsEncargado());
                Resultados.setText ("El empleado se ha insertado satisfactoriamente");
            }
        }
    //Modificar Emoleado
        else if(bModificarEmpleado.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpEditaPiloto pEdita = new jpEditaPiloto();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Piloto",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    Formula1UI.formula1.modificarPiloto(pEdita.getNumero()-1, pEdita.getNombre(), 
                            pEdita.getApellidos(), pEdita.getDatosPersonales());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("El piloto se ha modificado satisfactoriamente");
            }
          }
        }
    //Borrar Piloto
        else if(bBorrarEmpleado.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpBorraPiloto pBorra = new jpBorraPiloto();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Piloto",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Piloto piloto=Formula1UI.formula1.pilotos.get(pBorra.getNumero()-1);
                    Formula1UI.formula1.borrarPiloto(piloto);
                    Resultados.setText ("El piloto se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay pilotos");
            }
        }
    //Consultar Piloto
        else if(bConsultarEmpleado.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpConsultaPiloto pConsulta = new jpConsultaPiloto();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Piloto",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    if ((pConsulta.getNumero()>0) && (pConsulta.getNumero()<Formula1UI.formula1.numeroPilotos()+1)){
                        Piloto piloto=Formula1UI.formula1.pilotos.get(pConsulta.getNumero()-1);
                        Piloto x= Formula1UI.formula1.consultarPiloto(piloto);
                        Resultados.setText (x.toString());
                    }else{
                        Resultados.setText ("El identificador de piloto no es correcto");
                    }
                }
            }else{
                Resultados.setText ("No hay pilotos");
            }
        }
        
    //Añade Circuito
        if(bAnyadirVendedor.isSelected()){
            jpAñadeCircuito pAñade = new jpAñadeCircuito();
            if(JOptionPane.showConfirmDialog(this, pAñade, "Añade Circuito",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                    Circuito circuito = new Circuito(pAñade.getNombre(), pAñade.getAforo(),
                    pAñade.getCanon(), pAñade.getNumRectas(), pAñade.getNumCurvas());
                Formula1UI.formula1.añadirCircuito(circuito);
                Resultados.setText ("El circuito se ha insertado satisfactoriamente");
            }
        }
    //Modificar Circuito
        else if(bModificarVendedor.isSelected()){
          if(!Formula1UI.formula1.circuitos.isEmpty()){
            jpEditaCircuito pEdita = new jpEditaCircuito();
            if(JOptionPane.showConfirmDialog(this, pEdita, "Modificar Circuito",
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
            == JOptionPane.OK_OPTION) {
                try {
                    Formula1UI.formula1.modificarCircuito(pEdita.getNumero()-1, pEdita.getNombre(), 
                            pEdita.getAforo(), pEdita.getCanon());
                } catch (ParseException ex) {
                    Logger.getLogger(jpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                Resultados.setText ("El circuito se ha modificado satisfactoriamente");
            }
          }
        }
    //Borrar Circuito
        else if(bBorrarVendedor.isSelected()){
          if(!Formula1UI.formula1.pilotos.isEmpty()){
            jpBorraCircuito pBorra = new jpBorraCircuito();
            if(JOptionPane.showConfirmDialog(this, pBorra, "Borrar Circuito",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    Circuito circuito=Formula1UI.formula1.circuitos.get(pBorra.getNumero()-1);
                    Formula1UI.formula1.borrarCircuito(circuito);
                    Resultados.setText ("El circuito se ha borrado satisfactoriamente");
                }
            }else{
              Resultados.setText ("No hay circuitos");
            }
        }
    //Consultar Circuito
        else if(bConsultarVendedor.isSelected()){
          if(!Formula1UI.formula1.circuitos.isEmpty()){
            jpConsultaCircuito pConsulta = new jpConsultaCircuito();
            if(JOptionPane.showConfirmDialog(this, pConsulta, "Consultar Circuito",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)
                == JOptionPane.OK_OPTION) {
                    if ((pConsulta.getNumero()>0) && (pConsulta.getNumero()<Formula1UI.formula1.numeroCircuitos()+1)){
                        Circuito circuito=Formula1UI.formula1.circuitos.get(pConsulta.getNumero()-1);
                        Circuito x= Formula1UI.formula1.consultarCircuito(circuito);
                        Resultados.setText (x.toString());
                    }else{
                        Resultados.setText ("El identificador de circuito no es correcto");
                    }
                }
            }else{
                Resultados.setText ("No hay circuitos");
            }
        }
}//GEN-LAST:event_AccionActionPerformed

    private void bAnyadirTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnyadirTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnyadirTiendaActionPerformed

    private void bVenderProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVenderProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bVenderProductoActionPerformed

    private void bConsultarProducto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarProducto4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bConsultarProducto4ActionPerformed

    private void bAnyadirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnyadirEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAnyadirEmpleadoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jpAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accion;
    private javax.swing.ButtonGroup Agrupados;
    private javax.swing.JTextArea Resultados;
    private javax.swing.JRadioButton bAnyadirEmpleado;
    private javax.swing.JRadioButton bAnyadirProducto;
    private javax.swing.JRadioButton bAnyadirTienda;
    private javax.swing.JRadioButton bBorrarEmpleado;
    private javax.swing.JRadioButton bBorrarProducto;
    private javax.swing.JRadioButton bBorrarTienda;
    private javax.swing.JRadioButton bConfigurarOrdenador;
    private javax.swing.JRadioButton bConsultarEmpleado;
    private javax.swing.JRadioButton bConsultarProducto2;
    private javax.swing.JRadioButton bConsultarProducto4;
    private javax.swing.JRadioButton bConsultarTienda;
    private javax.swing.JRadioButton bModificarEmpleado;
    private javax.swing.JRadioButton bModificarProducto;
    private javax.swing.JRadioButton bModificarTienda;
    private javax.swing.JRadioButton bVenderProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
