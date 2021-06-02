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
public class Chapter3Ga {
    public static void main(String[] args) {
        float C,D,Temp;
        Scanner sc=new Scanner(System.in);
        C=sc.nextFloat();
        D=sc.nextFloat();
        System.out.println("Entered 2 numbers are : " + C + " " + D);
        System.out.println("Before Swapping : " + C + " " + D);
        Temp=C;
        C=D;
        D=Temp;
        System.out.println("After swapping : " + C + " " + D);
        sc.close();
    }
}
