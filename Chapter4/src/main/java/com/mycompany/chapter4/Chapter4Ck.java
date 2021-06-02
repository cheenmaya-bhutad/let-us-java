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
public class Chapter4Ck {
    public static void main(String[] args) {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            int year;
            year=sc.nextInt();
            System.out.println("Entered Year is : " + year);
            if((year%4==0) && (year%400==0))
                System.out.println("Year is a leap year");
            else
                System.out.println("Year is not a leap year");
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
