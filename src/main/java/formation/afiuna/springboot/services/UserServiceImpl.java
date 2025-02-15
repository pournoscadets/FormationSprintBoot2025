package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public User addUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User findUser(Integer useId) {
        return this.users.stream().filter(user -> user.getId().equals(useId)).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

}
