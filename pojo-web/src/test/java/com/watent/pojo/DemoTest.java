package com.watent.pojo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class DemoTest {

    private static final Logger logger = LoggerFactory.getLogger(DemoTest.class);

    @Test
    public void testLogback() throws InterruptedException {
        MDC.put("ip", "192.168.1.5");
        MDC.put("domain", "wxc.trade.qunar.com");
        MDC.put("key", "key-pojo");
        for(int i=0;i<30;i++){
            logger.info("hello {} ", i);
        }
    }

}
