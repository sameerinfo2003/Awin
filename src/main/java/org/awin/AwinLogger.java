package org.awin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class AwinLogger {

    private static final AwinLogger awinLogger = new AwinLogger();
    private static String classNameStr = null;
    private static String configuredloggingLevel = null;
    private static String loggingOutputTarget = null;

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

        try  {
            properties.load(config.openStream());

            configuredloggingLevel = properties.getProperty("logging.level");
            loggingOutputTarget = properties.getProperty("logging.output.target");

            if("debug".equalsIgnoreCase(configuredloggingLevel)) {
                debug = true;
                info = true;
                warning = true;
                error = true;
            } else if("info".equalsIgnoreCase(configuredloggingLevel)) {
                info = true;
                warning = true;
                error = true;
            } else if("warning".equalsIgnoreCase(configuredloggingLevel)) {
                warning = true;
                error = true;
            } else if("error".equalsIgnoreCase(configuredloggingLevel)) {
                error = true;
            }

        } catch (FileNotFoundException fie) {
            fie.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        classNameStr = className.getName();
        return awinLogger;
    }

    public void debug(String message) {
        if (isDebug())
            System.out.println(new Date() + " DEBUG ["+classNameStr+"] - " + message);
    }

    public void info(String message) {
        if (isInfo())
            System.out.println(new Date() + " INFO ["+classNameStr+"] - " + message);
    }

    public void warning(String message) {
        if (isWarning())
            System.out.println(new Date() + " WARNING ["+classNameStr+"] - " + message);
    }

    public void error(String message) {
        if (isError())
            System.out.println(new Date() + " ERROR ["+classNameStr+"] - " + message);
    }
    public boolean isDebug() { return AwinLogger.debug; }
    public boolean isInfo() { return AwinLogger.info; }
    public boolean isWarning() { return AwinLogger.info; }
    public boolean isError() { return AwinLogger.error; }
}