/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;
/**
 *
 * @author cheenmaya
 */
public class Chapter5Ci {
    public static void main(String[] args) {
        float fact=1;
        float sum=0;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
                fact=fact*j;
            sum=sum+(i/fact);
//            System.out.format("%10.2f",sum);
            fact=1;
        }
        System.out.println("Sum of expression is : " + sum);
    }
}
