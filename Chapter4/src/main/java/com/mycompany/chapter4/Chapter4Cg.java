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
public class Chapter4Cg {
    public static void main(String[] args) {
        char ch='y';
        while(ch=='y')
        {
            int l1,l2,l3;
            Scanner sc=new Scanner(System.in);
            l1=sc.nextInt();
            l2=sc.nextInt();
            l3=sc.nextInt();
            System.out.println("Entered lengths for the 3 sides of triangles are : " + l1 + " " + l2 + " " + l3);
            if((l1==l2) && (l2==l3) && (l1==l3))
                System.out.println("Triangle is Equilateral");
            else if((l1==l2) || (l3==l2) || (l1==l3))
                System.out.println("Triangle is Isosceles");
            else if(((l1*l1)+(l2*l2))==(l3*l3) || ((l2*l2)+(l3*l3))==(l1*l1) || ((l1*l1)+(l3*l3))==(l2*l2))
                System.out.println("Triangle is Right angled");
            else
                System.out.println("Triangle is Scalene");
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
