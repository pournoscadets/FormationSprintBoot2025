package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.User;

import java.util.List;

public interface UserService {
    User findUser(Integer useId);
    List<User> findAll();
}
