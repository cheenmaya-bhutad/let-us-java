/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter3;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter3Gb {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered Number is : " + num);
        sum=(num%10)+((num/10)%10)+((num/100)%10)+((num/1000)%10)+(num/10000);
        System.out.println("Sum of digits is : " + sum);
        sc.close();
    }
}
