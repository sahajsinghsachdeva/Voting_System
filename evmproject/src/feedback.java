
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class feedback extends javax.swing.JFrame {

    /**
     * Creates new form feedback
     */
    public feedback() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(0);
        setTitle("FEEDBACK");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("AndrewScript", 1, 40));
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("FEEDBACK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
        jLabel2.setForeground(new java.awt.Color(33, 190, 196));
        jLabel2.setText("Your Precious Feedback");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        t1.setToolTipText("Enter User Name.");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, -1));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
        jLabel3.setForeground(new java.awt.Color(33, 190, 196));
        jLabel3.setText("Your Good Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        t2.setColumns(20);
        t2.setRows(5);
        jScrollPane1.setViewportView(t2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 430, 150));

        jButton1.setFont(new java.awt.Font("Andalus", 1, 20));
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        jButton2.setFont(new java.awt.Font("Andalus", 1, 20));
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REVIEW.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String Name=t1.getText();
String feed=t2.getText();

int serial;
if (t1.getText().equals(""))
{JOptionPane.showMessageDialog(this,"Please fill your Good Name.....");}
else if (t2.getText().equals(""))
{JOptionPane.showMessageDialog(this,"Please give feedback");}


else { try
{
      Class.forName("java.sql.DriverManager");
      Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
        Statement S=(Statement)C.createStatement();
        String query="select max(serialno) from feedback;";
        ResultSet r =S.executeQuery(query);
        r.next();
        int acc=Integer.parseInt(r.getString("max(serialno)"));
                serial=acc+1;



        String A="Insert Into feedback values('"+serial+"','"+Name+"','"+feed+"');";

       S.executeUpdate(A);

     JOptionPane.showMessageDialog(null,"thanks for your feedback!!!! ");
     new homepage().setVisible(true);
     this.dispose();

     
     
     
        }catch(Exception e){JOptionPane.showMessageDialog(this,e.getMessage());}
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea t2;
    // End of variables declaration//GEN-END:variables
}
