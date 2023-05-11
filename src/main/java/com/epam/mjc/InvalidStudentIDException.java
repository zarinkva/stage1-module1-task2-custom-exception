package com.epam.mjc;

public class InvalidStudentIDException extends IllegalArgumentException {
    public InvalidStudentIDException(String message)
    {
        super(message);
    }
}
