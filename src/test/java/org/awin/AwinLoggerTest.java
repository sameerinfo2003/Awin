package org.awin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AwinLoggerTest {

    AwinLogger logger;
    @BeforeEach
    void setUp(){
        logger = new AwinLogger();
    }
    @Test
    void getInstance(){
        assertNotNull(logger.getInstance());
    }

}
