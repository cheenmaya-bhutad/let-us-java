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
public class Chapter5Cj {
    public static void main(String[] args) {
        double x=0,sum=0,y=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=(x-1)/x;
        sum=sum+y
        for(int i=1;i<=6;i++)
            sum=sum+(0.5d*Math.pow(y,i+1));
        System.out.println("Natural logarithm for " + x + " is : " + sum);
    }
}
