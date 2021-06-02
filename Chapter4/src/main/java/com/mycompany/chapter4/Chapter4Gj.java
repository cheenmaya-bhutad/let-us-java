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
public class Chapter4Gj {
    public static void main(String[] args) {
        char ch='y';
        while(ch=='y')
        {
            int x,y;
            Scanner sc=new Scanner(System.in);
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println("Entered coordinates are : " + "(" + x + "," + y + ")");
            if(x==0 && y==0)
                System.out.println("The given point lies on origin");
            else if(y==0)
                System.out.println("The given point lies on X axis");
            else if(x==0)
                System.out.println("The given point lies on Y axis");
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
