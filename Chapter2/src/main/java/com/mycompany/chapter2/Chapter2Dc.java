/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter2;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter2Dc {
    public static void main(String[] args) {
        float s1,s2,s3,s4,s5,agg,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for the student : ");
        s1=sc.nextFloat();
        s2=sc.nextFloat();
        s3=sc.nextFloat();
        s4=sc.nextFloat();
        s5=sc.nextFloat();
        agg=(s1+s2+s3+s4+s5);
        per=(agg/500)*100;
        System.out.println("The aggregate marks are " + agg + " whereas the percentage is " + per + "%");
        sc.close();
    }
}
