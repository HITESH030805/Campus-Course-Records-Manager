package edu.ccrm.service.interfaces;

public interface Loggable {
    // Default method
    default void log(String message) {
        System.out.println("LOG: " + message);
    }
}