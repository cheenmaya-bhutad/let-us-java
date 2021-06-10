/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter8;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter8Ad {
    public static void main(String[] args) {
        int num;
        char ch='y';
        Scanner sc=new Scanner(System.in);
        while(ch=='y')
        {
            System.out.println("Enter the number : ");
            num=sc.nextInt();
            primefactorsrec(num);
            System.out.println("Do you want to continue : yes or no");
            ch=sc.next().charAt(0);
            if(ch=='n')
                sc.close();
        }
    }
    public static int primefactorsrec(int num)
    {
        if(num==1)
        {
            System.out.println("No more factors");
            return 1;
        }
   
        else
        {
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                {
                    System.out.print(i + "");
                    num=num/i;
                    break;
                }
                else
                {
                    continue;
                }
            }
            return primefactorsrec(num);
        }
    }
}
