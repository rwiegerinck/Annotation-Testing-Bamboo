/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;
import customAnnotations.PTestReport;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Rob
 */
public class PtestRunTests {
    
    @Test
    public void testMainTest() {
        PTestReport pt = new PTestReport();
        //String[] args2 = {"C:\\Users\\Rob\\Desktop\\spring-petclinic\\src\\test\\java\\"};
        String dir = System.getProperty("user.dir") + "\\src\\test\\java\\" ;
        String[] args2 = {dir};
        pt.main(args2);
       // main(null);
        assertEquals(1,1);
    }
    
     public static void main(String[] args) {
         PTestReport pt = new PTestReport();
         System.out.println(PtestRunTests.class.getProtectionDomain().getCodeSource().getLocation().getPath());
         //String location = PtestRun.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "java\\";
         //String[] args2 = {location};
         //String[] args2 = {"C:\\Users\\Rob\\Desktop\\spring-petclinic\\src\\test\\java\\"};
         //pt.main(args2);
     }
}
