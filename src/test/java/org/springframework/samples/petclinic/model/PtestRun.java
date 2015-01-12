/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;
import antlr.build.ANTLR;
import customAnnotations.PTestReport;

/**
 *
 * @author Rob
 */
public class PtestRun {
    
     public static void main(String[] args) {
         PTestReport pt = new PTestReport();
         
         String[] args2 = {"C:\\Users\\Rob\\Desktop\\spring-petclinic\\src\\test\\java\\"};
         pt.main(args2);
     }
}
