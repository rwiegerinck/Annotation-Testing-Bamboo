/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.samples.petclinic.model;

import customAnnotations.PTest;
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
public class PersonTest {
    
    public PersonTest() {
    }

    @Test
    public void testPTest() {
        PtestRunTests pt = new PtestRunTests();
   //     pt.main(null);
        assertEquals("2","2");
    }
 
    @Test
    public void testGetFirstName2() {
        assertEquals("2","2");
    }
    
    /**
     * Test of getFirstName method, of class Person.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testGetFirstName() {
        Person instance = new Person();
        instance.firstName = "voornaam";
        String expResult = "voornaam";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testSetFirstName() {
        String firstName = "Rob";
        Person instance = new Person();
        instance.setFirstName(firstName);
        assertEquals(instance.getFirstName(), "Rob");
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testGetLastName() {
        Person instance = new Person();
        instance.lastName = "achternaam";
        String expResult = "achternaam";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    public void testSetLastName() {
        String lastName = "achternaam";
        Person instance = new Person();
        instance.lastName = "tempAchternaam";
        assertEquals(instance.lastName, "tempAchternaam");
        instance.setLastName(lastName);
        assertEquals(instance.lastName, lastName);
    }
    
}
