package proyecto1ed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    File archivo;
    FileWriter out;
    BufferedWriter bout;

    LinkedList students;

    public main() {
        initComponents();
        students = new LinkedList();
        try {
            archivo = new File("./Notas.csv");
            out = new FileWriter(archivo, true);
        } catch (IOException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdAdd = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCarreer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        bAdd2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bCancel = new javax.swing.JButton();
        jdAdmin = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        cbStudents = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlGrades = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        bAddGrade = new javax.swing.JButton();
        bRemoveGrade = new javax.swing.JButton();
        bRemoveStudent = new javax.swing.JButton();
        bExitAdmin = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bAdmin = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bExit = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Carrera: ");

        jLabel3.setText("No. Cuenta:");

        bAdd2.setText("Agregar");
        bAdd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAdd2MouseClicked(evt);
            }
        });

        jLabel4.setText("Agregar Estudiante");

        bCancel.setText("Cancelar");
        bCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdAddLayout = new javax.swing.GroupLayout(jdAdd.getContentPane());
        jdAdd.getContentPane().setLayout(jdAddLayout);
        jdAddLayout.setHorizontalGroup(
            jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAddLayout.createSequentialGroup()
                .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdAddLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdAddLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfName))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jdAddLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfCarreer, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jdAddLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jdAddLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel4))
                    .addGroup(jdAddLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jdAddLayout.setVerticalGroup(
            jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCarreer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAdd2)
                .addGap(18, 18, 18)
                .addComponent(bCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Escoja un estudiante: ");

        cbStudents.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStudentsItemStateChanged(evt);
            }
        });

        jScrollPane1.setViewportView(jlGrades);

        jLabel6.setText("Notas:");

        bAddGrade.setText("Agregar nueva nota");
        bAddGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAddGradeMouseClicked(evt);
            }
        });

        bRemoveGrade.setText("Eliminar nota seleccionada");
        bRemoveGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRemoveGradeMouseClicked(evt);
            }
        });

        bRemoveStudent.setText("Eliminar estudiante seleccionado");
        bRemoveStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bRemoveStudentMouseClicked(evt);
            }
        });

        bExitAdmin.setText("Salir");
        bExitAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdAdminLayout = new javax.swing.GroupLayout(jdAdmin.getContentPane());
        jdAdmin.getContentPane().setLayout(jdAdminLayout);
        jdAdminLayout.setHorizontalGroup(
            jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAdminLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdAdminLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bRemoveStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bRemoveGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAddGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bExitAdmin)
                .addGap(271, 271, 271))
        );
        jdAdminLayout.setVerticalGroup(
            jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdAdminLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jdAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(jdAdminLayout.createSequentialGroup()
                        .addComponent(bAddGrade)
                        .addGap(30, 30, 30)
                        .addComponent(bRemoveGrade)
                        .addGap(32, 32, 32)
                        .addComponent(bRemoveStudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bExitAdmin)
                .addGap(27, 27, 27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titulo.setText("Administrador de Notas");

        bAdd.setText("Agregar un estudiante al sistema");
        bAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAddMouseClicked(evt);
            }
        });

        bAdmin.setText("Administrar notas de estudiantes");
        bAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAdminMouseClicked(evt);
            }
        });

        bSave.setText("Guardar datos  (Archivo CSV)");
        bSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSaveMouseClicked(evt);
            }
        });

        bExit.setText("Salir");
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(bExit)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseClicked
        int x = JOptionPane.showConfirmDialog(this, "Seguro que desea salir?", "Datos no guardados seran perdidos", JOptionPane.OK_CANCEL_OPTION);
        if (x == JOptionPane.OK_OPTION) {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {

            }
            System.exit(0);
        }
    }//GEN-LAST:event_bExitMouseClicked

    private void bAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddMouseClicked
        jdAdd.setLocationRelativeTo(this);
        jdAdd.setModal(true);
        jdAdd.pack();
        jdAdd.setVisible(true);
    }//GEN-LAST:event_bAddMouseClicked

    private void bAdd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdd2MouseClicked
        if (!tfName.getText().equals("") && !tfCarreer.getText().equals("") && !tfId.getText().equals("")) {
            if (students.insert(new Student(tfName.getText(), tfCarreer.getText(), tfId.getText()), students.length())) {
                JOptionPane.showMessageDialog(this, "Estudiante agregado con exito!");
            } else {
                JOptionPane.showMessageDialog(this, "Ocurrio un error al agregar el estudiante, intente de nuevo");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error, intente de nuevo y verifique que haya ingresado todos los datos");
        }
        tfName.setText("");
        tfCarreer.setText("");
        tfId.setText("");
        jdAdd.setModal(false);
        jdAdd.setVisible(false);
        jdAdd.dispose();
    }//GEN-LAST:event_bAdd2MouseClicked

    private void bCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelMouseClicked
        tfName.setText("");
        tfCarreer.setText("");
        tfId.setText("");
        jdAdd.setModal(false);
        jdAdd.setVisible(false);
        jdAdd.dispose();
    }//GEN-LAST:event_bCancelMouseClicked

    private void bAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAdminMouseClicked
        if (students.length() > 0) {
            DefaultComboBoxModel resetCB = new DefaultComboBoxModel();
            for (int i = 0; i < students.length(); i++) {
                resetCB.addElement(students.get(i));
            }
            cbStudents.setModel(resetCB);
            DefaultListModel resetList = new DefaultListModel();
            jlGrades.setModel(resetList);
            jdAdmin.setLocationRelativeTo(this);
            jdAdmin.setModal(true);
            jdAdmin.pack();
            jdAdmin.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No hay estudiantes en el sistema\nAgregue estudiantes desde el menu principal antes de administrar notas");
        }
    }//GEN-LAST:event_bAdminMouseClicked

    private void cbStudentsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStudentsItemStateChanged
        DefaultListModel SetList = new DefaultListModel();
        if (cbStudents.getSelectedItem() != null && cbStudents.getSelectedIndex() != -1) {
            for (int i = 0; i < ((Student) cbStudents.getSelectedItem()).getGrades().length(); i++) {
                SetList.addElement(((Student) cbStudents.getSelectedItem()).getGrades().get(i));
            }
        }
        jlGrades.setModel(SetList);
    }//GEN-LAST:event_cbStudentsItemStateChanged

    private void bAddGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddGradeMouseClicked
        if (cbStudents.getSelectedItem() != null && cbStudents.getSelectedIndex() != -1) {
            try {
                String input = JOptionPane.showInputDialog("Ingrese nota (Decimal de 0.0 a 100.0)");
                double parse = Double.parseDouble(input);
                if (parse >= 0.0 && parse <= 100.0) {
                    ((Student) cbStudents.getSelectedItem()).addGrade(parse);
                    DefaultListModel updateList = (DefaultListModel) jlGrades.getModel();
                    updateList.addElement(parse);
                    jlGrades.setModel(updateList);
                } else {
                    JOptionPane.showMessageDialog(this, "Nota invalida, intente de nuevo");
                }
            } catch (NumberFormatException e) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un estudiante");
        }
    }//GEN-LAST:event_bAddGradeMouseClicked

    private void bExitAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitAdminMouseClicked
        jdAdmin.setModal(false);
        jdAdmin.dispose();

    }//GEN-LAST:event_bExitAdminMouseClicked

    private void bRemoveGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoveGradeMouseClicked
        if (cbStudents.getSelectedItem() != null && cbStudents.getSelectedIndex() != -1 && jlGrades.getSelectedIndex() != -1) {
            DefaultListModel updateList = (DefaultListModel) jlGrades.getModel();
            int index = jlGrades.getSelectedIndex();
            ((Student) cbStudents.getSelectedItem()).getGrades().remove(index);
            updateList.removeElementAt(index);
            jlGrades.setModel(updateList);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una nota. Si no hay notas, agregue una o mas primero");
        }
    }//GEN-LAST:event_bRemoveGradeMouseClicked

    private void bRemoveStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRemoveStudentMouseClicked
        if (cbStudents.getSelectedItem() != null && cbStudents.getSelectedIndex() != -1) {
            DefaultComboBoxModel updateStudents = (DefaultComboBoxModel) cbStudents.getModel();
            int index = cbStudents.getSelectedIndex();
            students.remove(index);
            updateStudents.removeElementAt(index);
            cbStudents.setModel(updateStudents);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un estudiante de la lista.\nSi no hay estudiantes, primero agregue uno o mas al sistemas desde el menu principal");
        }
    }//GEN-LAST:event_bRemoveStudentMouseClicked

    private void bSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSaveMouseClicked
        int input = JOptionPane.showConfirmDialog(this, "Esto pasara los estudiantes del sistema a un archivo .csv en la carpeta del programa", "Confirme su eleccion", JOptionPane.OK_CANCEL_OPTION);
        if (input == JOptionPane.OK_OPTION) {
            try {
                for (int i = 0; i < students.length(); i++) {
                    System.out.println("entro a for " + i);
                    if (students.get(i).getGrades().length() > 0) {
                        System.out.println("entro a if, " + students.get(i).toString());
                        double promedio = 0.0;
                        for (int j = 0; j < students.get(i).getGrades().length(); j++) {
                            promedio += students.get(i).getGrades().get(i);
                        }
                        promedio /= students.get(i).getGrades().length();
                        out.write(students.get(i).getName() + "," + promedio + "\n");
                    }
                }
            } catch (IOException | NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Ocurrio un error escribiendo las notas al archivo");
            }
        }

    }//GEN-LAST:event_bSaveMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bAdd2;
    private javax.swing.JButton bAddGrade;
    private javax.swing.JButton bAdmin;
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bExitAdmin;
    private javax.swing.JButton bRemoveGrade;
    private javax.swing.JButton bRemoveStudent;
    private javax.swing.JButton bSave;
    private javax.swing.JComboBox<String> cbStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jdAdd;
    private javax.swing.JDialog jdAdmin;
    private javax.swing.JList<String> jlGrades;
    private javax.swing.JTextField tfCarreer;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfName;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
