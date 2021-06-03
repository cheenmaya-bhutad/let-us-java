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
public class Chapter5Ca {
    public static void main(String[] args) {
        int num=0;
        long fact=1l;
        char ch='y';
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            num=sc.nextInt();
            fact=1;
            for(int i=1;i<=num;i++)
                fact=fact*i;
            System.out.println("The factorial of the number is : " + fact);
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
