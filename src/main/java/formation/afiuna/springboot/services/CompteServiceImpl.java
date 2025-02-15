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


    @Override
    public Compte findById(int id) {
        return null;
    }

    @Override
    public List<Compte> findAll() {
        return List.of();
    }

    private List<Compte> getListCompte() {
        List<Compte> comptes = new ArrayList<>();

        return comptes;
    }
}
