/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author cheenmaya
 */
public class Chapter5Cc {
    public static void main(String[] args) {
        int h,t,u;
        for(int i=1;i<=500;i++)
        {
            h=i/100;
            t=(i/10)%10;
            u=i%10;
            if((Math.pow(h,3) + Math.pow(t,3) + Math.pow(u,3))==i)
                System.out.println(i);
            else
                continue;
        }
    }
}
