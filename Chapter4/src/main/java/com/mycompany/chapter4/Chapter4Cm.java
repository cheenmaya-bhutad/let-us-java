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
public class Chapter4Cm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch))
            System.out.println("Character is lowercase alphabet");
        else
            System.out.println("Character is not a lowercase alphabet");
        if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
            System.out.println("Character is a digit");
        else
            System.out.println("Character is not a digit");
        if(!(Character.isAlphabetic(ch) && Character.isDigit(ch)))
            System.out.println("Character is Alphanumeric");
        else
            System.out.println("Character is not Alphanumeric"); 
        sc.close();
    }
}
