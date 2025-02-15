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

    List<User> users = List.of(
            new User(1,"Andre", "KOUADIO", 20, "Adjame"),
            new User(2,"Joel", "YAPI", 30, "Treichville"),
            new User(3,"Mohamed", "SYLLA", 25, "Abobo")
    );

    @Override
    public User findUser(Integer useId) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }
}
