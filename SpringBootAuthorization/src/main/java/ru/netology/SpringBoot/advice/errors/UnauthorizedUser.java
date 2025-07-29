package ru.netology.SpringBoot.advice.errors;

public class UnauthorizedUser extends RuntimeException  {

    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
