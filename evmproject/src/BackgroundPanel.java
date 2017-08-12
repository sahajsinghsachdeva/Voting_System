public class BackgroundPanel extends javax.swing.JPanel {

    java.awt.Image image;

    public BackgroundPanel() {
        try {
            image = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("Indian-Flag-Wallpaper5.jpg"), "Indian-Flag-Wallpaper5.jpg"));
            java.awt.Dimension size = new java.awt.Dimension(image.getWidth(null), image.getHeight(null));
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
        } catch (Exception e) { /*handled in paintComponent()*/ }
    }

    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAHAJ SINGH SACHDEVA
 */

