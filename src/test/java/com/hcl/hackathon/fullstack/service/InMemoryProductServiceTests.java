package com.hcl.hackathon.fullstack.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InMemoryProductServiceTests {

    @Autowired
    private InMemoryProductService productService;

    @Test
    public void shouldInMemoryProductServiceBeInjected() {
        assertThat(productService, instanceOf(InMemoryProductService.class));
    }

    @Test
    public void shouldProductRegistrySizeBeEqualsTen() {
        Assert.assertEquals("Expecting product registry to be equals 10",
                10, productService.findAll().size());
    }
}