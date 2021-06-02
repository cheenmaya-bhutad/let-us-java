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
public class Chapter4Ca {
    public static void main(String[] args) {
        float SP,CP,profit,loss;
        Scanner sc=new Scanner(System.in);
        SP=sc.nextFloat();
        CP=sc.nextFloat();
        System.out.println("Entered Cost price is " + CP + " and Selling price is " + SP);
        if(SP>CP)
        {
            profit=SP-CP;
            System.out.println("Profit is : " + profit);
        }
        else if(CP>SP)
        {
            loss=CP-SP;
            System.out.println("Loss is : " + loss);
        }
        sc.close();
    }
}
