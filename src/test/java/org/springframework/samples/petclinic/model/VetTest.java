/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;

import customAnnotations.PTest;
import java.util.List;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rob
 */
public class VetTest {
    
    public VetTest() {
    }

    /**
     * Test of setSpecialtiesInternal method, of class Vet.
     */
    @Test
    public void testSetSpecialtiesInternal() {
        System.out.println("setSpecialtiesInternal");
        Set<Specialty> specialties = null;
        Vet instance = new Vet();
        instance.setSpecialtiesInternal(specialties);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialtiesInternal method, of class Vet.
     */
    @Test
    public void testGetSpecialtiesInternal() {
        System.out.println("getSpecialtiesInternal");
        Vet instance = new Vet();
        Set<Specialty> expResult = null;
        Set<Specialty> result = instance.getSpecialtiesInternal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialties method, of class Vet.
     */
    @Test
    public void testGetSpecialties() {
        System.out.println("getSpecialties");
        Vet instance = new Vet();
        List<Specialty> expResult = null;
        List<Specialty> result = instance.getSpecialties();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNrOfSpecialties method, of class Vet.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testGetNrOfSpecialties() {
        Vet instance = new Vet();
        int expResult = 0;
        int result = instance.getNrOfSpecialties();
        assertEquals(expResult, result);
    }

    /**
     * Test of addSpecialty method, of class Vet.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testAddSpecialty() {
        Specialty specialty = new Specialty();
        Vet instance = new Vet();
        instance.addSpecialty(specialty);
        assertEquals(instance.getNrOfSpecialties(), 1);
    }
    
}
