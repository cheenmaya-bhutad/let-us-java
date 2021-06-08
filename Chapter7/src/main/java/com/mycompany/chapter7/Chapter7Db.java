/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter7;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter7Db {
    public static void main(String[] args) {
            char ch='y';    
            while(ch=='y')
            {
                int a,b,res=0;
                Scanner sc=new Scanner(System.in);
                a=sc.nextInt();
                b=sc.nextInt();
                res=raisedto(a,b);
                System.out.println("a raised to power b is " + a + "^" + b + "=" + res);
                System.out.println("Do you want to continue : yes or no");
                ch=sc.next().charAt(0);
                if(ch!='y')
                    sc.close();
            }
    }
            public static int raisedto(int a,int b)
            {
                int fact=1;
                for(int i=1;i<=a;i++)
                    fact=fact*b;
                return fact;
            }
}
