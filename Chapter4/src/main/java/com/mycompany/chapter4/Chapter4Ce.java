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
public class Chapter4Ce {
    public static void main(String[] args) {
        float a1,a2,a3;
        Scanner sc=new Scanner(System.in);
        a1=sc.nextFloat();
        a2=sc.nextFloat();
        a3=sc.nextFloat();
        System.out.println("Entered angles for the triangles are : " + a1 + " " + a2 + " " + a3);
        if((a1+a2+a3)==180f)
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
