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
public class Chapter4Cb {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered number is : " + num);
        if((num%2)==0)
        {
            System.out.println("Given number is even");
        }
        else
        {
            System.out.println("Given number is odd");
        }
        sc.close();
    }
}
