package formation.afiuna.springboot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.afiuna.springboot.domain.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}