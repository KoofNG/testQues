/* Copyright (c) 2021 oasomefun@futa.edu.ng. All Rights Reserved.
 * Redistribution of original or derived work requires permission.
 * Credits: MIT
 */
package rules;

import static org.junit.Assert.*;

import org.junit.ClassRule;
import org.junit.Test;

/**
 * JUnit tests for Rules507.
 */
public class Rules507Test {
    
    /**
     * Tests the mayUseCodeIn507 method.
     */
    @Test
    public void testMayUseCodeIn507() {

        boolean status = false;
        // 1.
        status = Rules507.mayUseCodeIn507(false, true,
                false, false);
        assertFalse("Expected false: un-cited publicly-available code", status);

        // 2.
        status = Rules507.mayUseCodeIn507(true, false,
                true, true);
        assertTrue("Expected true: self-written required code", status);
    }
}
