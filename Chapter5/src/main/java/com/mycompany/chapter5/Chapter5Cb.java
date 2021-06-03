/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter5Cb {
    public static void main(String[] args) {
        int C,D,fact;
        Scanner sc=new Scanner(System.in);
        char ch='y';
        while(ch=='y')
        {   
            fact=1;
            C=sc.nextInt();
            D=sc.nextInt();
            System.out.println("Entered numbers are : " + C + " " + D);
            for(int i=0;i<D;i++)
                fact=fact*C;
            System.out.println("Required Result is : " + fact);
            System.out.println("Do you want to continue :  yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
