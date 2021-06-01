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
public class Chapter2Db {
    public static void main(String[] args) {
        float dkm=0f,dcm=0f,dinch=0f,dfeet=0f;
        System.out.println("Enter the distance in KM : ");
        Scanner sc = new Scanner(System.in);
        dkm=sc.nextFloat();
        dcm=100000*dkm;
        dinch=dcm/2.54f;
        dfeet=dinch/12;
        System.out.println("The Distance in centimeteres:"+ dcm + ", feet:"+ dfeet + " and inches: "+ dinch);
        sc.close();
    }
}
