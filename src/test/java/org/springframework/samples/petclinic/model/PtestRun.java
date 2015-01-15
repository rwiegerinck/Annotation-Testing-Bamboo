/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;
import customAnnotations.PTestReport;

/**
 *
 * @author Rob
 */
public class PtestRun {
    
     public static void main(String[] args) {
	     System.out.println("1: " + PtestRun.class.getProtectionDomain().getCodeSource().getLocation().getPath());
         System.out.println("2: "+System.getProperty("user.dir"));
         String dir = System.getProperty("user.dir") + "/src/test/java/" ;
         System.out.println("3:"+ dir);
         PTestReport pt = new PTestReport();
       //  String dir = System.getProperty("user.dir") + "\\src\\test\\java\\" ;
         String[] args2 = {dir};
         pt.main(args2);
     }
}
