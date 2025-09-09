package edu.ccrm.io;

import edu.ccrm.config.AppConfig;
import edu.ccrm.util.RecursiveFileUtils;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BackupService {
    private final AppConfig config = AppConfig.getInstance();

    public Path createBackup() throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        Path backupDir = config.getBackupRootPath().resolve("backup_" + timestamp);

        Files.createDirectories(backupDir);

        Files.copy(config.getStudentDataPath(), backupDir.resolve("students.csv"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(config.getCourseDataPath(), backupDir.resolve("courses.csv"), StandardCopyOption.REPLACE_EXISTING);

        return backupDir;
    }

    public void displayBackupSize() throws IOException {
        Path backupRoot = config.getBackupRootPath();
        if (Files.notExists(backupRoot)) {
            System.out.println("No backups found.");
            return;
        }
        // Calling the recursive utility method [cite: 33]
        long totalSize = RecursiveFileUtils.calculateDirectorySize(backupRoot);
        System.out.printf("Total size of backup directory '%s' is %d bytes.%n", backupRoot, totalSize);
    }
}