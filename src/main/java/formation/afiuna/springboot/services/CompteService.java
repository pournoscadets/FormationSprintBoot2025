package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.Compte;
import formation.afiuna.springboot.entity.User;

import java.util.List;

public interface CompteService {
    void rattacherCompte(User user);
    Compte crediterCompte(int montant, int numeroCompte);
    Compte findById(int id);
    List<Compte> findAll();
}
