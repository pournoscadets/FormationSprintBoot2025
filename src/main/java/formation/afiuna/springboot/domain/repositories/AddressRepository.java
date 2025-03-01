package formation.afiuna.springboot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.afiuna.springboot.domain.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}