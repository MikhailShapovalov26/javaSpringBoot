# Локальное тестирование

Для тестирования я создал 3 пользователей
```java
public UserRepository() {
        users.put("test", new User("test", "passwd", Authorities.READ));
        users.put("admin", new User("admin", "passwd", Authorities.WRITE));
        users.put("user", new User("user", "passwd", Authorities.DELETE));
    }
```

Теперь проверяем что Postman нам возвращает необходимое на корректный запрос

![img.png](img.png)

Пробуем ошибку на пустой пароль
![img_1.png](img_1.png) 
Пробуем на не правильный логин
![img_2.png](img_2.png)
