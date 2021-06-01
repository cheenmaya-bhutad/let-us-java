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
public class Chapter2Dd {
    public static void main(String[] args) {
        float C,F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius :");
        C = sc.nextFloat();
        F=((5*C)/9) + 32;
        System.out.println("Temperature in Faranheit is : " + F + " degrees");
        sc.close();
    }
}
