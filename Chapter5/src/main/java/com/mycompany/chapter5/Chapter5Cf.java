/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;
/**
 *
 * @author cheenmaya
 */
public class Chapter5Cf {
    public static void main(String[] args) {
        float i=0;
        for(int y=1;y<=6;y++)
            for(float x=5.5f;x<=12.5f;x=x+0.5f)
            {
                i=2+(y+(0.5f*x));
                System.out.println("i:" + i + " y:" + y + " x:" + x);
            }
        i=0f;
    }
}
