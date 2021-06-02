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
public class Chapter3Gd {
    public static void main(String[] args) {
        float TP=80000,LM,LF,NOM,NOF,ILM,ILF;
        LM=(0.35f)*80000;
        LF=(80000*0.48f)-LM;
        NOM=80000*0.52f;
        ILM=NOM-LM;
        NOF=TP-NOM;
        ILF=NOF-LF;
        System.out.println("Total iliterate men : " + ILM + " and Women : " + ILF);
        }
}
