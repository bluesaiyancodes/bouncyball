/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;



/**
 *
 * @author bishalblue
 */
class ballComponent extends JPanel{
    moveBall ball=new moveBall();
    @Override
    public void paintComponent(Graphics g){
    Graphics2D g2= (Graphics2D)g;
    //moveBall ball=new moveBall();
    ball.drawMoveBall(g2);
}
    void setball(moveBall pass){
        ball=pass;
    }
}
public class BouncingBall {
    public static void main(String args[]){
        JFrame frame=new JFrame();
        frame.setTitle("Bouncy Ball");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ballComponent bc=new ballComponent();
        moveBall pass=new moveBall();
        pass.passbc(bc);
        bc.setball(pass);
        frame.add(bc);
    }
}
