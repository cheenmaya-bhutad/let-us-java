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
public class Chapter5Ch {
    public static void main(String[] args) {
        float p,r,q,n;
        double a;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            p=sc.nextFloat();
            r=sc.nextFloat();
            q=sc.nextFloat();
            n=sc.nextFloat();
            a=p*(Math.pow((1+r/q),n*q));
            System.out.println("Amount a is : " + a);
        }
    }
}
