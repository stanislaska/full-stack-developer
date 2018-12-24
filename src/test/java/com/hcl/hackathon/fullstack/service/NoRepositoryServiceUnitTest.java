package com.hcl.hackathon.fullstack.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NoRepositoryServiceUnitTest {

    @Mock
    private NoRepositoryService service;

    @Before
    public void tearUp() {
        // - Nop
    }

    @After
    public void tearDown() {
        // - Nop
    }

    @Test
    public void shouldNotBeNull() {
        Assert.assertNotNull("Unexpecting mocked service to be null", service);
    }
}