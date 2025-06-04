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
}