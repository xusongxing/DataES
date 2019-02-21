package cn.xsx.web.dsp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
    }
}
