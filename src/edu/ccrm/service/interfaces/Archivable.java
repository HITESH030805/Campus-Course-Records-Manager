package edu.ccrm.service.interfaces;

public interface Archivable {
    default void log(String message) {
        System.out.println("ARCHIVE LOG: " + message);
    }
}