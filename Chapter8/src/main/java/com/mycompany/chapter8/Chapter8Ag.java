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
public class Chapter8Ag {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of natural numbers : ");
        num=sc.nextInt();
        sum=recsum(num);
        System.out.println("Sum of numbers is : " + sum);
        sc.close();
    }
    public static int recsum(int num) {
        if(num==0)
            return 0;
        else
            return num+recsum(num-1);
    }
}
