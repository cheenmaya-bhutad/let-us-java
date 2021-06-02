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
public class Chapter4Cd {
    public static void main(String[] args) {
        float Ram,Shyam,Ajay;
        Scanner sc=new Scanner(System.in);
        Ram=sc.nextFloat();
        Shyam=sc.nextFloat();
        Ajay=sc.nextFloat();
        System.out.println("Entered Ages for Ram, Shyam and Ajay are : " + Ram + " " + Shyam + " " + Ajay);
        if((Ram<Ajay) && (Ram<Shyam))
        {
            System.out.println("Ram is Youngest");
        }
        else if(Ajay<Shyam)
        {
            System.out.println("Ajay is Youngest");
        }
        else
        {
            System.out.println("Shyam is Youngest");
        }
        sc.close();
    }
}
