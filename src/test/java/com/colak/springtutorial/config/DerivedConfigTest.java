package com.colak.springtutorial.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DerivedConfigTest {

    @Autowired
    private DerivedConfig derivedConfig;

    @Test
    void testDerivedConfig() {
        assertEquals("value1", derivedConfig.getKey1());
        assertEquals("overridden_value", derivedConfig.getKey2());
    }

}