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
public class Chapter2De {
    public static void main(String[] args) {
        final float pi=3.14f;
        float r,l,b,Arec,Acir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length,breadth and radius :");
        l=sc.nextFloat();
        b=sc.nextFloat();
        r=sc.nextFloat();
        Arec=l*b;
        Acir=pi*r*r;
        System.out.println("Area for rectangle is : " + Arec + " and for Circle is : " + Acir);
        sc.close();
    }
}
