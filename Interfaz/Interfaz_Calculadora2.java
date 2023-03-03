/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
import Controlador.Operaciones;
/**
 *
 * @author Adrian Castillo
 */
public class Interfaz_Calculadora2 extends javax.swing.JFrame {
    private Operaciones operaciones;
    private float numero1;
    private float numero2;
    private String resultado;
    
    /**
     * Creates new form Interfaz_Calculadora2
     */
    public Interfaz_Calculadora2() {
        /**ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine se = sem.getEngineByExtension("JavaScript");
        * */
        initComponents();
        operaciones=new Operaciones();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /**
     * Concatenar
     * metodo para concatenar los digitos en la calculadora
     * @param numero -> es el atributo que se ingresa a la pantall
     * @return pant -> variable resultado de la concatenacion
     */
    public String Concatenar(String numero){
        String pant=pantalla.getText();
        if(pant.equals("0")){
            pant=numero;
        }else{
            pant+=numero;
        }
        return pant;
    }
    public static boolean existepunto(String cadena){
        boolean resultado; 
        resultado = false;
        
        for (int i=0;i<cadena.length();i++){
            if(cadena.substring(i,i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Limpiar = new javax.swing.JButton();
        Btn_Borrar = new javax.swing.JButton();
        Btn_Porcentaje = new javax.swing.JButton();
        Btn_Divicion = new javax.swing.JButton();
        Btn_Siete = new javax.swing.JButton();
        Btn_Ocho = new javax.swing.JButton();
        Btn_Nueve = new javax.swing.JButton();
        Btn_Multiplicacion = new javax.swing.JButton();
        Btn_Cuatro = new javax.swing.JButton();
        Btn_Cinco = new javax.swing.JButton();
        Btn_Seis = new javax.swing.JButton();
        Btn_Resta = new javax.swing.JButton();
        Btn_Uno = new javax.swing.JButton();
        Btn_Dos = new javax.swing.JButton();
        Btn_Tres = new javax.swing.JButton();
        Btn_Suma = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        Btn_Cero = new javax.swing.JButton();
        Btn_Punto = new javax.swing.JButton();
        Btn_Igual = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pantalla2 = new javax.swing.JLabel();
        pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(0, 4));

        btn_Limpiar.setText("C");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Limpiar);

        Btn_Borrar.setText("Borrar");
        Btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BorrarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Borrar);

        Btn_Porcentaje.setText("%");
        Btn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Porcentaje);

        Btn_Divicion.setText("/");
        Btn_Divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DivicionActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Divicion);

        Btn_Siete.setText("7");
        Btn_Siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SieteActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Siete);

        Btn_Ocho.setText("8");
        Btn_Ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_OchoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ocho);

        Btn_Nueve.setText("9");
        Btn_Nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NueveActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Nueve);

        Btn_Multiplicacion.setText("x");
        Btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Multiplicacion);

        Btn_Cuatro.setText("4");
        Btn_Cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CuatroActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cuatro);

        Btn_Cinco.setText("5");
        Btn_Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CincoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cinco);

        Btn_Seis.setText("6");
        Btn_Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SeisActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Seis);

        Btn_Resta.setText("-");
        Btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Resta);

        Btn_Uno.setText("1");
        Btn_Uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UnoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Uno);

        Btn_Dos.setText("2");
        Btn_Dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DosActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Dos);

        Btn_Tres.setText("3");
        Btn_Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TresActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Tres);

        Btn_Suma.setText("+");
        Btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SumaActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Suma);
        jPanel1.add(jButton17);

        Btn_Cero.setText("0");
        Btn_Cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CeroActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Cero);

        Btn_Punto.setText(".");
        Btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PuntoActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Punto);

        Btn_Igual.setText("=");
        Btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IgualActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Igual);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 90));
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        pantalla2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pantalla2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla2.setText("0");
        pantalla2.setToolTipText("");
        pantalla2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pantalla2.setAlignmentY(0.0F);
        pantalla2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pantalla2.setInheritsPopupMenu(false);
        pantalla2.setPreferredSize(new java.awt.Dimension(24, 20));
        pantalla2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(pantalla2);

        pantalla.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setToolTipText("");
        pantalla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pantalla.setPreferredSize(new java.awt.Dimension(12, 25));
        jPanel2.add(pantalla);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SeisActionPerformed
        pantalla.setText(Concatenar("6"));
        
    }//GEN-LAST:event_Btn_SeisActionPerformed

    private void Btn_NueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NueveActionPerformed
        pantalla.setText(Concatenar("9"));
    }//GEN-LAST:event_Btn_NueveActionPerformed

    private void Btn_OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_OchoActionPerformed
        pantalla.setText(Concatenar("8"));
    }//GEN-LAST:event_Btn_OchoActionPerformed

    private void Btn_SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SieteActionPerformed
        pantalla.setText(Concatenar("7"));
    }//GEN-LAST:event_Btn_SieteActionPerformed

    private void Btn_CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CincoActionPerformed
        pantalla.setText(Concatenar("5"));
    }//GEN-LAST:event_Btn_CincoActionPerformed

    private void Btn_CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CuatroActionPerformed
        pantalla.setText(Concatenar("4"));
    }//GEN-LAST:event_Btn_CuatroActionPerformed

    private void Btn_TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TresActionPerformed
        pantalla.setText(Concatenar("3"));
    }//GEN-LAST:event_Btn_TresActionPerformed

    private void Btn_DosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DosActionPerformed
        pantalla.setText(Concatenar("2"));
    }//GEN-LAST:event_Btn_DosActionPerformed

    private void Btn_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UnoActionPerformed
        pantalla.setText(Concatenar("1"));
    }//GEN-LAST:event_Btn_UnoActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        pantalla.setText("");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void Btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BorrarActionPerformed
        
    }//GEN-LAST:event_Btn_BorrarActionPerformed

    private void Btn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PorcentajeActionPerformed
        pantalla.setText(Concatenar("%"));
    }//GEN-LAST:event_Btn_PorcentajeActionPerformed

    private void Btn_DivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DivicionActionPerformed
        pantalla.setText(Concatenar("/"));
    }//GEN-LAST:event_Btn_DivicionActionPerformed

    private void Btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MultiplicacionActionPerformed
        pantalla.setText(Concatenar("x"));
    }//GEN-LAST:event_Btn_MultiplicacionActionPerformed

    private void Btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestaActionPerformed
        pantalla.setText(Concatenar("-"));
    }//GEN-LAST:event_Btn_RestaActionPerformed

    private void Btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SumaActionPerformed
        pantalla.setText(Concatenar("+"));
        
        
    }//GEN-LAST:event_Btn_SumaActionPerformed

    private void Btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IgualActionPerformed
        pantalla.setText(operaciones.evaluar(pantalla.getText()));
        /**try {
        String resultado = se.eval(pantalla.getText()).toString();
        pantalla.setText(resultado);
        } catch (Exception e) {
            // TODO: handle exception
        }
        **/
    }//GEN-LAST:event_Btn_IgualActionPerformed

    private void Btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PuntoActionPerformed
        String cadena; 
        cadena = pantalla.getText();
        if (cadena.length()<=0){
            pantalla.setText("0.");
            
        }else{
            if(!existepunto(pantalla.getText())){
                pantalla.setText(pantalla.getText()+".");
            }
        }
        
   
    }//GEN-LAST:event_Btn_PuntoActionPerformed

    private void Btn_CeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CeroActionPerformed
        pantalla.setText(Concatenar("0"));
    }//GEN-LAST:event_Btn_CeroActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Calculadora2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Borrar;
    private javax.swing.JButton Btn_Cero;
    private javax.swing.JButton Btn_Cinco;
    private javax.swing.JButton Btn_Cuatro;
    private javax.swing.JButton Btn_Divicion;
    private javax.swing.JButton Btn_Dos;
    private javax.swing.JButton Btn_Igual;
    private javax.swing.JButton Btn_Multiplicacion;
    private javax.swing.JButton Btn_Nueve;
    private javax.swing.JButton Btn_Ocho;
    private javax.swing.JButton Btn_Porcentaje;
    private javax.swing.JButton Btn_Punto;
    private javax.swing.JButton Btn_Resta;
    private javax.swing.JButton Btn_Seis;
    private javax.swing.JButton Btn_Siete;
    private javax.swing.JButton Btn_Suma;
    private javax.swing.JButton Btn_Tres;
    private javax.swing.JButton Btn_Uno;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel pantalla2;
    // End of variables declaration//GEN-END:variables
}
