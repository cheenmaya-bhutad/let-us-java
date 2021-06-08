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
public class Chapter7Dd {
    public static void main(String[] args) {
            char ch='y';
            int num1=0;
            float num2=0f,pr=0f;
            Scanner sc=new Scanner(System.in);
            while(ch=='y')
            {
                num1=sc.nextInt();
                num2=sc.nextFloat();
                pr=Product(num1,num2);
                System.out.println("Product of int and float is : " + pr);
                System.out.println("Do you want to continue : yes or no");
                ch=sc.next().charAt(0);
                if(ch!='y')
                    sc.close();
            }
    }
    public static float Product(int num1,float num2)
    {
        float pr;
        pr=num1*num2;
        return pr;
    }
}
