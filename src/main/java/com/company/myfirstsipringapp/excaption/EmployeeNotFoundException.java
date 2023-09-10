package com.company.myfirstsipringapp.excaption;

public class EmployeeNotFoundException extends  Throwable{

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
