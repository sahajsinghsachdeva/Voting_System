
import java.sql.Connection;
       import java.sql.Statement;
       import java.sql.ResultSet;
       import java.sql.DriverManager;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import javax.swing.JOptionPane;

/*
 * ADHARCARDFORM1.java
 *
 * Created on Aug 8, 2014, 10:52:15 PM
 */

/**
 *
 * @author 1
 */
public class ADHARCARDFORM1 extends javax.swing.JFrame {

    /** Creates new form ADHARCARDFORM1 */
    public ADHARCARDFORM1() {
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
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        q = new javax.swing.JTextField();
        oc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextArea();
        ci = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        m1 = new javax.swing.JRadioButton();
        m2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        in = new javax.swing.JRadioButton();
        ots = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        ot = new javax.swing.JTextField();
        BUT1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ma = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        d1 = new datechooser.beans.DateChooserCombo();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(0);
        setTitle("ADHAAR CARD FORM");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel12.setText("OCCUPATION");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel11.setText("QUALIFICATION");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel6.setText("ADDRESS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel10.setText("CITY");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel9.setText("CONTACT NO.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        cn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cn.setToolTipText("Enter Your Contact No.");
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, -1));

        n.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        n.setToolTipText("Enter Your Name");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, -1));

        q.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        q.setToolTipText("Enter your Qualification");
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 150, -1));

        oc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oc.setToolTipText("Enter your Occupation");
        getContentPane().add(oc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 150, -1));

        ad.setColumns(20);
        ad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ad.setRows(5);
        ad.setToolTipText("Enter Your Address");
        jScrollPane1.setViewportView(ad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 220, -1));

        ci.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ci.setToolTipText("Enter Your City");
        ci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciActionPerformed(evt);
            }
        });
        getContentPane().add(ci, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, -1));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MARITAL STATUS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Simplified Arabic Fixed", 1, 18))); // NOI18N
        jPanel3.setOpaque(false);

        m1.setBackground(new java.awt.Color(102, 255, 0));
        buttonGroup2.add(m1);
        m1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        m1.setText("MARRIED");
        m1.setToolTipText("Select Your Marital Status");
        m1.setOpaque(false);

        m2.setBackground(new java.awt.Color(102, 255, 0));
        buttonGroup2.add(m2);
        m2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        m2.setText("UN MARRIED");
        m2.setToolTipText("Select Your Marital Status");
        m2.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m1)
                    .addComponent(m2))
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(m1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(m2))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 255, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NATIONALITY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Simplified Arabic", 1, 18))); // NOI18N
        jPanel4.setOpaque(false);

        in.setBackground(new java.awt.Color(102, 255, 0));
        buttonGroup3.add(in);
        in.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        in.setText("INDIAN");
        in.setToolTipText("Select Your Nationality");
        in.setOpaque(false);
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        ots.setBackground(new java.awt.Color(102, 255, 0));
        buttonGroup3.add(ots);
        ots.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ots.setText("OTHER");
        ots.setToolTipText("Select Your Nationality");
        ots.setOpaque(false);
        ots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otsActionPerformed(evt);
            }
        });
        ots.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                otsKeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("(SPECIFY)");

        ot.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ot.setToolTipText("Specify Your Nationality");
        ot.setEnabled(false);
        ot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(in)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ots)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(in)
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ots)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));

        BUT1.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        BUT1.setText("SUBMIT");
        BUT1.setToolTipText("CLICK TO SUBMIT");
        BUT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUT1ActionPerformed(evt);
            }
        });
        getContentPane().add(BUT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, -1, 40));

        jButton2.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setToolTipText("Clear All Fields");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, 40));

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ADHAAR CARD FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 410, -1));

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel4.setText("D.O.B");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jLabel2.setText("F.NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fn.setToolTipText("Enter Your Father's Name");
        getContentPane().add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 160, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENDER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Simplified Arabic Fixed", 1, 18))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel2.setName("GENDER"); // NOI18N
        jPanel2.setOpaque(false);

        buttonGroup1.add(ma);
        ma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ma.setText("MALE");
        ma.setToolTipText("Select Your Gender");
        ma.setOpaque(false);
        ma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maActionPerformed(evt);
            }
        });

        buttonGroup1.add(fem);
        fem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fem.setText("FEMALE");
        fem.setToolTipText("Select Your Gender");
        fem.setOpaque(false);
        fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fem)
                    .addComponent(ma))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(fem))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Log Out");
        jButton4.setToolTipText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        jButton5.setFont(new java.awt.Font("Simplified Arabic", 1, 24)); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/indian_flag_by_abhishekghosh-d6i41mg.png"))); // NOI18N
        jLabel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel5FocusGained(evt);
            }
        });
        jLabel5.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jLabel5CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 950, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int i=JOptionPane.showConfirmDialog(this,"Do you Want To Exit");
if(i==0)
{this.dispose();}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);    // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new Password().setVisible(true);
                // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
BUT1.setEnabled(true);
        d1.setSelectedDate(null);//clearing date
buttonGroup1.clearSelection();//clearing buttongroup1
buttonGroup2.clearSelection();//clearing buttongroup2
buttonGroup3.clearSelection();//clearing buttongroup3
n.setText("");//clearing name field
fn.setText("");//clearing father's name field
q.setText("");//clearing qualification field
oc.setText("");//clearing occupation field
ad.setText("");//clearing address field
ci.setText("");//clearing city field
cn.setText("");//clearing contact nso field
ot.setText("");//clearing others field
ot.setEnabled(false);//disabling others field
}//GEN-LAST:event_jButton2ActionPerformed

    private void BUT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUT1ActionPerformed
Calendar D=d1.getSelectedDate();//getting date
String dob=D.get(D.DATE)+"-"+(D.get(D.MONTH)+1)+"-"+D.get(D.YEAR);
int y=D.get(D.YEAR);
if(y<=2014)//Comparing year so that user enter not more than current year
{
String Name=n.getText();//getting name
String fname=fn.getText();//getting father's name
String g=null;
String s=null;
long adh;
String na=null;
if (ma.isSelected()==true) {
g="Male";
}//for radio button male
else if(fem.isSelected() == true) {
g="Female";
}//for radio button female
if (m1.isSelected()==true) {
s="Married";
}//for radio button married
else if(m2.isSelected() == true) {
s="Unmarried";
}//for radio button unmarried
String qu=q.getText();//getting qualification
String o=oc.getText();//getting occupation
String a=ad.getText();//getting address
String c=ci.getText();//getting city
if (in.isSelected()==true)
{
na="Indian";
} 
else if (ots.isSelected()==true)
{
na=ot.getText();
}
String cno=cn.getText();//getting contact no.
int lcn=cno.length();
if (n.getText().equals(""))//checking name field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Name.....");
}
else if (fn.getText().equals(""))//checking fathers name field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Father's Name.....");
}
else if (q.getText().equals(""))//checking qualification field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Qualification......");
}
else if (oc.getText().equals(""))//checking occupation field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Occupation......");
}
else if (ad.getText().equals(""))//checking address field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Addresss.....");
}
else if (ci.getText().equals(""))//checking city field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill City Name.....");
}
else if (cn.getText().equals(""))//checking contact field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please fill Contact no.....");
}
else if (lcn>10 || lcn<=9)//checking whether mobile field should not have less than or more than 10 values
{
JOptionPane.showMessageDialog(this,"Please  fill valid Contact no.....");
}
else if (ma.isSelected()==false && fem.isSelected()==false)//checking gender field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please Select Gender.....");
}
else if (m1.isSelected()==false && m2.isSelected()==false)//checking marital status field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please Select Marital Status.....");
}
else if ((in.isSelected()==false && ots.isSelected()==false )||(ots.isSelected()==true && ot.getText().equals("")))//checking nationality field whether it is empty or not
{
JOptionPane.showMessageDialog(this,"Please Specify Nationality.....");
}
else { try
{
    BUT1.setEnabled(false);
Class.forName("java.sql.DriverManager");
Connection C=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/OVS","root","RRMPS");
Statement S=(Statement)C.createStatement();
String query="select max(adh) from ADHARCARD;";
ResultSet r =S.executeQuery(query);
r.next();
long acc=Long.parseLong(r.getString("max(adh)"));
adh=acc+1;
String A="Insert Into ADHARCARD values('"+adh+"','"+Name+"','"+fname+"','"+g+"','"+s+"','"+qu+"','"+o+"','"+a+"','"+c+"','"+na+"','"+cno+"','"+dob+"');";
S.executeUpdate(A);
JOptionPane.showMessageDialog(null,"Adhar Card Created!!!!"+  "\n adhar card no. is "+adh);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(this,e.getMessage());
}
}//end of else
}//end of first if
else {
JOptionPane.showMessageDialog(this,"Please specify the correct year");
}





        // TODO add your handling code here:
}//GEN-LAST:event_BUT1ActionPerformed

    private void otActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_otActionPerformed

    private void otsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otsKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_otsKeyPressed

    private void otsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otsActionPerformed
        ot.setEnabled(true);      // TODO add your handling code here:
}//GEN-LAST:event_otsActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        ot.setText("");
        ot.setEnabled(false);
        // TODO add your handling code here:
}//GEN-LAST:event_inActionPerformed

    private void femActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_femActionPerformed

    private void ciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ciActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_nActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cnActionPerformed

    private void maActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maActionPerformed

    private void jLabel5CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel5CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5CaretPositionChanged

    private void jLabel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel5FocusGained
    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5FocusGained

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
n.requestFocus(true);            // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADHARCARDFORM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUT1;
    private javax.swing.JTextArea ad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField ci;
    private javax.swing.JTextField cn;
    private datechooser.beans.DateChooserCombo d1;
    private javax.swing.JRadioButton fem;
    private javax.swing.JTextField fn;
    private javax.swing.JRadioButton in;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton m1;
    private javax.swing.JRadioButton m2;
    private javax.swing.JRadioButton ma;
    private javax.swing.JTextField n;
    private javax.swing.JTextField oc;
    private javax.swing.JTextField ot;
    private javax.swing.JRadioButton ots;
    private javax.swing.JTextField q;
    // End of variables declaration//GEN-END:variables

}