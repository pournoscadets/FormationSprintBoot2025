package formation.afiuna.springboot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.afiuna.springboot.domain.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}