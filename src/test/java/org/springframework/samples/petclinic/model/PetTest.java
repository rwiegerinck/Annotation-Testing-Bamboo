/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;

import customAnnotations.PTest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Rob
 */
public class PetTest {
    
    public PetTest() {
    }
    
    /**
     * Test of setBirthDate method, of class Pet.
     */
    @Test
    public void testSetBirthDate() {
        System.out.println("setBirthDate");
        DateTime birthDate = null;
        Pet instance = new Pet();
        instance.setBirthDate(birthDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDate method, of class Pet.
     */
    @Test
    public void testGetBirthDate() {
        System.out.println("getBirthDate");
        Pet instance = new Pet();
        DateTime expResult = null;
        DateTime result = instance.getBirthDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Pet.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        PetType type = null;
        Pet instance = new Pet();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Pet.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Pet instance = new Pet();
        PetType expResult = null;
        PetType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Pet.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        Owner owner = null;
        Pet instance = new Pet();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Pet.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Pet instance = new Pet();
        Owner expResult = null;
        Owner result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisitsInternal method, of class Pet.
     */
    @Test
    public void testSetVisitsInternal() {
        System.out.println("setVisitsInternal");
        Set<Visit> visits = null;
        Pet instance = new Pet();
        instance.setVisitsInternal(visits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisitsInternal method, of class Pet.
     */
    @PTest(amountTimesRunPerUser = 1000)
    @Test
    public void testGetVisitsInternal() {
        System.out.println("getVisitsInternal");
        Pet instance = new Pet();
        Set<Visit> expResult = new HashSet<Visit>();
        Set<Visit> result = instance.getVisitsInternal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVisits method, of class Pet.
     */
    @Test
    public void testGetVisits() {
        System.out.println("getVisits");
        Pet instance = new Pet();
        List<Visit> expResult = null;
        List<Visit> result = instance.getVisits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVisit method, of class Pet.
     */
    @Test
    public void testAddVisit() {
        System.out.println("addVisit");
        Visit visit = null;
        Pet instance = new Pet();
        instance.addVisit(visit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
