/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter7;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter7Dc {
    public static void main(String[] args) {
            char ch='y';
            int year=0;
            Scanner sc=new Scanner(System.in);
            while(ch=='y')
            {
                year=sc.nextInt();
                Leapyearcheck(year);
                System.out.println("Do you want to continue : yes or no");
                ch=sc.next().charAt(0);
                if(ch!='y')
                    sc.close();
            }
    }
    public static void Leapyearcheck(int year)
    {
        if(year%4==0 && year%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a Leap year");
    }
}
