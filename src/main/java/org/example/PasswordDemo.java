package org.example;

import org.example.app.passwordGenerator.PasswordGenerator;

public class PasswordDemo {
    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(12);
        System.out.println("Згенерований пароль: " + password);
    }
}
