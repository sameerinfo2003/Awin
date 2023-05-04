package org.awin;

import java.util.Date;

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
        classNameStr = className.getCanonicalName();
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