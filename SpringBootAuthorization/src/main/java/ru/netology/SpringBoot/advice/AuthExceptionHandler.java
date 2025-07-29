package ru.netology.SpringBoot.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.SpringBoot.advice.errors.InvalidCredentials;
import ru.netology.SpringBoot.advice.errors.UnauthorizedUser;

@RestControllerAdvice
public class AuthExceptionHandler {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentials(InvalidCredentials inv){
        return new ResponseEntity<>(inv.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUser(UnauthorizedUser unv){
        System.out.println(unv.getLocalizedMessage());
        return new ResponseEntity<>(unv.getLocalizedMessage(), HttpStatus.UNAUTHORIZED);
    }

}
