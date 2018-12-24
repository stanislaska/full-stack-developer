package com.hcl.hackathon.fullstack.resource;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ResourceUnitTest {
    @Mock
    private Resource resource;

    @Before
    public void tearUp() {
        // - Nop
    }

    @After
    public void tearDown() {
        reset(resource); // rollback to initial state ..
    }

    @Test
    public void shouldNotBeNull() {
        assertNotNull("Unexpecting this auto injected resource to be null", resource);
    }

    @Test
    public void expectResourceHrefToBeApi() {
        when(resource.getHref()).thenReturn("/api/v1/any");
        assertEquals("Expecting the resource href to be equals", "/api/v1/any", resource.getHref());
        verify(resource, atLeast(1)).getHref();
    }

    @Test
    public void shouldVersionToBeEquals() {
        when(resource.getVersion()).thenReturn(Version.V1);
        assertEquals("Expecting the resource href to be equals", Version.V1, resource.getVersion());
        verify(resource, atLeast(1)).getVersion();
    }
}