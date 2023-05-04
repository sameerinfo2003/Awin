package org.awin;

import java.util.Date;

public class AwinLogger {

    private static final AwinLogger awinLogger = new AwinLogger();
    private static boolean debug = false;
    private static boolean info = false;
    private static boolean warning = false;
    private static boolean error = false;

    public static void main(String[] args) {
        System.out.println("Awin Logger!");
    }

    public static AwinLogger getInstance() {
        System.out.println("Returning AwinLogger instance");
        return awinLogger;
    }

    public void debug(String message) {
        System.out.println(new Date() + " DEBUG ["+AwinLogger.class+"] - " + message);
    }

    public void info(String message) {
        System.out.println(new Date() + " INFO ["+AwinLogger.class+"] - " + message);
    }

    public void warning(String message) {
        System.out.println(new Date() + " WARNING ["+AwinLogger.class+"] - " + message);
    }

    public void error(String message) {
        System.out.println(new Date() + " ERROR ["+AwinLogger.class+"] - " + message);
    }

}