/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author bishalblue
 */
public class moveBall implements ActionListener {
    Timer time;
    drawBall ball=new drawBall();
    swingConf ballSwing=new swingConf();
    ballComponent BC;

    public moveBall() {
        this.time = new Timer(5,this);
    }
    void passbc(ballComponent bc){
        BC=bc;
    }
    public void drawMoveBall(Graphics2D g2){
        ball.ballSize();
        ball.drawBall(g2);
        time.start();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballSwing.setCoordinates(ball.size);
        BC.repaint();
    
    }
    
    
}
