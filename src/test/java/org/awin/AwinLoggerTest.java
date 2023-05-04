package org.awin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AwinLoggerTest {

    AwinLogger logger;
    @BeforeEach
    void setUp(){
        logger = AwinLogger.getInstance(AwinLoggerTest.class);
    }
    @Test
    void getInstance(){
        assertNotNull(AwinLogger.getInstance(AwinLoggerTest.class));
    }

    @Test
    void debug(){
        String debugMessage = "DEBUG message";
        logger.debug(debugMessage);
    }

    @Test
    void info(){
        String infoMessage = "INFO message";
        logger.info(infoMessage);
    }

    @Test
    void warning(){
        String warningMessage = "WARNING message";
        logger.warning(warningMessage);
    }

    @Test
    void error(){
        String errorMessage = "ERROR message";
        logger.error(errorMessage);
    }

}
