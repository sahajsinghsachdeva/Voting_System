
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * about_us.java
 *
 * Created on Sep 10, 2014, 12:47:32 AM
 */

/**
 *
 * @author 1
 */
public class about_us extends javax.swing.JFrame {

    /** Creates new form about_us */
    public about_us() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(0);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Our Aim.....");

        ad.setBackground(new java.awt.Color(255, 102, 51));
        ad.setColumns(20);
        ad.setEditable(false);
        ad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ad.setLineWrap(true);
        ad.setRows(5);
        ad.setText("Voting machines are the total combination of mechanical, electromechanical, or electronic equipment (including software, firmware, and documentation required to program control, and support equipment), that is used to define ballots; to cast and count votes; to report or display election results; and to maintain and produce any audit trail information. The first voting machines were mechanical but it is increasingly more common to use electronic voting machines.\n\nA voting system includes the practices and associated documentation used to identify system components and versions of such components; to test the system during its development and maintenance; to maintain records of system errors or defects; to determine specific changes made after initial certification; and to make available any materials to the voter (such as notices, instructions, forms, or paper ballots).\n\nTraditionally, a voting machine has been defined by the mechanism the system uses to cast\n votes and further categorized by the location where the system tabulates the votes.\n\nVoting machines have different levels of usability, security, efficiency and accuracy. Certain systems may be more or less accessible to all voters, or not accessible to those voters with certain types of disabilities. They can also have an effect on the public's ability to oversee elections.\nThe first major proposal for the use of voting machines came from the Chartists in 1838. Among the radical reforms called for in The People's Charter were universal suffrage and voting by secret ballot. This required major changes in the conduct of elections, and as responsible reformers, the Chartists not only demanded reforms but described how to accomplish them, publishing Schedule A, a description of how to run a polling place, and Schedule B, a description of a voting machine to be used in such a polling place.\n\nThe Chartist voting machine, attributed to Benjamin Jolly of 19 York Street in Bath, allowed each voter to cast one vote in a single race. This matched the requirements of a British parliamentary election. Each voter was to cast his vote by dropping a brass ball into the appropriate hole in the top of the machine by the candidate's name. Each voter could only vote once because each voter was given just one brass ball. The ball advanced a clockwork counter for the corresponding candidate as it passed through the machine, and then fell out the front where it could be given to the next voter.\n\nIn 1875, Henry Spratt of Kent received a U.S. patent for a voting machine that presented the ballot as an array of push buttons, one per candidate. Spratt's machine was typically British, allowing each voter to cast a fixed number of votes in a single race. In 1881, Anthony Beranek of Chicago patented the first voting machine appropriate for use in a general election in the United States. Beranek's machine presented an array of push buttons to the voter, with one row per office on the ballot, and one column per party. Interlocks behind each row prevented voting for more than one candidate per race, and an interlock with the door of the voting booth reset the machine for the next voter as each voter left the booth.\n\n\n\nA document ballot voting system records votes, counts votes, and produces a tabulation of the vote count from votes cast on paper cards or sheets. A document ballot voting system can allow for manual or electronic tabulation.\n\n\nThe first use of paper ballots to conduct an election appears to have been in Rome in 139 BCE, and the first use of paper ballots in the United States was in 1629 to select a pastor for the Salem Church.\n\nNOW IT'S TURN FOR THE FUTURE AND BEST TECHNOLOGY.....\n\n\nAs We Know Voting condition of INDIA is NOW-A-DAYS is very poor and worse. Only 54% people come out of their home to vote. 30% people enjoy this day as public holiday. They enjoy this day with their family by organising trips and picnic. Left 16% donot even came out of their house to caste vote. They think that no change will cause in the condition of Indian Government by their vote. They think that after every 5 years new government will form and rule on their country and make money for themselves. \n\nSo for those people who enjoy this day as public holiday and think that voting is wastage of time, WE have DESIGNED an e-Application i.e. \"Online Voting Machine\" that can be installed on any P.C. or KIOSKS or any android Smartphones or Tablets. People can Vote by sitting at their home or anywhere using their mobile or pc...... \n\nThis application will help in increase in \"%\" of voting. Also it awares the people, the time of voting. Also it saves the precious time of those people who came from their jobs to cast Vote.\n\nThanks!!!!!!\n--DEVELOPERS");
        ad.setToolTipText("");
        ad.setWrapStyleWord(true);
        ad.setAutoscrolls(false);
        ad.setCaretPosition(1);
        jScrollPane1.setViewportView(ad);

        jButton5.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Andalus", 1, 20)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel1))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
int i=JOptionPane.showConfirmDialog(this,"Do you Want To Exit");
if(i==0)
{
this.dispose();}


// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ad;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
