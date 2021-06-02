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
public class Chapter3Gc {
    public static void main(String[] args) {
        int num,rev=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Entered Number is : " + num);
        rev=((num%10)*10000)+(((num/10)%10)*1000)+(((num/100)%10)*100)+(((num/1000)%10)*10)+(num/10000);
        System.out.println("Reversed number is : " + rev);
        sc.close();
    }
}
