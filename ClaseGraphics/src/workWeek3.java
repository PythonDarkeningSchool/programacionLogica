
import java.awt.Color;
import java.awt.Graphics;

public class workWeek3 extends javax.swing.JFrame {

    public workWeek3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 200));
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(workWeek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workWeek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workWeek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workWeek3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workWeek3().setVisible(true);
            }
        });
    }
    
    
    
    public void paint(Graphics g) {//metodo de la libreria graphics
        super.paint(g);//nombre del metodo paint, para crear las lineas o formas a dibujar en el frame
        
        g.setColor(Color.BLUE);
        
        int[] vectorx1 = {10};
        int[] vectory1 = {150};
        g.drawPolygon(vectorx1, vectory1, 1);
        
        g.drawOval(110, 46, 40, 35); // head
        g.drawOval(90, 80, 80, 70); // pancita
        g.drawRect(170, 100, 60, 30); // mano derecha
        g.drawRect(30, 100, 60, 30); // mano izquierda
        g.drawRect(100, 150, 60, 30); // fajo
        g.drawRect(100, 180, 30, 60); // pierna izquierda
        g.drawRect(130, 180, 30, 60); // pierna derecha
        g.drawRect(100, 240, 30, 20); // zapato izquierdo
        g.drawRect(130, 240, 30, 20); // zapato derecho
       
        
        g.setColor(Color.BLACK);
        g.drawOval(320, 46, 40, 35); // head
        g.drawOval(300, 80, 80, 70); // pancita
        g.drawRect(380, 100, 60, 30); // mano derecha
        g.drawRect(240, 100, 60, 30); // mano izquierda
        g.drawRect(310, 150, 60, 30); // fajo
        g.drawRect(310, 180, 30, 60); // pierna izquierda
        g.drawRect(340, 180, 30, 60); // pierna derecha
        
        int x = 60;
        int y = 400;
        
        
        for (int i = 0; i < 150; i++) {
                    
            g.setColor(Color.RED);
            g.fillRect(x, y, 60, 30);
            
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            
            g.clearRect(x, y, 100, 100);
            x = x + 2;
            y = y +2;
            
        }
       
        

    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
