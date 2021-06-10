/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter8;
import java.util.*;

/**
 *
 * @author cheenmaya
 */
public class Chapter8Aa {
    public static void main(String[] args) {
        char ch='y';
        int max1,a,b;
        float max2,c,d;
        double max3,e,f;
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            System.out.println("Enter the 2 integers : ");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Enter the 2 floats : ");
            c=sc.nextFloat();
            d=sc.nextFloat();
            System.out.println("Enter the 2 doubles : ");
            e=sc.nextDouble();
            f=sc.nextDouble();
            max1=Max(a,b);
            max2=Max(c,d);
            max3=Max(e,f);
            System.out.println("Max of both integers is : " + max1);
            System.out.println("Max of both floats is : " + max2);
            System.out.println("Max of both doubles is : " + max3);
            System.out.println("Do you want to continue :  yes or no ");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
    public static int Max(int a,int b){
        if(a>b)
            return a;
        else if(a<b)
            return b;
        else
            return a;
    }
    public static float Max(float c,float d){
        if(c>d)
            return c;
        else if(c<d)
            return d;
        else
            return c;
    }
    public static double Max(double e,double f){
        if(e>f)
            return e;
        else if(e<f)
            return f;
        else
            return e;
    }
}
