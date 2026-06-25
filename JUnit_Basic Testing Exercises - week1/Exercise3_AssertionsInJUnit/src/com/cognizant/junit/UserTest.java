package com.cognizant.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserTest {

    @Test
    public void testUserName() {

        User user = new User();

        assertEquals("Bhagyasri", user.getName());
        assertNotNull(user.getName());
        assertTrue(user.getName().length() > 0);
    }
}
