package formation.afiuna.springboot.services;

import formation.afiuna.springboot.entity.Compte;
import formation.afiuna.springboot.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CompteServiceImpl implements CompteService {

    List<Compte> comptes = List.of(
            new Compte(10L, 250, 30000, null),
            new Compte(11L, 300, 100000, null)
    );

    @Override
    public void rattacherCompte(User user) {
        // A Faire ensemble
    }

    @Override
    public Compte crediterCompte(int montant, int numeroCompte) {
        return null;
    }

    @Override
    public Compte findById(int id) {
        return this.comptes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Compte> findAll() {
        return this.comptes;
    }
}
