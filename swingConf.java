/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

/**
 *
 * @author bishalblue
 */
public class swingConf {
    double X=0,Y=0,velX=1,velY=1, size;
    static int countstrike=0;
    
    public void setCoordinates(double size){
        if(X==0 || X==800-size){
            velX=-velX;
            countstrike++;
        }
        if (Y==0 || Y==600-size){
            velY=-velY;
            countstrike++;
        }
        X=X+velX;
        Y=Y+velY;
    }
    
}
