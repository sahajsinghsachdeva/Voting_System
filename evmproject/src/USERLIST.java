import java.sql.Connection;
       import java.sql.Statement;
       import java.sql.ResultSet;
       import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * USERLIST.java
 *
 * Created on Aug 2, 2014, 9:58:13 PM
 */

/**
 *
 * @author 1
 */
public class USERLIST extends javax.swing.JFrame {

    /** Creates new form USERLIST */
    public USERLIST() {
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        d1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        se = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(0);
        setTitle("USERLIST");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 1, 28)); // NOI18N
        jLabel2.setText("AUNTHETIC USERS LIST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("BACK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 110, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setText("DELETE USER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 150, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("ADD USER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 140, 30));

        d1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        d1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        d1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID", "USER NAME", "POST", "PHONE NO.", "Password"
            }
        ));
        jScrollPane1.setViewportView(d1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 680, 140));

        jButton5.setText("Show all");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));
        getContentPane().add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 120, -1));

        jLabel3.setText("Enter User ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 80, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Row-of-desks_purple.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 DefaultTableModel model=(DefaultTableModel)d1.getModel();
try
{
    Class.forName("java.sql.DriverManager");
    Connection c=(Connection)DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/ovs","root","RRMPS");
    Statement S=(Statement)c.createStatement();
        String query="select * from usertable;";
        ResultSet rs=S.executeQuery(query);
        while(rs.next())
        {


        String sn=rs.getString("Serial");
        String un=rs.getString("Usern");
        String ps=rs.getString("Post");
        String cn=rs.getString("Contacts");
        String pass=rs.getString("Password");
        model.addRow(new Object[]
        {sn,un,ps,cn,pass});
        
        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new adduser().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int mid=d1.getSelectedRow();
        String k=(""+d1.getValueAt(mid,0));

int a[]=d1.getSelectedRows();
        
        DefaultTableModel dm=(DefaultTableModel)d1.getModel();
int n=JOptionPane.showConfirmDialog(this,"Are you sure to Delete this USER permanently ");
if(n==0)
{
        try{
            Class.forName("java.sql.DriverManager");
            Connection c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs","root","RRMPS");
            Statement s=(Statement)c.createStatement();
            
            String q="delete from USERTABLE where SERIAL =" + k +" ;";

       
            s.executeUpdate(q);
             
            
            JOptionPane.showMessageDialog(this,"User's Account Deleted!!!","Delete",1);
            dm.removeRow(a[0]);
            se.setText( "");
            // mid.
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"User Account Not Selected","Error",0);
        }}
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int i=JOptionPane.showConfirmDialog(this,"Do you Want To Exit");
if(i==0)
{System.exit(0);}        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();        // TODO add your handling code here:
}//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        se.setText("");
        DefaultTableModel model=(DefaultTableModel)d1.getModel();
        {
            int i=model.getRowCount();
            while (i>0)
            {
                model.removeRow(0);
                i--;
            }

        }
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection c=(Connection)DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/ovs","root","RRMPS");
            Statement S=(Statement)c.createStatement();
            String query="select * from USERTABLE;";
            ResultSet rs=S.executeQuery(query);
            while(rs.next())
            {

                String sn=rs.getString("SERIAL");
                String un=rs.getString("USERN");
                String cn=rs.getString("POST");
                String pass=rs.getString("CONTACTS");
                String pn=rs.getString("PASSWORD");
                
                model.addRow(new Object[]
                    {sn,un,cn,pass,pn,});

            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int b=Integer.parseInt(se.getText());
        DefaultTableModel model=(DefaultTableModel)d1.getModel();
        { {

        }

        try
        {
            Class.forName("java.sql.DriverManager");
            Connection c=(Connection)DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/ovs","root","RRMPS");
            Statement S=(Statement)c.createStatement();
            String query="select * from USERTABLE where  SERIAL='"+b+"';";
            ResultSet rs=S.executeQuery(query);

            {
                int i=model.getRowCount();
                while (i>0)
                {
                    model.removeRow(0);
                    i--;
                    while(rs.next())
                    {

                        String sn=rs.getString("SERIAL");
                        String un=rs.getString("USERN");
                        String cn=rs.getString("POST");
                        String pass=rs.getString("CONTACTS");
                        String pn=rs.getString("PASSWORD");
                        

                        model.addRow(new Object[]
                            {sn,un,cn,pass,pn});

                    }
                }
            }}
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }        // TODO add your handling code here:

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERLIST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable d1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField se;
    // End of variables declaration//GEN-END:variables

}
