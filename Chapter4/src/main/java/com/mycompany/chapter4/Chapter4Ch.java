/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter4;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter4Ch {
    public static void main(String[] args) {
        char ch='y';
        while(ch=='y')
        {
            float l,b,area,peri;
            Scanner sc=new Scanner(System.in);
            l=sc.nextFloat();
            b=sc.nextFloat();
            System.out.println("Entered Length and Breadth of Rectangle is : " + l + " " + b);
            area=l*b;
            peri=2*(l+b);
            if(area>peri)
                System.out.println("Area is greater than Perimeter");
            else
                System.out.println("Perimeter is greater than Area");
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
