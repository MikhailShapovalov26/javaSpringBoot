package ru.netology.SpringBoot.user;

import lombok.Data;
import org.springframework.stereotype.Component;
import ru.netology.SpringBoot.advice.errors.InvalidCredentials;
import ru.netology.SpringBoot.advice.errors.UnauthorizedUser;
import ru.netology.SpringBoot.authorization.Authorities;
import ru.netology.SpringBoot.user.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Component
public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public UserRepository() {
        users.put("test", new User("test", "passwd", Authorities.READ));
        users.put("admin", new User("admin", "passwd", Authorities.WRITE));
        users.put("user", new User("user", "passwd", Authorities.DELETE));
    }

    public List<Authorities> getUserAuthorities(String username, String password) {
        User user = users.get(username);
        if (user == null) {
            throw new UnauthorizedUser("Unknown user " + username);
        }
        if (!user.getPassword().equals(password)) {
            throw new InvalidCredentials("Invalid password");
        }
        return user.getAuthorities();

    }
}
