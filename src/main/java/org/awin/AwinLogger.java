package org.awin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class AwinLogger {

    private static final AwinLogger awinLogger = new AwinLogger();
    private static String classNameStr = null;

    private static boolean debug = false;
    private static boolean info = false;
    private static boolean warning = false;
    private static boolean error = false;

    public static void main(String[] args) {
        System.out.println("Awin Logger!");
    }

    public static AwinLogger getInstance(Class<?> className) {
        Properties properties = new Properties();
        java.net.URL config = ClassLoader.getSystemResource("config.properties");
        String configuredloggingLevel;

        try  {
            properties.load(config.openStream());
            configuredloggingLevel = properties.getProperty("logLevel");
            System.out.println(properties.getProperty(configuredloggingLevel));
        } catch (FileNotFoundException fie) {
            fie.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        classNameStr = className.getName();
        System.out.println("Returning AwinLogger instance");
        return awinLogger;
    }

    public void debug(String message) {
        System.out.println(new Date() + " DEBUG ["+classNameStr+"] - " + message);
    }

    public void info(String message) {
        System.out.println(new Date() + " INFO ["+classNameStr+"] - " + message);
    }

    public void warning(String message) {
        System.out.println(new Date() + " WARNING ["+classNameStr+"] - " + message);
    }

    public void error(String message) {
        System.out.println(new Date() + " ERROR ["+classNameStr+"] - " + message);
    }

}