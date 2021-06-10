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
public class Chapter8Ac {
    public static void main(String[] args) {
        char ch='y';
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            num=sc.nextInt();
            sum=recsum(num);
            System.out.println("Sum of digits is : " + sum);
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
    public static int recsum(int num){
        int sum=0;
        if(num==0)
            return 0;
        else
        {
            sum=sum+num%10+recsum(num/10);
            return sum;
        }
    }
}
