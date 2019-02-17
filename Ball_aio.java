/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

/**
 *
 * @author bishalblue
 */
public abstract class Ball_aio extends JPanel implements ActionListener {
    Timer t=new Timer(5, this);
    double x=0,y=0,velx=2,vely=2;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        Ellipse2D.Double circle=new Ellipse2D.Double(x, y, 20, 20);
        g2.fill(circle);
        t.start();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(x<0 || x>580){
            velx=-velx;
        }
        if(y<0 || y<360){
            vely=-vely;
        }
        x+=velx;
        y+=vely;
        repaint();
    }
}