package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.Compte;
import formation.afiuna.springboot.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private List<User> users = List.of(new User(12L, "Ahmed", "Sylla", 30,"Abobo"));

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User findUser(Integer useId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

}
