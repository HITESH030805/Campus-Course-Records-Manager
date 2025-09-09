package edu.ccrm.domain;

public abstract class Person {
    // Encapsulation: private fields [cite: 59]
    protected Name name; // Using an immutable value object for Name
    private String email;

    public Person(Name name, String email) {
        this.name = name;
        this.email = email;
    }
    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getProfile();

    @Override
    public String toString() {
        return "Name=" + name + ", Email='" + email + '\'';
    }
}