package ru.netology.SpringBoot.user;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import ru.netology.SpringBoot.authorization.Authorities;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {

    @NotBlank
    @Size(min = 1)
    private String user;

    @NotBlank
    @Size(min = 1)
    private String password;

    private List<Authorities> authorities;

    public User() {
    }
    public User(String user, String password, Authorities authorities) {
        this.user = user;
        this.password = password;
        this.authorities = new ArrayList<>();
       this.authorities.add(authorities);
    }

}
