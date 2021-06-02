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
public class Chapter3Ge {
    public static void main(String[] args) {
        int amt=0,Num=0;
        Scanner sc=new Scanner(System.in);
        amt=sc.nextInt();
        System.out.println("Entered amount is : " + amt);
        Num=amt/100;
        amt=amt%100;
        Num=Num+(amt/50);
        amt=amt%50;
        Num=Num+(amt/10);
        amt=amt%10;
        System.out.println("Minimum notes required is : " + Num);
        sc.close();
    }
}
