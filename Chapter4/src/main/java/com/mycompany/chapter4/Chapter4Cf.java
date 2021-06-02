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
public class Chapter4Cf {
    public static void main(String[] args) {
        float l1,l2,l3;
        Scanner sc=new Scanner(System.in);
        l1=sc.nextFloat();
        l2=sc.nextFloat();
        l3=sc.nextFloat();
        System.out.println("Entered lengths for the 3 sides of triangles are : " + l1 + " " + l2 + " " + l3);
        if((l1<(l2+l3)) && (l2<(l1+l3)) && (l3<(l1+l2)))
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is invalid");
        }
        sc.close();
    }
}
