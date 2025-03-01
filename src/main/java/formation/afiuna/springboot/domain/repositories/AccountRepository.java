package formation.afiuna.springboot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.afiuna.springboot.domain.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}