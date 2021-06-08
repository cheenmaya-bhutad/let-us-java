/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter7;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author cheenmaya
 */
public class Chapter7De {
    public static void main(String[] args) {
        char ch='y';
        float a,b,c;
        double area;
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            System.out.println("Enter the sides for the triangle :");
            a=sc.nextFloat();
            b=sc.nextFloat();
            c=sc.nextFloat();
            area=Areaoftri(a,b,c);
            System.out.println("Area of triangles with sides " + a + "," + b + "," + c + " is :" + area);
            System.out.println("Do you want to continue : yes or no");
                ch=sc.next().charAt(0);
                if(ch!='y')
                    sc.close();
        }
    }
    public static double Areaoftri(float a,float b,float c)
    {
        double area,S;
        S=(a+b+c)/2;
        area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        return area;
    }
}
