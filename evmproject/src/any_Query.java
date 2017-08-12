
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
 * any_Query.java
 *
 * Created on Sep 10, 2014, 12:25:02 AM
 */

/**
 *
 * @author 1
 */
public class any_Query extends javax.swing.JFrame {

    /** Creates new form any_Query */
    public any_Query() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ma = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        fem1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        k = new javax.swing.JButton();
        l12 = new javax.swing.JLabel();
        te = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(0);
        setTitle("QUERY");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setText("ASK A Query.....");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("AndrewScript", 0, 24)); // NOI18N
        jLabel2.setText("Enter Your Adhar Card no.(if any)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        t2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t2.setToolTipText("Enter Your Adhar Card  No.");
        t2.setEnabled(false);
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 250, -1));

        t1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t1.setToolTipText("Enter Your Registration No.");
        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 250, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose The Query Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Simplified Arabic Fixed", 1, 18))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.setName("Choose The Query Type"); // NOI18N
        jPanel2.setOpaque(false);

        buttonGroup1.add(ma);
        ma.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ma.setText("Ask to create Adharcard");
        ma.setToolTipText("Select For  Your Adhar Card Enquery.");
        ma.setOpaque(false);
        ma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maMouseClicked(evt);
            }
        });
        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });
        ma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                maKeyPressed(evt);
            }
        });

        buttonGroup1.add(fem);
        fem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fem.setText("For registration no. enquiry");
        fem.setToolTipText("Select For  Your Registration No. Enquery.");
        fem.setOpaque(false);
        fem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femMouseClicked(evt);
            }
        });
        fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femActionPerformed(evt);
            }
        });

        buttonGroup1.add(fem1);
        fem1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fem1.setText("Other");
        fem1.setToolTipText("Select For Other Enquery.");
        fem1.setOpaque(false);
        fem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fem1MouseClicked(evt);
            }
        });
        fem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fem)
                    .addComponent(fem1)
                    .addComponent(ma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ma)
                .addGap(3, 3, 3)
                .addComponent(fem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fem1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        ta.setRows(5);
        ta.setToolTipText("Enter Your Query HERE");
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 540, 210));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jLabel4.setText("Type Your Query Here:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        k.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        k.setText("Submit");
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, 40));

        l12.setFont(new java.awt.Font("AndrewScript", 0, 24)); // NOI18N
        l12.setText("Give these details(compulsory)");
        getContentPane().add(l12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        te.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        te.setToolTipText("Enter Your E-Mail ID");
        te.setEnabled(false);
        te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teActionPerformed(evt);
            }
        });
        getContentPane().add(te, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 250, -1));

        jButton2.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, -1, 40));

        jButton9.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, -1, -1));

        jLabel3.setFont(new java.awt.Font("AndrewScript", 0, 24)); // NOI18N
        jLabel3.setText("Enter Your Registration no.(if any)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("AndrewScript", 0, 24)); // NOI18N
        jLabel7.setText("Enter Your Email id:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        l3.setText("3) D.O.B ");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        l4.setText("4) Address");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        l5.setText("5) City");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        l6.setText("6) Contact No.");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        l7.setText("7) Qualification");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        l8.setText("8) Occupation");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, -1));

        l9.setText("9) Gender");
        getContentPane().add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        l10.setText("10) Marital Status");
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        l11.setText("11) Nationality");
        getContentPane().add(l11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        l2.setText("2) Father's Name");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        l1.setText("1) Full Name");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jButton10.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/message.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed

t2.setEnabled(false);
te.setEnabled(true);
l1.setVisible(true);
l2.setVisible(true);
l3.setVisible(true);
l4.setVisible(true);
l5.setVisible(true);
l6.setVisible(true);
l7.setVisible(true);
l8.setVisible(true);
l9.setVisible(true);
l10.setVisible(true);
l11.setVisible(true);
l12.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_maActionPerformed

    private void maKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_maKeyPressed

    private void maMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maMouseClicked
t1.setText("");
t2.setText("");


       
t2.setEnabled(false);
te.setEnabled(true);
ta.setEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_maMouseClicked

    private void femMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femMouseClicked
t1.setText("");
t2.setText("");

        t2.setEnabled(true);
te.setEnabled(true);
t1.setEnabled(false);
ta.setEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_femMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int i=JOptionPane.showConfirmDialog(this,"Do you Want To Exit");
if(i==0)
{System.exit(0);}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void fem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fem1MouseClicked
t1.setEnabled(true);
t2.setEnabled(true);
        te.setEnabled(true);
t1.setText("");
t2.setText("");
 ta.setEditable(true);
 // TODO add your handling code here:
    }//GEN-LAST:event_fem1MouseClicked

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
String m=ta.getText();//getting Query
String r=t1.getText();//getting registration No.
String e=te.getText();//getting e-mail id
String l=t2.getText();//getting adhar card no
if (ma.isSelected()==true)//if adhar card radiobutton is Selected
{
if(te.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill e-mail id.....");}
else if(ta.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill complete information correctly");}
else{
int n=JOptionPane.showConfirmDialog(this,"Are you sure that you have provided all information completely and correctly "+"\n"+
        "NOTE: If any information not provided than adharcard will not be created ");
if(n==0)
{
    try{
Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Insert Into Message Values('"+r+"','"+m+"','"+e+"','"+l+"');";
S.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Message Sent!!!!"+  "\n Your reply will be sent to your e-mail id");
}
catch(Exception ec){
JOptionPane.showMessageDialog(this,ec.getMessage());
}}
}
//end of catch
//end of try
}
else if (fem.isSelected()==true)//if registration number radiobutton is Selected
{
if (t2.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill adharcard  no.....");}
else if(te.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill e-mail id.....");}
else if(ta.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill your query.....");}
else{
try{
Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Insert Into Message Values('"+r+"','"+m+"','"+e+"','"+l+"');";
S.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Message Sent!!!!"+  "\n Your reply will be sent to your e-mail id");
}
catch(Exception ec){
JOptionPane.showMessageDialog(this,ec.getMessage());
}//end of if
}
}
else if (fem1.isSelected()==true)//if others radiobutton is Selected
{
if (te.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill e-mail id.....");}
else if(ta.getText().equals("")) {
JOptionPane.showMessageDialog(this,"Please fill your query.....");}
else{
try{
Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="Insert Into Message Values('"+r+"','"+m+"','"+e+"','"+l+"');";
S.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Message Sent!!!!"+  "\n Your reply will be sent to your e-mail id");
}
catch(Exception ec){
JOptionPane.showMessageDialog(this,ec.getMessage());
}//end of if
}
}
}//GEN-LAST:event_kActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);  
        buttonGroup1.clearSelection();
t1.setText("");//for clearing registration no textfield
te.setText("");//for clearing email textfield
t2.setText("");//for clearing adharcard no textfield
ta.setText("");//for clearing Query textfield
t2.setEnabled(false);//for disabling AdharCard textfield
t1.setEnabled(false);//for disabling registration textfield
te.setEnabled(false);//for disabling email textfield
ta.setEnabled(false);//for disabling Query textfield
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
System.exit(0);   // TODO add your handling code here:
}//GEN-LAST:event_jButton9ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femActionPerformed
te.setEnabled(true);
t1.setEnabled(false);
        l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_femActionPerformed

    private void fem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fem1ActionPerformed
t1.setEnabled(true);
te.setEnabled(true);
t2.setEnabled(true);
        l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_fem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
this.dispose();       // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new any_Query().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fem;
    private javax.swing.JRadioButton fem1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton k;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JRadioButton ma;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField te;
    // End of variables declaration//GEN-END:variables

}