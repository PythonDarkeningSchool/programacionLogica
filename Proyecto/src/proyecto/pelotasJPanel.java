/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author hiperezr
 */
public class pelotasJPanel extends javax.swing.JPanel implements Runnable {

    int aX = getWidth();
    int aY = 20;
    int bX = getWidth();
    int cX = getWidth();
    int cY = 140;
    int dX = getWidth();
    int dY = 200;
    int eX = getWidth();
    int fX = getWidth();
    int fY = 320;
    Thread hilo;
    
    public pelotasJPanel() {
        initComponents();
        hilo = new Thread(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g){
        //g.setColor(getBackground());
        //g.setColor(Color.CYAN);
        //g.fillRect(0, 200, getWidth(), getHeight());
        
        g.setColor(Color.BLUE); // circle color
        g.fillOval(aX, aY, 50, 50);
        
        g.setColor(Color.BLACK); // circle color
        g.fillOval(bX, 80, 50, 50);
        
        g.setColor(Color.CYAN); // circle color
        g.fillOval(cX, cY, 50, 50);
        
        g.setColor(Color.MAGENTA); // circle color
        g.fillOval(dX, dY, 50, 50);
        
        g.setColor(Color.ORANGE); // circle color
        g.fillOval(eX, 260, 50, 50);
        
        g.setColor(Color.DARK_GRAY); // circle color
        g.fillOval(fX, fY, 50, 50);

    }
    public void inicio(){ hilo.start(); }
    
    public void pausa(){ hilo.suspend(); }
    
    public void continuar(){ hilo.resume(); }
    
    @Override
    public void run(){
        try {
            while(true){
                while(aX < getWidth()-30){
                    Thread.sleep(20);
                    aX +=5;
                    aY +=1;
                    bX +=5;
                    cX +=5;
                    cY -=1;
                    dX +=5;
                    dY +=1;
                    eX +=5;
                    fX +=5;
                    fY -=1;
                    repaint();
                }
                while(aX > 0){
                    Thread.sleep(20);
                    aX -=5;
                    aY -=1;
                    bX -=5;
                    cX -=5;
                    cY +=1;
                    dX -=5;
                    dY -=1;
                    eX -=5;
                    fX -=5;
                    fY +=1;
                    repaint();
                }
            }
        } 
        catch(InterruptedException e) { System.out.println(e); }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
