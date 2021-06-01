/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter2;
import java.util.*;
/**
 *
 * @author cheenmaya
 */
public class Chapter2Da {
    public static void main(String[] args) {
        float BS=0f,DA=0f,HRA=0f,GS=0f;
        System.out.println("Enter the Base Salary: ");
        Scanner sc = new Scanner(System.in);
        BS = sc.nextFloat();
        DA = 0.4f*BS;
        HRA = 0.2f*BS;
        GS = DA+HRA+BS;
        System.out.print("Gross Salary is " + GS);
        sc.close();
    }
}
