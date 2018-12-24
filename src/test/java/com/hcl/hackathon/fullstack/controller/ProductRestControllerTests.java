package com.hcl.hackathon.fullstack.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRestControllerTests {

    @Autowired
    private ProductRestController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void shouldProductRegistrySizeBeEqualsTen() {
        Assert.assertEquals("Expecting product registry to be equals 10",
                10, controller.all().size());
    }
}