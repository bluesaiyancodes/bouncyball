/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;
/**
 *
 * @author bishalblue
 */
public class drawBall {
    Ellipse2D.Double ball;
    double x,y;
    boolean startflag=false;
    public double size;
    
    public void ballSize(){
        if (startflag==false){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the ball: ");
        size=input.nextDouble();
        startflag=true;
    }
    }
    
    swingConf getCoordinates = new swingConf();
    
    public void drawBall(Graphics2D g2){
        x=getCoordinates.X;
        y=getCoordinates.Y;
        ball=new Ellipse2D.Double(x, y, size, size);
        g2.fill(ball);
    }
}

