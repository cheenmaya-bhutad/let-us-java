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
public class Chapter7Da {
    public static void main(String[] args) {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        int num=0,Fact=0;
        while(ch=='y')
        {    
            num=sc.nextInt();
            Fact=factorial(num);
            System.out.println("Factorial is : " + Fact);
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch!='y')
                sc.close();
        } 
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        return fact;
    }
}
