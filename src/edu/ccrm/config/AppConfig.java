package edu.ccrm.config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AppConfig {
    private static final AppConfig INSTANCE = new AppConfig();

    private final Path dataFolderPath;
    private final Path backupRootPath;

    // 2. Private constructor to prevent instantiation
    private AppConfig() {
        this.dataFolderPath = Paths.get("data");
        this.backupRootPath = Paths.get("backups");
    }
    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public Path getStudentDataPath() {
        return dataFolderPath.resolve("students.csv");
    }

    public Path getCourseDataPath() {
        return dataFolderPath.resolve("courses.csv");
    }

    public Path getEnrollmentDataPath() {
        return dataFolderPath.resolve("enrollments.csv");
    }

    public Path getBackupRootPath() {
        return backupRootPath;
    }
}