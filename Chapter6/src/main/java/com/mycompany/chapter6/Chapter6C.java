/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter6;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter6C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice,num,fact,temp=0;
        do
        {
            System.out.println("Enter your choice :");
            System.out.println("1. Factorial of a number");
            System.out.println("2. Prime or not");
            System.out.println("3. Odd or even");
            System.out.println("4. Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your number : ");
                    num=sc.nextInt();
                    fact=1;
                    for(int i=1;i<=num;i++)
                        fact=fact*i;
                    System.out.println("Factorial of the number is : " + fact);
                    break;
                case 2:
                    System.out.println("Enter your number : ");
                    num=sc.nextInt();
                    for(int i=2;i<=num;i++)
                    {
                        if(num%i==0)
                        {
                            temp=i;
                            break;
                        }
                        else
                        {  
                            temp=i;
                            continue;
                        }
                    }
                    if(temp==num)
                        System.out.println("Prime number");
                    else
                        System.out.println("Not a prime number");
                    temp=0;
                    break;
                case 3:
                    System.out.println("Enter your number : ");
                    num=sc.nextInt();
                    if(num%2==0)
                        System.out.println("Even number");
                    else
                        System.out.println("Odd number");
                    break;
                case 4:
                    System.out.println("Exiting menu");
                    break;
                default:
                    System.out.println("Please enter correct choice");
                    break;
            }
        }while(choice!=4);
    }   
}
