/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter4;
import java.lang.Math;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter4Cc {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered number is : " + num);
        System.out.println("Absolute value of number is : " + Math.abs(num));
        sc.close();
    }
}
