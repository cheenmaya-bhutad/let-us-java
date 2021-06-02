/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter4;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author cheenmaya
 */
public class Chapter4Gi {
    public static void main(String[] args) {
        char ch='y';
        while(ch=='y')
        {
            int x1,y1,x2,y2,r;
            Scanner sc=new Scanner(System.in);
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            r=sc.nextInt();
            System.out.println("Entered circle center : " + "(" + x1 + "," + y1 + ")" + " and radius is " + r);
            if(Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)))<r)
                System.out.println("Point lies inside the circle");
            else if(Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)))==r)
                System.out.println("Point lies on the circle");
            else
                System.out.println("Point lies outside the circle");
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
