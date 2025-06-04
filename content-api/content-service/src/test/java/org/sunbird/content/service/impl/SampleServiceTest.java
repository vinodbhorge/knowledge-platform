package org.sunbird.content.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleServiceTest {
    
    private final SampleService sampleService = new SampleService();
    
    @Test
    public void testAdd() {
        assertEquals(4, sampleService.add(2, 2));
    }

    @Test
    public void testGetMessage() {
        String message = sampleService.getMessage();
        assertNotNull(message);
        assertEquals("Hello World", message);
    }

    @Test
    public void testDeliberatelyFailing() {
        // This test will fail to verify the workflow's behavior with failing tests
        assertEquals("Expected message", sampleService.getMessage());
        // This assertion will fail because getMessage() returns "Hello World"
    }
}