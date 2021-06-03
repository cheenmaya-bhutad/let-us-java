/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter5;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter5Cg {
    public static void main(String[] args) {
        char ch='y';
        while(ch=='y')
        {
            int num=0;
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            for(int i=1;i<=10;i++)
                System.out.println(num + "*" + i + "=" + num*i);
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
}
