
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * administration.java
 *
 * Created on Aug 1, 2014, 9:56:44 PM
 */

/**
 *
 * @author 1
 */
public class administration extends javax.swing.JFrame {


    /** Creates new form administration */
    public administration() {
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

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        BUT3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BUT2 = new javax.swing.JButton();
        BUT1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        BUT4 = new javax.swing.JButton();

        setDefaultCloseOperation(0);
        setTitle("ADMINISTRATION");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        BUT3.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        BUT3.setText("Disable Results");
        BUT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AndrewScript", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 175, 219));
        jLabel1.setText("Welcome Mr.Administrator");

        BUT2.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        BUT2.setText("Turn Voting On");
        BUT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT2ActionPerformed(evt);
            }
        });

        BUT1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        BUT1.setText("Turn Voting Off");
        BUT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton5.setText("Show Results");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton8.setText("User's List");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton7.setText("Show Adharcards");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton4.setText("Show Registration");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton10.setText("Show Queries");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton11.setText("HOMEPAGE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton9.setText("EXIT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jButton12.setText("Show Feedbacks");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        BUT4.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        BUT4.setText("Enable Results");
        BUT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BUT2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addComponent(BUT4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUT1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUT3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUT2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUT1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUT3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUT4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT2ActionPerformed
try
{Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Update status set status=1 where status=0;";
S.executeUpdate(query);
BUT2.setEnabled(false);
BUT1.setEnabled(true);

}
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());
}
       // TODO add your handling code here:
    }//GEN-LAST:event_BUT2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
new USERLIST().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
new adharcardlist().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new Result().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new registrationlist().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int i=JOptionPane.showConfirmDialog(this,"Do you Want To Exit");
if(i==0)
{this.dispose();}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
new Show_Query().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      new homepage().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void BUT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT1ActionPerformed
try
{Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Update status set status=0 where status=1;";
S.executeUpdate(query);

BUT1.setEnabled(false);
BUT2.setEnabled(true);
}
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());
}
// TODO add your handling code here:
    }//GEN-LAST:event_BUT1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);        // TODO add your handling code here:
}//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
new feedbacklist().setVisible(true);// TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void BUT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT3ActionPerformed
try
{Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Update resultstatus set status=0 where status=1;";
S.executeUpdate(query);
BUT3.setEnabled(false);
BUT4.setEnabled(true);

}
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());
}        // TODO add your handling code here:
    }//GEN-LAST:event_BUT3ActionPerformed

    private void BUT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT4ActionPerformed
try
{Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Update resultstatus set status=1 where status=0;";
S.executeUpdate(query);
BUT4.setEnabled(false);
BUT3.setEnabled(true);

} 
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());}// TODO add your handling code here:
    }//GEN-LAST:event_BUT4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int b=0;
int adh=0;
        { try
{
Class.forName("java.sql.DriverManager");
java.sql.Connection C=(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs","root","RRMPS");
java.sql.Statement S=(java.sql.Statement)C.createStatement();
java.sql.Statement S1=(java.sql.Statement)C.createStatement();
String query="select * from status WHERE status='"+b+"';";
String query2="select * from resultstatus where status='"+b+"';";
ResultSet r =S.executeQuery(query);
ResultSet r1 =S1.executeQuery(query2);
if(r1.first()==false)
{
BUT3.setEnabled(true);
BUT4.setEnabled(false);
}
if(r.first()==false)
{
BUT1.setEnabled(true);
BUT2.setEnabled(false);
}
if(r.first()==true)
{
BUT2.setEnabled(true);
BUT1.setEnabled(false);
}
if(r1.first()==true)
{
BUT4.setEnabled(true);
BUT3.setEnabled(false);
}
}
catch(Exception e)
{
}
}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUT1;
    private javax.swing.JButton BUT2;
    private javax.swing.JButton BUT3;
    private javax.swing.JButton BUT4;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}