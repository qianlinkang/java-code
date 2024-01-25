package code.java.learn.ch7.s7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * java9新的log api
 */
public class LogTest {
    public static void main(String[] args) throws IOException {
        System.Logger logger = System.getLogger("fkjava");
        Logger.getLogger("fkjava").setLevel(Level.ALL);
        // 使用a.xml保存
        Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
        logger.log(System.Logger.Level.DEBUG, "debug信息");
        logger.log(System.Logger.Level.INFO, "info信息");
        logger.log(System.Logger.Level.ERROR, "error信息");

    }
}
