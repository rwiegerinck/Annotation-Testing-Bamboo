/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;
import customAnnotations.PTest;

/**
 * JUnit test for the {@link Owner} class.
 *
 * @author Ken Krebs
 */
public class OwnerTests {

    @PTest(author = "Rob123", amountTimesRunPerUser = 1000, numberOfUsers = 1)
    @Test
    @Transactional
    public void testHasPet() {
        int x = 0;
       // for(int i = 0; i < 15; i++) {
       //     System.out.println(i);
       // }
        Owner owner = new Owner();
        Pet fido = new Pet();
        fido.setName("Fido");
        assertNull(owner.getPet("Fido"));
        assertNull(owner.getPet("fido"));
        owner.addPet(fido);
        assertEquals(fido, owner.getPet("Fido"));
        assertEquals(fido, owner.getPet("fido"));
    }

}
