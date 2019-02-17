/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BouncingBall;

import javax.swing.JFrame;

/**
 *
 * @author bishalblue
 */
public class Ball_aio_mech {
    public static void main(String args[]){
        Ball_aio Bl=new Ball_aio() {};
        JFrame frame=new JFrame();
        frame.add(Bl);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AIO Ball");
    }
}
