package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private final int id;
    private final String regNo;
    private String status;
    private final LocalDate registrationDate;

    public Student(int id, String regNo, Name name, String email, String status) {
        super(name, email);
        this.id = id;
        this.regNo = regNo;
        this.status = status;
        this.registrationDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getRegNo() {
        return regNo;
    }

    @Override
    public String getProfile() {
        return String.format("Student Profile:\nID: %d\nRegNo: %s\nName: %s\nEmail: %s\nStatus: %s",
                id, regNo, super.getName(), super.getEmail(), status);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", regNo='" + regNo + '\'' +
                ", " + super.toString() +
                '}';
    }
}