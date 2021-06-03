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
public class Chapter5Cd {
    public static void main(String[] args) {
        int temp=0;
        for(int i=2;i<=300;i++)
        {
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    temp=j;
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(i==temp)
                System.out.println("Prime number : " + i);
        }
    }
}
